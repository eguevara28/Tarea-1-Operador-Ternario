/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_operadorternario;
import java.util.Scanner;
/**
 *
 * @author ernes
 */
public class Guevara_Ernesto_OperadorTernario {
    public static void main(String[] args) {
        
        /*
        El operador ternario desde mi punto de vista es como un tipo de if
        que sirve para asignarle un valor a una variable dependiendo de la
        situacion planteada, lo veo bastante util para agilizar algunas asignaciones
        a las variables ya que aveces podemos ocupar cierto valor dependiendo de la
        situacion, yo hago uso del operador ternario en mi proyecto por ejemplo a la hora
        de elegir que producto esta comprando el cliente dependiendo del codigo que ingrese.
        */
        
        Scanner lea=new Scanner(System.in);
        
        while(true){
            System.out.println("Menu tarea: Operador Ternario");
            System.out.println("1. Ejemplo 1");
            System.out.println("2. Ejemplo 2");
            System.out.println("3. Ejemplo 3");
            System.out.println("4. Salir");
            int op=lea.nextInt();
            
            if(op==1){
                System.out.println("Escriba el numero de su juego preferido");
                System.out.println("1. The Legend of Zelda");
                System.out.println("2. Elden Ring");
                System.out.println("3. Red Dead Redemption 2");
                int opjuego=lea.nextInt();
                
                String nombrejuego=(opjuego==1)?"The Legend of Zelda"
                        :(opjuego==2)?"Elden Ring"
                        :(opjuego==3)?"Red Dead Redeptiom 2":null;
                
                System.out.println("Su juego favorito es: "+nombrejuego);               
            }
            
            if(op==2){
                System.out.println("Si el subtotal de su compra es superior a 1000lps se le dara un 5% de descuento");
                System.out.println("Cuanto fue el subtotal de su compra?");
                double subtotal=lea.nextDouble();
                
                double total=(subtotal>1000)?subtotal-(subtotal*0.05):subtotal;
                
                System.out.println("Su total a pagar es: "+total);
            }
            
            if(op==3){
                System.out.println("si vive con menos de 3 personas se le cobra 200lps por cada una, y de 3 en adelante 400lps por persona");
                System.out.println("Cuantas personas viven en su casa?");
                int personas=lea.nextInt();
                
                int pago=(personas<3)?personas*200
                        :(personas>=3)?personas*400:0;
                
                System.out.println("Su total a pagar es: "+pago);
            }
            
            if(op==4){
                System.out.println("Nos vemos");
                break;
            }
        }
        
    }
    
}
