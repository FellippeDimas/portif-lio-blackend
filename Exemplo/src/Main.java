package org.example;

public class Personagem {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 5;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Java";
        Personagem creeper = new Creeper();
        creeper.nome = "Creeper";
        creeper.vida = 5;

        jogador.atacar(inimigo);


        system.out.println("jogador: " + jogador.vida);
        system.out.println("inimigo: " + inimigo.vida);
        system.out.println("Creeper: " + inimigo.vida);

        //system.out.println(jogador.nome +" / vida: " + jogador.vida);
        //system.out.println(inimigo.nome +" / vida: " + jogador.vida);
    }
}