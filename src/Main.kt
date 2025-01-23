




fun main(){
    val curso1 = Curso(nombre = "DAM", codigo = "55934l")
    val estudiante1 = Estudiante(nombre = "Jesus", "77499633Y")
    val estudiante2 = Estudiante(nombre = "Gonzalo", dni = "77543497K")
    curso1.agregarAlumno(estudiante1)
    estudiante2.inscribirse(curso1)
    curso1.mostrarEstudiantes()
}