package consumo;


import java.util.Scanner;
public class Consumo {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        double r = x/y;
        
        
        System.out.println(String.format("%.3f km/l", r));
        
        
    }
    
}
