import java.util.Scanner;

public class ValoresInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int resultado = n1 + n2;
        System.out.println("SOMA = " + resultado);

        sc.close();
    }
}


/*
Faça um programa para ler dois valores inteiros, e
depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. 

Entrada: 
10 
30 
Saída: 
SOMA = 40 
-------------------------------
  
Entrada: 
-30 
10 
Saída: 
SOMA = -20 
---------------------------------

Entrada: 
0 
0 
Saída: 
SOMA = 0 
*/