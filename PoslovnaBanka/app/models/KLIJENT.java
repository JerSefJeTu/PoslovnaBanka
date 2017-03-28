package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
/***********************************************************************
 * Module:  KLIJENT.java
 * Author:  Aleksa
 * Purpose: Defines the Class KLIJENT
 ***********************************************************************/
@Entity
public class KLIJENT extends Model {

    @Column(nullable = false, unique = true)
    @OneToMany(mappedBy = "kLIJENT")
    public java.util.Collection<RACUN> rACUN;
    @Column(nullable = false)
    public String ADRESA;
    @Column(nullable = false, unique = true)
    public String TELEFON;
    @Column(nullable = false, unique = true)
    public String FAX;
    @Column(nullable = false, unique = true)
    public String E_MAIL;
    @Column(nullable = false)    
    public MESTO mesto;


   public KLIJENT() {
   }


	public KLIJENT(int iD_KLIJENTA, Collection<RACUN> rACUN, PRAVNO pRAVNO, FIZICKO fIZICKO) {
		super();
		this.rACUN = rACUN;
	}

   
}