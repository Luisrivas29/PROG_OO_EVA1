
package eva1_6_vehiculo;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double precio;
    
    //METODOS
    
    //MARCA
    
    public String getMarca(){
        return marca;
    } 
    public void setMarca(String valor){
        marca = valor;
    }
    
    //MODELO
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String valor){
        modelo = valor;
    }
    
    //AÑO
    public int getAño(){
        return annio;
    }
    
    public void setAño(int valor){
        annio = valor;
    }
    
    //COLOR
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String valor){
        color = valor;
    }
    
    //PRECIO
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double valor){
        precio = valor;
    }
}
    
    

