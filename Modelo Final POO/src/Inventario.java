import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Inventario {
    private Dispositivo[] dispositivos; // Ocultamiento
    private int cantidad; // Ocultamiento

    public Inventario(int capacidad) {
        this.dispositivos = new Dispositivo[capacidad];
        this.cantidad = 0;
    }

    public void añadirDispositivo(Dispositivo dispositivo) throws Exception { // Excepcion
        if (cantidad >= dispositivos.length) {
            throw new Exception("InventarioLlenoException"); // Excepcion
        } else {
            for (int i = 0; i < cantidad; i++) {
                if (dispositivo.getId() == dispositivos[i].getId()) {
                    throw new Exception("DispositivoDuplicadoException"); // Excepcion
                }
            }
        }
        dispositivos[cantidad] = dispositivo;
        cantidad++;
    }

    public void imprimirInventario() {
        if (cantidad == 0) {
            System.out.println("El inventario esta vacio.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(dispositivos[i].imprimirDatos());
                System.out.println("----------");
            }
        }
    }

    public void calcularTiempoUsoTotal() {
        if (cantidad == 0) {
            System.out.println("El inventario esta vacio.");
        } else {
            int accum = 0;
            for (int i = 0; i < cantidad; i++) {
                accum = accum + dispositivos[i].getTiempoUso();
            }

            System.out.println(accum + " horas.");
        }
    }

    public void listarDispositivos () {
        if (cantidad == 0) {
            System.out.println("El inventario esta vacio.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(dispositivos[i].getNombreDispositivo());
            }
        }
    }

    public Dispositivo buscarPorID(int id) throws Exception { // Excepcion
        if (cantidad == 0) {
            System.out.println("El inventario esta vacio.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                if (dispositivos[i].getId() == id) {
                    return dispositivos[i];
                }
            }
        }
        throw new Exception("DispositivoNoEncontradoException"); // Excepcion
    }

    public void guardarEnArchivo(String nombreArchivo) { // Escritura en archivo de texto
        try (BufferedWriter writer = new BufferedWriter((new FileWriter(nombreArchivo)))) { // Excepcion
            for (int i = 0; i < cantidad; i++) {
                writer.write(dispositivos[i].imprimirDatos()); // Escritura en archivo de texto
                writer.newLine(); // Escritura en archivo de texto
            }
        } catch (IOException e) { // Excepcion
            System.out.println(e.getMessage());
        }
    }
}

