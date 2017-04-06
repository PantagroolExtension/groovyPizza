package groovypizza

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(PizzaFactory)
class PizzaFactorySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "pizzaFactory validation"() {
        when: "pizzaFactory validation"
        def pizzaFactory = new PizzaFactory(pizzas: [])

        then:
        pizzaFactory.validate()
    }
}
