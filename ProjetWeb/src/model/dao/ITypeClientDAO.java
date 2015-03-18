package model.dao;

import java.util.List;
import model.bo.TypeClient;


public interface ITypeClientDAO {
	
	 
	public  Long create(TypeClient c);
	public void update(TypeClient c);
	public void delete(Long id);
	public List <TypeClient> getAllTypes();
	public TypeClient getById(Long id);

}
