package br.ws.models;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/*@Component*/
@Repository
@Transactional
public class AlunoModel extends ModelBase<Object> {
	
	/*private static final List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	@PostConstruct
	public void initData() {
		Aluno aluno1 = new Aluno();
		aluno1.setAlunoId(1);
		aluno1.setAlunoName("Alfredo Costa");
		aluno1.setAlunoIdade(26);
		aluno1.setAlunoClasse("A1");
		
		Aluno aluno2 = new Aluno();
		aluno2.setAlunoId(2);
		aluno2.setAlunoName("Allas Jony");
		aluno2.setAlunoIdade(25);
		aluno2.setAlunoClasse("A2");
		
		alunos.add(aluno1);
		alunos.add(aluno2);
	}
	
	public Aluno getAluno(int alunoId) {
		Aluno result = null;
		
		for(Aluno aluno : alunos){
			if(alunoId == aluno.getAlunoId()){
				result = aluno;
			}
		}
		
		return result;
	}*/

}
