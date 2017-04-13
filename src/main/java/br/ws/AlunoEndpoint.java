package br.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

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
		response.setAluno(alunoModel.getAluno(request.getAlunoId()));
		return response;
	}
}
