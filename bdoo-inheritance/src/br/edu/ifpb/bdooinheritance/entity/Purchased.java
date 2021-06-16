package br.edu.ifpb.bdooinheritance.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Gênesis Lima
 *  
 */
@Embeddable
public class Purchased extends PartType{
	@Column(name="psupplier_name")
	private String supplierName;
	@Column(name="plist_price")
	private BigDecimal listPrice;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public BigDecimal getListPrice() {
		return listPrice;
	}
	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listPrice == null) ? 0 : listPrice.hashCode());
		result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchased other = (Purchased) obj;
		if (listPrice == null) {
			if (other.listPrice != null)
				return false;
		} else if (!listPrice.equals(other.listPrice))
			return false;
		if (supplierName == null) {
			if (other.supplierName != null)
				return false;
		} else if (!supplierName.equals(other.supplierName))
			return false;
		return true;
	}
	
	
}
