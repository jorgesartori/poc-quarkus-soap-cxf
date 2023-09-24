
package org.tempuri;

import io.smallrye.mutiny.Uni;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddResult" type=
"{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addResult" })
@XmlRootElement(name = "AddResponse")
public class AddResponse {

	@XmlElement(name = "AddResult")
	protected int addResult;

	/**
	 * Obtém o valor da propriedade addResult.
	 * 
	 * Now, it's reactive!!!
	 * 
	 */
	public Uni<Integer> getAddResult() {
		return Uni.createFrom().item(addResult);
	}

	/**
	 * Define o valor da propriedade addResult.
	 * 
	 */
	public void setAddResult(int value) {
		this.addResult = value;
	}

}
