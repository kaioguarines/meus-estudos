package EstruturaCondicionais;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Escreva um numero");
        a = sc.nextInt();
        if (a % 2 == 0 ) {
            System.out.println("O numero " + a + " e par.");
        }else {
            System.out.println("O numero " + a + " e impar.");

        }
        sc.close();
    }
}
