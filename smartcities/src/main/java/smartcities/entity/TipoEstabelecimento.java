package smartcities.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_estabelecimento")
public class TipoEstabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_estabelecimento")
	private int id;

	@Column(name = "nome_tipo_estabelecimento", nullable = false, length = 50)
	private String nome;

	@OneToMany(mappedBy = "tipo")
	private Collection<Estabelecimento> estabelecimentos;

	public TipoEstabelecimento() {
		super();
	}

	public TipoEstabelecimento(int id, String nome, Collection<Estabelecimento> estabelecimentos) {
		this.id = id;
		this.nome = nome;
		this.estabelecimentos = estabelecimentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(Collection<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

}
