package model.dao;

import java.util.List;

import model.bo.Client;

 interface IClientDAO {
	 
	public  Long create(Client c);
	public void update(Client c);
	public void delete(Long id);
	public List <Client> getAllClient();
	
}
