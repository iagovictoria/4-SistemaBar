
public class ClienteSocio extends Cliente {
	String numSocio;

	public ClienteSocio(String cpf, int idade, String genero, String numSocio) {
		super(cpf, idade, genero);
		this.numSocio = numSocio;
	}

	public String getNumSocio() {
		return numSocio;
	}
}
