package ISYPOS

class SqtCuotaServicio {
    int enviado

    SqtProducto productoRef
    SqtEstatus estatus

    static constraints = {
        enviado nulleable: true
    }
}
