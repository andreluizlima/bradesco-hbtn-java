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

    public void apresentarResumoPedido(){
        double total = 0;
        double totalPedidoComDesconto = calcularTotal();

        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido item : itens){
            imprimirInfoItem(item);
            total += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n",(total-totalPedidoComDesconto));
        System.out.printf("TOTAL PRODUTOS: %.2f\n",total);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPedidoComDesconto);
        System.out.println("----------------------------");
    }

    private void imprimirInfoItem(ItemPedido item){
        // System.out.println("Tipo: " + item.getProduto().getClass().getSimpleName() + 
        // " Titulo: " + item.getProduto().getTitulo() + 
        // " Preco: " + item.getProduto().obterPrecoLiquido() + 
        // " Quant: " + item.getQuantidade() + 
        // " Total: "+item.getQuantidade()*item.getProduto().obterPrecoLiquido());

        System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), item.getQuantidade()*item.getProduto().obterPrecoLiquido());
    }
}
