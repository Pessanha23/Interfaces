package herancamultipla.entities;

public class Printer extends Device implements Print {

    public Printer(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {

    }

    @Override
    public void print(String doc) {

    }
}
