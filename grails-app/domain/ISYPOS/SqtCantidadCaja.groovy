package ISYPOS

class SqtCantidadCaja {
    Double cantidad
    String caja

    SqtTienda tienda
    SqtAsignacion asignacion
    SqtFormaPago formaPago

    static constraints = {
        caja maxSize: 2, nullable: false
    }
}

/* Solo para ISYPOS*/