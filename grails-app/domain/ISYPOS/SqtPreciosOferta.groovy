package ISYPOS

class SqtPreciosOferta {
    Date fechaInicio
    Date fechaFin
    Double precioCompraCiva
    Double montoIvaPrecioCompra
    Double precioCompraSiva
    Double pventaNormalSiva
    Double mIvaPventoNormal
    Double pventaNormalCiva
    Double margenUtilidadNormal
    Double pctDescuento
    Double descuentoSiva
    Double montoIvaDescuento
    Double descuentoCiva
    Double precioVentaSiva
    Double montoIvaPrecioVenta
    Double precioVentaCiva
    Double margenUtilidad
    int aplicaOferta
    Date fechaMod
    SqtUsuario usuarioMod
    int enviado
    Double montoIsb

    SqtListaPrecios listaPrecios
    SqtProveedor proveedor
    SqtProducto producto
    SqtEstatus estatus

    static constraints = {
        enviado nullable:true
        fechaFin nullable: true
        montoIvaPrecioCompra nullable: true
        precioVentaSiva nullable: true
        margenUtilidadNormal nullable: true
        pctDescuento nullable: true
        descuentoSiva nullable: true
        montoIvaDescuento nullable: true
        descuentoCiva nullable: true
        precioVentaSiva nullable: true
        montoIvaPrecioVenta nullable: true
        precioVentaCiva nullable:true
        margenUtilidad nullable:true
        aplicaOferta nullable: true
        estatus nullable: true
    }
}
