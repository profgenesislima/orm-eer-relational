package br.edu.ifpb.bdooinheritance.testdrive;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Gênesis Lima
 *  
 */
public class ITableCreationTestDrive {

	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd2ifpb-inheritance");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		
//		Department d = new Department();
//		d.setName("Contabilidade");
//		d.setArea(Area.FINANCEIRO);
//		d.setCreationDate(LocalDate.of(1999, 10, 10));
//		
//		
//		
//		Budget b = new Budget();
//		b.setApproved(true);
//		b.setInitialDate(LocalDate.now());
//		b.setFinalDate(LocalDate.of(2020, 10, 11));
//		b.setBalance(new BigDecimal(200000));
//		
//		d.setBudget(b);
//		em.persist(b);
//		em.persist(d);
//		em.getTransaction().commit();
		em.close();
	}
}
