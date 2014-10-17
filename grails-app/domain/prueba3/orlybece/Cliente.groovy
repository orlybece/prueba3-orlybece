package prueba3.orlybece

class Cliente {

    String nombre
    String cedula
    Date fechaNacimiento
    String sexo
    Boolean estatus
    String direccion
    String telefono
    String email

    static constraints = {

        cedula blank:false, nullable: false
        nombre blank: false, nullable: false
        sexo inList: ["Masculino", "Femenino"]
        fechaNacimiento max: new Date()
        direccion blank: false, nullable: false
        telefono blank: false, nullable: false
        email email: true, blank: true
    }
}
