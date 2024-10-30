package contenido.Draft;

import lombok.Getter;
import java.util.Date;

//@Getter
public class Documento {
    private Date fecha;
    private int numero;
    Sucursal sucursal;

    public Documento(Date fecha, int numero) {
        this.fecha = fecha;
        this.numero = numero;

    }


    public void Imprimir(){
        sucursal.setDireccion("sdfsa");
    }

    public Date getFecha() {
        return fecha;
    }
}
