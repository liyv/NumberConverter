package de.scriptim;

/* updates:
 *  v1: release
 *  v2: + TextField limits, ToolTipTexts
 *  v3: + Logger, version label
 *  v4: + log file location inside jar
 *    v4.1: + updated version label
 *  v5: + updated Logger
 *      + cleared up
 */

/**
 * https://www.github.com/Scriptim/NumberConverter.git
 *
 * @author Scriptim
 * @version 4.1
 */
public class NumberConverter{

  static Logger logger = new Logger();
  static boolean doLog = true;
  static UserInterface ui;

  public static void main(String[] args) {

    logger.log("created logger successfully");

    logger.log("starting GUI...");
    ui = new UserInterface();

    logger.log("main-thread ended");
  }

}
