package com.darex
import groovy.lang.Closure
import java.util.Map
import grails.core.GrailsClass

public interface PolicyGrailsClass extends GrailsClass {
     String DESTINATION = "destination"
     String METHODS = "methods"
     /**
      * The class or interface to mix the methods into.
      *
      * @return the class or interface
      */
     Class<?> getDestination()
     /**
      * The closures to mix into the destination; the keys are method names and
      * the values are the closures to use for metamethods.
      * @return the methods
      */
     Map<String, Closure<?>> getMethods()
}
