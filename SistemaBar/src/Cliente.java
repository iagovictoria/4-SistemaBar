
public class Cliente {
	String cpf;
	int idade;
	String genero;

	public Cliente(String cpf, int idade, String genero) {
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}

	
	public String getCpf() {
		return cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getGenero() {
		return genero;
	}
}
