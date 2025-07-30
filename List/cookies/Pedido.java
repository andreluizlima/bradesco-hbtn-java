import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        cookies.add(cookie);
    }

    public int obterTotalCaixas(){
        int totalCaixas = 0;
        for (PedidoCookie cookie : cookies) {
            totalCaixas += cookie.getQuantidade();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor) {
        int totalRemovido = 0;
        for (int i = 0; i < cookies.size(); i++) {
            PedidoCookie cookie = cookies.get(i);
            if (cookie.getSabor().equals(sabor)) {
                totalRemovido += cookie.getQuantidade();
                cookies.remove(i);
                i--; // Ajusta o índice após remoção
            }
        }
        return totalRemovido;
    }


}
