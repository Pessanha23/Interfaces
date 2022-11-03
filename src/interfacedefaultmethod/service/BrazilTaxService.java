package interfacedefaultmethod.service;

import interfacedefaultmethod.entities.InterestService;

public class BrazilTaxService implements InterestService {

    private double pegaImposto;



    public BrazilTaxService(double pegaImposto) {
        this.pegaImposto = pegaImposto;
    }
    @Override
    public double pegaImposto() {
        return pegaImposto;
    }
}
