package interfaceemprestimopaypal.entities;

import interfaceemprestimopaypal.service.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dueDate;
    private Double amount;

    public Installments() {
    }

    public Installments(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
