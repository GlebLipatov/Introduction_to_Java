package Introduction.HomeWorks.HW6;

import java.util.HashMap;
import java.util.Objects;

public class Notebook {
    private static long ID = 1;
    private long id;
    private String manufacturer;
    private int processorFrequency;
    private int ramCapacity;
    private int memoryCapacity;
    private int videoCapacity;
    private int monitorSize;

    /**
     *
     * @param - String
     * @param - int
     * @param - int
     * @param - int
     * @param - int
     * @param - int
     */
    public Notebook(String manufacturer,
                    int processorFrequency,
                    int ramCapacity,
                    int memoryCapacity,
                    int videoCapacity,
                    int monitorSize) {

        this.manufacturer = manufacturer;
        this.processorFrequency = processorFrequency;
        this.ramCapacity = ramCapacity;
        this.memoryCapacity = memoryCapacity;
        this.videoCapacity = videoCapacity;
        this.monitorSize = monitorSize;
        this.id = ID++;
    }

    @Override
    public String toString() {
        return String.format("Id:%d | Manufacturer:%s | Processor frequency:%dMHz | Ram capacity:%dGb | Memory capacity:%dGb | Video capacity:%dGb | Monitor size:%d\"",
                id, manufacturer,processorFrequency,ramCapacity,memoryCapacity, videoCapacity, monitorSize);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook note = (Notebook) o;

        return  this.id == note.id &&
                this.manufacturer.equals(note.manufacturer) &&
                this.processorFrequency == note.processorFrequency &&
                this.ramCapacity == note.ramCapacity &&
                this.memoryCapacity == note.memoryCapacity &&
                this.videoCapacity == note.videoCapacity &&
                this.monitorSize == note.monitorSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                manufacturer,
                processorFrequency,
                ramCapacity,
                memoryCapacity,
                videoCapacity,
                monitorSize);
    }

    public long getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public int getVideoCapacity() {
        return videoCapacity;
    }

    public int getMonitorSize() {
        return monitorSize;
    }
}
