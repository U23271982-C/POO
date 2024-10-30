package contenido.Week08.JuegoAjedrez;

import contenido.Week08.JuegoAjedrez.Piezas.*;

public abstract class Ajedrez extends Juego{
    private Pieza piezasJuego[];
    private int numPeon = 1;
    private int numCaballo = 1;
    private int numTorre = 1;
    private int numAfil = 1;
    private int numReina = 1;
    private int numRey = 1;

    private int[] numPiezas = new int[5];

    public Ajedrez() {
        int contPiezas = 0;
        this.piezasJuego = new Pieza[32];
        //Piezas en total
        for (int i = 0; i < 2; i++) {
            //8 peones en total
            for (int j = 0; j < 8; j++) {
                piezasJuego[contPiezas] = new Peon();
                contPiezas++;
                //numPeon++;
                numPiezas[0]++;
            }
            //2 de cada cada pieza
            for (int j = 0; j < 2; j++) {
                piezasJuego[contPiezas] = new Torre();
                contPiezas++;
                //numTorre++;
                numPiezas[1]++;
                piezasJuego[contPiezas] = new Caballo();
                contPiezas++;
                //numCaballo++;
                numPiezas[2]++;
                piezasJuego[contPiezas] = new Alfil();
                contPiezas++;
                //numAfil++;
                numPiezas[3]++;
            }
            piezasJuego[contPiezas] = new Reina();
            contPiezas++;
            //numReina++;
            numPiezas[4]++;
            piezasJuego[contPiezas] = new Rey();
            //numRey++;
            numPiezas[5]++;
        }
    }

    public String mostrarPiezas(){
        int j = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < piezasJuego.length; i++) {
            int x = i-1;
            //si la pieza es diferente a la pieza anterior, se mostrar la descripcion junto con el número de piezas
            if(piezasJuego[i] != piezasJuego[x]) {
                sb.append(String.format("%s *Numero Pieza: %d*\n",
                        piezasJuego[i].toString(), numPiezas[j]));
                j++;
            }
        }
        return sb.toString();
    }

    public void moverPieza(Pieza pieza){
    }
}
