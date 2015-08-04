package de.scriptim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * on return
 *
 * @author Scriptim
 */
public class ReturnListener implements ActionListener{
   
   @Override
   public void actionPerformed(ActionEvent e){
      NumberConverter.log("EnterListener was triggered...");
      if(e.getSource() == NumberConverter.ui.binaryText){
         String s = NumberConverter.ui.binaryText.getText().replaceAll("[^01]", "");

         NumberConverter.log("binary: " + ((JTextField)e.getSource()).getText() + " -> " + s);
         NumberConverter.log(s.length() > 21 ? "binary was shorten" : "binary was not shorten");

         s = s.length() > 50 ? s.substring(0, 50) : s;

         NumberConverter.ui.binaryText.setText(s.isEmpty() ? "" : Long.toBinaryString(Long.parseLong(s, 2)));
         NumberConverter.ui.octalText.setText(s.isEmpty() ? "" : Long.toOctalString(Long.parseLong(s, 2)));
         NumberConverter.ui.decimalText.setText(s.isEmpty() ? "" : Long.toString(Long.parseLong(s, 2)));
         NumberConverter.ui.hexadecimalText.setText(s.isEmpty() ? "" : Long.toHexString(Long.parseLong(s, 2)).toUpperCase());

         NumberConverter.log("changed content: [" + NumberConverter.ui.binaryText.getText() + "]-[" + NumberConverter.ui.octalText.getText() +
                 "]-[" + NumberConverter.ui.decimalText.getText() + "]-[" + NumberConverter.ui.hexadecimalText.getText() + "]");
      }else if(e.getSource() == NumberConverter.ui.octalText){
         String s = NumberConverter.ui.octalText.getText().replaceAll("[^01234567]", "");

         NumberConverter.log("octal: " + ((JTextField)e.getSource()).getText() + " -> " + s);
         NumberConverter.log(s.length() > 21 ? "octal was shorten" : "octal was not shorten");

         s = s.length() > 21 ? s.substring(0, 21) : s;

         NumberConverter.ui.binaryText.setText(s.isEmpty() ? "" : Long.toBinaryString(Long.parseLong(s, 8)));
         NumberConverter.ui.octalText.setText(s.isEmpty() ? "" : Long.toOctalString(Long.parseLong(s, 8)));
         NumberConverter.ui.decimalText.setText(s.isEmpty() ? "" : Long.toString(Long.parseLong(s, 8)));

         NumberConverter.ui.hexadecimalText.setText(s.isEmpty() ? "" : Long.toHexString(Long.parseLong(s, 8)).toUpperCase());
         NumberConverter.log("changed content: [" + NumberConverter.ui.binaryText.getText() + "]-[" + NumberConverter.ui.octalText.getText() +
                 "]-[" + NumberConverter.ui.decimalText.getText() + "]-[" + NumberConverter.ui.hexadecimalText.getText() + "]");
      }else if(e.getSource() == NumberConverter.ui.decimalText){
         String s = NumberConverter.ui.decimalText.getText().replaceAll("[^0123456789]", "");

         NumberConverter.log("decimal: " + ((JTextField)e.getSource()).getText() + " -> " + s);
         NumberConverter.log(s.length() > 21 ? "decimal was shorten" : "decimal was not shorten");

         s = s.length() > 19 ? s.substring(0, 19) : s;

         NumberConverter.ui.binaryText.setText(s.isEmpty() ? "" : Long.toBinaryString(Long.parseLong(s, 10)));
         NumberConverter.ui.octalText.setText(s.isEmpty() ? "" : Long.toOctalString(Long.parseLong(s, 10)));
         NumberConverter.ui.decimalText.setText(s.isEmpty() ? "" : Long.toString(Long.parseLong(s, 10)));
         NumberConverter.ui.hexadecimalText.setText(s.isEmpty() ? "" : Long.toHexString(Long.parseLong(s, 10)).toUpperCase());

         NumberConverter.log("changed content: [" + NumberConverter.ui.binaryText.getText() + "]-[" + NumberConverter.ui.octalText.getText() +
                 "]-[" + NumberConverter.ui.decimalText.getText() + "]-[" + NumberConverter.ui.hexadecimalText.getText() + "]");
      }else if(e.getSource() == NumberConverter.ui.hexadecimalText){
         String s = NumberConverter.ui.hexadecimalText.getText().toUpperCase().replaceAll("[^0123456789ABCDEF]", "");

         NumberConverter.log("hex: " + ((JTextField)e.getSource()).getText() + " -> " + s);
         NumberConverter.log(s.length() > 21 ? "hex was shorten" : "hex was not shorten");

         s = s.length() > 15 ? s.substring(0, 15) : s;

         NumberConverter.ui.binaryText.setText(s.isEmpty() ? "" : Long.toBinaryString(Long.parseLong(s, 16)));
         NumberConverter.ui.octalText.setText(s.isEmpty() ? "" : Long.toOctalString(Long.parseLong(s, 16)));
         NumberConverter.ui.decimalText.setText(s.isEmpty() ? "" : Long.toString(Long.parseLong(s, 16)));
         NumberConverter.ui.hexadecimalText.setText(s.isEmpty() ? "" : Long.toHexString(Long.parseLong(s, 16)).toUpperCase());

         NumberConverter.log("changed content: [" + NumberConverter.ui.binaryText.getText() + "]-[" + NumberConverter.ui.octalText.getText() +
                 "]-[" + NumberConverter.ui.decimalText.getText() + "]-[" + NumberConverter.ui.hexadecimalText.getText() + "]");
      }
   }
}