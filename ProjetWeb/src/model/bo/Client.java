package model.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Client {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String pays;
	@ManyToOne
	@JoinColumn(name="TypeClient")
	private TypeClient typec;
	
	
	public Client(String nom, String prenom, String adresse, String pays) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.pays = pays;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public TypeClient getTypec() {
		return typec;
	}
	public void setTypec(TypeClient typec) {
		this.typec = typec;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	

}
