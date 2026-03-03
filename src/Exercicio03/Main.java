package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor pro = new Professor();


        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do professor: ");
            pro.nome= sc.next();
            System.out.print("Digite o número de aulas Semanais: ");
            pro.aulasSemanais= sc.nextInt();
            System.out.print("Digite o valor da hora por aula: ");
            pro.valorHoraAula= sc.nextDouble();


        }
        System.out.printf("Professor(a):", pro.nome);
        System.out.printf("Salário Bruto: R$", pro.calcularSalarioBruto());

    }
}
