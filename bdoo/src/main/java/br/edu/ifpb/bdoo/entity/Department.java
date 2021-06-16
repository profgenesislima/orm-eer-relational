package br.edu.ifpb.bdoo.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * @author Gênesis Lima
 *  
 */
@Entity
@SequenceGenerator(name = "seq_department", sequenceName = "seq_department", initialValue = 1, allocationSize = 1)
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_department")
	private Long department_id;
	@Basic(optional = false)
	private String name;
	@Enumerated(EnumType.STRING)
	private Area area;
	
	private LocalDate creationDate;
	
	@ElementCollection
	@CollectionTable(foreignKey = @ForeignKey(name = "fk_department_phone"))	
	private Set<String> phones;
	
	@OneToMany(mappedBy = "department")
	private List<Budget> budget;
	
	public Long getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
	
	
	
	
	
	public List<Budget> getBudget() {
		return budget;
	}
	public void setBudget(List<Budget> budget) {
		this.budget = budget;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department_id == null) ? 0 : department_id.hashCode());
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
		Department other = (Department) obj;
		if (department_id == null) {
			if (other.department_id != null)
				return false;
		} else if (!department_id.equals(other.department_id))
			return false;
		return true;
	}
	
	
	
}
