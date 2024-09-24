public class Escalador extends Ciclista {
    private float aceleracionSubida;
    private float gradoRampa;

    public Escalador(int identificador, String nombre, int tiempoCarrera) {
        super(identificador, nombre, tiempoCarrera);
        this.aceleracionSubida = aceleracionSubida;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionSubida() {
        return aceleracionSubida;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setAceleracionSubida(float aceleracionSubida) {
        this.aceleracionSubida = aceleracionSubida;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    public void imprimirDatos() {
        System.out.println("Aceleracion subida: " + aceleracionSubida + "Grado rampa: " + gradoRampa);
    }

    public String imprimirTipo() {
        return "Escalador";
    }
}
