package ISYPOS

import grails.gorm.services.Service

@Service(SqtCajeroTienda)
interface SqtCajeroTiendaService {

    SqtCajeroTienda get(Serializable id)

    List<SqtCajeroTienda> list(Map args)

    Long count()

    void delete(Serializable id)

    SqtCajeroTienda save(SqtCajeroTienda sqtCajeroTienda)

}