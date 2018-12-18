package ISYPOS

class SqtDetalleBitacora {
    Double cantidad
    Double precioVenta
    Date fechamod
    int enviado

    SqtUsuario usuarioMod
    SqtMovimiento movimiento

    static belongsTo = [bitacora:SqtBitacora]

    static constraints = {
        precioVenta nullable: true
        cantidad nullable: true
        enviado nulluable: true
    }
}
