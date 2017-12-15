package fonctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thomas on 15/12/17.
 */
public class ResetListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        ecran.setText("");
    }
}
