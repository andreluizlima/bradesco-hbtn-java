package produtos;

public abstract class Produto {
    private String titulo;
    private Integer ano;
    private String pais;
    private Double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto){
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setPais(pais);
        this.setPrecoBruto(precoBruto);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Double getPrecoBruto() {
        return precoBruto;
    }
    public void setPrecoBruto(Double precoBruto) {
        this.precoBruto = precoBruto;
    }

    public abstract double obterPrecoLiquido();
    
}
