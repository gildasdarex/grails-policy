package com.darex
import groovy.lang.Closure
import java.util.Map
import org.grails.core.AbstractGrailsClass

public class DefaultPolicyGrailsClass extends AbstractGrailsClass implements PolicyGrailsClass{
  protected Class<?> destination
  protected Map<String, Closure<?>> methods


  public DefaultPolicyGrailsClass(Class<?> wrappedClass)
  {

    super(wrappedClass, PolicyArtefactHandler.TYPE)
    //destination = (Class<?>)getPropertyOrStaticPropertyOrFieldValue(DESTINATION, Class.class)
    //methods = (Map<String, Closure<?>>) getPropertyOrStaticPropertyOrFieldValue(METHODS, Map.class)
  }

  public Class<?> getDestination() { return destination}

  public Map<String, Closure<?>> getMethods() { return methods}

}
