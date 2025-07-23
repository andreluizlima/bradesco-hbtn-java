import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        double peso = pedido.getPeso();
        double total = pedido.getTotal();

        Frete frete = provedorFrete.calcularFrete(peso, total);
        pedido.setFrete(frete);
    }
}
