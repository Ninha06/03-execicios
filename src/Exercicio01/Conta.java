package Exercicio01;

public class Conta {

    String correntista;
    int numeroConta;
    double saldo;

    public void sacar (double valor){
        //NÃO trabalha metodo com static
        saldo = saldo - valor;
    }

    public void deposito (double valor){
        saldo = saldo + valor;
    }



}
