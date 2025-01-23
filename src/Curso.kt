class Curso(val nombre: String, val codigo: String) {
    var estudiantes = mutableListOf<Estudiante>()


    fun agregarAlumno(estudiante: Estudiante){
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes(){
        for(estudiante in estudiantes){
            println("${estudiante.nombre}  ${estudiante.dni}")

        }
    }


}