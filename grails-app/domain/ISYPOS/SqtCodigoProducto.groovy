package ISYPOS

class SqtCodigoProducto {
    String codigo

    SqtProducto base

    static belongsTo = [base:SqtProducto]

    static constraints = {
        codigo maxSize: 30
    }
}
