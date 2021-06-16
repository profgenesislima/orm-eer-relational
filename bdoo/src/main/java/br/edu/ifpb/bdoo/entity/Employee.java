package br.edu.ifpb.bdoo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
@SequenceGenerator(name="seq_employee", sequenceName="seq_employee", initialValue=1, allocationSize = 1)
@Table(uniqueConstraints = @UniqueConstraint(name="uk_ssn",columnNames = {"ssn"}))
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_employee")
	@Column(name="employee_id")
	private Long id;
	private String name;
	@Column(unique = true)
	private int ssn;
	
	@Embedded
	private Address address;
	
	@OneToMany
	@JoinColumn(name = "supervisor_id", foreignKey = @ForeignKey(name="fk_supervised_supervisor"))
	private List<Employee> supervisedEmployees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public List<Employee> getSupervisedEmployees() {
		return supervisedEmployees;
	}

	public void setSupervisedEmployees(List<Employee> supervisedEmployees) {
		this.supervisedEmployees = supervisedEmployees;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}  
	
	
	
	
	
}
