public class Contrarrelojista extends Ciclista {
    private int velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, int tiempoCarrera, int velocidadMaxima) {
        super(identificador, nombre, tiempoCarrera);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirDatos() {
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }

    public String imprimirTipo() {
        return "Contrarrelojista";
    }
}
