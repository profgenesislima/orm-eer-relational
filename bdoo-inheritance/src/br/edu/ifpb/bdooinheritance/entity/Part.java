package br.edu.ifpb.bdooinheritance.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
@SequenceGenerator(name="seq_part", sequenceName="seq_part", initialValue = 1, allocationSize = 1)
public class Part {

	@Id
	@Column(name="part_no")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "seq_part")
	private Long id;	
	private String description;
	private boolean mFlag = false;
	private boolean pFlag = false;
	
	public Part() {
		
	}

	public Part(PartType partType) {
		if(partType instanceof Manufactured){
			this.manufactured = (Manufactured) partType;
			mFlag = true;
		}else {
			this.purchased = (Purchased) partType;
			pFlag = true;

		}
			
	}
	
	
	@Embedded
	private Manufactured manufactured;
	
	@Embedded
	private Purchased purchased;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Manufactured getManufactured() {
		return manufactured;
	}

	public void setManufactured(Manufactured manufactured) throws Exception {
		if(this.purchased == null ) {
		this.manufactured = manufactured;
		this.mFlag = true;
		}else {
			throw new Exception("Part already has a type of "+this.purchased);
		}
	}

	public Purchased getPurchased() {
		return purchased;
	}

	public void setPurchased(Purchased purchased) throws Exception{
		if(this.manufactured == null ) {
			this.purchased = purchased;
			this.pFlag = true;

			}else {
				throw new Exception("Part already has a type of "+this.manufactured);
			}
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
		Part other = (Part) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public boolean ismFlag() {
		return mFlag;
	}

	public void setmFlag(boolean mFlag) {
		this.mFlag = mFlag;
	}

	public boolean ispFlag() {
		return pFlag;
	}

	public void setpFlag(boolean pFlag) {
		this.pFlag = pFlag;
	}
	
	
	
}
