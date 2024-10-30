package contenido.Week08.JuegoAjedrez.Piezas;

import contenido.Week08.JuegoAjedrez.Pieza;

public class Caballo extends Pieza {
    public Caballo() {
        super.descripcionMoviento = "Se mueve en forma de “L”: dos " +
                "casillas en una dirección y luego una casilla perpendicular" +
                ", o viceversa.Puede saltar sobre otras piezas";
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
