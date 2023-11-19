package matSilva1.emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLen = 8;
	private String department;
	private String email;
	private String companyNameSuffix = "empresa.com.br";
	private int mailBoxCapacity = 500;
	private String alternativeEmail;
	
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		
		this.password = randomPassword(defaultPasswordLen);
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" 
											+ this.department.toLowerCase() + "." + companyNameSuffix;
		
	}
	
	private String setDepartment() {
		System.out.println("\nSelecione o setor:\n1 - Vendas\n2 - Contas\n3 - Desenvolvimento\n0 - Nenhum dos anteriores\n\nDigite o numero do departamento: ");
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		
		switch(depChoice) {
			case 1:
				in.close();
				return "Vendas";
			case 2:
				in.close();
				return "Contas";
			case 3:
				in.close();
				return "Desenvolvimento";
			case 0:
				in.close();
				return "";
			default:
				System.out.println("Digite apenas numeros \nPrograma sendo finalizado");
				break;
		}
		
		in.close();
		return "";
	}
	
	private String randomPassword(int lenght) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ1234567890@#%!abcdefghijklmnopqrstuvxyz";
		char[] password = new char[lenght];
		
		for(int i=0; i<lenght; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String (password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() { return mailBoxCapacity; }
	public String getAlternateEmail() { return alternativeEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "\nResumo: \n" +
				"\nEmail sera gerado para: " + firstName + " " + lastName +
				"\nEmail corporativo: " + email +
				"\nCapacidade da caixa de entrada: " + mailBoxCapacity + "MB";
	}
}
