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
import timeAttendance.Service.IService;
import timeAttendance.data.Service;

/**
 *
 * @author simo
 */
@ManagedBean
@RequestScoped
public class ServiceBean {
    
    @ManagedProperty(value = "#{IService}")
    IService iService;
    
    Service service = new Service();

    public IService getiService() {
        return iService;
    }

    public void setiService(IService iService) {
        this.iService = iService;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public ServiceBean() {
    }
    
      public Service createService(){
      return iService.createService(service);
    }
    public Service updateService(){
      return iService.updateService(service);
    }
    public Service findServiceById(){
       return iService.findServiceById(service.getId());
    }
    public List<Service> findAllService(){
       return iService.findAllService();
    }

    
}
