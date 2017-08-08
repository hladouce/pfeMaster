/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author simo
 */
@Entity
public class Lecteur implements Serializable{

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long id;
    
    @Column
    private String code;
    
    @Column
    private String denomination;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public Lecteur(String code, String denomination) {
        this.code = code;
        this.denomination = denomination;
    }

    public Lecteur() {
    }
    
}

