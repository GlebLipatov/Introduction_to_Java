package Introduction.HomeWorks.HW6;

import java.util.HashSet;
import java.util.Random;

public class NotebookBuilder {
    Components components;

    /**
     * Constructor and init Components in this exemplar NotebookBuilder.
     */
    public NotebookBuilder() {
        this.components = new Components();
    }

    /**
     * Build new random notebook.
     * @return new Notebook
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
     * @param quantity of new notebooks. (int)
     * @return Set of new Notebooks (HashSet< Notebook >)
     */
    public HashSet<Notebook> buildNotebooks(int quantity) {
        HashSet<Notebook> notebooks = new HashSet<>();

        for (int i = 0; i < quantity; i++)
            notebooks.add(buildNotebook());

        return notebooks;
    }

}
