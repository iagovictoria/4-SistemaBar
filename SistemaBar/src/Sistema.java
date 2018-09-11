import java.util.ArrayList;

public class Sistema {
	ArrayList<Cliente> clientes;

	public Sistema() {
		clientes = new ArrayList<Cliente>();
	}

	public void registrarEntradaCliente(Cliente c) {
		if(buscarClienteCpf(c.getCpf()).equals(null)) {
			clientes.add(c);
			//escrever no arquivo
		} else {
		//escrever no arquivo
		}
	}

	public void registrarSaidaCliente(String cpf) {
		if (!clientes.isEmpty()) {
			for (Cliente c : clientes) {
				if (c.getCpf().equals(cpf)) {
					clientes.remove(c);
					//escrever no arquivo
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

}
