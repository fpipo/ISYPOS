package ISYPOS

class SqtRecaudacion {
    String contrato
    Double monto
    Double comision
    Date fechaVencimiento
    Date fechaPago
    SqtArchivo archivo
    Date fechaMod
    SqtUsuario usuarioMod
    int enviado
    String identificador

    SqtTienda tienda
    SqtEstatus estatus


    static constraints = {
        comision nullable: true
        fechaPago nullable: true
        estatus nullable: true
        contrato maxSize: 30
        fechaMod nullable: true
        usuarioMod nullable: true
        enviado nullable:true
        identificador maxSize: 50, nullable: true
    }
}
