package no.dependency.injection;
/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication {
	// classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
	// Isso leva à "dependência codificada"
	//private EmailService email = new EmailService();

	
	
	//public void processMessages(String msg, String rec){
		//aqui teríamos algumas mensagens de validação, manipulação da lógica, etc.
		//this.email.sendEmail(msg, rec);
	//}

	private ServicoMensagem servicoMensagem;

	// Injeção de dependência via construtor
	public MyApplication(ServicoMensagem servicoMensagem) {
		this.servicoMensagem = servicoMensagem;
	}

	public void submitMessage(String msg, String receiver) {
		// Lógica de validação e manipulação
		servicoMensagem.enviarMensagem(msg, receiver);
	}
}
