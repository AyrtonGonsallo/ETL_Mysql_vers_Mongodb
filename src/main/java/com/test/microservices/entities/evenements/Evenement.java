package com.test.microservices.entities.evenements;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.test.microservices.enums.Sexe;
import com.test.microservices.enums.TypeEvenement;

import lombok.*;
@Entity
@Table(name="evenements")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Evenement {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	public String Nom;
	@Enumerated(EnumType.STRING)
	public Sexe Sexe;
	@Temporal(TemporalType.DATE)
	public Date DateDebut;
	@Temporal(TemporalType.DATE)
	public Date DateFin;
	@Temporal(TemporalType.TIMESTAMP)
	public Date DatePub;
	public String Presentation;
	public byte Visible;
	@Enumerated(EnumType.STRING)
	public TypeEvenement Type;
	public String Document1;
	public String Document2;
	public String Document3;
	public String Contact;
	public String Telephone;
	public String Mail;
	public String Web;
	public byte Valider;
	public byte Pack;
	public String PaysID;
	public int CategorieID;
	public int CategorieageID;
	public int compteur;
	@Override
	public String toString() {
		String res="";
		res+="evenementRepo.save(new Evenement("+"\"" +ID+"\",\""+Nom+"\","+"Sexe."+Sexe+",";
		if(DateDebut!=null)
			res+="new SimpleDateFormat(\"yyyy-MM-dd\").parse(\"" + DateDebut+"\")";
		else res+="null";
		res+=",";
		if(DateFin!=null)
			res+="new SimpleDateFormat(\"yyyy-MM-dd\").parse(\"" + DateFin+"\")";
		else res+="null";
		res+=",";
		if(DatePub.toString()!="0000-00-00" && DatePub!=null )
			res+="new SimpleDateFormat(\"yyyy-MM-dd\").parse(\"" + DatePub+"\")";
		else res+="null";
		
		
		res+="));";
		return res;
	}
}
