import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Sistema {
	ArrayList<Cliente> clientes;

	public Sistema() {
		clientes = new ArrayList<Cliente>();
	}

	public void registrarEntradaCliente(Cliente c) {
		if(buscarClienteCpf(c.getCpf()) == null) {
			clientes.add(c);
			try {
				gravarArquivo(c.getCpf(), "Entrada");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				gravarArquivo(c.getCpf(), "Entrada");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void registrarSaidaCliente(String cpf) {
		if (!clientes.isEmpty()) {
			Cliente c = buscarClienteCpf(cpf);
			if(c != null) {
					clientes.remove(c);
					try {
						gravarArquivo(cpf, "Saída");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}		
		}
	}

	public ArrayList<Cliente> listarClientes() {
		return clientes;
	}

	public Cliente buscarClienteCpf(String cpf) {
		if (!clientes.isEmpty()) {
			for (Cliente c : clientes) {
				if (c.getCpf().equals(cpf)) {
					return c;
				}
			}
		}
		return null;
	}

	public int quantidadeClientes() {
		return clientes.size();
	}

	public int quantidadeClientesMasc() {
		int cont = 0;
		if (!clientes.isEmpty()) {
			for (Cliente c : clientes) {
				if (c.getGenero().equals("Masculino")) {
					cont++;
				}
			}
			return cont;
		}
		return 0;

	}

	public int quantidadeClientesFem() {
		int cont = 0;
		if (!clientes.isEmpty()) {
			for (Cliente c : clientes) {
				if (c.getGenero().equals("Feminino")) {
					cont++;
				}
			}
			return cont;
		}
		return 0;

	}
	
	public int quantidadeSocios() {
		int cont = 0;
		if (!clientes.isEmpty()) {
			for (Cliente c : clientes) {
				if (c instanceof ClienteSocio) {
					cont++;
				}
			}
			return cont;
		}
		return 0;
	}
	
	public int quantidadeNaoSocios() {
		int cont = 0;
		if (!clientes.isEmpty()) {
			for (Cliente c : clientes) {
				if (!(c instanceof ClienteSocio)) {
					cont++;
				}
			}
			return cont;
		}
		return 0;
	}
	
	
	public void gravarArquivo(String cpf, String estado) throws IOException {
		Date d = new Date();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src\\SistemaBar.txt", true));
        buffWrite.append(estado + ": " + cpf + " - "+ d.toString());
        buffWrite.newLine();
        buffWrite.flush();
        buffWrite.close();
 	}
	

}
