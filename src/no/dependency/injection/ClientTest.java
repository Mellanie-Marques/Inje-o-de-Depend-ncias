package no.dependency.injection;

public class ClientTest {
	//public static void main(String[] args) {
		//MyApplication app = new MyApplication();
		//app.processMessages("Ola Alex! Mostra um exemplo de DI.", "alex@ifpb.edu.br");
	//}
	public static void main(String[] args) {
		// Injetando o serviço de e-mail
		ServicoMensagem servicoEmail = new ServicoEmail();
		MyApplication appEmail = new MyApplication(servicoEmail);
		appEmail.submitMessage("Olá via e-mail!", "usuario@exemplo.com");

		// Injetando o serviço de SMS
		ServicoMensagem servicoSMS = new ServicoSMS();
		MyApplication appSMS = new MyApplication(servicoSMS);
		appSMS.submitMessage("Olá via SMS!", "+5511999999999");
	}
}
