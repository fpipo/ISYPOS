package ISYPOS

class SqtCatalogoGlasgo {
    int compra
    int venta
    int enviado

    SqtProducto producto
    SqtEstatus estatus

    static constraints = {
        enviado nullable: true
        compra nullable:true
        venta nullable:true
    }
}
