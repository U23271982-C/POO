package PruebaIntefaz;

public interface Prueba02 extends Prueba01{
    @Override
    void met1();

    void met2();

    static int met3(){
        return 1;
    }
    int met4();
    default double met5(){
        return 0.0;
    }
}
