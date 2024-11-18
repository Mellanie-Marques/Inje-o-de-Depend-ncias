Pratica de Padrões de Projeto

Usando o padrão de Injeção de Dependências 

Enunciado:
A classe Aplicacao adota uma interface textual (console) para troca de mensagens

com o usuário e tem a responsabilidade de inicializar internamente o serviço de e-
mail e então utilizá-lo. Isso leva à dependência codificada. Isto é, se quisermos

mudar para algum outro serviço de envio de mensagens no futuro, serão necessárias
alterações de código na classe Aplicacao. Essa decisão torna o aplicativo difícil de
estender.
 Considerando que desejamos estender nosso aplicativo para também prover o envio
de mensagens via SMS ou pelo whatsapp, por exemplo, precisaremos escrever outras
classes Aplicacao para isso: uma para cada serviço. Assim, haverá
alterações/replicações de código em classes de aplicativos e também em classes de
clientes.
Pode-se levantar, então, o argumento de que podemos remover a criação da
instância do serviço de e-mail da classe Aplicacao alterando o construtor para que receba
o serviço de e-mail como argumento.
