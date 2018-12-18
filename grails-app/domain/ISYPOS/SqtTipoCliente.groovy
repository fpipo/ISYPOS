package ISYPOS

class SqtTipoCliente {
    String descripcion
    int enviado

    static constraints = {
        descripcion maxSize: 50
        enviado nullable:true
    }
}
