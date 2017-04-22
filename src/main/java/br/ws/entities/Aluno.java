package br.ws.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno",schema="soap")
public class Aluno extends EntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aluno_id", updatable=false)
	protected int alunoId;
	@Column(name = "aluno_nome", nullable = false, length = 150)
	protected String alunoName;
	@Column(name = "aluno_idade", nullable = false)
    protected int alunoIdade;
	@Column(name = "aluno_classe", nullable = false, length = 150)
    protected String alunoClasse;

	public int getId() {
		return alunoId;
	}

	public int getAlunoId() {
		return alunoId;
	}
	public void setAlunoId(int alunoId) {
		this.alunoId = alunoId;
	}
	public String getAlunoName() {
		return alunoName;
	}
	public void setAlunoName(String alunoName) {
		this.alunoName = alunoName;
	}
	public int getAlunoIdade() {
		return alunoIdade;
	}
	public void setAlunoIdade(int alunoIdade) {
		this.alunoIdade = alunoIdade;
	}
	public String getAlunoClasse() {
		return alunoClasse;
	}
	public void setAlunoClasse(String alunoClasse) {
		this.alunoClasse = alunoClasse;
	}
	@Override
	public String toString() {
		return "Aluno [alunoId=" + alunoId + ", alunoName=" + alunoName + ", alunoIdade=" + alunoIdade
				+ ", alunoClasse=" + alunoClasse + "]";
	}
}
