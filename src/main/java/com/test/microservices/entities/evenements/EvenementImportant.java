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
@Table(name="evenementimportants")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class EvenementImportant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public String Nom;
	public String Text1;
	public String Text2;
	public String Text3;
	public String Logo;
	public int Evenement_id;
	public String Lien;
}
