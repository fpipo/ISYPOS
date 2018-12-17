package ISYPOS

import grails.gorm.services.Service

@Service(SqtClasificacionTiendas)
interface SqtClasificacionTiendasService {

    SqtClasificacionTiendas get(Serializable id)

    List<SqtClasificacionTiendas> list(Map args)

    Long count()

    void delete(Serializable id)

    SqtClasificacionTiendas save(SqtClasificacionTiendas sqtClasificacionTiendas)

}