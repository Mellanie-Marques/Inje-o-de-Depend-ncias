package no.dependency.injection;

public class ServicoEmail implements ServicoMensagem{
    @Override
    public void enviarMensagem(String msg, String receiver) {
        System.out.println("Enviando e-mail para " + receiver + ": " + msg);
    }
}
