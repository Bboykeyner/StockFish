
package stockfish;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth Damian Fonseca Bernal
 */
public class StockFish {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    ListaEnlazada instancia = new ListaEnlazada();
    String entrada;
    int opcion = -1; // Inicializamos fuera del rango para que entre al bucle

    do {
        entrada = JOptionPane.showInputDialog(null, 
            "Hola! ¿Desea gestionar eventos?\n1. Agregar\n2. Ver eventos\n3. Buscar Eventos\n0. Salir");

        // 1. Validar si presionó Cancelar o cerró la ventana
        if (entrada == null) {
            opcion = 0; // Forzamos la salida limpia
        } else {
            try {
                opcion = Integer.parseInt(entrada);
                
                switch (opcion) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog(null, "Cual es su nombre?");
                        if (nombre == null) break; // Si cancela, vuelve al menú
                        
                        String evento = JOptionPane.showInputDialog(null, "Que evento desea recordar?");
                        if (evento == null) break;
                        
                        String fecha = JOptionPane.showInputDialog(null, "Que fecha desea programar?");
                        if (fecha == null) break;

                        instancia.agregarNodo(nombre, evento, fecha);
                        break;
                        
                    case 2:
                        instancia.verEventos();
                        break;
                        
                    case 3:
                        String buscarPorNombre = JOptionPane.showInputDialog(null, "Nombre a buscar:");
                        // El método buscarEventosPersona ya maneja el null internamente
                        instancia.buscarEventosPersona(buscarPorNombre);
                        break;
                        
                    case 0:
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida :c");
                        break;
                }
            } catch (NumberFormatException | ArithmeticException e) {
                // 2. Manejar si el usuario escribe letras en lugar de números
                JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números.");
                opcion = -1; // Mantiene el bucle activo
            }
        }
    } while (opcion != 0);
}
}              