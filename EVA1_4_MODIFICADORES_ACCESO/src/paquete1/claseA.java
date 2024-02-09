
package paquete1;

import paquete2.claseB;
import paquete2.claseC;


public class claseA {

   
    public static void main(String[] args) {
      
        One obj1 = new One();
        System.out.println(obj1);
        
        // clases del paquete 2
        claseB objB = new claseB();
        System.out.println(objB);
        
        //Two obj2 = new Two(); --> no se puede usar 
                             //--> porque no es accesible
                             //--> tiene modificador default
                             
        claseC objC = new claseC();
        System.out.println(objC);
        
        //Three obj3 = new Three(); --> no se puede usar 
                             //--> porque no es accesible
                             //--> tiene modificador default
        
    }
    
}

class One{

}