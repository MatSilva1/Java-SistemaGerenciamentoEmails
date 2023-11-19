package matSilva1.emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email email1 = new Email("Joao", "Silva");
		
		email1.setAlternateEmail("js@outlook.com.br");
		System.out.println("\nEmail alternativo definido: " + email1.getAlternateEmail());
		
		System.out.println("\nLimite de emails atual: " + email1.getMailBoxCapacity());
		
		email1.setMailBoxCapacity(300);
		System.out.println("\nLimite foi alterado para: " + email1.getMailBoxCapacity());
		
		System.out.println("\n" + email1.showInfo());
		System.out.println("Senha: " + email1.getPassword());

	}

}
