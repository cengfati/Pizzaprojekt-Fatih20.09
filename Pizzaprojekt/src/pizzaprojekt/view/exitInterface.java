package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exitInterface {
    private JPanel exitPanel;
    private JLabel exitLabel;
    private JButton closeAppButton;
    private Doepi myDoepi;

    public exitInterface(Doepi myDoepi){
        closeAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDoepi.closeFrame();
            }
        });
    }

    public JPanel getPanel(){
        return exitPanel;
    }
}
