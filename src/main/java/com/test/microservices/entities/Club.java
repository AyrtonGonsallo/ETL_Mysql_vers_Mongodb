package com.test.microservices.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="clubs")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Club {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public String pays;
	public String departement;
	public String club;
	public String responsable;
	public String telephone;
	public String mel;
	public String site;
	public String description;
	public String ville;
	public String CP;
	public String adresse;
	public String gcoo1;
	public String gcoo2;
	public String gaddress;
	public byte Valide;
}
