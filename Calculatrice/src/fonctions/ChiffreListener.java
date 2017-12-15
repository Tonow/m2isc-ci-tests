package fonctions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by thomas on 15/12/17.
 * Listener utilisé pour les chiffres
 * Permet de stocker les chiffres et de les afficher
 */
public class ChiffreListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //On affiche le chiffre additionnel dans le label
        String str = ((JButton)e.getSource()).getText();
        if(update){
            update = false;
        }
        else{
            if(!ecran.getText().equals("0"))
                str = ecran.getText() + str;
        }
        ecran.setText(str);
    }
}
