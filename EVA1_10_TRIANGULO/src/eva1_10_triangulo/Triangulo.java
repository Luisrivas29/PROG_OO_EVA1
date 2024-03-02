package eva1_10_triangulo;


public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        base = -1;
        altura = -1;
    }
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(double valor){
        altura = valor;
    }
    
    public double getBase(){
        return base;
    }
    public void setBase(double valor){
        base = valor;
    }
    
    private double calcularArea(){
        return (base * altura)/2;
    }
    
    private double calcularPeri(){
        double hipo = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double peri = base + altura + hipo;
        return peri;
    }
    
    public void imprimirDatos(){
        System.out.println("El area del triangulo es: " + calcularArea());
        System.out.println("El perimetro del triangulo es: " + calcularPeri());
    }
}


