package programaçãoOrientadaAObjetos.pilaresPoo.abstração;


public class ComputadorPedrinho {

    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        Facebook facebook = new Facebook();
        Telegram telegram = new Telegram();

        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("Telegram");
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
