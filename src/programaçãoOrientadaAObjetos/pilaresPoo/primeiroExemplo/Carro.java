package programaçãoOrientadaAObjetos.pilaresPoo.primeiroExemplo;
// para fazer uso de herança de classe usar a palavra extends + a classe de destino

public class Carro extends Veiculo {
    //foi retirado para exemplo de herença, passado para classe herança
   /* private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }*/

    public void ligar() {
        //para chamar funções encapsuladas colocar a chamada da função dentro de outra função
        confereCambio();
        confereCombustivel();
        conferindoEmbreagem();
        System.out.println("Carro ligado");
    }
    public void acionarTurbo() {
        System.out.println("Turbo acionado");
    }
    // para encapsular usar private, trocar public por private
    private void confereCombustivel() {
        System.out.println("conferindo combustivel");
    }
    // para encapsular usar private, trocar public por private
    private void confereCambio() {
        System.out.println("conferindo cambio");
    }
    public void acionandoNitro() {
        System.out.println("nitro ativado Vrummmmm");
    }
    private void conferindoEmbreagem(){
        System.out.println("embreagem esta precionada");
    }
}
