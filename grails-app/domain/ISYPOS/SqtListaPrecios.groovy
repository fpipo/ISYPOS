package ISYPOS

class SqtListaPrecios {
    String descripcionCorta
    int base
    String tipo
    int enviado

    /*static belongsTo = [productos:SqtProducto]*/    /*OJO esta se debe quitar*/

    static constraints = {
        descripcionCorta maxSize: 80
        base nullable: true
        tipo maxSize: 2, nullable: true
        enviado nullable:true
    }
}
