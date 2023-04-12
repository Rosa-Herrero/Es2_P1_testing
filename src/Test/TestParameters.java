package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CapaDomini.CalculDescompte;

class TestParameters {

	@Test
	void test_null() {
		// Si la matriu productes és vuida cal llançar una excepció
		try {
			double result = CalculDescompte.getDescompte(null);
			fail("Not yet implemented");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "La matriu no pot ser nul.la");
			assert (e.getClass() == IllegalArgumentException.class);
		}

	}

	@Test
	void test_2columns() {
		// Comprovem si la matriu productes té exactament dues columnes
		try {
			double result = CalculDescompte.getDescompte(new double[][] { { 0, 0, 0 } });
			fail("Not yet implemented");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "La matriu cal que sigui de 2 columnes");
			assert (e.getClass() == IllegalArgumentException.class);
		}
	}

	@Test
	void test_cami2voltes() {
		double p1 = 10.05, p2 = 21.50;
		double[][] productes = { { 0, p1 }, { 1, p2 } };
		double esperat = p1 + p2 * 0.05;
		double resultat = CalculDescompte.getDescompte(productes);

		assertEquals(esperat, resultat, 0.01);
	}

}
