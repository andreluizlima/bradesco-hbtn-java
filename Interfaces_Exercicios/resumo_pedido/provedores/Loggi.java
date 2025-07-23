package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        // Implementação específica do cálculo de frete para Loggi
        double custoTotal = peso <= 5000 ? valor * 0.04 : valor * 0.12;
        return new Frete(custoTotal, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }

}
