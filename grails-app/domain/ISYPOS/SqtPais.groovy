package ISYPOS

class SqtPais {
    String clave
    String descripcion
    int enviado

    static constraints = {
        clave maxSize: 3
        descripcion maxSize: 30
        enviado nullable:true
    }
}
