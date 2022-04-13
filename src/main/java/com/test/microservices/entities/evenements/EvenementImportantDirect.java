package com.test.microservices.entities.evenements;

import java.util.Date;

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
@Table(name="evenementimportantdirect")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class EvenementImportantDirect {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public Date date ;
	public String admin;
	public String titre;
	public String texte;
	public int evenement_important_id;
	public char une;
}
