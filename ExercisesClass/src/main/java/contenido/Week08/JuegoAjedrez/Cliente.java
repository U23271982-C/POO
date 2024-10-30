package contenido.Week08.JuegoAjedrez;

import contenido.Week08.JuegoAjedrez.Piezas.*;

import java.util.ArrayList;

public class Cliente {
    Pieza[] piezas;
    Ajedrez ajedrez;

    public Cliente() {
    }
    //Mostrar todas las piezas
    public String mostrarPiezasCliente(){
        return ajedrez.mostrarPiezas();
    }
}
