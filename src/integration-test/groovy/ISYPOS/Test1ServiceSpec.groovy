package ISYPOS

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class Test1ServiceSpec extends Specification {

    Test1Service test1Service
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Test1(...).save(flush: true, failOnError: true)
        //new Test1(...).save(flush: true, failOnError: true)
        //Test1 test1 = new Test1(...).save(flush: true, failOnError: true)
        //new Test1(...).save(flush: true, failOnError: true)
        //new Test1(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //test1.id
    }

    void "test get"() {
        setupData()

        expect:
        test1Service.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Test1> test1List = test1Service.list(max: 2, offset: 2)

        then:
        test1List.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        test1Service.count() == 5
    }

    void "test delete"() {
        Long test1Id = setupData()

        expect:
        test1Service.count() == 5

        when:
        test1Service.delete(test1Id)
        sessionFactory.currentSession.flush()

        then:
        test1Service.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Test1 test1 = new Test1()
        test1Service.save(test1)

        then:
        test1.id != null
    }
}
