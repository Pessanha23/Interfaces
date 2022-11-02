package herancamultipla.entities.service;

public class ComboDevice extends Device implements Print, Scan{

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {

    }

    @Override
    public void print(String doc) {

    }

    @Override
    public String scan() {
        return null;
    }
}
