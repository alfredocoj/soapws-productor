package br.ws.endpoints;

import br.ws.soap.PostAlunoRequest;
import br.ws.soap.PostAlunoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.ws.entities.Aluno;
import br.ws.models.AlunoModel;
import br.ws.soap.GetAlunoRequest;
import br.ws.soap.GetAlunoResponse;

@Endpoint
public class AlunoEndpoint {
	private static final String NAMESPACE_URI = "http://ws.br/soap";
	@Autowired
	private AlunoModel alunoModel;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAlunoRequest")
	@ResponsePayload
	public GetAlunoResponse getAluno(@RequestPayload GetAlunoRequest request) {
		GetAlunoResponse response = new GetAlunoResponse();
		Aluno aluno = new Aluno();
		aluno.setAlunoId(request.getAlunoId());
		Aluno repository = (Aluno) alunoModel.getById(aluno);
		response.setAluno(repository);
		System.out.println(response.getAluno().getAlunoName());
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "postAlunoRequest")
	@ResponsePayload
	public PostAlunoResponse addAluno(@RequestPayload PostAlunoRequest request) throws Exception {
		PostAlunoResponse response = new PostAlunoResponse();

		Aluno aluno = new Aluno();
		aluno.setAlunoName( request.getAlunoName() );
		aluno.setAlunoIdade( request.getAlunoIdade() );
		aluno.setAlunoClasse( request.getAlunoClasse() );
		Aluno repository = (Aluno) alunoModel.save( aluno );
		response.setAluno(repository);

		return response;
	}
}
