package edu.dio.estruturasDeRepetição;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <=5; numero++){

            if (numero==3)
                //ou continue
                break;

            System.out.println(numero);

        }

    }

}
