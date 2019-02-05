package ISYPOS

class Test1 {
    String id
    String nombre

    static mapping = {
        id generator: 'uuid', name: 'id'
    }
    static constraints = {
        nombre maxSize: 20, nullable: true
    }
}
