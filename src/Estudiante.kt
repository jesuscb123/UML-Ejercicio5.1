class Estudiante(val nombre: String,val dni: String, ) {
    init{
        require(dni.length == 9) {"El dni debe ser con 9 caracteres."}
        require(dni[8].isLetter()) {"El último caracter debe ser una letra."}
    }

    fun inscribirse(curso: Curso){
        curso.agregarAlumno(Estudiante(nombre,dni))
    }

}