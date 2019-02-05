package ISYPOS

class SqtClaveContabilizacion {
    String clave
    String descripcion
    String tipoMovimiento
    String tipoContabilizacion
    int enviado

    static constraints = {
        clave maxSize: 2
        descripcion maxSize: 50 , nullable: true
        tipoMovimiento maxSize: 1
        tipoContabilizacion maxSize: 1
        enviado nullable: true
    }
}
