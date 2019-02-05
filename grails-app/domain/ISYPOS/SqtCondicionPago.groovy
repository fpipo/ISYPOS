package ISYPOS

class SqtCondicionPago {
    String condicion
    String descripcion

    static constraints = {
        condicion maxSize: 10, nullable: true
        descripcion maxSize: 50, nullable: true
    }
}
