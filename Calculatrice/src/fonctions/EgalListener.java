package fonctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thomas on 15/12/17.
 * //Listener affecté au bouton =
 */
public class EgalListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
        calcul();
        update = true;
        clicOperateur = false;
    }
}
