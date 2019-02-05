package ISYPOS

class SqtTipoSku {
    String clave
    String descripcion
    Date fechaCreacion
    Date fechaMod
    SqtUsuario usuarioMod
    int enviado

    static constraints = {
        clave maxSize: 3
        enviado nullable:true
    }
}
