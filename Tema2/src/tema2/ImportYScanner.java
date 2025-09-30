package tema2;
        
        import java.lang.System;
        import java.lang.AbstractMethodError;
                
                
        import java.lang.*;
                
        import java.util.Scanner;
public class ImportYScanner {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Estoy aprendiendo a importar paquetes");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuanto dinero tienes en la cuenta?");
        
        int dinero = entrada.nextInt();
        
        System.out.println("Tienes " + dinero + " euros");
    }
    
}
