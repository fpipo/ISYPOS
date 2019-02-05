package ISYPOS

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class SqtCajeroTiendaController {

    SqtCajeroTiendaService sqtCajeroTiendaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond sqtCajeroTiendaService.list(params), model:[sqtCajeroTiendaCount: sqtCajeroTiendaService.count()]
    }

    def show(Long id) {
        respond sqtCajeroTiendaService.get(id)
    }

    def create() {
        respond new SqtCajeroTienda(params)
    }

    def save(SqtCajeroTienda sqtCajeroTienda) {
        if (sqtCajeroTienda == null) {
            notFound()
            return
        }

        try {
            sqtCajeroTiendaService.save(sqtCajeroTienda)
        } catch (ValidationException e) {
            respond sqtCajeroTienda.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sqtCajeroTienda.label', default: 'SqtCajeroTienda'), sqtCajeroTienda.id])
                redirect sqtCajeroTienda
            }
            '*' { respond sqtCajeroTienda, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond sqtCajeroTiendaService.get(id)
    }

    def update(SqtCajeroTienda sqtCajeroTienda) {
        if (sqtCajeroTienda == null) {
            notFound()
            return
        }

        try {
            sqtCajeroTiendaService.save(sqtCajeroTienda)
        } catch (ValidationException e) {
            respond sqtCajeroTienda.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'sqtCajeroTienda.label', default: 'SqtCajeroTienda'), sqtCajeroTienda.id])
                redirect sqtCajeroTienda
            }
            '*'{ respond sqtCajeroTienda, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        sqtCajeroTiendaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'sqtCajeroTienda.label', default: 'SqtCajeroTienda'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sqtCajeroTienda.label', default: 'SqtCajeroTienda'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
