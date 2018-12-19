package ISYPOS

class   SqtTraspasoParcial {
    Double cantidad
    int idPartida
    SqtTraspaso traspaso
    SqtTienda tienda

    static constraints = {
        cantidad nullable:true
    }
}
