package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        // Implementação específica do cálculo de frete para JadLog
        double custoTotal = peso <= 2000 ? valor * 0.045 : valor * 0.07;
        return new Frete(custoTotal, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }

}
