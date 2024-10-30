package contenido.Week08.JuegoAjedrez.Piezas;

import contenido.Week08.JuegoAjedrez.Pieza;

public class Peon extends Pieza {

    public Peon() {
        super.descripcionMoviento = "Se mueven una casilla hacia adelante" +
                " en cada turno. Sin embargo, en su primer movimiento, pueden " +
                "avanzar dos casillas si lo desean";
        super.valorPieza = 1;
        //super.color = "Blanco";
    }

    @Override
    public String getDescripcionMoviento() {
        return super.getDescripcionMoviento();
    }

    @Override
    public int getValorPieza() {
        return super.getValorPieza();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void movimiento() {
        super.movimiento();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
