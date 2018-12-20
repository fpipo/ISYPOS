package ISYPOS

class SqtEstado {
    String edo
    String descripcion
    int enviado

    SqtPais pais

    static constraints = {
        enviado nullable: true
    }
}
