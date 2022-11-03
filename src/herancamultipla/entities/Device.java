package herancamultipla.entities;

public abstract class Device {
    private String serialNumber;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void processDoc(String doc);
}
