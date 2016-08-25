package com.darex

trait PolicyTrait {

  def authorize(record) {
    def policyClass = getCurrentPolicy(grailsApplication, "${controllerName.capitalize()}Policy")
    def policyInstance = policyClass.newInstance()
    policyInstance.context.record = record
    policyInstance."$actionName"()
    actionName
  }

  def authorize(record, method) {
    def policyClass = getCurrentPolicy(grailsApplication, "${controllerName.capitalize()}Policy")
    def policyInstance = policyClass.newInstance()
    policyInstance.context.record = record
    policyInstance."$method"()
    actionName
  }


  private Class getCurrentPolicy(grailsApplication, simpleName){
    grailsApplication.getAllClasses().find {
       it.simpleName == simpleName
    }
  }
}
