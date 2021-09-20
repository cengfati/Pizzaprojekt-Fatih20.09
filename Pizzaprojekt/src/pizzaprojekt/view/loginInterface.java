package pizzaprojekt.view;

import pizzaprojekt.control.Doepi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class loginInterface {
    private JPanel loginPanel;
    private JLabel loginText;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel passwordWrong;
    private Doepi myDoepi;

    public loginInterface(Doepi myDoepi){
        this.myDoepi = myDoepi;
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                char [] input = passwordField1.getPassword();
                if(checkIfCorrect(input)){
                    myDoepi.switchFrame("order");
                }else{
                    passwordWrong.setText("Falsches Passwort. Versuch es erneut!");
                }
            }
        });
    }

    public JPanel getPanel(){
        return loginPanel;
    }

    private boolean checkIfCorrect(char [] input){
        boolean isCorrect = false;
        char [] correctPass = {'1','2','3'};

        if(input.length != correctPass.length){
            isCorrect = false;
        }else{
            isCorrect = Arrays.equals(input, correctPass);
        }
        Arrays.fill(correctPass, '0');
        return isCorrect;
    }
}
