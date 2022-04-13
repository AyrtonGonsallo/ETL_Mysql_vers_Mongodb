package com.test.microservices.entities;

import java.util.Date;

import javax.persistence.*;



import lombok.*;

@Entity
@Table(name="champions")
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Champion {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private String IDold;
	private String Nom;
	private char Sexe;
	private String PaysID;
	private String NvPaysID;
	@Temporal(TemporalType.DATE)
	private Date DateChangementNat;
	@Temporal(TemporalType.DATE)
	private Date DateNaissance;
	private String LieuNaissance;
	private String Grade;
	private String Clubs;
	private int Taille;
	private int Poids;
	private String TokuiWaza;
	private String MainDirectrice;
	private String Activite;
	private String Forces;
	private String Idole;
	private String Idole2;
	private String Idole3;
	private String Idole4;
	private String Idole5;
	private String Idole6;
	private String Idole7;
	private String Lidole2;
	private String Lidole3;
	private String Lidole4;
	private String Lidole5;
	private String Lidole6;
	private String Lidole7;
	private String Anecdote;
	private String Phrase;
	private String VuPar;
	private String Site;
	@Override
	public String toString() {
		String res="";
		res+="championsRepo.save(new Champion("+"\"" + ID + "\",\"" + IDold + "\",\"" + Nom + "\",'" + Sexe + "',\"" + PaysID
				+ "\",\"" + NvPaysID+"\",";
		if(DateChangementNat!=null)
			res+="new SimpleDateFormat(\"yyyy-MM-dd\").parse(\"" + DateChangementNat+"\")";
		else res+="null";
		res+=",";
		if(DateNaissance!=null)
			res+= "new SimpleDateFormat(\"yyyy-MM-dd\").parse(\""+ DateNaissance + "\")";
		else
			res+=null;
		res+= ",\"";
		res+=LieuNaissance + "\",\"" + Grade + "\",\"" + Clubs
				+ "\"," + Taille + "," + Poids + ",\"" + TokuiWaza + "\",\""
				+ MainDirectrice + "\",\"" + Activite + "\",\"" + Forces + "\",\"" + Idole + "\",\""
				+ Idole2 + "\",\"" + Idole3 + "\",\"" + Idole4 + "\",\"" + Idole5 + "\",\"" + Idole6
				+ "\",\"" + Idole7 + "\",\"" + Lidole2 + "\",\"" + Lidole3 + "\",\"" + Lidole4
				+ "\",\"" + Lidole5 + "\",\"" + Lidole6 + "\",\"" + Lidole7 + "\",\"" + Anecdote
				+ "\",\"" + Phrase + "\",\"" + VuPar + "\",\"" + Site + "\""+"));";
		return res;
	}

}
