package salario;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double s = scanner.nextDouble();
        double salary = s*y;
        
       
        
        System.out.println("NUMBER = " + x);
        System.out.println("SALARY = U$" + d.format(salary));
    }
    
}
