package ISYPOS

class SqtAutorizaMovimiento {
    SqtMovimiento movimiento
    SqtFuncion funcion
    SqtGrupoUsuario grupo
    String enviado

    static constraints = {
        enviado nullable: true
    }
}
