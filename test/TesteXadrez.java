
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteXadrezTest {
    @Test
    void verificarCriacaoPecas() {
       Peca peca = new Peca();
        assertEquals("A peca foi criada" , getStatus());
       
        Bispo bispo = new Bispo();
        assertEquals("O bispo foi criada", getStatus());
        Cavalo cavalo = new Cavalo();
        assertEquals("O cavalo foi criado", getStatus());
        Peao peao = new Peao(); 
        assertEquals("O peao foi criado", getStatus() );      
        Rainha rainha = new Rainha(); 
        assertEquals("A rainha foi criada", getStatus());
        Rei rei = new Rei();
        assertEquals("O rei foi criado", getStatus());  
          Torre torre = new Torre();
         assertEquals("A torre foi criada" , getStatus());

         System.out.println("Todos os objetos fora criados com sucesso.");         
 

    }
   
    @Test
    void verificarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
             assertEquals("O Tabuleiro foi criado com sucesso" , getStatus());
    }    
}