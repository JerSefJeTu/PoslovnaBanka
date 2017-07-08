package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
public class Clearing extends Model {

	@Column(nullable=false)
	public Date datumIVreme;
	
	@OneToMany(mappedBy = "clearing", cascade = {CascadeType.ALL})
	@Column(nullable=false)
	public Collection<MT10X> poruke;

	public Clearing(){
		this.poruke = new ArrayList<>();
	}
	
	public Clearing(Date datumIVreme, Collection<MT10X> poruke) {
		super();
		this.datumIVreme = datumIVreme;
		this.poruke = poruke;
	}
	
	
}
