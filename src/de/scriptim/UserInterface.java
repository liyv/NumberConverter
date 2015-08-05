package de.scriptim;

import javax.swing.*;
import java.awt.*;

/**
 * GUI
 *
 * @author Scriptim
 */
public class UserInterface extends JFrame{
   
   JLabel binaryLabel = new JLabel();
   JLabel octalLabel = new JLabel();
   JLabel decimalLabel = new JLabel();
   JLabel hexadecimalLabel = new JLabel();
   
   JTextField binaryText = new JTextField();
   JTextField octalText = new JTextField();
   JTextField decimalText = new JTextField();
   JTextField hexadecimalText = new JTextField();
   
   JCheckBox checkLog = new JCheckBox("enable logger");
   JLabel version = new JLabel("v5");
   
   public UserInterface(){
      
      setTitle("Number Converter - Scriptim");
      setLocation(50, 50);
      setSize(360, 265);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(null);
      NumberConverter.logger.log("GUI frame modified");
      
      binaryLabel.setBounds(2, 8, 350, 15);
      binaryLabel.setText("Binary");
      binaryLabel.setToolTipText("Base: 2");
      add(binaryLabel);
      binaryText.setBounds(2, 25, 350, 25);
      binaryText.setToolTipText("Limit: 50");
      binaryText.addActionListener(new ReturnListener());
      add(binaryText);
      NumberConverter.logger.log("binary elements were created successfully");
      
      octalLabel.setBounds(2, 60, 350, 15);
      octalLabel.setText("Octal");
      octalLabel.setToolTipText("Base: 8");
      add(octalLabel);
      octalText.setBounds(2, 77, 350, 25);
      octalText.setToolTipText("Limit: 21");
      octalText.addActionListener(new ReturnListener());
      add(octalText);
      NumberConverter.logger.log("octal elements were created successfully");
      
      decimalLabel.setBounds(2, 112, 350, 15);
      decimalLabel.setText("Decimal");
      decimalLabel.setToolTipText("Base: 10");
      add(decimalLabel);
      decimalText.setBounds(2, 129, 350, 25);
      decimalText.setToolTipText("Limit: 19");
      decimalText.addActionListener(new ReturnListener());
      add(decimalText);
      NumberConverter.logger.log("decimal elements were created successfully");
      
      hexadecimalLabel.setBounds(2, 164, 350, 15);
      hexadecimalLabel.setText("Hexadecimal");
      hexadecimalLabel.setToolTipText("Base: 16");
      add(hexadecimalLabel);
      hexadecimalText.setBounds(2, 181, 350, 25);
      hexadecimalText.setToolTipText("Limit: 15");
      hexadecimalText.addActionListener(new ReturnListener());
      add(hexadecimalText);
      NumberConverter.logger.log("hexadecimal elements were created successfully");
      
      version.setBounds(335, 220, 10, 20);
      version.setFont(new Font("version", Font.PLAIN, 8));
      add(version);
      NumberConverter.logger.log("version label created");
      
      checkLog.setBounds(0, 210, 150, 20);
      checkLog.setSelected(true);
      checkLog.addItemListener(new CheckListener());
      add(checkLog);
      
      setVisible(true);
      NumberConverter.logger.log("GUI was painted succesfully");
      
   }

}