package programaçãoOrientadaAObjetos.pilaresPoo.polimorfismo.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente as classes filhos podem ver esta função protected desde que estejam no mesmo pacote

    protected void validarConectadoInternet() {

        System.out.println("Validando se está conectado a internet");
    }
}
