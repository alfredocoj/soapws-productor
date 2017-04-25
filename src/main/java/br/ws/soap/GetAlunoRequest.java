
package br.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alunoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alunoId"
})
@XmlRootElement(name = "getAlunoRequest", namespace = "http://ws.br/soap")
public class GetAlunoRequest {

    @XmlElement(namespace = "http://ws.br/soap")
    protected int alunoId;

    /**
     * Obtém o valor da propriedade alunoId.
     * 
     */
    public int getAlunoId() {
        return alunoId;
    }

    /**
     * Define o valor da propriedade alunoId.
     * 
     */
    public void setAlunoId(int value) {
        this.alunoId = value;
    }

}
