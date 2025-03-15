public class Laptop extends Dispositivo { // Herencia
    private int memoriaRAM; // Ocultamiento
    private int capacidadAlmacenamiento; // Ocultamiento

    public Laptop(int id, String nombreDispositivo, int tiempoUso, int memoriaRAM, int capacidadAlmacenamiento) { // Encapsulamiento
        super(id, nombreDispositivo, tiempoUso); // Herencia
        this.memoriaRAM = memoriaRAM;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getMemoriaRAM() { // Encapsulamiento
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) { // Encapsulamiento
        this.memoriaRAM = memoriaRAM;
    }

    public int getCapacidadAlmacenamiento() { // Encapsulamiento
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) { // Encapsulamiento
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String imprimirTipo() { // Herencia, metodo abstracto implementado
        return "Es una Laptop";
    }

    public String imprimirDatos() { // super.imprimirDatos() = HERENCIA
        return super.imprimirDatos() + " Memoria RAM: " + memoriaRAM + " Capacidad de almacenamiento: " + capacidadAlmacenamiento + " GB.";
    }
}
