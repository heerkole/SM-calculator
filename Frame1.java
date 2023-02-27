import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;


public class Frame1 extends JFrame implements AncestorListener
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
            
            
            //Dichiarazione JSpinner
            SpinnerModel value =  
                     new SpinnerNumberModel(5, //initial value  
                        0, //minimum value  
                        10, //maximum value  
                        1); //step  
            JSpinner spinner = new JSpinner(value); 
            

            // Dichiarazione aree di testo
            JTextArea ta_host = new JTextArea();


            // Dichiarazione bottone
            JButton continua = new JButton("Continua");

            // Dichiarazione posizione e dimensione dei componenti
            host.setBounds(50, 50, 150, 30);
            nSub.setBounds(50, 100, 200, 30);
            ta_host.setBounds(250, 50, 150, 30);
            spinner.setBounds(250, 100, 50, 30);
            continua.setBounds(150, 200, 150, 30);


            // Aggiunta dei componenti al frame
            add(host);     add(nSub);
            add(ta_host);  
            add(continua); add(spinner);

            continua.addActionListener(e -> new Frame2());

            // Visualizzazione del frame
            setVisible(true);
    }
    public static void main(String[] args) { new Frame1(); }
    
    
    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorAdded'");
    }
    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorRemoved'");
    }
    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorMoved'");
    }
}
