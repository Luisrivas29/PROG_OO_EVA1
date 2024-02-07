
package eva1_2_instanciacion;


public class EVA1_2_INSTANCIACION {

    
    public static void main(String[] args) {
        
        int valor = 100;
        //INSTANCIACION
        //CLASE IDENTIFICADOR = new Constructor();
        //Constructor --> Método con el mismo nombre de la clase
        
        Persona perso1= new Persona(); // instanciacion
        System.out.println(perso1);
        
        //perso1 --> referencia --> direccion de memoria
        
        Vehiculo lamamalona = new Vehiculo();
        System.out.println(lamamalona);
        lamamalona.marca = "Dodge";
        lamamalona.modelo = "Ram";
        lamamalona.annio = 2006;
        System.out.println("Marca: " + lamamalona.marca);
        System.out.println("Modelo: " + lamamalona.modelo);
        System.out.println("Año: " + lamamalona.annio);
        
    }
    
}

class Persona{
}

class Vehiculo{
    //ATRIBUTOS
    String marca;
    int annio;
    String modelo;
    
}