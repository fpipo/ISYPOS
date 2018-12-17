package ISYPOS

class SqtCategoriaProducto {
   SqtProducto producto
   SqtCategoria categoria
   SqtGrupo grupo
    SqtSubgrupo subgrupo
    int enviado
    SqtMarca marca

    static constraints = {
        enviado nulluable: true
        grupo nullable: true
        marca nullable: true
        subgrupo nullable: true
    }
}
