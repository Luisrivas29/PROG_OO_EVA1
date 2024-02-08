package eva1_3_modificadores_acceso;

import paquete2.clase2;


public class EVA1_3_MODIFICADORES_ACCESO {

    public int x;
        protected int y;
        private int z;
        int w;
  
    public static void main(String[] args) {
        PruebaA objA = new PruebaA();
       // objA. --> puedo ver x (public)
       //puedo ver a y (protected)
       //puedo ver a w (default)
       
       clase2 objeto = new clase2();
       //objeto.x --> se ve x porque es public
       //los demas no son visibles
       //esta clase no es visible en este paquete:
      // PruebaB objB = new PruebaB();
       
}
       
}
    


// clase con acceso default

class PruebaA{
public int x;
        protected int y;
        private int z;
        int w;

}