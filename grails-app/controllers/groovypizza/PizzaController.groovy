package groovypizza

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PizzaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Pizza.list(params), model:[pizzaCount: Pizza.count()]
    }

    def order() {
        render view: 'order'
    }

    def pizzas() {
        PizzaFactory pizzaFactory = Pizza.first().pizzaFactory
        def pizzas = pizzaFactory.pizzas
        render view: 'pizzas', model: [pizzas: pizzas]
    }


    def show(Pizza pizza) {
        respond pizza
    }

    def create() {
        respond new Pizza(params)
    }

    @Transactional
    def save(Pizza pizza) {
        if (pizza == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (pizza.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond pizza.errors, view:'create'
            return
        }

        pizza.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pizza.label', default: 'Pizza'), pizza.id])
                redirect pizza
            }
            '*' { respond pizza, [status: CREATED] }
        }
    }

    def edit(Pizza pizza) {
        respond pizza
    }

    @Transactional
    def update(Pizza pizza) {
        if (pizza == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (pizza.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond pizza.errors, view:'edit'
            return
        }

        pizza.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'pizza.label', default: 'Pizza'), pizza.id])
                redirect pizza
            }
            '*'{ respond pizza, [status: OK] }
        }
    }

    @Transactional
    def delete(Pizza pizza) {

        if (pizza == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        pizza.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'pizza.label', default: 'Pizza'), pizza.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pizza.label', default: 'Pizza'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
