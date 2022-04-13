package com.test.microservices.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String nom;
	public String prenom;
	public String username;
	public String email;
	@Temporal(TemporalType.DATE)
	public Date date_naissance;
	public String code_postale;
	public String ville;
	public String pays;
	public String grade;
	public String club;
	public String user_ip;
	public byte newsletter;
	public byte offres;
	public String gcoo1;
	public String gcoo2;
	public String gaddress;
	public String password;
	public int user_regdate;
}
