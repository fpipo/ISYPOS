package ISYPOS

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class SqtClasificacionTiendasController {

    SqtClasificacionTiendasService sqtClasificacionTiendasService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond sqtClasificacionTiendasService.list(params), model:[sqtClasificacionTiendasCount: sqtClasificacionTiendasService.count()]
    }

    def show(Long id) {
        respond sqtClasificacionTiendasService.get(id)
    }

    def create() {
        respond new SqtClasificacionTiendas(params)
    }

    def save(SqtClasificacionTiendas sqtClasificacionTiendas) {
        if (sqtClasificacionTiendas == null) {
            notFound()
            return
        }

        try {
            sqtClasificacionTiendasService.save(sqtClasificacionTiendas)
        } catch (ValidationException e) {
            respond sqtClasificacionTiendas.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sqtClasificacionTiendas.label', default: 'SqtClasificacionTiendas'), sqtClasificacionTiendas.id])
                redirect sqtClasificacionTiendas
            }
            '*' { respond sqtClasificacionTiendas, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond sqtClasificacionTiendasService.get(id)
    }

    def update(SqtClasificacionTiendas sqtClasificacionTiendas) {
        if (sqtClasificacionTiendas == null) {
            notFound()
            return
        }

        try {
            sqtClasificacionTiendasService.save(sqtClasificacionTiendas)
        } catch (ValidationException e) {
            respond sqtClasificacionTiendas.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'sqtClasificacionTiendas.label', default: 'SqtClasificacionTiendas'), sqtClasificacionTiendas.id])
                redirect sqtClasificacionTiendas
            }
            '*'{ respond sqtClasificacionTiendas, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        sqtClasificacionTiendasService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'sqtClasificacionTiendas.label', default: 'SqtClasificacionTiendas'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sqtClasificacionTiendas.label', default: 'SqtClasificacionTiendas'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
