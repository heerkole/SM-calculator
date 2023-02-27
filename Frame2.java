import javax.swing.*;

public class Frame2 extends JFrame
{
    public Frame2()
    {
        //Settaggio parametri finestra
        super("Calcolatrice di Subnet Mask");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        /*
            In base al numero di subnet da creare fare un ciclo for che crea n label 
            e n spazi di testo dove n è il numero di subnet inserite dall'utente
        */

        // Visualizzazione del frame
        setVisible(true);
    }
}
