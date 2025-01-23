### 1.Interpreta el significado del diagrama de clases.**

**a) Relación entre las clases. Significado, tipo, multiplicidad.**

Curso contiene estudiantes. Un curso en concreto puede contener muchos estudiantes pero un estudiante en concreto solo puede estar en un curso. 1:N

**b) Elementos de las clases. Tipos y propósito.**

La clase curso: tiene un nombre de tipo String(cadena de texto), un código de tipo string y una lista mutable de tipo Estudiante.

Además, cuenta con dos métodos:

AgregarAlumno(estudiante) -> Un objeto de tipo estudiante.

mostrarEstudiantes() -> no recibe nada pero muestra la lista de estudiantes.

La clase Estudiante tiene dos atributos de tipo String: Nombre y Dni.

Además, cuenta con un método:

inscribirse(curso)

**c)Significado del método agregarAlumno(). Funcionamiento.**

El método agregar alumno, agrega un alumno de tipo Estudiante a la lista estudiantes.

**d) Significado del método inscribirse()**

El método inscribirse recibe por parámetro un objeto curso para poder entrar en la lista de estudiantes de ese curso.