package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        // Implementação específica do cálculo de frete para Sedex
        double custoTotal = peso <= 1000 ? valor * 0.05 : valor * 0.1;
        return new Frete(custoTotal, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }

}
