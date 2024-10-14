package edu.dio.condicionais;

public class SistemaMedida {

    public static void main(String[] args) {
        String plano = "M";
//switch e melhor utilizado quando você precisa usar as opções abaixo deixando sem break para não ter parada assim também utilizando codigo abaixo da opção selecionada
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}


     /*   String sigla = "G";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}*/
//switch case com if /else if/ else
        /*if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MEDIO");
        else if(sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");*/





