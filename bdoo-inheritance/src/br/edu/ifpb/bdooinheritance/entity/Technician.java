package br.edu.ifpb.bdooinheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author G�nesis Lima
 *  
 */
@Entity
public class Technician  extends Employee{

	private String tGrade;

}
