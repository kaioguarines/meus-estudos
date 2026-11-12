package EstruturaSequecial;

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a;
        double b;
        String c;
        char d;

        a = sc.nextInt();
        b = sc.nextDouble();
        c = sc.next();
        d = sc.next().charAt(0);

        System.out.println("Voce Digitou: " + a);
        System.out.printf("Voce Digitou: %.2f%n", b);
        System.out.println("Voce Digitou: " + c);
        System.out.println("Voce Digitou: " + d);

        Scanner scn = new Scanner(System.in);

        String s1, s2, s3;


        s1 = scn.nextLine();
        s2 = scn.nextLine();
        s3 = scn.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scn.close();

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado  = " + B);
        System.out.println(x + " elevado ao quadrado" + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
