public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoCarrera;

    public Ciclista(int identificador, String nombre, int tiempoCarrera) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoCarrera = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void imprimirDatos() {
        System.out.println("ID: " + identificador + "Nombre: " + nombre + "Tiempo: " + tiempoCarrera);
    }

    public abstract String imprimirTipo();
}
