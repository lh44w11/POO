public class Juego {
    private int VidasOriginales;
    private int Vidas;

    public Juego(int VidasOriginales) {
        this.VidasOriginales = VidasOriginales;
        this.Vidas = VidasOriginales;
    }

    public void MuestraVidasRestantes() {
        System.out.println("Vidas restantes: " + Vidas);
    }

    public boolean QuitarVida() {
        Vidas--;
        return Vidas>0;
    }

    public void ReiniciarPartida() {
        this.Vidas = VidasOriginales;
    }
}
