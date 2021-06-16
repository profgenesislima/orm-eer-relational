package br.edu.ifpb.bdooinheritance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
public class Truck extends AbstractCar {

	@Column
	private int numOfAxles;
	@Column
	private int Tonnage;
	public int getNumOfAxles() {
		return numOfAxles;
	}
	public void setNumOfAxles(int numOfAxles) {
		this.numOfAxles = numOfAxles;
	}
	public int getTonnage() {
		return Tonnage;
	}
	public void setTonnage(int tonnage) {
		Tonnage = tonnage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Tonnage;
		result = prime * result + numOfAxles;
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
		Truck other = (Truck) obj;
		if (Tonnage != other.Tonnage)
			return false;
		if (numOfAxles != other.numOfAxles)
			return false;
		return true;
	}
	
	
}
