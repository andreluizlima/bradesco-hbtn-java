public class Comida {
    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + nome + "] " + calorias + " R$ " + preco;
    }
    public String getNome() {
        return nome;
    }
    public int getCalorias() {
        return calorias;
    }
    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
