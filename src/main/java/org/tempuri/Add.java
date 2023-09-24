
package org.tempuri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Add")
public class Add {

    protected int intA;
    protected int intB;

    /**
     * Obtém o valor da propriedade intA.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Define o valor da propriedade intA.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Obtém o valor da propriedade intB.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Define o valor da propriedade intB.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
