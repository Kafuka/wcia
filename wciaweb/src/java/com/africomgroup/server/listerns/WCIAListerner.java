/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.server.listerns;

import com.africomgroup.wcia.entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Jordy Mugeni
 */
@WebListener()
public class WCIAListerner implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //Initializing 
        List <Service> services = new ArrayList<Service> ();
        Service cleaning = new Service ("01","Cleaning",100);
        Service valet = new Service("02" , "valet", 10);
        Service carpet = new Service("03", "Carpet", 200);
        
        services.add(cleaning);
        services.add(valet);
        services.add(carpet);
        
        sce.getServletContext().setAttribute("services", services);
        
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
       
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
       //To change body of generated methods, choose Tools | Templates.
    }
}
