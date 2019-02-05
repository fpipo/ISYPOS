package ISYPOS

class SqtPrecioProducto {
        Date fechaInicio
        Date fechaFin
        int aplicaPcompraOferta
        Double pcompraOfertaSiva
        Double mIvaPcompraOferta
        Double precioVenta
        Double precioCompra
        Double pctVarianza
        Date fechaMod
        int enviado
        Double montoIsb

        SqtUsuario usuarioMod
        SqtProveedor proveedor
        SqtListaPrecios listaPrecios

        static belongsTo = [productos:SqtProducto]

        static constraints = {
                fechaFin nullable: true
                pcompraOfertaSiva nullable: true
                mIvaPcompraOferta nullable: true
                pctVarianza nullable: true
                montoIsb nullable: true
                enviado nullable:true
        }
}
