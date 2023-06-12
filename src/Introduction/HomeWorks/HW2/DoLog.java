package Introduction.HomeWorks.HW2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class DoLog {
    private String className;
    private String logTitle;
    private Logger logger;
    private Handler handler;
    private SimpleFormatter formatter;


    public DoLog(Class classToLog) {
        this.className = classToLog.getName();
        this.logTitle = classToLog.getSimpleName() + ".txt";
        this.logger = Logger.getLogger(className);
        this.formatter = new SimpleFormatter();
        init(logTitle, logger, handler, formatter);
    }

    private void init(String logTitle, Logger logger, Handler handler, SimpleFormatter formatter) {
        try {
            handler = new FileHandler(logTitle, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.logger.addHandler(handler);
        handler.setFormatter(formatter);
    }

    public void logging(String message) {
        this.logger.info(message);
    }
}
