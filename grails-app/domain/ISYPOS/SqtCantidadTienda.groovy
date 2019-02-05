package ISYPOS

class SqtCantidadTienda {
    Date diaOperacion
    Double cantidad
    Double cantidadReal
    int aplica
    int enviado
    Double sobrante

    SqtTienda tienda
    SqtFormaPago formaPago

    static constraints = {
        cantidad nullable: true
        cantidadReal nullable: true
        aplica nullable:true
        enviado nullable: true
        sobrante nullable: true
    }
}
