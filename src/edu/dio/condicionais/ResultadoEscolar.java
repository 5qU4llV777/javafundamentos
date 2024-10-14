package edu.dio.condicionais;

public class ResultadoEscolar {

    public static void main(String[] args) {
//condição ternaria
        int nota = 3;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);




// condição ternaria
        /*int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/
    }
}






   /*     int nota = 10;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");

        //é possivel colocar varios else if se necessario
        //else if (nota >= 5 && nota < 7)true /false
            //System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");

    }
}*/
