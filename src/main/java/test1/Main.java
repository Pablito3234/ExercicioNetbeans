package test1;

import java.lang.Math;
public class Main {
    public boolean primo(int numero){
        int Divisor = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                Divisor = Divisor += 1;
            }
        }
        if (Divisor == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public int sortear(int min, int max){
        int intervalo = (max - min) + 1;
        return (int) (Math.random() * intervalo) + min; 
        }

    public static void main(String[] args) {

        Main objeto = new Main();
        int[] vet = new int[20];
      //  System.out.println(objeto.sortear(10,20));
        int cont =0;
        for (int i = 0; i < 20; i++) {
            vet[i]=objeto.sortear(30, 100);
         System.out.println(vet[i] +"   "+ i );
      
        }

        
       /* System.out.println("\n");
        
        for (int i = 0; i < 20; i++) {
            if (objeto.primo(vet[i]) == true) {
                System.out.println(vet[i] + " é primo");
            }
        }*/   
    }
    
}
