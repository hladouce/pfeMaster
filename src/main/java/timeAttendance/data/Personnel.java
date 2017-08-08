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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author simo
 */
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personnel implements Serializable{

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long id;
    
    @Column
    private String matricule;
    
    @Column
    private String nom;
    
    @Column
    private String prenom;
    
    @OneToMany(mappedBy = "personnel")
   // @JoinColumn(name= "empreinte_id")
     List<Empreinte> listeEmpreinte;
    
    @ManyToOne
    Service service;
    
    @ManyToOne
    Categorie categorie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personnel(String matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personnel() {
    }

    public List<Empreinte> getListeEmpreinte() {
        return listeEmpreinte;
    }

    public void setListeEmpreinte(List<Empreinte> listeEmpreinte) {
        this.listeEmpreinte = listeEmpreinte;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    
   
    
 }
