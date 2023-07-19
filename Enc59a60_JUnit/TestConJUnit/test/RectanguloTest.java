import entities.Rectangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import services.RectanguloService;


public class RectanguloTest {
    
    RectanguloService rs;
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rs = new RectanguloService();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10, 10).getColor());
    }
    
    @Test 
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10, 10). 0));fdrrrgdfgdfg
    }
    
    @Test
    public void deberiaCalcularPerimetro(){
        
    }
}
