package ISYPOS

class SqtEmisoresComision {
    String nombre
    Double comision
    Double comisionC

    static constraints = {
        nombre maxSize: 100
    }
}
