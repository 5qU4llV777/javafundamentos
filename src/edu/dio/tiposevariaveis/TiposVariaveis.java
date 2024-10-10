package edu.dio.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        String meuNome = "claudio";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        //valor nunca podera mudar , para declarar constante usar final nome da variavel tem que ser  na caixa alta
        final double VALOR_DE_PI = 3.14;
        //não pode ser alterado
        //VALOR_DE_PI = 5.90;

    }
}
