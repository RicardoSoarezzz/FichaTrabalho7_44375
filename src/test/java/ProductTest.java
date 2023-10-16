import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Product;

public class ProductTest {
    private Product product1;
    private Product product2;

    @Before
    public void setUp() {
        product1 = new Product("Item 1", 10.0);
        product2 = new Product("Item 2", 20.0);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Item 1", product1.getTitle());
    }

    @Test
    public void testGetPrice() {
        assertEquals(10.0, product1.getPrice(), 0.001);
    }

    @Test
    public void testEquals() {
        Product product3 = new Product("Item 1", 30.0);
        Product product4 = new Product("Item 2", 20.0);
        assertTrue(product1.equals(product3));
        assertTrue(product2.equals(product4));
        assertFalse(product1.equals(product2));
    }
}
