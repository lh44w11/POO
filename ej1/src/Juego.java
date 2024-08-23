public class Juego {
    public int Vidas;

    public Juego(int vidas) {
        this.Vidas = vidas;
    }

    public void MuestraVidasRestantes() {
        System.out.println("Vidas restantes: " + Vidas);
    }
}
