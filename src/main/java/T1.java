import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T1 extends JFrame{
        private JTextArea Chatarea = new JTextArea();
        private JTextField chatbox = new JTextField();
        public T1(){
            JFrame frame =new JFrame();
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setLayout(null);
            frame.setSize(500, 500);
            frame.setTitle("ChatBot");
            frame.add(Chatarea);
            frame.add(chatbox);
            //For TextArea
            Chatarea.setSize(400, 300);
            Chatarea.setLocation(2,2);
            //For TextField
            chatbox.setSize(440 , 30);
            chatbox.setLocation(2,400);

            chatbox.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    String gtext = chatbox.getText();
                    Chatarea.append("You ->" + gtext + "\n");
                    chatbox.setText("");

                    if (gtext.equalsIgnoreCase("Hi")) {
                        T1("Hey, Good Day");
                    } else {
                        int rand = (int) (Math.random() * 3 + 1);
                        if (rand == 1) {
                            T1("Sorry, I don't understand you!");
                        }else if(rand == 2){
                            T1("Sorry, Could you please repeat that?!");
                        }else if(rand == 3){
                            T1("Excuse me!");
                        }
                    }
                }
            });



        }
    private void T1(String string){
        Chatarea.append("Bot--> " +string+ "\n");
    }

        public static void main(String[] args) {
            new T1();




        }
    }