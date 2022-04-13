package com.test.microservices.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;
@Entity
@Table(name="abonnement")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Abonnement {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public int user;
	public int champion;
	@Temporal(TemporalType.DATE)
	public Date date_creation;
	@Override
	public String toString() {
		String res="";
		res+="abonnementRepo.save(new Abonnement("+"\"" +id+"\","+user+","+champion+",";
		if(date_creation!=null)
			res+="new SimpleDateFormat(\"yyyy-MM-dd\").parse(\"" + date_creation+"\")";
		else res+="null";
		res+="));";
		return res;
	}
	
}
