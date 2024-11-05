public class Persona {
    String nombre;
    String apellidos;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String paisOrigen;
    String genero;

    public Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String paisOrigen, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisOrigen = paisOrigen;
        this.genero = genero;
    }
        public void imprimir(){
            System.out.println("Nombre = " + nombre);
            System.out.println("Apellidos = " + apellidos);
            System.out.println("Numero de documento de identidad = " + númeroDocumentoIdentidad);
            System.out.println("Año de nacimiento = " + añoNacimiento);
            System.out.println("Pais de origen = " + paisOrigen);
            System.out.println("Genero (H/M) = " + genero);
            System.out.println();
        }
}
