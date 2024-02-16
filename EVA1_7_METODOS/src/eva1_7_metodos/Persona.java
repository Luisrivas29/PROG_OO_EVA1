
package eva1_7_metodos;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    //METODOS GET Y SET
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setApellidos(String valor){
        apellidos = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    
    public String generarNombreCom(){
        return nombre + " " + apellidos;
    }
    
    //CALCULAR AÑO DE NACIMIENTO
    public int calcularAnnioNac(){
        return 2024 - edad;
    }
    
    
}
