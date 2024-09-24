public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo Crema", 3);

        Velocista velocista = new Velocista(1, "Lewis", 32, 384, 312);
        Escalador escalador = new Escalador(2, "Max", 33);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Oscar", 34, 60);

        equipo.añadirCiclista(velocista);
        velocista.setTiempoCarrera(32);
        equipo.añadirCiclista(escalador);
        escalador.setTiempoCarrera(33);
        equipo.añadirCiclista(contrarrelojista);
        contrarrelojista.setTiempoCarrera(34);

        equipo.imprimirDatosEquipo();
        System.out.println("Tiempo total del equipo: " + equipo.calcularTiempoTotal());

        equipo.imprimirDatosCiclista(1);
    }
}