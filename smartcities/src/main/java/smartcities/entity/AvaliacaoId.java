package smartcities.entity;

import java.io.Serializable;

public class AvaliacaoId implements Serializable {

	private int cliente;

	private int estabelecimento;

	public AvaliacaoId() {
		super();
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(int estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cliente;
		result = prime * result + estabelecimento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoId other = (AvaliacaoId) obj;
		if (cliente != other.cliente)
			return false;
		if (estabelecimento != other.estabelecimento)
			return false;
		return true;
	}

}
