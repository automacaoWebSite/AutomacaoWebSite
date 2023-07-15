package Steps;

import Elementos.ElementosDeTelaCadastro;
import Metodos.MetodosPage;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class Teste {
	
	ElementosDeTelaCadastro e = new ElementosDeTelaCadastro();
	MetodosPage m = new MetodosPage();

	@Dado("^que estou na página de cadastro \"([^\"]*)\"$")
	public void que_estou_na_página_de_cadastro(String url) throws Throwable {
	 m.abrirnavegador(url);
	   Thread.sleep(5000);
	   System.out.println("");
	   System.out.println("=======================");
	   System.out.println(" Abrindo site aguarde...");
	   System.out.println("=======================");
	   System.out.println("");
	 
	 
	}

	@Quando("^preencho o formulário com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha$")
	public void preencho_o_formulário_com_um_nome_válido_um_e_mail_válido_uma_senha_válida_e_a_confirmação_da_senha() throws Throwable {
		
	    m.imagens(e.getImageUpload());
	    System.out.println("-Imagem OK.");
	    Thread.sleep(500);
		
		m.preencher(e.getfirstName(), "Jhone");
		System.out.println("-firstName OK.");
		Thread.sleep(500);
		
		m.preencher(e.getlastName(), "Joe");
		System.out.println("-lastName OK.");
		Thread.sleep(500);
		
		m.preencher(e.getAddress(), "BRASIL - BA / SALVADOR");
		System.out.println("-Address OK.");
		Thread.sleep(500);
		
		m.preencher(e.getEmailAddress(), "jhonejoe@hotmail.com");
		System.out.println("-EmailAddress OK.");
		Thread.sleep(500);
		
		m.preencher(e.getPhone(), "1234567891");
		System.out.println("-Phone OK.");
		Thread.sleep(500);
		
		m.clicar(e.getGener());
		System.out.println("-Gene OK.");
		Thread.sleep(500);
		
		m.clicar(e.getHobbies());	 
		System.out.println("-Hobbies OK.");
		Thread.sleep(500);
		
		m.clicar(e.getLanguages());
		    System.out.println("-Languages OK.");
		    Thread.sleep(1000);
		
		m.clicar(e.getLanguagess());
		    System.out.println("-Languagess OK.");
		    Thread.sleep(1000);
		
		m.clicar(e.getSkills());
		System.out.println("-Skills OK.");
	    Thread.sleep(500);
		
		//m.clicar(e.getCountry());
		System.out.println("- Country sem elementos para selecionar !!!");
		Thread.sleep(500);
		
		m.clicar(e.getSelectCountry());
		System.out.println("-SelectCountry OK.");
		Thread.sleep(500);
		
		m.clicar(e.getDateOfBirtha());
		System.out.println("-DateOfBirtha OK.");
		Thread.sleep(500);
		
		m.clicar(e.getDateOfBirthm());
		System.out.println("-DateOfBirthm OK.");
		Thread.sleep(500);
		
		m.clicar(e.getDateOfBirthd());
		System.out.println("-DateOfBirthd OK.");
		Thread.sleep(500);
		
		m.preencher(e.getPassword(), "12345678");
		System.out.println("-Password OK.");
		Thread.sleep(500);
		
		m.preencher(e.getConfirmPassword(), "12345678");
		System.out.println("-ConfirmPassword OK.");
		Thread.sleep(500);
	}

	@Quando("^clico no botão \"([^\"]*)\"$")
	public void clico_no_botão(String arg1) throws Throwable {
		m.clicar(e.getBtnSubmit());
		System.out.println("-Botão Submit OK.");
		
		System.out.println("");
		System.out.println("=======================");
		System.out.println("-Aguarde finalizando...");
		System.out.println("=======================");
		System.out.println("");
		Thread.sleep(5000);
	 
	}

	@Então("^vejo uma mensagem de sucesso indicando que meu cadastro foi realizado$")
	public void vejo_uma_mensagem_de_sucesso_indicando_que_meu_cadastro_foi_realizado() throws Throwable {
	
		

        // Fechar o navegador
        m.fecharNavegador();
        System.out.println("=================================");
        System.out.println("Desafio finalizado com sucesso!!!");
        System.out.println("=================================");
        
	}


	
}
