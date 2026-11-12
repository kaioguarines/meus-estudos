package EstruturaCondicionais;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Escreva um Numero: ");
        a = sc.nextInt();
        if (a < 0) {
            System.out.println(a + " Numero Negativo");
        }else {
            System.out.println("Nao Negativo");
        }
        sc.close();
    }
}
