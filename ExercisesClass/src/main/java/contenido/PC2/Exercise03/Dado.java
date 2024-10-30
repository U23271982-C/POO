package contenido.PC2.Exercise03;

public class Dado implements Comparable{
    private String color;
    private int valor;

    public Dado(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }
    public void lanzar(){
        valor =  (int) (Math.random() * 6) + 1;
    }

    @Override
    public int comparar(Object object) {
        return 0;
    }
}
