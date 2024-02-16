package eva1_7_metodos;

import java.util.Scanner;


public class EVA1_7_METODOS {

    
    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellidos("Perez");
        perso.setEdad(50);
        
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nacio en el año: " + perso.calcularAnnioNac());
        //--------
        Persona[] grupo = new Persona[5];
        //HAY QUE CREAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++){
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //UNA VEZ CREADO EL OBJETO HAY QUE LLENARLO:
            System.out.println("Introduce el nombre: ");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido: ");
            String apellido = input.nextLine();
            grupo[i].setApellidos(apellido);
            
            System.out.println("Introduce la edad: ");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
        }
        //LEER
        for (int i = 0; i < grupo.length; i++){
            System.out.println("El nombre es " + grupo[i].generarNombreCom());
            System.out.println("Nacio en el año: " + grupo[i].calcularAnnioNac());
        }
       
    }
    
}
