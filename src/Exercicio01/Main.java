package Exercicio01;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double valor;

        System.out.print("Correntista -->");
        conta.correntista=sc.next();
        conta.numeroConta = rd.nextInt(1000,9999);


        System.out.println("Saldo Inicial R$ " + df.format(conta.saldo));
        System.out.println("Digite o valor do depósito R$ :");
        valor = sc.nextDouble();
        conta.deposito(valor);
        System.out.println("Saldo atual R$ " + df.format(conta.saldo));

        System.out.println("Digite o valor do saque R$ :");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo atual R$ " + df.format(conta.saldo));
    }
}
