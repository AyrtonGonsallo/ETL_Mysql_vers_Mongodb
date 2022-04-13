package com.test.microservices;

import java.io.FileWriter;
import java.util.List;
import com.test.microservices.entities.evenements.*;
import com.test.microservices.repositories.evenements.*;
import com.test.microservices.entities.*;
import com.test.microservices.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;


@Component
public class ReaderWriter {
	String chemindebase="C:\\Users\\Dell\\Downloads\\data\\";
	@Autowired
	private ChampionsRepository chr;
	@Autowired
	private EvenementRepository evr;
	@Autowired
	private AbonnementRepository abr;
	
	public void readAndWrite(int max,Classes classe, String file) throws Exception {
		int total=0;
		FileWriter myWriter = new FileWriter(this.chemindebase+file);
		switch (classe) {
			case Champion:
				System.out.println("ecriture champion");
				List<Champion>lc=chr.findAll();
				Thread.sleep(5000);
				for(Champion c:lc) {
					myWriter.write(c.toString());
					myWriter.write(System.getProperty("line.separator"));
					total++;
					if(total==max)
						break;
				}
				break;
			case Abonnement:
				System.out.println("ecriture abonnement");
				List<Abonnement>lAb=abr.findAll();
				Thread.sleep(5000);
			    for(Abonnement ab:lAb) {
					myWriter.write(ab.toString());
					myWriter.write(System.getProperty("line.separator"));
					total++;
					if(total==max)
						break;
				}
				break;
			case Evenement:
				System.out.println("ecriture evenement");
				List<Evenement>lEv=evr.findAll();
				Thread.sleep(5000);
			    for(Evenement ev:lEv) {
					myWriter.write(ev.toString());
					myWriter.write(System.getProperty("line.separator"));
					total++;
					if(total==max)
						break;
				}
				break;
	
			default:
				break;
		}

		myWriter.close();
		System.out.println("ecriture dans le fichier "+file+" fine");
	};
}
