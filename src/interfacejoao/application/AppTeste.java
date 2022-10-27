package interfacejoao.application;

import interfacejoao.entities.CarRental;
import interfacejoao.entities.Vehicle;
import interfacejoao.service.BrazilTaxService;
import interfacejoao.service.RentalServices;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppTeste {

    @Test
    public void teste_1() {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        CarRental car = new CarRental(LocalDateTime.parse("25/06/2018 10:30", fmt), LocalDateTime.parse("25/06/2018 14:40", fmt), new Vehicle("Civic"));
        RentalServices rental = new RentalServices(130.0, 10.0, new BrazilTaxService());

        rental.processInvoice(car);

        String resultado = car.toString();

        String expectativa = """
            Fatura:
            Pagamento básico: 50.0
            Imposto: 10.0
            Pagamento Total:  60.0""";

        Assert.assertEquals(expectativa,resultado);


    }

    @Test
    public void teste_2() {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        CarRental car = new CarRental(LocalDateTime.parse("25/06/2018 10:30", fmt), LocalDateTime.parse("27/06/2018 11:40", fmt), new Vehicle("BMW"));
        RentalServices rental = new RentalServices(130.0, 10.0, new BrazilTaxService());

        rental.processInvoice(car);

        String resultado = car.toString();

        String expectativa = """
              Fatura:
              Pagamento básico: 390.0
              Imposto: 58.5
              Pagamento Total:  448.5""";

        Assert.assertEquals(expectativa,resultado);


    }

}
