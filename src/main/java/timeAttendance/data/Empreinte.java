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
import javax.persistence.ManyToOne;

/**
 *
 * @author simo
 */
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Empreinte implements Serializable{

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long id;
    
    @Column
    private String epg;
    @Column
    private String eig;
    @Column
    private String emg;
    @Column
    private String eag;
    @Column
    private String eog;
    @Column
    private String epd;
    @Column
    private String eid;
    @Column
    private String emd;
    @Column
    private String ead;
    @Column
    private String eod;
    
    @ManyToMany
    List<Pointage> ListePointage;
    
    @ManyToOne
    Personnel personnel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEpg() {
        return epg;
    }

    public void setEpg(String epg) {
        this.epg = epg;
    }

    public String getEig() {
        return eig;
    }

    public void setEig(String eig) {
        this.eig = eig;
    }

    public String getEmg() {
        return emg;
    }

    public void setEmg(String emg) {
        this.emg = emg;
    }

    public String getEag() {
        return eag;
    }

    public void setEag(String eag) {
        this.eag = eag;
    }

    public String getEog() {
        return eog;
    }

    public void setEog(String eog) {
        this.eog = eog;
    }

    public String getEpd() {
        return epd;
    }

    public void setEpd(String epd) {
        this.epd = epd;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEmd() {
        return emd;
    }

    public void setEmd(String emd) {
        this.emd = emd;
    }

    public String getEad() {
        return ead;
    }

    public void setEad(String ead) {
        this.ead = ead;
    }

    public String getEod() {
        return eod;
    }

    public void setEod(String eod) {
        this.eod = eod;
    }

    public Empreinte(String epg, String eig, String emg, String eag, String eog, String epd, String eid, String emd, String ead, String eod) {
        this.epg = epg;
        this.eig = eig;
        this.emg = emg;
        this.eag = eag;
        this.eog = eog;
        this.epd = epd;
        this.eid = eid;
        this.emd = emd;
        this.ead = ead;
        this.eod = eod;
    }

    public Empreinte() {
    }
    
    
}

