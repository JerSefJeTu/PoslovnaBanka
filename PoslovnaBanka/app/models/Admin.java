package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Djordje on 8/24/2017.
 */
@Entity
@DiscriminatorValue("A")
@PrimaryKeyJoinColumn(name = "KLIJENT_ID")
@Table(name = "ADMIN")
public class Admin extends Klijent  {
    public Admin() {
    }
}
