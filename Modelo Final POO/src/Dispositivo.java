abstract class Dispositivo { // Clase abstracta
    private int id; // Ocultamiento
    private String nombreDispositivo; // Ocultamiento
    private int tiempoUso; // Ocultaiento

    public Dispositivo(int id, String nombreDispositivo, int tiempoUso) { // Encapsulamiento
        this.id = id;
        this.nombreDispositivo = nombreDispositivo;
        this.tiempoUso = tiempoUso;
    }

    public int getId() { // Encapsulamiento
        return id;
    }

    public void setId(int id) { // Encapsulamiento
        this.id = id;
    }

    public String getNombreDispositivo() { // Encapsulamiento
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) { // Encapsulamiento
        this.nombreDispositivo = nombreDispositivo;
    }

    public int getTiempoUso() { // Encapsulamiento
        return tiempoUso;
    }

    public void setTiempoUso(int tiempoUso) { // Encapsulamiento
        this.tiempoUso = tiempoUso;
    }

    public abstract String imprimirTipo(); // Metodo abstracto sin implementar

    public String imprimirDatos() {
        return "ID: " + id + " Nombre del dispositivo: " + nombreDispositivo + " Tiempo de uso: " + tiempoUso + " hs. ";
    }
}
