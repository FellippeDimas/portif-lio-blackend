public class Personagem {
    public String nome;
    public Integer vida = 10;

    public void atacar(Personagem alvo) {
        system.out.println(alvo.nome = " foi atacado " + this.nome);
        alvo.vida -=5;
    }
}
