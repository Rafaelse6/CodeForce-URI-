
package media;
import java.util.Scanner;


public class Media {

   
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
       
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double MEDIA = ((2.0 * n1) + (3.0* n2) + (5.0 * n3))/10;
        System.out.println(String.format("MEDIA = %.1f" , MEDIA));
    }
    
}
