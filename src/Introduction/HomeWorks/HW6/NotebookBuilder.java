package Introduction.HomeWorks.HW6;

import java.util.HashSet;
import java.util.Random;

public class NotebookBuilder {
    Components components;

    /**
     * Init Components in this exemplar NotebookBuilder.
     */
    public void init() {
        this.components = new Components();
        this.components.init();
    }

    /**
     * Build new random notebook.
     * @return Notebook
     */
    public Notebook buildNotebook(){
        int lim = 4;
        Random rnd = new Random();
        String manufacturer = components.getManufacturer().get(rnd.nextInt(1, lim));
        int processorFrequency = components.getProcessorFrequency().get(rnd.nextInt(1, lim));
        int ramCapacity = components.getRamCapacity().get(rnd.nextInt(1, lim));
        int memoryCapacity = components.getMemoryCapacity().get(rnd.nextInt(1, lim));
        int videoCapacity = components.getVideoCapacity().get(rnd.nextInt(1, lim));
        int monitorSize = components.getMonitorSize().get(rnd.nextInt(1, lim));

        return new Notebook(manufacturer,
                processorFrequency,
                ramCapacity,
                memoryCapacity,
                videoCapacity,
                monitorSize);
    }

    /**
     * Build current quantity random notebooks and added them in to HashSet.
     * @param - int
     * @return HashSet<Notebook>
     */
    public HashSet<Notebook> buildNotebooks(int quantity) {
        int lim = 4;
        Random rnd = new Random();
        HashSet<Notebook> notebooks = new HashSet<>();
        String manufacturer;
        int processorFrequency;
        int ramCapacity;
        int memoryCapacity;
        int videoCapacity;
        int monitorSize;

        for (int i = 0; i < quantity; i++) {
            manufacturer = components.getManufacturer().get(rnd.nextInt(1, lim));
            processorFrequency = components.getProcessorFrequency().get(rnd.nextInt(1, lim));
            ramCapacity = components.getRamCapacity().get(rnd.nextInt(1, lim));
            memoryCapacity = components.getMemoryCapacity().get(rnd.nextInt(1, lim));
            videoCapacity = components.getVideoCapacity().get(rnd.nextInt(1, lim));
            monitorSize = components.getMonitorSize().get(rnd.nextInt(1, lim));

            notebooks.add(new Notebook(
                    manufacturer,
                    processorFrequency,
                    ramCapacity,
                    memoryCapacity,
                    videoCapacity,
                    monitorSize));
        }

        return notebooks;
    }

}
