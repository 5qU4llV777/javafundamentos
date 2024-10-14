package edu.dio.estruturasDeRepetição;

public class ExemploForArray {

    public static void main(String[] args) {
//arrays a maioria começa indice 0
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);

        /*for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);*/
        }

    }
}
//estruturas de repetição parei Break e Continue