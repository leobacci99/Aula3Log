package aula3logica;

import java.util.Scanner;

public class Aula3Logica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
       
        //ENTRADA
        System.out.print("Tipo: ");
        String tipo = leitor.next();
        
        System.out.println("Temperatura: ");
        double temperatura = leitor.nextDouble();
       
        //PROCESSAMENTO    
        boolean transporte = false;
        switch (tipo) {
            case "A": if (temperatura >= 10 && temperatura <= 17){
                transporte = true;
            }else{
                transporte = false;
            } break;
            
            case "B": if (temperatura >= 11 && temperatura <= 16){
                transporte = true;
            }else{
                transporte = false;
            } break;   
            
            case "C": if (temperatura >= 12 && temperatura <= 15){
                transporte = true;
            }else{
                transporte = false;
            } break;            
            
             case "D": transporte = temperatura >= 13 && temperatura <=14;
              break;           
    }
        //SAIDA
        if (transporte) {
            System.out.println("Pode transportar");
        }else{
            System.out.println("Não pode transportar");
            
        }
 
    
    }
    
}
