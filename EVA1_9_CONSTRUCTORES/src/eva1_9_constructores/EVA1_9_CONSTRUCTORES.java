package eva1_9_constructores;


public class EVA1_9_CONSTRUCTORES {

   
    public static void main(String[] args) {
       CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Cliente: " + cuenta.getCliente());
        System.out.println("Cuenta: " + cuenta.getNoCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo()) ;
    }
    
}
