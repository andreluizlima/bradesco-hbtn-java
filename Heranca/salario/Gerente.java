public class Gerente extends Empregado {


	public Gerente(double salarioFixo) {
		super(salarioFixo);
	}

	@Override
	public double calcularBonus(Departamento departamento) {
		return departamento.alcancouMeta() ? aplicarMetaAtingidaNoCalculo(departamento.getValorAtingidoMeta() - departamento.getValorMeta()) : 0;
	}

	private double aplicarMetaAtingidaNoCalculo(double deltaMetaAtingida){
		double resultado = 0;

		resultado += getSalarioFixo() * 0.2;
		resultado += deltaMetaAtingida * 0.01;

		return resultado;
	}
}