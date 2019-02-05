package ISYPOS

class SqtDireccion {
    int clave
    String calle
    String colonia
    String municipio
    String cp
    String ciudad

    SqtUsuario usuario
    SqtEstado estado
    SqtPais pais

    static constraints = {
        calle maxSize: 50, nullable: true
        colonia maxSize: 50, nullable: true
        municipio maxSize: 50, nullable: true
        cp maxSize: 5, nullable: true
        ciudad maxSize: 50, nullable: true
        pais nullable: true
        estado nullable: true
    }
}
