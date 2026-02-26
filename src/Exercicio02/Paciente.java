package Exercicio02;

public class Paciente {
    int idade;
    String nome;



    public int freq_maxima (){
        return 220 - idade;
    }

    public  double [] freq_alvo (){
        double [] alvo = new double[2];
        int fm = freq_maxima(); // criamos uma variavél para não ocupar espaço no computador
        alvo[0]= fm*0.5;
        alvo[1]= fm*0.85;
        return alvo;
    }
}
