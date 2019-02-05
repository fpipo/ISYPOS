package ISYPOS

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class Test1Controller {

    Test1Service test1Service

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond test1Service.list(params), model:[test1Count: test1Service.count()]
    }

    def show(Long id) {
        respond test1Service.get(id)
    }

    def create() {
        respond new Test1(params)
    }

    def save(Test1 test1) {
        if (test1 == null) {
            notFound()
            return
        }

        try {
            test1Service.save(test1)
        } catch (ValidationException e) {
            respond test1.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'test1.label', default: 'Test1'), test1.id])
                redirect test1
            }
            '*' { respond test1, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond test1Service.get(id)
    }

    def update(Test1 test1) {
        if (test1 == null) {
            notFound()
            return
        }

        try {
            test1Service.save(test1)
        } catch (ValidationException e) {
            respond test1.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'test1.label', default: 'Test1'), test1.id])
                redirect test1
            }
            '*'{ respond test1, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        test1Service.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'test1.label', default: 'Test1'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'test1.label', default: 'Test1'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
