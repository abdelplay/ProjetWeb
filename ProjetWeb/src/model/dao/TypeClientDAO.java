package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.bo.TypeClient;

public class TypeClientDAO implements ITypeClientDAO{

	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session;
	Transaction tx;
	
	@Override
	public Long create(TypeClient c) {

		session = sf.openSession();
		tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		return c.getId();
	}

	@Override
	public void update(TypeClient c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TypeClient> getAllTypes() {
		session = sf.openSession();
		tx = session.beginTransaction();
		return session.createQuery("select t from TypeClient t").list();
	}

	@Override
	public TypeClient getById(Long id) {
		session = sf.openSession();
		tx = session.beginTransaction();
		return (TypeClient) session.load(TypeClient.class, id);
	}

}
