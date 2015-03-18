package model.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String designation;
//	List<Client> clients;
	

	
	public Long getId() {
		return id;
	}
	public TypeClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeClient(String designation) {
	super();
	this.designation = designation;
}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
