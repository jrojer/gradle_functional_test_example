import spock.lang.Specification

class HelloSpockSpec extends Specification {
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 3
        "Kirk"   | 4
        "Scotty" | 6
    }
}