package ISYPOS

class SqtDepositos {
    Double importe
    String referencia
    Date diaOperacion
    Date fechaDeposito
    String comentarios
    int enviado
    Date fechaMod

    SqtTienda tienda
    SqtBanco banco
    SqtUsuario usuario

    static constraints = {
        referencia maxSize: 12
        comentarios maxSize: 250, nullable: true
        enviado nullable: true
        fechaDeposito nullable: true
        fechaMod nullable: true
    }
}
