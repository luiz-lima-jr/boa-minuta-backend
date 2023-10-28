//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.07.12 às 11:54:22 AM GMT-03:00 
//


package br.com.bomtransporte.boaminuta.mili;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="in0" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0",
    "in1",
    "in2"
})
@XmlRootElement(name = "receberCarga", namespace = "http://controller.carga.efrotas.mili.com.br")
public class ReceberCarga {


    public ReceberCarga(){

    }

    public ReceberCarga(Long in0, String in1, Long in2){
        this.in0 = in0;
        this.in1 = in1;
        this.in2 = in2;

    }

    @XmlElement(namespace = "http://controller.carga.efrotas.mili.com.br")
    protected long in0;
    @XmlElement(namespace = "http://controller.carga.efrotas.mili.com.br", required = true, nillable = true)
    protected String in1;
    @XmlElement(namespace = "http://controller.carga.efrotas.mili.com.br")
    protected long in2;

    /**
     * Obtém o valor da propriedade in0.
     * 
     */
    public long getIn0() {
        return in0;
    }

    /**
     * Define o valor da propriedade in0.
     * 
     */
    public void setIn0(long value) {
        this.in0 = value;
    }

    /**
     * Obtém o valor da propriedade in1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn1() {
        return in1;
    }

    /**
     * Define o valor da propriedade in1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn1(String value) {
        this.in1 = value;
    }

    /**
     * Obtém o valor da propriedade in2.
     * 
     */
    public long getIn2() {
        return in2;
    }

    /**
     * Define o valor da propriedade in2.
     * 
     */
    public void setIn2(long value) {
        this.in2 = value;
    }

}
