package ISYPOS

class SqtTelefono {
    String noTelefono

    static constraints = {
        noTelefono maxSize: 10, nullable: false
    }
}
