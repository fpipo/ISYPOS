package ISYPOS

import grails.gorm.services.Service

@Service(Test1)
interface Test1Service {

    Test1 get(Serializable id)

    List<Test1> list(Map args)

    Long count()

    void delete(Serializable id)

    Test1 save(Test1 test1)

}