public class Tablet extends Dispositivo { // Herencia
    private int resolucion; // Ocultamiento

    public Tablet(int id, String nombreDispositivo, int tiempoUso, int resolucion) { // Encapsulamiento
        super(id, nombreDispositivo, tiempoUso); // Herencia
        this.resolucion = resolucion;
    }

    public int getResolucion() { // Encapsulamiento
        return resolucion;
    }

    public void setResolucion(int resolucion) { // Encapsulamiento
        this.resolucion = resolucion;
    }

    public String imprimirTipo() { // Herencia, metodo abstracto implementado
        return "Es una Tablet";
    }

    public String imprimirDatos() { // super.imprimirDatos() = HERENCIA
        return super.imprimirDatos() + " Resolucion: " + resolucion + " pixeles.";
    }
}
