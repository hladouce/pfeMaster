/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import timeAttendance.data.Lecteur;

/**
 *
 * @author simo
 */
@Transactional
public interface ILecteur {
    
    public Lecteur createLecteur(Lecteur lecteur);
    public Lecteur updateLecteur(Lecteur lecteur);
    public Lecteur deleteLecteur(Lecteur lecteur);
    public Lecteur findLecteurById(Long Id);
    public List<Lecteur> findAllLecteur();
    public void ecrireSurLecteur(Lecteur lecteur);
    public String lireSurLecteur(Lecteur lecteur);
    public void nettoyerLecteur(Lecteur lecteur);
    
    
}

