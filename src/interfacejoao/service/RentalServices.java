package interfacejoao.service;

import interfacejoao.entities.CarRental;
import interfacejoao.entities.Invoice;

import java.time.Duration;

public class RentalServices {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;


    public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        super();
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

         double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
         double hours = minutes/60;

         double basicPayment;
         if (hours <= 12.0) {
             basicPayment = pricePerHour * Math.ceil(hours);
         } else {
             basicPayment = pricePerDay * Math.ceil(hours/24.0);
         }

         double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}