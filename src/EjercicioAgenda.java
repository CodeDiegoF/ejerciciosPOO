import lombok.*;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

class Contacto{
     private String nombreContacto;
     private String numeroTelefono;
     
     @Override
     public String toString() {
          return nombreContacto + " - " + numeroTelefono;
     }
}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Agenda{
     private String nombreAgenda;
     private ArrayList<Contacto> contactos = new ArrayList<>();
     
     // Constructor con parámetro nombreAgenda
     public Agenda(String agenda) {
          this.nombreAgenda = agenda;
     }
     
     public void insertarContacto(Contacto contacto) {
          if (contacto != null) {
               contactos.add(contacto);
          }
     }
     
     public List<Contacto>  mostrarContactos(){
          return new ArrayList<>(contactos);
     }
     
     String devolverNombre(String telefono){
          for (Contacto c : contactos){
               if(c.getNumeroTelefono().equals(telefono)){
                    return "El nombre del contacto es:  " + c.getNombreContacto();
               }
          }
          return "No encontrado";
     }
     
     String devolverTelefono(String nombreContacto){
          for (Contacto c : contactos){
               if(c.getNombreContacto().equals(nombreContacto)){
                    return "El teléfono del contacto es: " + c.getNumeroTelefono();
               }
          }
          return "No encontrado";
     }
     
     void actualizarContacto(String nombre, String nuevoTelefono){
          for (Contacto c : contactos){
               if(c.getNombreContacto().equals(nombre)){
                    c.setNumeroTelefono(nuevoTelefono);
               }
          }
     }
     
     void eliminarContacto(String nombre){
          contactos.removeIf(c -> c.getNombreContacto().equals(nombre));
     }
     
     
     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append("Agenda: ").append(nombreAgenda).append("\n");
          sb.append("=".repeat(40)).append("\n");
          
          if (contactos.isEmpty()) {
               sb.append("No hay contactos.\n");
          } else {
               for (Contacto c : contactos) {
                    sb.append("• ").append(c.getNombreContacto())
                            .append(" - ")
                            .append(c.getNumeroTelefono())
                            .append("\n");
               }
          }
          
          sb.append("=".repeat(40));
          return sb.toString();
     }
}


public class EjercicioAgenda {
     
     public static void main(String[] args) {
          Agenda agenda = new Agenda("Agenda Amigos");
          
          // creo 4 contactos
          Contacto contacto1 = new Contacto("Marco", "12345");
          Contacto contacto2 = new Contacto("Paco", "953467");
          Contacto contacto3 = new Contacto("Ramón", "855427");
          Contacto contacto4 = new Contacto("José", "556414");
          
          // añado los 4 contactos a la agenda
          agenda.insertarContacto(contacto1);
          agenda.insertarContacto(contacto2);
          agenda.insertarContacto(contacto3);
          agenda.insertarContacto(contacto4);
          
          // muestro los contactos guardados
          System.out.println("AGENDA INICIAL:");
          System.out.println(agenda.getContactos());
          
          //busca el nombre según el teléfono
          System.out.println("BÚSQUEDAS:");
          System.out.println(agenda.devolverNombre("556414")); // José
          System.out.println(agenda.devolverNombre("156416")); // No encontrado
          
          //busca el teléfono según el nombre
          System.out.println(agenda.devolverTelefono("Marco"));    // 12345
          System.out.println(agenda.devolverTelefono("Ezequiel")); // No encontrado
          
          
          //actualizo un contacto cambiado su telefono
          System.out.println("ACTUALIZANDO TELÉFONO DE RAMÓN:");
          agenda.actualizarContacto("Ramón", "124562");
          System.out.println(agenda.getContactos());
          
          //elimino un contacto
          System.out.println("ELIMINANDO A MARCO:");
          agenda.eliminarContacto("Marco");
          System.out.println(agenda.getContactos());
          
          System.out.println(agenda.toString());
          
          
     }
     
     
}


