/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import timeAttendance.data.Categorie;

/**
 *
 * @author simo
 */
@Transactional
public interface ICategorie {
    
    public Categorie createCategorie(Categorie categorie);
    public Categorie updateCategorie(Categorie categorie);
    public void deleteCategorie(Categorie categorie);
    public Categorie findCategorieById(Long Id);
    public List<Categorie> findAllCategorie();
    
}
