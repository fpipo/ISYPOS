package ISYPOS

class SqtCuentaContable {

    String cuentaContable
    String descripcion
    int enviado

    static constraints = {
        cuentaContable maxSize: 10
        descripcion maxSize: 50 , nullable: true
        enviado nullable:true
    }
}
