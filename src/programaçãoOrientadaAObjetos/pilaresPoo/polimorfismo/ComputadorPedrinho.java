package programaçãoOrientadaAObjetos.pilaresPoo.polimorfismo;

import programaçãoOrientadaAObjetos.pilaresPoo.polimorfismo.apps.Facebook;
import programaçãoOrientadaAObjetos.pilaresPoo.polimorfismo.apps.MSNMessenger;
import programaçãoOrientadaAObjetos.pilaresPoo.polimorfismo.apps.ServicoMensagemInstantanea;
import programaçãoOrientadaAObjetos.pilaresPoo.polimorfismo.apps.Telegram;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        /*não se sabe qual app
        mas qualquer um deverá enviar e receber mensagem
        *
        * */

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("Facebook"))
            smi = new Facebook();
        else if(appEscolhido.equals("Telegram"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();





    }


}
