
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LifeGame extends JFrame
  implements ActionListener, Runnable{
 private JButton button1,button2;
 private LifePanel life1;
 private Thread t;
 private boolean nextGeneration,death;

 public static void main(String[] args) {
  new LifeGame().setVisible(true);
 }
 
 public LifeGame(){
  this.setSize(530, 500);
  setBackground(Color.black);
  nextGeneration = false;
  death = false;
  setLayout(null);
  button1 = new JButton();
  button1.setText("Strat");
  button1.setBounds(10, 420, 70, 20);
  getContentPane().add(button1);
  button2 = new JButton();
  button2.setText("Clear");
  button2.setBounds(440, 420, 70, 20);
  getContentPane().add(button2);
  life1 = new LifePanel(100, 80);
  life1.setBounds(10, 10, 500, 400);
  life1.setBackground(Color.black);
  getContentPane().add(life1);
  button1.addActionListener(this);
  button2.addActionListener(this);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public void actionPerformed(ActionEvent ev){
  if(ev.getSource() == button1){
   if(!nextGeneration){
    button1.setText("Stop");
    death = true;
    t = new Thread(this);
    t.start();
   } else {
    death = false;
    button1.setText("Start");
   }
   nextGeneration = !nextGeneration;
   return;
  } else {
   life1.initialData();
   life1.repaint();
   return;
  }
 }

 public void run(){
  do {
   life1.checkAllLife();
   life1.repaint();
   try {
    Thread.sleep(100L);
   }
   catch(Exception _ex){}
  } while(death);
 }
}
