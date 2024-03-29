package com.ck.iwendy;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {

    public static void main(String[] args) throws Exception{
        Server server = new Server(Integer.parseInt(System.getenv("PORT")));
        
        // load project
        WebAppContext webapp=new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar("bin/iwendy-web.war");
        
 
        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
