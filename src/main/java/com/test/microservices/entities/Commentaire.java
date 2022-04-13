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
@Table(name="commentaires")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Commentaire {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int ID;
	@Temporal(TemporalType.DATE)
	public Date date;
	public String commentaire;
	public byte valide;
	public int user_id;
	public int news_id;
	public int video_id;
	public long champion_id;
	public String positif;
	public String negatif;
}
