package main;

public class Tabuleiro {
    public String getStatus() {
        return "O Tabuleiro foi criado com sucesso";
    }

    private String[][] casas = new String[8][8];
    private int turnos = 0;

    public Tabuleiro() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                casas[i][j] = "   ";
        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {
        new Rei("K1b");
        new Rainha("Q1b");
        new Torre("T1b");
        new Torre("T2p");
        new Bispo("B1b");
        new Bispo("B2p");
        new Cavalo("H1b");
        new Cavalo("H2p");
        for (int i = 0; i < 8; i++)
            new Peao("p" + (i + 1) + "b");

        new Rei("K1p");
        new Rainha("Q1p");
        new Torre("T1p");
        new Torre("T2b");
        new Bispo("B1p");
        new Bispo("B2b");
        new Cavalo("H1p");
        new Cavalo("H2b");
        for (int i = 0; i < 8; i++)
            new Peao("P" + (i + 1) + "p");
    }

    public void mostrar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print("[" + casas[i][j] + "]");
            System.out.println();
        }
    }

    public boolean acabouOJogo() {
        return false;
    }
}
