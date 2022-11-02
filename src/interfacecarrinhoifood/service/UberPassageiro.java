package interfacecarrinhoifood.service;

import java.time.Duration;
import java.time.LocalDateTime;

public class UberPassageiro implements TaxaUberCancelamento {

    //Passageiro cancelar antes dos 5min, nao receberá uma taxa
    //Passageiro após 5 min, receberá uma taxa 5%

    private LocalDateTime start;
    private LocalDateTime finish;
    private Double valorCorrida;

    public UberPassageiro() {
    }


    public UberPassageiro(LocalDateTime start, LocalDateTime finish, Double valorCorrida) {
        this.start = start;
        this.finish = finish;
        this.valorCorrida = valorCorrida;
    }

    public UberPassageiro(LocalDateTime finish, Double valorCorrida) {
        this.finish = finish;
        this.valorCorrida = valorCorrida;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public double taxa() {

        double paga = 0;
        double minutes = Duration.between(start,finish).toMinutes();
        if (minutes >= 5) {
            paga = 0.5 * valorCorrida;
        }
        return paga;
    }
}
