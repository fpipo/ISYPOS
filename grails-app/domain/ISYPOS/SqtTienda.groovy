package ISYPOS

class SqtTienda {
    String id
    int clave
    String descripcion
    String tipo
    Date fechaApertura
    String serie
    SqtUsuario usuarioMod
    Date fechaMod
    int enviado
    int idGrupoTiendaExtra
    int idServidor

    SqtZona zona
    String telefono
    SqtRuta ruta
    SqtGrupoTienda grupoTienda
    SqtEstatus estatus
    SqtSegmentos segmento
    SqtGrupoGlasgo grupoGlasgo

    static mapping = {
        id generator: 'uuid', name: 'id'
    }

    static constraints = {
        descripcion maxSize: 80, nullable: false
        tipo maxSize: 2, nullable: true
        fechaApertura nullable: true
        serie maxSize: 5, nullable:true
        enviado nullable: true
        idServidor nullable: true
        grupoGlasgo nullable: true
        segmento nullable: true
        idGrupoTiendaExtra nullable: true
        telefono maxSize: 10, nullable: true
        telefono maxSize: 10, nullable: true
    }
}
