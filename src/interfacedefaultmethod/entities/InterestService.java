package interfacedefaultmethod.entities;

import java.security.InvalidParameterException;

public interface InterestService {

    double pegaImposto();

    default double pagamento(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Os meses devem ser maior que zero");
        }

        return amount * Math.pow(1 + pegaImposto()/100,months);
    }
}
