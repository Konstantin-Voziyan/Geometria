import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Circulo_KVTestPerimetro {
	
	private double r;
	private double res;
	private String tipo = "circulo";
	
	public Circulo_KVTestPerimetro(double r, double res) {
		this.r = r;
		this.res = res;
	}
	
	
	@Parameters
	public static Collection<Object[]> numeros_Perimetro(){
		return Arrays.asList(new Object[][] {
			{7, 43.9},{0, 0},{-3, 18.8}
		});
	}
	
	@Test
	public void testPerimetro() {
		Circulo_KV c1 = new Circulo_KV(r, tipo);
		double resultado = c1.perimetro();
		assertEquals(res, resultado, 0.1);
	}

}