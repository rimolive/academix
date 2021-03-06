package br.nom.martinelli.ricardo.academix.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Campus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2951632826636329977L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(length = 40, nullable = false)
	@NotNull
	@Size(max = 40)
	private String nome;

	@ManyToOne(optional = false)
	@NotNull
	private Endereco endereco;

	@Column(nullable = false)
	@NotNull
	@Max(99999)
	private Integer numero;

	@Column(length = 30)
	@Size(max = 30)
	private String complemento;

	@Column(length = 13)
	@Size(max = 13)
	private String telefone;

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
		if (!(obj instanceof Campus)) {
			return false;
		}
		Campus other = (Campus) obj;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(final Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (id != null)
			result += "id: " + id;
		result += ", version: " + version;
		if (nome != null && !nome.trim().isEmpty())
			result += ", nome: " + nome;
		if (endereco != null)
			result += ", endereco: " + endereco;
		if (numero != null)
			result += ", numero: " + numero;
		if (complemento != null && !complemento.trim().isEmpty())
			result += ", complemento: " + complemento;
		if (telefone != null && !telefone.trim().isEmpty())
			result += ", telefone: " + telefone;
		return result;
	}
}