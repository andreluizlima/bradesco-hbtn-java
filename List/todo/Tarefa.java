public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = descricao;
        this.estahFeita = false;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void modificarDescricao(String descricao){
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = descricao;
    }
}
