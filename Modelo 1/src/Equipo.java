public class Equipo {
    private String nombreEquipo;
    private Ciclista[] ciclistas;
    private int indiceActual;

    public Equipo(String nombreEquipo, int cantidadCiclistas) {
        this.nombreEquipo = nombreEquipo;
        this.ciclistas = new Ciclista[cantidadCiclistas];
        this.indiceActual = 0;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        if (indiceActual<ciclistas.length) {
            ciclistas[indiceActual] = ciclista;
            indiceActual++;
        }
        else {
            System.out.println("No se pueden añadir mas ciclistas al equipo.");
        }
    }

    public int calcularTiempoTotal() {
        int tiempoTotal = 0;
        for (int i = 0; i<indiceActual; i++) {
            tiempoTotal = tiempoTotal + (ciclistas[i].getTiempoCarrera());
        }
        return tiempoTotal;
    }

    public void listarCiclistas() {
        for (int i = 0; i<indiceActual; i++) {
            System.out.println(ciclistas[i].getNombre());
        }
    }

    public void imprimirDatosCiclista(int identificador) {
        for (int i = 0; i<indiceActual; i++) {
            if (ciclistas[i].getIdentificador() == identificador) {
                ciclistas[i].imprimirDatos();
                return;
            }
        }
        System.out.print("No se encontro un ciclista con el identificador: " + identificador);
    }

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + getNombreEquipo());
        listarCiclistas();
    }
}
