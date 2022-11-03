package interfacedefaultmethod.service;

import interfacedefaultmethod.entities.InterestService;

public class UsaTaxService implements InterestService {

    private double pegaImposto;

    public UsaTaxService(double pegaImposto) {
        this.pegaImposto = pegaImposto;
    }
    @Override
    public double pegaImposto() {
        return pegaImposto;
    }
}
