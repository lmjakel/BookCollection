package com.leeannjakel.controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Services application.
 */
//Defines the base URI for all resource URIs.
@ApplicationPath("/Services")

//The java class declares root resource and provider classes
/**
 * A application class used to implement the Delete and Edit book classes
 *
 * @author LeeAnn Jakel
 */
public class ServicesApplication extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(DeleteBook.class );
        h.add(EditBook.class );
        return h;
    }

}
