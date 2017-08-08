/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.service.spi.ServiceException;
import timeAttendance.Service.ICategorie;
import timeAttendance.Service.IPersonnel;
import timeAttendance.Service.IService;
import timeAttendance.data.Categorie;
import timeAttendance.data.Personnel;
import timeAttendance.data.Service;

/**
 *
 * @author simo
 */
@ManagedBean
@RequestScoped
public class PersonnelBean {
    
    @ManagedProperty(value = "#{IPersonnel}")  
   private IPersonnel iPersonnel;
    
    @ManagedProperty(value = "#{ICategorie}")
    private ICategorie iCategorie;
    
    @ManagedProperty(value = "#{IService}")
    private IService iService;
    
    long idCategorie;
    long idService;
    
    List<Categorie> listCategories;
    List<Service> listServices;
   
    
    Personnel personnel = new Personnel();

    
     public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    
    

    public IPersonnel getiPersonnel() {
        return iPersonnel;
    }

    public void setiPersonnel(IPersonnel iPersonnel) {
        this.iPersonnel = iPersonnel;
    }

    public long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public long getIdService() {
        return idService;
    }

    public void setIdService(long idService) {
        this.idService = idService;
    }

    public List<Service> getListServices() throws ServiceException{
        return iService.findAllService();
    }

    public void setListServices(List<Service> listServices) {
        this.listServices = listServices;
    }
    
    
    public PersonnelBean() {
        idCategorie = 0L;
        idService = 0L;
    }
    
     public List<Categorie> getListCategories() throws ServiceException {
        return iCategorie.findAllCategorie();
      }
       public void setListCategories(List<Categorie> listCategories) {
        this.listCategories = listCategories;
    }
     
     public ICategorie getiCategorie() {
        return iCategorie;
    }

    public void setiCategorie(ICategorie iCategorie) {
        this.iCategorie = iCategorie;
    }

    public IService getiService() {
        return iService;
    }

    public void setiService(IService iService) {
        this.iService = iService;
    }
    
    
        
    public Personnel createPersonnel() throws ServiceException{
        Categorie categorie = iCategorie.findCategorieById(idCategorie);
       personnel.setCategorie(categorie);
       Service service = iService.findServiceById(idService);
       personnel.setService(service);
         return iPersonnel.createPersonnel(personnel);
    }
    public Personnel updatePersonnel() throws ServiceException{
       Categorie categorie = iCategorie.findCategorieById(idCategorie);
       personnel.setCategorie(categorie);
       Service service = iService.findServiceById(idService);
       personnel.setService(service);
         return iPersonnel.updatePersonnel(personnel);
    }
    public Personnel findPersonnelById(){
       return iPersonnel.findPersonnelById(personnel.getId());
    }
    public List<Personnel> findAllPersonnel(){
       return iPersonnel.findAllPersonnel();
    }
    public void envoyerNotification(){
    
    }
    
    
}
