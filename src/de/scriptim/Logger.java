package de.scriptim;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger{

  protected PrintWriter logger;
  private String date;

  Logger(){
    try{
      File file = new File("NumberConverterLog.txt");
      if(! file.exists()){
        file.createNewFile();
      }
      logger = new PrintWriter(file);
    }catch(IOException e){
      System.exit(1);
    }
    date = new SimpleDateFormat("yy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
  }

  void log(String msg){
    if(NumberConverter.doLog){
      logger.println("[" + date + "] " + msg);
    }
  }

}
