package interfacecarrinhoifood.service;

public class UberMotorista implements TaxaUberCancelamento {

    //Motorista aceitou ou cancelar, taxa 5%
    //Se o motorista nao aceitou, taxa 0%
    private boolean aceitacao;

    private Double valorCorrida;

    public UberMotorista() {
    }

    public UberMotorista(boolean aceitacao, Double valorCorrida) {
        this.aceitacao = aceitacao;

        this.valorCorrida = valorCorrida;
    }

    public UberMotorista(boolean aceitacao) {
        this.aceitacao = aceitacao;
    }

    public boolean isAceitacao() {
        return aceitacao;
    }

    public void setAceitacao(boolean aceitacao) {
        this.aceitacao = aceitacao;
    }


    public Double getValorCorrida() {
        return valorCorrida;
    }

    public void setValorCorrida(Double valorCorrida) {
        this.valorCorrida = valorCorrida;
    }

    public double taxa() {
        double paga = 0;
        if (aceitacao == true) {
            paga = 0.5 * valorCorrida;
        }
        return paga ;
    }
}
