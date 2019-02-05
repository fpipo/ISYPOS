package ISYPOS

class SqtCajeroTienda {
    Date fecha
    String comentarios
    Double cantidadInicial
    Date fechaMod
    int enviado
    String usuario
    int caja

    SqtTienda tienda
    SqtEstatus estatus
    SqtUsuario usuarioMod

    static constraints = {
        usuario maxSize: 15
        comentarios maxSize: 250, nullable: true
        enviado nullable:true
        cantidadInicial nullable: true
    }
}
