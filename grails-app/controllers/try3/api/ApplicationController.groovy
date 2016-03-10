package try3.api

import grails.core.GrailsApplication
import grails.util.Environment
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        def b = new Author(name: "John Doe", ssn: "22432").save()
        [grailsApplication: grailsApplication, pluginManager: pluginManager, author: b]
    }


}
