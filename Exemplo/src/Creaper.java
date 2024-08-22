public class Creaper extends Personagem {
    @Override
    public void atacar(Personagem alvo) {
        alvo.vida -= 3;
        this.vida = 0;
    }
}
