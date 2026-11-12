package EstruturaCondicionais;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial;
        int horaFinal;
        int duracao;
        System.out.println("Escreva hora inicial do jogo");
        horaInicial = sc.nextInt();
        System.out.println("Escreva hora final do jogo");
        horaFinal = sc.nextInt();


        if (horaFinal  > horaInicial){
            duracao = horaFinal - horaInicial;
        } else if (horaFinal < horaInicial) {
            duracao = (24 - horaInicial )+ horaFinal;
        } else {
            duracao = 24;
        }
        System.out.println("O jogo durou " + duracao + " Horas");
        sc.close();
    }
}
