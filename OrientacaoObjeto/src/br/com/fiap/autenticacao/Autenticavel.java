package br.com.fiap.autenticacao;

public interface Autenticavel {
	
	String MSG_LOGOUT = "Saindo...";
	
	boolean login(String usuario, String senha);
	
	void logout();
	
}
