package ISYPOS

class SqtProveedorGrupoTienda {
    int enviado

    SqtProveedor proveedor
    SqtGrupoTienda grupoTienda
    SqtEstatus estatus

    static constraints = {
        enviado nullable:true
    }
}
