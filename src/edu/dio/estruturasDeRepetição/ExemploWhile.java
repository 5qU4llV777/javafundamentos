package edu.dio.estruturasDeRepetição;

import java.util.concurrent.ThreadLocalRandom;


public class ExemploWhile {

    public static void main(String[] args) {

        double mesada = 50;
        while (mesada>0) {

            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("doce do valor " + valorDoce + " Adicionado no carrinho ");
            mesada = mesada - valorDoce;
        }
         System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");

        }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }
    }

/*
 * Não se preocupe quanto a formatação de valores
 * Iremos explorar os recursos de formatação em breve !!
 */