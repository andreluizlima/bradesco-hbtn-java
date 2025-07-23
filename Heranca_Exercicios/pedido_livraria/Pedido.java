public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }
    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    public ItemPedido[] getItens() {
        return itens;
    }
    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal(){
        double totalPedido = 0;
        for(ItemPedido item : itens){
            totalPedido += (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        return totalPedido * (1 - (percentualDesconto/100));
    }
}
