/**
* @author <a href='mailto:cazacugmihai@gmail.com'>Mihai Cazacu</a>
* @author <a href='mailto:enrico@comiti.name'>Enrico Comiti</a>
* @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
*/
class SpringSecurityOauthFacebookGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.2.2 > *"
    def dependsOn = [springSecurityOauth: '2.0.2 > *']

    def title = "Facebook for Spring Security OAuth plugin"
    def author = "Mihai Cazacu, Enrico Comiti, Alexey Zhokhov"
    def authorEmail = "donbeave@gmail.com"
    def description = '''\
Integrate [Facebook|http://www.facebook.com] to [Spring Security OAuth plugin|http://grails.org/plugin/spring-security-oauth].
'''

    def documentation = "https://github.com/donbeave/grails-spring-security-oauth-facebook"

    def license = "APACHE"

    def developers = [
        [name: "Mihai Cazacu", email: "cazacugmihai@gmail.com"],
        [name: "Enrico Comiti", email: "enrico@comiti.name"],
        [name: "Alexey Zhokhov", email: "donbeave@gmail.com"]]

    def scm = [url: 'https://github.com/donbeave/grails-spring-security-oauth-facebook']

}
