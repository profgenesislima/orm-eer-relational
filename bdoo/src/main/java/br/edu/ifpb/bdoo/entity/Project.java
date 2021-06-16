package br.edu.ifpb.bdoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
@SequenceGenerator(name="seq_project", sequenceName="seq_project", initialValue=1, allocationSize = 1)
public class Project {

	@Id
	@Column(name="project_id")
	private Long id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="department_id", foreignKey = @ForeignKey(name="fk_project_department"))
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="employee_id", foreignKey = @ForeignKey(name="fk_employee_department"))
	private Employee employee;

	
	
	
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

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
		Project other = (Project) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
