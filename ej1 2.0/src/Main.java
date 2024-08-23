public class Main {
    public static void main(String[] args) {
        Juego partida1 = new Juego(5);
        partida1.MuestraVidasRestantes();
        partida1.QuitarVida();
        partida1.MuestraVidasRestantes();
        partida1.ReiniciarPartida();
        partida1.MuestraVidasRestantes();
    }
}