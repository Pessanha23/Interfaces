package interfaceemprestimopaypal.service;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, Integer months);

}