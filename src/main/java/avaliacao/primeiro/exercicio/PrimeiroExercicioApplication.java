package avaliacao.primeiro.exercicio;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class PrimeiroExercicioApplication {

	public int solution(Integer entrada) {

		int retorno = -1;
		String valor = String.valueOf(entrada);

		try {
			List<String> values = Arrays.asList(valor.split(""));

			Collections.sort(values, new Comparator<String>() {
				@Override
				public int compare(String v1, String v2) {

					int valor1 = Integer.valueOf(v1);
					int valor2 = Integer.valueOf(v2);
					if (valor1 == valor2)
						return 0;

					return valor1 > valor2 ? -1 : 1;

				}
			});

			String valorFinal = values.stream().map(v -> v).reduce("", String::concat);
			if (Integer.parseInt(valorFinal) > 100000000){
				log.error(String.format("O valor inserido foi {} e não é aceito CODIGO {}"), valor, retorno);
				return retorno;
			}

			log.info(String.format("O valor inserido foi {} e o maior valor é {}"), valor, valorFinal);

			retorno = Integer.parseInt(valorFinal);
		} catch (NumberFormatException e){
			log.error("O valor não pode ser lido, ultrapassa do tamanho do inteiro");
		}

		return retorno;
	}
}
