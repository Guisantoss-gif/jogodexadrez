package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteXadrezTest {
    @Test
    void verificarCriacaoPecas() {
        Peca peca = new Peca("Peca");
        assertEquals("A peca foi criada", peca.getStatus());
       
        Bispo bispo = new Bispo("Bispo");
        assertEquals("O bispo foi criado", bispo.getStatus());
        
        Cavalo cavalo = new Cavalo("Cavalo");
        assertEquals("O cavalo foi criado", cavalo.getStatus());
        
        Peao peao = new Peao("Peão"); 
        assertEquals("O peao foi criado", peao.getStatus());      
        
        Rainha rainha = new Rainha("Rainha"); 
        assertEquals("A rainha foi criada", rainha.getStatus());
        
        Rei rei = new Rei("Rei");
        assertEquals("O rei foi criado", rei.getStatus());  
        
        Torre torre = new Torre("Torre");
        assertEquals("A torre foi criada", torre.getStatus());
         
        System.out.println("Todos os objetos foram criados com sucesso.");         
    }
   
    @Test
    void verificarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertEquals("O Tabuleiro foi criado com sucesso", tabuleiro.getStatus());
    }    
}
