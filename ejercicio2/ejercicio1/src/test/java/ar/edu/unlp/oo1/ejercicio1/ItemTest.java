package ar.edu.unlp.oo1.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

	private Item item;

	@BeforeEach
	public void setUp() {
		item = new Item("azucar", 60.0, 2);
	}

	@Test
	public void testCosto() {
		assertEquals(120, item.costo());
	}

	@Test
	public void testCostoUnitario() {
		assertEquals(60.0, item.getCostoUnitario());
	}
}
