public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, int tiempoCarrera, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempoCarrera);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public void imprimirDatos() {
        System.out.println("Potencia promedio: " + potenciaPromedio + " Velocidad promedio: " + velocidadPromedio);
    }

    public String imprimirTipo() {
        return "Velocista";
    }
}
