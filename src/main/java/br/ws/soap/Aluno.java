
package br.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aluno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alunoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alunoName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alunoIdade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alunoClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aluno", namespace = "http://ws.br/soap", propOrder = {
    "alunoId",
    "alunoName",
    "alunoIdade",
    "alunoClasse"
})
public class Aluno {

    @XmlElement(namespace = "http://ws.br/soap")
    protected int alunoId;
    @XmlElement(namespace = "http://ws.br/soap", required = true)
    protected String alunoName;
    @XmlElement(namespace = "http://ws.br/soap")
    protected int alunoIdade;
    @XmlElement(namespace = "http://ws.br/soap", required = true)
    protected String alunoClasse;

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

    /**
     * Obtém o valor da propriedade alunoName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunoName() {
        return alunoName;
    }

    /**
     * Define o valor da propriedade alunoName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunoName(String value) {
        this.alunoName = value;
    }

    /**
     * Obtém o valor da propriedade alunoIdade.
     * 
     */
    public int getAlunoIdade() {
        return alunoIdade;
    }

    /**
     * Define o valor da propriedade alunoIdade.
     * 
     */
    public void setAlunoIdade(int value) {
        this.alunoIdade = value;
    }

    /**
     * Obtém o valor da propriedade alunoClasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunoClasse() {
        return alunoClasse;
    }

    /**
     * Define o valor da propriedade alunoClasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunoClasse(String value) {
        this.alunoClasse = value;
    }

}
