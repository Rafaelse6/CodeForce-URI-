
package media1;
import java.util.Scanner;

public class Media1 {

    
    public static void main(String[] args) {
          
       Scanner scanner = new Scanner(System.in);
       
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double MEDIA = ((3.5 * n1) + (7.5 * n2))/11;
        System.out.println(String.format("MEDIA = %.5f" , MEDIA));
    }
    
}
