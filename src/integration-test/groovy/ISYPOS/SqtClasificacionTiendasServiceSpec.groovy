package ISYPOS

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SqtClasificacionTiendasServiceSpec extends Specification {

    SqtClasificacionTiendasService sqtClasificacionTiendasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new SqtClasificacionTiendas(...).save(flush: true, failOnError: true)
        //new SqtClasificacionTiendas(...).save(flush: true, failOnError: true)
        //SqtClasificacionTiendas sqtClasificacionTiendas = new SqtClasificacionTiendas(...).save(flush: true, failOnError: true)
        //new SqtClasificacionTiendas(...).save(flush: true, failOnError: true)
        //new SqtClasificacionTiendas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //sqtClasificacionTiendas.id
    }

    void "test get"() {
        setupData()

        expect:
        sqtClasificacionTiendasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<SqtClasificacionTiendas> sqtClasificacionTiendasList = sqtClasificacionTiendasService.list(max: 2, offset: 2)

        then:
        sqtClasificacionTiendasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        sqtClasificacionTiendasService.count() == 5
    }

    void "test delete"() {
        Long sqtClasificacionTiendasId = setupData()

        expect:
        sqtClasificacionTiendasService.count() == 5

        when:
        sqtClasificacionTiendasService.delete(sqtClasificacionTiendasId)
        sessionFactory.currentSession.flush()

        then:
        sqtClasificacionTiendasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        SqtClasificacionTiendas sqtClasificacionTiendas = new SqtClasificacionTiendas()
        sqtClasificacionTiendasService.save(sqtClasificacionTiendas)

        then:
        sqtClasificacionTiendas.id != null
    }
}
