package utils

class Authorization {

  def authorize = { Object ...args->
    def applicationContext
    if (grailsApplication == null) applicationContext = grails.util.Holders.getGrailsApplication()
    println controllerName
  }

}
