package com.test.microservices.entities.evenements;


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
@Table(name="evresultats")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Resultat {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public String Rang;
	public String Commentaire;
	public String Club;
	public int EvenementID;
	public int ChampionID;
	public int equipeID;
	public String PoidID;
}
