/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author simo
 */
@Entity
public class Pointage implements Serializable{

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long id;
    
    @Column
    private String heure_entree;
    
    @Column
    private String heure_sortie;
    
    @ManyToMany
    List<Lecteur> listeLecteur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeure_entree() {
        return heure_entree;
    }

    public void setHeure_entree(String heure_entree) {
        this.heure_entree = heure_entree;
    }

    public String getHeure_sortie() {
        return heure_sortie;
    }

    public void setHeure_sortie(String heure_sortie) {
        this.heure_sortie = heure_sortie;
    }

    public Pointage(String heure_entree, String heure_sortie) {
        this.heure_entree = heure_entree;
        this.heure_sortie = heure_sortie;
    }

    public Pointage() {
    }
    
}
