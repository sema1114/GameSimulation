package GameSales.entities.concretes;

import GameSales.entities.abstracts.Entity;

public class Gamer implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private int nationalOfBirth;
	
	public Gamer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gamer(int id, String firstName, String lastName, String nationalIdentity, int nationalOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.nationalOfBirth = nationalOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getNationalOfBirth() {
		return nationalOfBirth;
	}

	public void setNationalOfBirth(int nationalOfBirth) {
		this.nationalOfBirth = nationalOfBirth;
	}
	
	
}
