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
      NumberConverter.log("de.scriptim.CheckListener was triggered...");
      if(e.getStateChange() == ItemEvent.SELECTED){
         NumberConverter.doLog = true;
         NumberConverter.log("Logger enabled");
      }else{
         NumberConverter.log("Logger disabled");
         NumberConverter.doLog = false;
      }
   }
}