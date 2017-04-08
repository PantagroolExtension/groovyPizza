package groovypizza

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ToppingsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Toppings.list(params), model:[toppingsCount: Toppings.count()]
    }

    def show(Toppings toppings) {
        respond toppings
    }

    def create() {
        respond new Toppings(params)
    }

    @Transactional
    def save(Toppings toppings) {
        if (toppings == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (toppings.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond toppings.errors, view:'create'
            return
        }

        toppings.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'toppings.label', default: 'Toppings'), toppings.id])
                redirect toppings
            }
            '*' { respond toppings, [status: CREATED] }
        }
    }

    def edit(Toppings toppings) {
        respond toppings
    }

    @Transactional
    def update(Toppings toppings) {
        if (toppings == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (toppings.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond toppings.errors, view:'edit'
            return
        }

        toppings.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'toppings.label', default: 'Toppings'), toppings.id])
                redirect toppings
            }
            '*'{ respond toppings, [status: OK] }
        }
    }

    @Transactional
    def delete(Toppings toppings) {

        if (toppings == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        toppings.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'toppings.label', default: 'Toppings'), toppings.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'toppings.label', default: 'Toppings'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
