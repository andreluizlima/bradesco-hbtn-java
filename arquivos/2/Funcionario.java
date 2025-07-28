public class Funcionario {
    private String nome;
    private String idade;
    private String departamento;
    private String salarial;

    public Funcionario(String nome, String idade, String departamento, String salarial) {
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
        this.salarial = salarial;
    }
    public String getNome() {
        return nome;
    }
    public String getIdade() {
        return idade;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getSalarial() {
        return salarial;
    }
    
}
