package br.nom.martinelli.ricardo.academix.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.nom.martinelli.ricardo.academix.model.Campus;

import javax.persistence.ManyToOne;

@Entity
public class Localizacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8131750946828053542L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@ManyToOne(optional = false)
	@NotNull
	private Campus campus;

	@Column(length = 30, nullable = false)
	@NotNull
	@Size(max = 30)
	private String nome;

	@Column(length = 3, nullable = false)
	@NotNull
	@Max(999)
	private Integer quantidade;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Localizacao)) {
			return false;
		}
		Localizacao other = (Localizacao) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public Campus getCampus() {
		return this.campus;
	}

	public void setCampus(final Campus campus) {
		this.campus = campus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (nome != null && !nome.trim().isEmpty())
			result += "nome: " + nome;
		if (quantidade != null)
			result += ", quantidade: " + quantidade;
		return result;
	}
}