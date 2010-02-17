package br.inf.prismasoft.academix.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Localizacao generated by hbm2java
 */
@Entity
@Table(name = "LOCALIZACAO", schema = "ACADEMIX")
public class Localizacao implements java.io.Serializable {

	private static final long serialVersionUID = 2310608392969634482L;
	private Integer idtLocalizacao;
	private String desLocalizacao;
	private Set<GradeHorariaItem> gradeHorariaItems = new HashSet<GradeHorariaItem>(0);

	public Localizacao() {
	}

	public Localizacao(String desLocalizacao) {
		this.desLocalizacao = desLocalizacao;
	}

	public Localizacao(String desLocalizacao,
			Set<GradeHorariaItem> gradeHorariaItems) {
		this.desLocalizacao = desLocalizacao;
		this.gradeHorariaItems = gradeHorariaItems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idt_localizacao", unique = true, nullable = false)
	public Integer getIdtLocalizacao() {
		return this.idtLocalizacao;
	}

	public void setIdtLocalizacao(Integer idtLocalizacao) {
		this.idtLocalizacao = idtLocalizacao;
	}

	@Column(name = "des_localizacao", nullable = false, length = 20)
	@NotNull
	@Length(max = 20)
	public String getDesLocalizacao() {
		return this.desLocalizacao;
	}

	public void setDesLocalizacao(String desLocalizacao) {
		this.desLocalizacao = desLocalizacao;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "localizacao")
	public Set<GradeHorariaItem> getGradeHorariaItems() {
		return this.gradeHorariaItems;
	}

	public void setGradeHorariaItems(Set<GradeHorariaItem> gradeHorariaItems) {
		this.gradeHorariaItems = gradeHorariaItems;
	}

}
