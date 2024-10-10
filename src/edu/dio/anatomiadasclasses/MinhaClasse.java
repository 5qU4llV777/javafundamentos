package edu.dio.anatomiadasclasses;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "claudio";
        String segundoNome = "nogueira";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome ) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
//// parei nesta aula = Anatomia das Classes - 4
//////// test de variaveis
/*
declarar uma variavel em java segue sempre a seguinte estrutura

tipo nomeBemDefinido = atribuilção (opcional em alguns casos

exemplo
int idade = 30;
double altura = 1.62;
Dog spike;
int ano = 2021;
ano = 2022;

final String BR = "Brasil";
String meuNome = "claudio";

int anoFabricacao = 2022;

boolean verdadeira = false;

anoFabricacao = 2024;
BR = "Brazil";*/
