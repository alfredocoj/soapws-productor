
package br.ws.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.ws.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.ws.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostAlunoResponse }
     * 
     */
    public PostAlunoResponse createPostAlunoResponse() {
        return new PostAlunoResponse();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link PostAlunoRequest }
     * 
     */
    public PostAlunoRequest createPostAlunoRequest() {
        return new PostAlunoRequest();
    }

    /**
     * Create an instance of {@link GetAlunoRequest }
     * 
     */
    public GetAlunoRequest createGetAlunoRequest() {
        return new GetAlunoRequest();
    }

    /**
     * Create an instance of {@link GetAlunoResponse }
     * 
     */
    public GetAlunoResponse createGetAlunoResponse() {
        return new GetAlunoResponse();
    }

}
