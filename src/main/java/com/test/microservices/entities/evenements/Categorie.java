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
@Table(name="evcategorieevenement")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Categorie {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public String Intitule;
	public String Intitule_en;
	public byte tri;
	public byte club;
	public byte inter;
	public char classement;
}
