public class Planetas {
    String nombrePlaneta;
    int satelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaAlSol;
    String tipoDePlaneta;
    boolean observable;
    double densidad;
    boolean exterior;
    int periodoOrbital;
    int periodoRotacion;

    public Planetas(String nombrePlaneta, int satelites, double masa, double volumen, double diametro, double distanciaAlSol, String tipoDePlaneta, boolean observable, double densidad, boolean exterior, int periodoOrbital, int periodoRotacion) {
        this.nombrePlaneta = nombrePlaneta;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tipoDePlaneta = tipoDePlaneta;
        this.observable = observable;
        this.densidad = densidad;
        this.exterior = exterior;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }
    public void imprimir(){
        System.out.println("Nombre del planeta = " + nombrePlaneta);
        System.out.println("Cantidad de satelites = " + satelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diametro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaAlSol);
        System.out.println("Tipo de planeta = " + tipoDePlaneta);
        System.out.println("Es observable = " + observable);
        System.out.println("Densidad del planeta = " + densidad);
        System.out.println("Es planeta exterior = " + exterior);
        System.out.println("Periodo orbital (en años) = " + periodoOrbital);
        System.out.println("Periodo de rotacion (en dias) = " + periodoRotacion);
        System.out.println();
    }
}

