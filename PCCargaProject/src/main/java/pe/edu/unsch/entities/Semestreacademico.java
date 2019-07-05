package pe.edu.unsch.entities;
// Generated 05-jul-2019 1:43:54 by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Semestreacademico generated by hbm2java
 */
@Entity
@Table(name = "semestreacademico", catalog = "cargadb")
public class Semestreacademico implements java.io.Serializable {

	private int idSemestreAcademico;
	private String semestreAcademico;
	private String descripcion;
	private Set<Cargaacademica> cargaacademicas = new HashSet<Cargaacademica>(0);

	public Semestreacademico() {
	}

	public Semestreacademico(int idSemestreAcademico, String semestreAcademico) {
		this.idSemestreAcademico = idSemestreAcademico;
		this.semestreAcademico = semestreAcademico;
	}

	public Semestreacademico(int idSemestreAcademico, String semestreAcademico, String descripcion,
			Set<Cargaacademica> cargaacademicas) {
		this.idSemestreAcademico = idSemestreAcademico;
		this.semestreAcademico = semestreAcademico;
		this.descripcion = descripcion;
		this.cargaacademicas = cargaacademicas;
	}

	@Id

	@Column(name = "idSemestreAcademico", unique = true, nullable = false)
	public int getIdSemestreAcademico() {
		return this.idSemestreAcademico;
	}

	public void setIdSemestreAcademico(int idSemestreAcademico) {
		this.idSemestreAcademico = idSemestreAcademico;
	}

	@Column(name = "SemestreAcademico", nullable = false, length = 45)
	public String getSemestreAcademico() {
		return this.semestreAcademico;
	}

	public void setSemestreAcademico(String semestreAcademico) {
		this.semestreAcademico = semestreAcademico;
	}

	@Column(name = "Descripcion", length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semestreacademico")
	public Set<Cargaacademica> getCargaacademicas() {
		return this.cargaacademicas;
	}

	public void setCargaacademicas(Set<Cargaacademica> cargaacademicas) {
		this.cargaacademicas = cargaacademicas;
	}

}