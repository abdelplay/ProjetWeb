package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.bo.Client;

public class ClientDAO implements IClientDAO {
	
	public ClientDAO(){
		
	}

	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session ;
	Transaction tx;

	@Override
	public Long create(Client c) {
		session = sf.openSession();
		tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();
		return c.getId();
		
	}

	@Override
	public void update(Client c) {
	//	Client c1 = em.find(Client.class, c.getId());
		session = sf.openSession();
		tx = session.beginTransaction();
		Client c1 = (Client) session.load(Client.class, c.getId());
		c1 = c ;
		session.saveOrUpdate(c1);
		session.close();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		session = sf.openSession();
		tx = session.beginTransaction();
		Client c1 = (Client) session.load(Client.class, id);
		session.delete(c1);
		tx.commit();
		
}

	@Override
public List<Client> getAllClient() {
	session = sf.openSession();
	tx = session.beginTransaction();
	return session.createQuery("select c from Client c ").list();

}

}
