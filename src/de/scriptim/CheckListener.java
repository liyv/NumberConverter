package de.scriptim;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * item listener for log checkbox
 *
 * @author Scriptim
 */
public class CheckListener implements ItemListener{
   
   @Override
   public void itemStateChanged(ItemEvent e){
      NumberConverter.logger.log("de.scriptim.CheckListener was triggered...");
      if(e.getStateChange() == ItemEvent.SELECTED){
         NumberConverter.doLog = true;
         NumberConverter.logger.log("Logger enabled");
      }else{
         NumberConverter.logger.log("Logger disabled");
         NumberConverter.doLog = false;
      }
   }
}