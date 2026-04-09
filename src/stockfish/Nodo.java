
package stockfish;

/**
 *
 * @author bboyk
 */
public class Nodo {
    private String nombre;
    private String evento;
    private String fecha;
    Nodo siguiente;
    
    public Nodo(String nombre,String evento, String fecha){
    this.nombre = nombre;
    this.evento=evento;
    this.fecha = fecha;
    siguiente = null;
    }
    public String getNombre(){
    return nombre;
    }

    public String getEvento() {
        return evento;
    }

    public String getFecha() {
        return fecha;
    }
    
}
