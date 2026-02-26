package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Paciente pc = new Paciente();
            double [] freqAlvo = pc.freq_alvo();
            //double[] alvo; para vetores maiores para não ocupar tanto espaço no pc

        System.out.printf("Digite o nome do paciente: ");
        pc.nome=sc.next();
        //sc.nextline -> le absolutamente tudo que voce digitou na linha
        // /n é uma string e o nextline le tudo, por isso não funciona quando usado dps de um inteiro

        System.out.printf("Digite sua idade: ");
        pc.idade=sc.nextInt();

        System.out.println("A frequência máxima do paciente "+pc.nome+" É : "+pc.freq_maxima());
        System.out.println("A frequência alvo esta entre ["+freqAlvo[0]+ "] , ["+freqAlvo[1]+"]");






    }
}
