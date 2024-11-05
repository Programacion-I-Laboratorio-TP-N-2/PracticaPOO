//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio Personas
        Persona p1 = new Persona( "Pedro" ,"Pérez","1053121010", 1998, "Argentina", "H");
        Persona p2 = new Persona("Luis","León","1053223344", 2001, "Argentina", "H");
        p1.imprimir();
        p2.imprimir();

        // Ejercicio Planetas
        Planetas t1 = new Planetas("Tierra", 1, 5.9736, 1.0832, 12742, 1500000000, "TERRESTRE",true, 5.514720, false, 345, 343545);
        Planetas t2 = new Planetas("Jupiter", 79, 1.899, 1.4313, 139820, 75000000, "GASEOSO", true, 1.32676, true, 3455,334534);
        t1.imprimir();
        t2.imprimir();
    }
}