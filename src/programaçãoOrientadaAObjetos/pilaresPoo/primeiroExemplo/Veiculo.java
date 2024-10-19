package programaçãoOrientadaAObjetos.pilaresPoo.primeiroExemplo;
// a classe tambem recebe a palavra abstract para se tornar abstrata
public  abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    //abstração e usada a palavra abstract
    public abstract void ligar();
}
