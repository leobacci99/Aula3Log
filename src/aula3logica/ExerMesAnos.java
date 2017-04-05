package aula3logica;

import java.util.Scanner;

public class ExerMesAnos {
    public static void main(String[] args) {
        Scanner visor = new Scanner(System.in);
        
        System.out.print("Mês:");
        String m = visor.next() ;        
        
        switch (m){
            case "1": 
            System.out.println("Esse mês tem 31 dias");
            break;
              
            case "2": 
            System.out.println("Esse mês tem 28 dias");
            break;
            
            case "3": 
            System.out.println("Esse mês tem 31 dias");
            break;
            
            case "4": 
            System.out.println("Esse mês tem 30 dias");
            break;
            
            case "5": 
            System.out.println("Esse mês tem 31 dias");
            break;
            
            case "6": 
            System.out.println("Esse mês tem 30 dias");
            break;
            
            case "7": 
            System.out.println("Esse mês tem 31 dias");
            break;
            
            case "8": 
            System.out.println("Esse mês tem 31 dias");
            break;
            
            case "9": 
            System.out.println("Esse mês tem 30 dias");
            break;
            
            case "10": 
            System.out.println("Esse mês tem 31 dias");
            break;
            
            case "11": 
            System.out.println("Esse mês tem 30 dias");
            break;
            
            case "12": 
            System.out.println("Esse mês tem 31 dias");
            break;
            
        }
        
        
        
    }
}
