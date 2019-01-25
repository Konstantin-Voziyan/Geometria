import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Circulo_KVTestArea {
	
	private double r;
	private double res;
	private String tipo = "circulo";
	
	public Circulo_KVTestArea(double r, double res) {
		this.r = r;
		this.res = res;
	}
	
	@Parameters
	public static Collection<Object[]> numeros_Area(){
		return Arrays.asList(new Object[][] {
			{7, 153.94},{0, 0},{-3, 28.27}
		});
	}
	

	@Test
	public void testArea() {
		Circulo_KV c1 = new Circulo_KV(r, tipo);
		double resultado = c1.area();
		assertEquals(res, resultado, 0.1);
	}

}