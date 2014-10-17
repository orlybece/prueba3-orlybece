package prueba3.orlybece

class Financiamiento {

    String numeroContrato
    Integer numeroCuotas
    Double montoContrato
    Double montoInicial
    Double montoInteres

    static belongsTo = [cliente:Cliente]


    static constraints = {
    }
}
