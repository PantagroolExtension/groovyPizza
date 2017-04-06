package groovypizza

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Pizza)
class PizzaSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "pizza validation"() {
        when:"pizza validation"
            def pizzaFactory = new PizzaFactory()
            def pizza = new Pizza(name: "pizza")
            pizza.pizzaFactory = pizzaFactory
        then:
            pizza.validate()
    }
}
