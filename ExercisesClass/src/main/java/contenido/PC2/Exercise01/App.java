package contenido.PC2.Exercise01;

public class App {
    public void ejecutar(Object object){
        Base base = new Derivada01();

        if (base instanceof Derivada01) {
            Derivada01 derivada01 = (Derivada01) base;
            derivada01.metodo02();
        }
    }
}
