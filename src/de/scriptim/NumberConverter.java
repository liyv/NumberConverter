package de.scriptim;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* updates:
 *  v1: release
 *  v2: + TextField limits, ToolTipTexts
 *  v3: + Logger, version label
 *  v4: + log file location inside jar
 *    v4.1: + updated version label
 */

/**
 * @author Scriptim
 * @version 4.1
 */
public class NumberConverter{

  private static final Logger logger = Logger.getLogger(NumberConverter.class.getName());
  private static Handler handler;
  static boolean doLog = true;
  static UserInterface ui;

  public static void main(String[] args) throws IOException{

    handler = new FileHandler("src//NumberConverterLog.txt");
    logger.addHandler(handler);
    log("created logger successfully");

    log("starting GUI...");
    ui = new UserInterface();

    log("main-thread ended");
  }

  static void log(String msg){
    if(doLog){
      logger.log(Level.INFO, msg);
    }
  }

}
