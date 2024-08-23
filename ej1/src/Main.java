public class Main {
    public static void main(String[] args) {
        Juego partida1 = new Juego(5);
        partida1.MuestraVidasRestantes();
        partida1.Vidas--;
        partida1.MuestraVidasRestantes();

        Juego partida2 = new Juego(5);
        partida2.MuestraVidasRestantes();
        partida1.MuestraVidasRestantes();

    }
}