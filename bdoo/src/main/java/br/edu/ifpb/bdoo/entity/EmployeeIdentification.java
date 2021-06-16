package br.edu.ifpb.bdoo.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
@Table(name="employee_identification")
public class EmployeeIdentification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4809710313855090550L;
	
	@Column
	private byte[] picture;
	@Column
	private byte[] fingerprint;
	
	@Id
	@OneToOne
	@MapsId("employee_id")
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_emp_identification_employee"))
	@AttributeOverride(name = "id", column = @Column(name="employee_identification_id"))
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		return result;
	}

	
	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public byte[] getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(byte[] fingerprint) {
		this.fingerprint = fingerprint;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeIdentification other = (EmployeeIdentification) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		return true;
	}
	
	
	
	
}
