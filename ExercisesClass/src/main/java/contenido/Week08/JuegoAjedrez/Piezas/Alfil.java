package contenido.Week08.JuegoAjedrez.Piezas;

import contenido.Week08.JuegoAjedrez.Pieza;

public class Alfil extends Pieza {
    public Alfil() {
        super.descripcionMoviento = "Se mueve en diagonal cualquier" +
                " número de casillas.";
        super.valorPieza = 3;
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
