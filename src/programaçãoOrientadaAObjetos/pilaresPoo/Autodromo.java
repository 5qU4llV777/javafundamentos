package programaçãoOrientadaAObjetos.pilaresPoo;

public class Autodromo {

    public static void main(String[] args) {

        Carro jeep = new Carro();
        jeep.setChassi("897897");
        jeep.ligar();
        jeep.acionarTurbo();
        jeep.acionandoNitro();

        Moto hornet = new Moto();
        hornet.setChassi("999999");
        hornet.ligar();

        //exemplo de polimorfismo
       /* Veiculo coringa = jeep;
        coringa.ligar();*/


    }

}
