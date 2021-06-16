package br.edu.ifpb.bdooinheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author Gênesis Lima
 *  
 */
@Entity
public class Engineer extends Employee {

	@Enumerated(EnumType.STRING)
	private EngType engType;

}
