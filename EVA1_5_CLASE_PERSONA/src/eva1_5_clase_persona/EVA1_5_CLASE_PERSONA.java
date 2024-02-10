package eva1_5_clase_persona;


public class EVA1_5_CLASE_PERSONA {

    
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        
        // seccion de escritura:
        
        perso1.setNombre("Juan");
        perso1.setApellidos("Perez Jolote");
        perso1.setEdad(50);
        
        // seccion de lectura: 
        
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());

    }
    
}

class Persona{
    // atributos --> estado del objeto
    // no deben ser accesibles directamente
    private String nombre;
    private String apellidos;
    private int edad;
    
    // metodos:
    // publicos --> son la interfaz
    // si son para manipular los atributos hay un estandar
    // en java
    //metodos set (escritura) y get (lectura)
    
    //son opcionales, no es obligatorio que tenga metodo get o set
    
    //nombre
    public String  getNombre(){
        return nombre;
    }
        
    public void setNombre(String valor){
        nombre = valor;
    }
    
    //apellidos
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String valor){
        apellidos = valor;
    }
    
    // edad
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad = valor;
    }
    
    
    
    }
    
    

