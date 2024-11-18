package no.dependency.injection;

public class ServicoSMS implements ServicoMensagem{
    @Override
    public void enviarMensagem(String msg, String receiver) {
        System.out.println("Enviando SMS para " + receiver + ": " + msg);
    }
}
