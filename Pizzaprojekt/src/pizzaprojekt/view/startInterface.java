package pizzaprojekt.view;
import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startInterface {

    private JButton startAppButton;
    private JPanel startPanel;
    private Doepi myDoepi;

    public startInterface(Doepi myDoepi) {
        this.myDoepi = myDoepi;
        startAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.switchFrame("login");
            }
        });
    }

    public JPanel getPanel(){
        return startPanel;
    }
}
