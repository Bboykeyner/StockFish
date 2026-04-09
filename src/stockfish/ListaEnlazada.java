
package stockfish;
import javax.swing.JOptionPane;
/**
 *
 * @author bboyk
 */
public class ListaEnlazada {
    Nodo cabeza = null;
 
    public void agregarNodo(String nombre, String evento, String fecha){
        Nodo objeto = new Nodo(nombre,evento,fecha);
        objeto.siguiente = cabeza;
        //cabeza = objeto.siguiente; Este no funciona ya que cabeza apuntaba a el siguiente enlace que es null por lo que la informacion se perdia
        cabeza = objeto;//Aqui si esta correcto, la cabeza apunta a el nuevo objeto y no a donde este apunta que es null
    
    }
    public void verEventos(){
      Nodo temporal = cabeza;
      if(cabeza == null){
      JOptionPane.showMessageDialog(null, "Sin eventos programados");
      return;
      }
      while(temporal != null){
          JOptionPane.showMessageDialog(null,"Nombre Usuario: "+ temporal.getNombre() +"\nEvento: "+temporal.getEvento()+"\nFecha: "+ temporal.getFecha());
      temporal = temporal .siguiente;}
    
    }
    public void buscarEventosPersona(String eventosNombre){
        if(eventosNombre == null || eventosNombre.trim().isEmpty()){// Si dan un valor nulo o simplemente dejo vacio que retorne sin mostrar error
            return;
        }
        boolean encontrado = false;
        Nodo temporal = cabeza;
        if(cabeza == null){
      JOptionPane.showMessageDialog(null, "Sin eventos programados");
      return;
      }
        while(temporal != null){
            if(temporal.getNombre().equalsIgnoreCase(eventosNombre)){
                encontrado = true;
            JOptionPane.showMessageDialog(null, temporal.getNombre()+" El usuario tiene el evento: "+ temporal.getEvento()+"\n El dia: "+ temporal.getFecha());
            }
    temporal = temporal.siguiente;}
            if(!encontrado){JOptionPane.showMessageDialog(null,"Usuario no tiene eventos programados");}

    }
    }
    
