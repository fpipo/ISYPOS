package ISYPOS

class SqtDetalleTraspasoTT {
    Double cantidadSugerida
    Double cantidadSurtida
    Double cantidadRecibida
    Double costoPromedio
    Double ivaCostoPromedio
    int sugerido
    int enviado
    Double ventaSemana

    SqtTienda tienda
    SqtProducto producto
    SqtMotivoDevolucion motivoDevolucion

    static belongsTo = [traspasostt: SqtTraspasoTT]

    static constraints = {
        enviado nullable: true
        motivoDevolucion nullable: true
        cantidadSugerida nullable: true
        cantidadSurtida nullable: true
        cantidadRecibida nullable: true
        costoPromedio nullable: true
        ivaCostoPromedio nullable: true
        sugerido nullable: true
        ventaSemana nullable: true
    }
}
