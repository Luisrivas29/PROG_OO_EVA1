
package eva1_6_vehiculo;


public class EVA1_6_VEHICULO {

  
    public static void main(String[] args) {
        Vehiculo miCarrito = new Vehiculo();
        miCarrito.setMarca("Dodge");
        miCarrito.setModelo("Ram");
        miCarrito.setAño(2025);
        miCarrito.setColor("Azul");
        miCarrito.setPrecio(1000000);
        
        //leer valores
        
        System.out.println("Marca: " + miCarrito.getMarca());
        System.out.println("Modelo: " + miCarrito.getModelo());
        System.out.println("Año: " + miCarrito.getAño());
        System.out.println("Color: " + miCarrito.getColor());
        System.out.println("Precio: " + miCarrito.getPrecio());
       
        
    }
    
}
