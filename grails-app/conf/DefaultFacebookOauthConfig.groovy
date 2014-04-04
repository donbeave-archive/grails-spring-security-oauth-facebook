import grails.util.Holders

def appName = grails.util.Metadata.current.'app.name'
def baseURL = Holders.config.grails.serverURL ?: "http://localhost:${System.getProperty('server.port', '8080')}/${appName}"

oauth {
    providers {
        facebook {
            api = org.scribe.builder.api.FacebookApi
            successUri = '/oauth/facebook/success'
            failureUri = '/oauth/facebook/failure'
            callback = "${baseURL}/oauth/facebook/callback"
        }
    }
}