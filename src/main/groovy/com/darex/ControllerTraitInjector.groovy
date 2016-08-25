package com.darex

import grails.compiler.traits.TraitInjector
import groovy.transform.CompileStatic

@CompileStatic
class ControllerTraitInjector implements TraitInjector {

    @Override
    Class getTrait() {
        PolicyTrait
    }

    @Override
    String[] getArtefactTypes() {
        ['Controller'] as String[]
    }
}
