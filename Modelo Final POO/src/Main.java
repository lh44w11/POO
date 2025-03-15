public class Main {
    public static void main(String[] args) {
        try { // Exepcion
            Inventario inventario = new Inventario(3);

            Smartphone smartphone = new Smartphone(1, "iPhone", 65, 4000, 7);
            Laptop laptop = new Laptop(2, "MacBook", 45, 32, 2048);
            Tablet tablet = new Tablet(3, "iPad", 10, 1920);

            inventario.añadirDispositivo(smartphone);
            inventario.añadirDispositivo(laptop);
            inventario.añadirDispositivo(tablet);

            System.out.println("");
            System.out.println("----------");
            inventario.imprimirInventario();

            System.out.println("");
            System.out.println("Tiempo de uso total entre todos los dispositivos del inventario: ");
            inventario.calcularTiempoUsoTotal();

            System.out.println("");
            System.out.println("Lista de nombres de todos los dispositivos del inventario: ");
            inventario.listarDispositivos();

            System.out.println("");
            System.out.println("Buscando por ID: 2... ");
            Dispositivo encontrado = inventario.buscarPorID(2);
            System.out.println(encontrado.imprimirDatos());

            inventario.guardarEnArchivo("inventario.txt"); // Escritura en archivo de texto
        } catch (Exception e){ // Excepcion
            System.out.println(e.getMessage());
        }
    }
}