package ISYPOS

class SqtCategoria {
    String descripcion
    int  enviado

    static constraints = {
        descripcion maxSize: 50, nullable: false
    }
}
