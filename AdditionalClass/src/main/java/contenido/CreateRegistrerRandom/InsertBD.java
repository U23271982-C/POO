package contenido.CreateRegistrerRandom;

public class InsertBD {
    String nameTable;
    String atributosTable;
    String valoresInsertar;

    public InsertBD(String nameTable, String atributosTable,
                    String valoresInsertar) {
        this.nameTable = nameTable;
        this.atributosTable = atributosTable;
        this.valoresInsertar = valoresInsertar;
    }
/* 
    public void contenidoTabla(int numAtributos){
        ValorInsertar valorInsertar = new ValorInsertar();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < valorInsertar.apellidos.length; i++) {
            for (int j = 0; j < valorInsertar.length; j++) {

            }
        }
    }
*/
    @Override
    public String toString() {
        return String.format("INSERT INTO %s (%s) VALUES\n%s",
                nameTable);
    }
}
