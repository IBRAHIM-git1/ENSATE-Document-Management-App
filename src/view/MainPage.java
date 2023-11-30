package view;

import view.TMPCompleteExample.TMPEspTrait;
import javax.swing.*;

public class MainPage extends JFrame {
    public MainPage(){
        TMPEspTrait newJPanel = new TMPEspTrait();
        javax.swing.JFrame MainPage = new javax.swing.JFrame();
//        MainPage.setResizable(false);
        MainPage.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        MainPage.getContentPane().add(newJPanel);
        MainPage.pack();
        MainPage.setVisible(true);
    }
public static void main(String[] args) throws Exception {
        MainPage myPage = new MainPage();   
    }
}