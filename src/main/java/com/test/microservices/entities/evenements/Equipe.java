package com.test.microservices.entities.evenements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.test.microservices.enums.Sexe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="evequipe")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Equipe {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public int Rang;
	public String NomEquipe;
	public String Equipe;
	public Sexe Sexe;
	public int evenementID;
}
