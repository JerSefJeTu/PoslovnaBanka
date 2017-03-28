package models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
@Entity
public class Clearing extends Model {

	@Column(nullable=false)
	public Date datumIVreme;
	
	@Column(nullable=false)
	@OneToMany
	public Collection<MT10X> poruke;

	public Clearing(){
		
	}
	
	public Clearing(Date datumIVreme, Collection<MT10X> poruke) {
		super();
		this.datumIVreme = datumIVreme;
		this.poruke = poruke;
	}
	
	
}
