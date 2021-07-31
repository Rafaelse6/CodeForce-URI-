
package calculosimples;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Calculosimples {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        int peca1  = scanner.nextInt();
        int n1     = scanner.nextInt();
        double v1  = scanner.nextDouble();
        
        
        
        int peca2 = scanner.nextInt();
        int n2    = scanner.nextInt();
        double v2 = scanner.nextDouble();
        
        double total = n1*v1 + n2*v2;
        
         System.out.println("VALOR A PAGAR: R$ " + d.format(total));
       
    }
    
}
