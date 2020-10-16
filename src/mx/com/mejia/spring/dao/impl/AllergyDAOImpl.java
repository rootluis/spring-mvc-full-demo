package mx.com.mejia.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.com.mejia.spring.dao.AllergyDAO;
import mx.com.mejia.spring.entity.Allergy;

@Repository
public class AllergyDAOImpl implements AllergyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Allergy> getAllergys() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Allergy> theQuery = currentSession.createQuery("from Allergy", Allergy.class);
		
		// execute query and get result list
		List<Allergy> allergys = theQuery.getResultList();
		
		// return the result
		return allergys;
	}

}
