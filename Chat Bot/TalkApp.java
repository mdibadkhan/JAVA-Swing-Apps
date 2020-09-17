import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class TalkApp implements ActionListener {

    static JFrame frame;
    static JLabel label1;
    static JLabel label2;
    static JLabel label3;
    static JPanel panel;
    static JButton btn1, send;
    static JProgressBar loading;
    static Timer t;
    static JTextField mssg;
    static JTextArea showchat;


    public static void main(final String[] args) {

        frame = new JFrame("Chat Bot");
        frame.setMinimumSize(new Dimension(500, 650));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        // Welcome text in Bold fonts
        label1 = new JLabel("Welcome to");
        label1.setBounds(80, -30, 500, 500);
        label1.setFont(label1.getFont().deriveFont(50f));
        panel.add(label1);
        label2 = new JLabel("JAVA Chat Bot");
        label2.setBounds(50, 20, 500, 500);
        label2.setFont(label2.getFont().deriveFont(50f));
        panel.add(label2);

        // Displays loading in percentage
        label3 = new JLabel("");
        label3.setBounds(200, 400, 150, 100);
        label3.setFont(label3.getFont().deriveFont(15f));
        panel.add(label3);

        // Start button
        btn1 = new JButton("Start chatting...");
        btn1.setBounds(175, 350, 150, 50);
        btn1.addActionListener(new TalkApp());
        panel.add(btn1);

        // Progress bar
        loading = new JProgressBar(0, 100);
        loading.setBounds(0, 0, 0, 0);
        panel.add(loading);

        // Timer to make the progress bar work
        t = new Timer(15, new TalkApp());

        /* -------------------------------------------------------------------------------- */

        // Chat menu :-

        // Typing area
        mssg = new JTextField();
        mssg.setBounds(15, 550, 350, 50);
        mssg.setFont(mssg.getFont().deriveFont(20f));
        mssg.setVisible(false);
        panel.add(mssg);


        // Send Button
        send = new JButton("Send");
        send.setBounds(375, 550, 100, 50);
        send.setFont(send.getFont().deriveFont(20f));
        send.setVisible(false);
        send.addActionListener(new TalkApp());
        panel.add(send);



        // Displaying chat
        showchat = new JTextArea("");
        showchat.setFocusable(false);
        showchat.setEditable(false);
        showchat.setWrapStyleWord(true);
        showchat.setLineWrap(true);
        showchat.setBounds(15, 20, 470, 25);
        showchat.setFont(showchat.getFont().deriveFont(20f));
        showchat.setVisible(false);
        panel.add(showchat);



        // making everything visible
        frame.setVisible(true);
    }


    // An integer to increement the value of progress bar
    int i=0;

    // Action listener function
    @Override
    public void actionPerformed(final ActionEvent e) {
        
        // Statements for start button
        if(e.getSource()==btn1){

            loading.setBounds(155, 480, 200, 10);
            t.start();
            
        }

                // Statements for progress bar
        if(e.getSource()==t){

            if(i==100){

                label3.setBounds(180, 400, 150, 100);
                label3.setText("Loading Complete");
                t.stop();

                // Performing next function
                showMenu();
                
            }
            else {
            i++;
            loading.setValue(i);
            label3.setText("Loading "+i+" %");
            }
        }

        // Statements for nessage send button
        if(e.getSource()==send){

            chat();

        }

    }

    // Function to make items visible/hidden
    public void showMenu(){

        
        label1.setVisible(false);
        label2.setVisible(false);
        btn1.setVisible(false);
        label3.setVisible(false);
        loading.setVisible(false);
        mssg.setVisible(true);
        send.setVisible(true);
        showchat.setVisible(true);

    }

    // Function to display chats
    public void chat(){

            String[] chathelp = {"Hello", "what can you do", "about you", "who made you"};

            String chat = mssg.getText();
            int i=25;

            if(chat.equalsIgnoreCase("hello") || chat.equalsIgnoreCase("hi") || chat.equalsIgnoreCase("hey") || chat.equalsIgnoreCase("hii") || chat.equalsIgnoreCase("h")){
                showchat.setText("You : "+mssg.getText()+"\nBot : Hello! This is a bot to chat with you..");
                i+=25;
                showchat.setBounds(15, 20, 470, i);
            }

            else if(chat.equalsIgnoreCase("chat --help")){

                showchat.setText("You : "+chat+"\nBot : List of the things you can try");
                i+=25;
                showchat.setBounds(15, 20, 470, i);

                for(int j=0; j<chathelp.length; j++){

                    showchat.setText(showchat.getText()+"\n"+(j+1)+") "+chathelp[j]);
                    i+=25;
                    showchat.setBounds(15, 20, 470, i);
                    
                }
                showchat.setText(showchat.getText()+"\nBot : I am still under development so the list is quite short for now...");
                i+=25;
                showchat.setBounds(15, 20, 470, i);
            }

            else if(chat.equalsIgnoreCase("what can you do")){
                showchat.setText("You : "+chat+"\nBot : For now I can only chat with you.. :)");
                i+=25;
                showchat.setBounds(15, 20, 470, i);
            }

            else if(chat.equalsIgnoreCase("about you")){
                showchat.setText("You : "+chat+"\nBot : I am bot made in JAVA Swing and I can chat with you");
                i+=25;
                showchat.setBounds(15, 20, 470, i);
            }

            else if(chat.equalsIgnoreCase("who made you")){
                showchat.setText("You : "+chat+"\nBot : I am made by Ibad who is learning JAVA.");
                i+=25;
                showchat.setBounds(15, 20, 470, i);
            }


            else{
                showchat.setText("You : "+mssg.getText()+"\nBot : Sorry! I didn't recognize that. Try writing \"chat --help\" to see the list of things you can ask.");
                i+=25;
                showchat.setBounds(15, 20, 470, i);
                i+=25;
            }
            i+=25;
            showchat.setBounds(15, 20, 470, i);
            i+=25;
    }
}
