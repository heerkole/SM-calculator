import javax.swing.*;

public class Frame1 extends JFrame 
{
    public Frame1() 
    {
        super("Calcolatrice di Subnet Mask");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

            // Dichiarazione etichette
            JLabel host = new JLabel("Host di partenza:");
            JLabel nSub = new JLabel("Numero di subnet da creare:");

            // Dichiarazione aree di testo
            JTextArea ta_host = new JTextArea();
            JTextArea ta_nSub = new JTextArea();

            // Dichiarazione bottone
            JButton continua = new JButton("Continua");

            // Dichiarazione posizione e dimensione dei componenti
            host.setBounds(50, 50, 150, 30);
            nSub.setBounds(50, 100, 200, 30);
            ta_host.setBounds(250, 50, 150, 30);
            ta_nSub.setBounds(250, 100, 150, 30);
            continua.setBounds(150, 200, 150, 30);

            // Aggiunta dei componenti al frame
            add(host);    add(nSub);
            add(ta_host); add(ta_nSub);
            add(continua);


            // Visualizzazione del frame
            setVisible(true);
    }

    public static void main(String[] args) { new Frame1(); }
}
