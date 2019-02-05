package ISYPOS

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SqtCajeroTiendaServiceSpec extends Specification {

    SqtCajeroTiendaService sqtCajeroTiendaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new SqtCajeroTienda(...).save(flush: true, failOnError: true)
        //new SqtCajeroTienda(...).save(flush: true, failOnError: true)
        //SqtCajeroTienda sqtCajeroTienda = new SqtCajeroTienda(...).save(flush: true, failOnError: true)
        //new SqtCajeroTienda(...).save(flush: true, failOnError: true)
        //new SqtCajeroTienda(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //sqtCajeroTienda.id
    }

    void "test get"() {
        setupData()

        expect:
        sqtCajeroTiendaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<SqtCajeroTienda> sqtCajeroTiendaList = sqtCajeroTiendaService.list(max: 2, offset: 2)

        then:
        sqtCajeroTiendaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        sqtCajeroTiendaService.count() == 5
    }

    void "test delete"() {
        Long sqtCajeroTiendaId = setupData()

        expect:
        sqtCajeroTiendaService.count() == 5

        when:
        sqtCajeroTiendaService.delete(sqtCajeroTiendaId)
        sessionFactory.currentSession.flush()

        then:
        sqtCajeroTiendaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        SqtCajeroTienda sqtCajeroTienda = new SqtCajeroTienda()
        sqtCajeroTiendaService.save(sqtCajeroTienda)

        then:
        sqtCajeroTienda.id != null
    }
}
