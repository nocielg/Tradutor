import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TesteTradutor {
//
	private Tradutor t;
	
	@Before
	public void criarTradutor(){
		t = new Tradutor();
	}
	
	@Test
	public void tradutorSemPalavras() {
		t = new Tradutor();
		assertTrue(t.estaVazio());
	}
	
	@Test
	public void umaTraducao(){
		t = new Tradutor();
		t.adicionaTraducao("bom","good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom"));
		t.adicionaTraducao("mau","bad");
	}
	
	@Test
	public void duasTraducoes(){
		t = new Tradutor();
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("mau","bad");
		assertEquals("good", t.traduzir("bom"));
		assertEquals("bad", t.traduzir("mau"));
	}
	
	@Test
	public void duasTraducoesMesmaPalavra(){
		t = new Tradutor();
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("bom","nice");
		assertEquals("good, nice", t.traduzir("bom"));
	}
	
	@Test
	public void traduzirFrase(){
		t = new Tradutor();
		t.adicionaTraducao("guerra","war");
		t.adicionaTraducao("é","is");
		t.adicionaTraducao("ruim","bad");
		assertEquals("war is bad", t.traduzirFrase("guerra é ruim"));
		
	}
	
	@Test
	public void traduzirFraseComDuasTraducoesMesmaPalavra(){
		t = new Tradutor();
		t.adicionaTraducao("paz","peace");
		t.adicionaTraducao("é","is");
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("bom","nice");
		assertEquals("peace is good", t.traduzirFrase("paz é bom"));
		
	}

}
