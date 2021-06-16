package br.edu.ifpb.bdooinheritance.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Gênesis Lima
 *  
 */
@MappedSuperclass
public abstract class AbstractCar {

	@Id
	@Column(name="vehicle_id")
	private Long id;
	@Column(unique = true)
	private int licencePlateNo;
	@Column
	private BigDecimal price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLicencePlateNo() {
		return licencePlateNo;
	}
	public void setLicencePlateNo(int licencePlateNo) {
		this.licencePlateNo = licencePlateNo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + licencePlateNo;
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
		AbstractCar other = (AbstractCar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (licencePlateNo != other.licencePlateNo)
			return false;
		return true;
	}
	
	
	
}
