import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleChatClientA {
    
    JTextField outgoing;   
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
       SimpleChatClientA client = new SimpleChatClientA();
       client.go();
    }

   public void go() {
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();

        outgoing = new JTextField(20);
 
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
       
        
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        
        setUpNetworking();
     ;
          
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400,500);
        frame.setVisible(true);                
   
     } // close go

   private void setUpNetworking() {  
        try {
           sock = new Socket("127.0.0.1", 5000);
          
           writer = new PrintWriter(sock.getOutputStream());
          
           System.out.println("networking established");
        } catch(IOException ex) {
           ex.printStackTrace();
        }
     } // close setUpNetworking   

   public class SendButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent ev) {
          try {
             writer.println(outgoing.getText());
             writer.flush();
             
          } catch(Exception ex) {
             ex.printStackTrace();
          }
          outgoing.setText("");
          outgoing.requestFocus();
      }
    }  // close SendButtonListener inner class


 }