package br.edu.ifpb.bdooinheritance.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Gênesis Lima
 *  
 */
@Embeddable
public class Manufactured extends PartType{
	
	@Column(name="mbatch_no")
	private Integer batchNo;
	@Column(name="mbdrawing_no")
	private Integer drawingNo;
	@Column(name="mmanufacture_date")
	private LocalDate manufactureDate;
	
	
	public Integer getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
	}
	public Integer getDrawingNo() {
		return drawingNo;
	}
	public void setDrawingNo(Integer drawingNo) {
		this.drawingNo = drawingNo;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchNo == null) ? 0 : batchNo.hashCode());
		result = prime * result + ((drawingNo == null) ? 0 : drawingNo.hashCode());
		result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
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
		Manufactured other = (Manufactured) obj;
		if (batchNo == null) {
			if (other.batchNo != null)
				return false;
		} else if (!batchNo.equals(other.batchNo))
			return false;
		if (drawingNo == null) {
			if (other.drawingNo != null)
				return false;
		} else if (!drawingNo.equals(other.drawingNo))
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		return true;
	}
	

	
}
