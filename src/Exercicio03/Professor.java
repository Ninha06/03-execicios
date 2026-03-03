package Exercicio03;

public class Professor {

    String nome;
    int aulasSemanais;
    double valorHoraAula;


    public double calcularSalarioBase() {
        return aulasSemanais * 4.5 * valorHoraAula;
    }

    public double calcularHoraAtividade() {
        return calcularSalarioBase() * 0.05;
    }

    public double calcularDSR() {
        double totalSemDSR = calcularSalarioBase() + calcularHoraAtividade();
        return totalSemDSR / 6.0;
    }

    public double calcularSalarioBruto() {
        return calcularSalarioBase() + calcularHoraAtividade() + calcularDSR();
    }







}
