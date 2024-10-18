package programaçãoOrientadaAObjetos.pilaresPoo.abstração;

// Classe abstrata
abstract class Animal {
    // Método abstrato
    abstract String fazerSom();
}

// Classe concreta que herda de Animal
class Cachorro extends Animal {
    @Override
    String fazerSom() {
        return "Au Au";
    }
}

// Outra classe concreta que herda de Animal
class Gato extends Animal {
    @Override
    String fazerSom() {
        return "Miau";
    }
}

// Classe principal para testar
/*public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        System.out.println(animal1.fazerSom());  // Saída: Au Au
        System.out.println(animal2.fazerSom());  // Saída: Miau
    }*/

/*
Explicação do código:
Classe Abstrata: A classe Animal é declarada como abstract e contém um método abstrato fazerSom(). Isso força as subclasses a implementarem esse método.

Classes Concretas: Cachorro e Gato estendem a classe Animal e implementam o método fazerSom().

Classe Principal: Na classe Main, instanciamos as classes Cachorro e Gato e chamamos o método fazerSom(), que retorna os sons correspondentes.

Essa estrutura permite que você trabalhe com diferentes tipos de Animal de forma polimórfica, mantendo a abstração dos detalhes de implementação.*/
