public class Smartphone extends Dispositivo { // Herencia
    private double capacidadBateria; // Ocultamiento
    private double tamañoPantalla; // Ocultamiento

    public Smartphone(int id, String nombreDispositivo, int tiempoUso, double capacidadBateria, double tamañoPantalla) { // Encapsulamiento
        super(id, nombreDispositivo, tiempoUso); // Herencia
        this.capacidadBateria = capacidadBateria;
        this.tamañoPantalla = tamañoPantalla;
    }

    public double getCapacidadBateria() { // Encapsulamiento
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) { // Encapsulamiento
        this.capacidadBateria = capacidadBateria;
    }

    public double getTamañoPantalla() { // Encapsulamiento
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) { // Encapsulamiento
        this.tamañoPantalla = tamañoPantalla;
    }

    public String imprimirTipo() { // Herencia, metodo abstracto implementado
        return "Es un Smartphone";
    }

    public String imprimirDatos() {  // super.imprimirDatos() = HERENCIA
        return super.imprimirDatos() + "Capacidad de bateria: " + capacidadBateria + " Tamaño de pantalla: " + tamañoPantalla + " pulgadas.";
    }
}
