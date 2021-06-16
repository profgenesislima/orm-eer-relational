package br.edu.ifpb.bdooinheritance.testdrive;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.bdooinheritance.entity.Manufactured;
import br.edu.ifpb.bdooinheritance.entity.Part;

/**
 * @author Gênesis Lima
 *  
 */
public class PartCreationTestDrive {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd2ifpb-inheritance");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Manufactured manufacturedPart = new Manufactured();
		manufacturedPart.setDrawingNo(10);
		manufacturedPart.setBatchNo(120);
		Part part = new Part(manufacturedPart);
		part.setDescription("Manufactured Part");	
		try {
//			Purchased p = new Purchased();
//			p.setListPrice(new BigDecimal(100.00));
//			part.setPurchased(p);
			em.persist(part);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
	}

}
