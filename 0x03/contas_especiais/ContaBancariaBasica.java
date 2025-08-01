import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0.0;
        this.taxaJurosAnual = taxaJurosAnual;
    }


    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double resultado = saldo * 0.1 > 10.0 ? 10.0 : saldo * 0.1;
        return resultado;
    }

    public double calcularJurosMensal(){
        double resultado = (taxaJurosAnual / 12.0 / 100.0);
        return saldo < 0 ? 0 : resultado * saldo;
    }

    public void aplicarAtualizacaoMensal() {
        double tarifa = calcularTarifaMensal();
        double juros = calcularJurosMensal();
        
        saldo -= tarifa;
        saldo += juros;
    }

    public String getNumeracao() {
        return numeracao;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
