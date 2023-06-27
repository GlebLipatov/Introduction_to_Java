package Introduction.HomeWorks.HW6;

import java.util.HashMap;
import java.util.Map;

public class Components {
    private Map<Integer,String> manufacturer; // не совсем сюда, но что бы не слишком усложнять.
    private Map<Integer, Integer> processorFrequency;
    private Map<Integer, Integer> ramCapacity;
    private Map<Integer, Integer> memoryCapacity;
    private Map<Integer, Integer> videoCapacity;
    private Map<Integer, Integer> monitorSize;

    public void init() {
        this.manufacturer = new HashMap<>();
        this.processorFrequency = new HashMap<>();
        this.ramCapacity = new HashMap<>();
        this.memoryCapacity = new HashMap<>();
        this.videoCapacity = new HashMap<>();
        this.monitorSize = new HashMap<>();

        this.manufacturer.put(1, "Asus");
        this.manufacturer.put(2, "Acer");
        this.manufacturer.put(3, "Samsung");

        this.processorFrequency.put(1, 3000);
        this.processorFrequency.put(2, 3100);
        this.processorFrequency.put(3, 3200);

        this.ramCapacity.put(1, 8);
        this.ramCapacity.put(2, 16);
        this.ramCapacity.put(3, 32);

        this.memoryCapacity.put(1, 256);
        this.memoryCapacity.put(2, 512);
        this.memoryCapacity.put(3, 1024);

        this.videoCapacity.put(1, 6000);
        this.videoCapacity.put(2, 8000);
        this.videoCapacity.put(3, 12000);

        this.monitorSize.put(1, 13);
        this.monitorSize.put(2, 14);
        this.monitorSize.put(3, 17);
    }

    public Map<Integer, String> getManufacturer() {
        return manufacturer;
    }

    public Map<Integer, Integer> getProcessorFrequency() {
        return processorFrequency;
    }

    public Map<Integer, Integer> getRamCapacity() {
        return ramCapacity;
    }

    public Map<Integer, Integer> getMemoryCapacity() {
        return memoryCapacity;
    }

    public Map<Integer, Integer> getVideoCapacity() {
        return videoCapacity;
    }

    public Map<Integer, Integer> getMonitorSize() {
        return monitorSize;
    }
}
