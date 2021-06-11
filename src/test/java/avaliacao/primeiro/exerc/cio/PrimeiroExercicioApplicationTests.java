package avaliacao.primeiro.exerc.cio;

import avaliacao.primeiro.exercicio.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeiroExercicioApplicationTests {

	static Solution app;

	@BeforeAll
	static void initialize(){
		app = new Solution();
	}

	@Test
	void testValoresOk() {

		int solution = app.solution(213);
		assertEquals(321, solution);

		solution = app.solution(555);
		assertEquals(555, solution);

		solution = app.solution(456789);
		assertEquals(987654, solution);

		solution = app.solution(665919);
		assertEquals(996651, solution);

		solution = app.solution(100000000);
		assertEquals(100000000, solution);
	}

	@Test
	void testValoresNOk() {

		int solution = app.solution(213000000);
		assertEquals(-1, solution);

		solution = app.solution(200000000);
		assertEquals(-1, solution);

		solution = app.solution(300000000);
		assertEquals(-1, solution);

	}

	@Test
	void testNumberFormatException(){
		int solution = app.solution(1000020002);
		assertEquals(-1, solution);
	}
}
