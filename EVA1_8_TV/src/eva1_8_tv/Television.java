package eva1_8_tv;


public class Television {
    //ATRIBUTOS
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    //CONSTRUCTORES
    //CONSTRUCTOR SIN ARGUMENTOS: CONSTRUCTOR DEFAULT
    public Television(){
        //NO ES OBLIGATORIO
        volumen = 30;
        canal = 5;
        estaEncendida = false;
    }
    
    public void subirVolumen(){
        if(estaEncendida && (volumen < 100))
            volumen = volumen +1;
        //volumen+=1
        //volumen++
    }
    
    public void bajarVolumen(){
        if(estaEncendida && (volumen > 0))
            volumen = volumen - 1;
    }
    
    public void subirCanal(){
        if(estaEncendida)
            canal = canal + 1;
    }
    public void bajarCanal(){
        if(estaEncendida && (canal > 0))
            canal = canal - 1;
    }
    
    public void cambiarCanal(int noCanal){  //  ! --> negacion
        if(estaEncendida && !(noCanal < 0))
            canal = noCanal;
    }
    
    public void power(){
        /*if(estaEncendida == true)
            estaEncendida = false;
        else
            estaEncendida = true;*/
        estaEncendida = !estaEncendida;
    }
    
    public void imprimirConfig(){
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + estaEncendida);
    }
}
