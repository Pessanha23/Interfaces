package interfaceemprestimopaypal.application;

import interfaceemprestimopaypal.entities.Contract;
import interfaceemprestimopaypal.entities.Installments;
import interfaceemprestimopaypal.service.ContractService;
import interfaceemprestimopaypal.service.PaypalService;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class AppTeste {
    @Test
    public void teste_1() {

        List<Installments> instalments = new ArrayList<>();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contract obj = new Contract(8068, LocalDate.parse("25/06/2018",fmt),600.0);
        ContractService contractService = new ContractService(new PaypalService());
        Installments installments = new Installments();
        contractService.processContract(obj, 3);


        String resultado = obj.toString();

        String expectativa = """
                Parcelas:
                2018-07-25 - 206.04
                2018-08-25 - 208.08
                2018-09-25 - 210.12
                """;

        Assert.assertEquals(expectativa,resultado);


    }


}
