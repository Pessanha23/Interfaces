package herancamultipla.entities.service;

public class Scanner extends Device implements Scan {


    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {

    }

    @Override
    public String scan() {
        return null;
    }
}
