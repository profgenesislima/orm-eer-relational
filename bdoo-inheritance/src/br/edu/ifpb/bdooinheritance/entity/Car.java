package br.edu.ifpb.bdooinheritance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
public class Car extends AbstractCar{

	@Column
	private int maxSpeed;
	@Column
	private int noOfPassengers;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxSpeed;
		result = prime * result + noOfPassengers;
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
		Car other = (Car) obj;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (noOfPassengers != other.noOfPassengers)
			return false;
		return true;
	}
	
	
}
