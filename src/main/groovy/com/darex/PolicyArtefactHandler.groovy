package com.darex
import grails.core.ArtefactHandlerAdapter

public class PolicyArtefactHandler extends ArtefactHandlerAdapter {
  public static final String TYPE = "Policy"

  public PolicyArtefactHandler(){
    super(TYPE, PolicyGrailsClass.class, DefaultPolicyGrailsClass.class, TYPE)
  }
}
