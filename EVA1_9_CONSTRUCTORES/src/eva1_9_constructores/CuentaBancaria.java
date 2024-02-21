package eva1_9_constructores;


public class CuentaBancaria {
    private double saldo;
    private int noCuenta;
    private String cliente;
    
    //constructor default
    public CuentaBancaria(){
        saldo = 1000000;
        noCuenta = 0;
        cliente = "SIN CLIENTE";
    }
    
    //get y set
    public int getNoCuenta(){
        return noCuenta;
    }
    public void setNoCuenta(int cuenta){
        noCuenta = cuenta;
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String nomCliente){
        cliente = nomCliente;
    }
    public double getSaldo(){
        return saldo;
    }
    public void retirar(double monto){
        if(saldo >= monto)
            saldo = saldo - monto;
    }
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
   
    
}
