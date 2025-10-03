
import java.util.ArrayList;
import java.util.List;


public class FormasGeometricas {
	private List<Retangulo> listaRetangulos;

	public FormasGeometricas() {
		listaRetangulos = new ArrayList<Retangulo>();
	}
	public Retangulo obterRetanguloMaiorPerimetro() {
		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo rMaiorPerimetro = null;

		for (Retangulo r : listaRetangulos) {
			if (r.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcularPerimetro();
				rMaiorPerimetro = r;
			}
		}

		return rMaiorPerimetro;

	}

	public Retangulo obterRetanguloMaiorArea() {
		double maiorArea = Double.MIN_VALUE;
		Retangulo rMaiorArea = null;

		for (Retangulo r : listaRetangulos) {
			if (r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				rMaiorArea = r;
			}
		}

		return rMaiorArea;

	}

	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}

	public List<Retangulo> obterListaRetangulos() {
		return listaRetangulos;
	}

}
