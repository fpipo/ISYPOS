package ISYPOS

class SqtProductoGrupoGlasgo {
    SqtGrupoGlasgo grupoGlasgo
    SqtProducto producto
    int enviado

    static constraints = {
        enviado nullable:true
    }
}
