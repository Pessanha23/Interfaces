package interfaceemprestimopaypal.service;

import interfaceemprestimopaypal.entities.Contract;
import interfaceemprestimopaypal.entities.Installments;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue()/months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

        double iterest = onlinePaymentService.interest(basicQuota,i);
        double fee = onlinePaymentService.paymentFee(basicQuota + iterest);

        double quota = basicQuota + iterest + fee;

        contract.getInstalments().add(new Installments(dueDate,quota));

        }
    }
}
