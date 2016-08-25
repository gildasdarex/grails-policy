description("Creates a new Policy") {
    usage "grails create-policy [POLICY NAME]"
    argument name:'Policy Name', description:"The name of the policy"
}

model = model( args[0] )
render  template:"Policy.groovy",
        destination: file( "grails-app/policies/$model.packagePath/${model.simpleName}Policy.groovy"),
        model: model
