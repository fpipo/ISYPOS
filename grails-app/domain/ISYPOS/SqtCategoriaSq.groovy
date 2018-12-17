package ISYPOS

class SqtCategoriaSq {
    String descripcion
    int enviado
    int ordenB

    static constraints = {
        descripcion maxSize: 50
        enviado nuluable: true
    }
}