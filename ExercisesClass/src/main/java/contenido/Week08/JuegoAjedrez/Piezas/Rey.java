package contenido.Week08.JuegoAjedrez.Piezas;

import contenido.Week08.JuegoAjedrez.Pieza;

public class Rey extends Pieza {
    public Rey() {
        super.descripcionMoviento = "Se mueve una casilla en cualquier " +
                "dirección (horizontal, vertical o diagonal). " +
                "Puede realizar el enroque, un movimiento especial con " +
                "la torre.";
        super.valorPieza = 0;
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
