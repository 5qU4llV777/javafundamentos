package programaçãoOrientadaAObjetos.pilaresPoo.primeiroExemplo;
// para fazer uso de herança de classe usar a palavra extends + a classe de destino

public class Moto extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("moto ligada");

    }

    //foi retirado para exemplo de herença, passado para classe herança
   /* private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }*/

}
