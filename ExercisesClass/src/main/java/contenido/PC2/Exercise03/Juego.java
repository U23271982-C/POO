package contenido.PC2.Exercise03;

public class Juego {
    private Dado[] dados;

    public Juego(String colores) {
        int longArr = colores.split(",").length;
        dados = new Dado[longArr];
    }
    public int jugar(){
        lanzarDados();
        return obtenerPuntos();
    }
    private void lanzarDados(){
        for (int i = 0; i < dados.length; i++) {
            dados[i].lanzar();
        }
    }
    private int obtenerPuntos(){
        int totalPuntos = 0;
        for (int i = 0; i < dados.length; i++) {
            for (int k = 0; k < dados.length; k++) {
                if (dados[i] != dados[i] & dados[i] == dados[k]) {
                    totalPuntos= dados[i].getValor() + 3;
                }else {
                    totalPuntos = dados[i].getValor() + 1;
                }
            }
        }
        return totalPuntos;
    }
}
