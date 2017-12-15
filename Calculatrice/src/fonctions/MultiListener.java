package fonctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thomas on 15/12/17.
 * Listener affecté au bouton *
 */
public class MultiListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }
        else{
            chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }
}
