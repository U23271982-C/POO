package contenido.Week08.JuegoAjedrez;

public class Pieza {
    public String descripcionMoviento;
    public int valorPieza;
    public String color;

/*    public Pieza(String descripcionMoviento, int valorPieza, String color) {
        this.descripcionMoviento = descripcionMoviento;
        this.valorPieza = valorPieza;
        this.color = color;
    }
*/

    public Pieza() {
        this.color = "Blanco";
    }

    //#region Getters

    public String getDescripcionMoviento() {
        return descripcionMoviento;
    }

    public int getValorPieza() {
        return valorPieza;
    }

    public String getColor() {
        return color;
    }
    //#endregion

    public void movimiento(){}

    @Override
    public String toString() {
        return String.format("\"%s\"<%s>[%d puntos]",
                descripcionMoviento,color,valorPieza);
    }
}
