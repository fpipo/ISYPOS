package ISYPOS

class SqtNsegmento {
    String segmento1
    String segmento2
    String segmento3
    String segmento4
    String segmento5
    String segmento6
    String segmento7

    static constraints = {
        segmento1 maxSize: 2
        segmento2 maxSize: 3
        segmento3 maxSize: 5
        segmento4 maxSize: 5
        segmento5 maxSize: 2
        segmento6 maxSize: 3
        segmento7 maxSize: 3
    }
}
