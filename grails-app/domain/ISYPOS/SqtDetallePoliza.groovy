package ISYPOS

class SqtDetallePoliza {
    int clavePol
    int partida
    String cuentaContable
    String contabilizacion
    Double importe
    String division
    String centroCostos
    int secuencia
    String textoCabecera
    String referenciaCabecera
    String textoDetalle
    String referenciaCabeceraOriginal
    int enviado

    SqtTienda tienda
    SqtMovimiento movimiento
    SqtImpuesto impuesto
    SqtNsegmento segmento
    SqtGrupo grupo

    static belongsTo = [polizas: SqtPoliza]

    static constraints = {
        cuentaContable maxSize: 30
        contabilizacion maxSize: 2
        impuesto nullable: true
        importe nullable: true
        secuencia nullable: true
        segmento nullable: true
        division maxSize: 4, nullable: true
        centroCostos maxSize: 30, nullable: true
        textoCabecera maxSize: 25, nullable: true
        referenciaCabecera maxSize: 16, nullable: true
        textoDetalle maxSize: 25, nullable: true
        referenciaCabeceraOriginal maxSize: 16, nullable: true
    }
}
