
import java.util.Scanner;

public class ExerCalcula {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Primeiro numero: ");   
        double n1 = leitor.nextDouble();
        
        System.out.print("Segundo numero: ");        
        double n2 = leitor.nextDouble();
        
        System.out.print("Operação: ");
        String op = leitor.next();
        
        
        
        
        switch(op){
            case "+": 
            double r1;
            r1 = n1+n2;
            System.out.println("Resultado: " + r1);
            break;
            
            case "-": 
            double r2;
            r2 = n1-n2;
            System.out.println("Resultado: " + r2);
            break;
            
            case "/": 
            double r3;
            r3 = n1/n2;
            System.out.println("Resultado: " + r3);
            break; 
           
            case "*": 
            double r4;
            r4 = n1/n2;
            System.out.println("Resultado: " + r4);
            break;
            
            
        }
        
        
        
        
        
}
}
