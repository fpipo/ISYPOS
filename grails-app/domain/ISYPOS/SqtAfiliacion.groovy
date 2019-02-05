package ISYPOS

class SqtAfiliacion {
    String afiliacion
    int caja
    int enviado

    SqtTienda tienda
    SqtBanco banco
    SqtEstatus estatus

    static constraints = {
        afiliacion maxSize: 50
        enviado nullable:true
        estatus nullable: true
    }
}
