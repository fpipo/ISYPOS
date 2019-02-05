package ISYPOS

class SqtProducto {
    String descripcionCorta
    String descripcionLarga                /* Vendra de SAP */
    String tipo
    int consignacion
    int inventariable
    int surteProveedor
    int surteBodega
    int surteComisariato
    int aplicaA
    Double contenidoProducto
    String unidadMedidaContenido            /* Vendra de SAP */
    Double cantidadProducto
    Double ultimoPrecioCompra
    Double ultimoMontoIva
    Double ultimoPctVarianza
    Double ultimoPcompraOferta
    Double ultimoPcompraRegalo
    Double ultimoMivaRegalo
    Double pctCobro
    Double pctVenta
    String contenidoUnidad                  /* Vendra de SAP */
    int prodTerminado
    int conCargo
    int completo
    int paraDevolucion
    Date fechaMod
    int enviado
    int preinactivo
    int ta
    String idCompania
    int esImporte
    String idTiempoAire
    int libreCmp
    int inactivoCompra
    int inactivoCedisComisariato
    int estatusVenta
    int estatusCompra

    SqtMarca marca
    SqtCategoria categoria                      /* Vendra de SAP */
    SqtUsuario usuarioMod
    SqtGrupo grupo                              /* Vendra de SAP */
    SqtSubgrupo subgrupo                        /* Vendra de SAP */
    SqtUnidadMedida unidadMedida               /* Vendra de SAP */
    SqtEstatus estatus

    static hasMany = [precios:SqtPrecioProducto, impuestos:SqtImpuestoProducto, codigoBarras:SqtCodigoProducto]

    static constraints = {
        estatusVenta nullable: true
        estatusCompra nullable: true
        descripcionCorta maxSize: 50
        descripcionLarga maxSize: 40, nullable: true   /* Vendra de SAP cuando entre a produccion se quita el nullable*/
        tipo maxSize:3
        marca nullable: true
        consignacion nullable: true
        inventariable nullable: true
        surteProveedor nullable: true
        surteBodega nullable: true
        surteComisariato nullable: true
        aplicaA nullable: true
        contenidoUnidad nullable: true
        unidadMedidaContenido maxSize: 3 , nullable: true
        cantidadProducto nullable: true
        ultimoPrecioCompra nullable: true
        ultimoMontoIva nullable: true
        ultimoPctVarianza nullable: true
        ultimoPcompraOferta nullable: true
        ultimoPcompraRegalo nullable: true
        completo nullable: true
        ultimoMivaRegalo nullable: true
        pctCobro nullable: true
        pctVenta nullable: true
        prodTerminado nullable: true
        conCargo nullable: true
        paraDevolucion nullable: true
        preinactivo nullable: true
        ta nullable: true
        idCompania maxSize: 3, nullable: true
        idTiempoAire maxSize: 14 , nullable: true
        libreCmp nullable: true
        inactivoCompra nullable: true
        esImporte nullable: true
        contenidoUnidad maxSize: 3, nullable: true
        enviado nullable:true
        inactivoCedisComisariato nullable:true
        contenidoProducto nullable: true
    }
}
