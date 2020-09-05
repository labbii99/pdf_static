package net.javaguides.springboot.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identity_card")

public class test {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long ID;
	
	@Column(name = "First_name")
	private String firstName;
	
	@Column(name = "Last_name")
	private String lastName;
	
	@Column(name = "Date_of_birthday")
	private Date dateOfBirthday;
	
	@Column(name = "Nationality")
	private String nationality;
	
	@Column(name = "Place_of_birthday")
	private String placeOfBirthday;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Date_of_Expiry")
	private Date dateOfExpiry;
	
	@Column(name = "Date_of_issue")
	private Date dateOfissue;
	
	@Column(name = "Issued_By")
	private String issuedBy;
	
	@Column(name = "Personal_Number")
	private long personalNumber;
	
	@Column(name = "Residence")
	private String residence;
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
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
	public Date getDateOfBirthday() {
		return dateOfBirthday;
	}
	public void setDateOfBirthday(Date dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPlaceOfBirthday() {
		return placeOfBirthday;
	}
	public void setPlaceOfBirthday(String placeOfBirthday) {
		this.placeOfBirthday = placeOfBirthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public Date getDateOfissue() {
		return dateOfissue;
	}
	public void setDateOfissue(Date dateOfissue) {
		this.dateOfissue = dateOfissue;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public long getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(long personalNumber) {
		this.personalNumber = personalNumber;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
}
