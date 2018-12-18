package ISYPOS

class SqtPais {
    String descripcion
    int enviado

    static constraints = {
        descripcion maxSize: 30, nullable: false
        enviado nullable:true
    }
}
