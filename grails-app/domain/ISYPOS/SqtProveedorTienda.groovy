package ISYPOS

class SqtProveedorTienda {
    SqtProveedor proveedor
    SqtTienda tienda
    SqtEstatus estatus
    int enviado

    static constraints = {
        estatus nullable: true
        enviado nullable:true
    }
}
