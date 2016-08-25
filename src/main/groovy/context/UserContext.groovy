package context

import grails.util.Holders

class UserContext {

  def context = [:]

  public UserContext(){
    def springSecurityService = Holders.grailsApplication.mainContext.getBean 'springSecurityService'
    def currentUser = springSecurityService?.currentUser
    context.user = currentUser
  }

  def getContext(){
    context
  }
}
