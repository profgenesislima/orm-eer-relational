package br.edu.ifpb.bdooinheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author G�nesis Lima
 *  
 */
@Entity
public class Secretary extends Employee{

	
	private int typingSpeed;
}
