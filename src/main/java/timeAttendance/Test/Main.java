/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Test;

import com.douwe.generic.dao.DataAccessException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import timeAttendance.Service.ICategorie;
import timeAttendance.data.Categorie;

/**
 *
 * @author simo
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws com.douwe.generic.dao.DataAccessException
     */
    public static void main(String[] args) throws DataAccessException{

        // TODO code application logic here
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-Config.xml");
        ICategorie service = ctx.getBean("ICategorie", ICategorie.class);

        Categorie categorie = new Categorie();
        categorie.setCode("scvsi");
        categorie.setDenomination("service informatique");
        service.createCategorie(categorie);
        System.out.println("succeeeeeesssssssssss");
    }

}
