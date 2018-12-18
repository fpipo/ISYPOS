package ISYPOS

class SqtZona {
    String descripcion
    int enviado

    static constraints = {
        descripcion maxSize: 50, nullable: false
        enviado nullable:true
    }
}
