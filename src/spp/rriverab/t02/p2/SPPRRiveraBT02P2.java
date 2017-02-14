//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.t02.p2;
import java.util.Scanner;

public class SPPRRiveraBT02P2 {

    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        Scanner teclado = new Scanner (System.in);
        int valinf, valsup, i;
        
        System.out.println("\n\n<<Calculadora de divisibilidad entre 2, 3 y 5 de números entre 2 cantidades>>");
        

        System.out.println("\nIntroduzca un valor inferior");
        valinf = teclado.nextInt();
        
        System.out.println("\nIntroduzca un valor superior");
        valsup = teclado.nextInt();
        
        for(i=valinf; i<valsup+1; i++){

            System.out.println("\n\n"+i+":\n");
            
            if(i%2==0){
                System.out.println("El número es par.");
            }
            else{
                System.out.println("El número no es par.");
            }
            
            if(i%3==0){
                System.out.println("El número es divisible entre 3.");
            }
            else{
                System.out.println("El número no es divisible entre 3.");
            }
            
            if(i%5==0){
                System.out.println("El número es divisible entre 5.");
            }
            else{
                System.out.println("El número no es divisible entre 5");
            }
   
        }
        
        salir();
        
    }
    
    
    static void salir(){
        Scanner teclado = new Scanner (System.in);
        String letra;
        
        System.out.println("\n¿Desea continuar?");
        System.out.println("No. Presione E");
        System.out.println("Sí. Presione cualquier otra tecla");
        letra = teclado.nextLine();
        
        if(letra.equals("E")){
            System.exit(0);
        }
        
        menu();
    }
    
    
    
}
