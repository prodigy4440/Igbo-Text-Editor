/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440;

import com.alee.laf.WebLookAndFeel;
import com.prodigy4440.controller.IgboKeyListener;
import com.prodigy4440.view.MainJFrame;
import java.awt.AWTEventMulticaster;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author prodigy4440
 */
public class IgboTextEditor {

    public static void main(String[] args) {
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);

        try {
            Thread.sleep(400);
        } catch (InterruptedException ex) {
            Logger.getLogger(IgboTextEditor.class.getName()).log(Level.SEVERE, null, ex);
        }

        splashScreen.updateStatusText("Checking activation status");

        WebLookAndFeel.install();

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(IgboTextEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
        splashScreen.setAlwaysOnTop(false);
        splashScreen.setVisible(false);
        splashScreen.dispose();

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

}
