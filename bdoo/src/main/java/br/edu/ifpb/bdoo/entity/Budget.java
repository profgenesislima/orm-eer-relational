package br.edu.ifpb.bdoo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
@SequenceGenerator(name="seq_budget", sequenceName = "seq_budget", allocationSize = 1)
public class Budget {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_budget")
	@Column(name="budget_id")
	private Long id;
	private boolean approved;
	private BigDecimal balance;
	private LocalDate initialDate;
	private LocalDate finalDate;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_budget_department"))
	private Department department;
	
	
	
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public LocalDate getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(LocalDate initialDate) {
		this.initialDate = initialDate;
	}
	public LocalDate getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(LocalDate finalDate) {
		this.finalDate = finalDate;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (approved ? 1231 : 1237);
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((initialDate == null) ? 0 : initialDate.hashCode());
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
		Budget other = (Budget) obj;
		if (approved != other.approved)
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (finalDate == null) {
			if (other.finalDate != null)
				return false;
		} else if (!finalDate.equals(other.finalDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (initialDate == null) {
			if (other.initialDate != null)
				return false;
		} else if (!initialDate.equals(other.initialDate))
			return false;
		return true;
	}

	
	
	
	

}
