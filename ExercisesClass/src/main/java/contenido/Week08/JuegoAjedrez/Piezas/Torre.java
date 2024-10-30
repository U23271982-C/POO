package contenido.Week08.JuegoAjedrez.Piezas;

import contenido.Week08.JuegoAjedrez.Pieza;

public class Torre extends Pieza {
    public Torre() {
        super.descripcionMoviento = "Se mueve en línea recta " +
                "horizontal o verticalmente cualquier número de casillas.";
        super.valorPieza = 5;
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
