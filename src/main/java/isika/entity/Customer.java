package isika.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	private String nom;
	private String email;
	private String adress;
	
	public Customer(Long id, String nom, String email, String adress) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.adress = adress;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nom=" + nom + ", email=" + email + ", adress=" + adress + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
