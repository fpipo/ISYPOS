package ISYPOS

class SqtImpuestoProducto {
    Double contenidoProducto
    Double monto
    int aplica
    int iva
    int fs
    int ivaCompra
    int enviado
    int isb

    SqtImpuesto impuesto
    SqtProducto producto

    static constraints = {
        contenidoProducto nullable:true
        monto nullable:true
        aplica nullable:true
        iva nullable:true
        fs nullable:true
        ivaCompra nullable:true
        enviado nullable:true
        isb nullable:true
    }
}
