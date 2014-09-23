/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.Normalizer;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 *
 * @author prodigy4440
 */
public class IgboKeyListener implements KeyListener {

    private final JTextArea textArea;
    private final Document document;

    public IgboKeyListener(JTextArea textArea) {
        this.textArea = textArea;
        this.document = textArea.getDocument();
    }

    @Override
    public void keyTyped(KeyEvent e) {

        if (e.isAltDown() & e.isShiftDown() & e.getKeyChar() == 'I') {
            String input = "\u1ECA";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        } else if (e.isAltDown() & e.getKeyChar() == 'i') {
            String input = "\u1ECB";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        } else if (e.isAltDown() & e.isShiftDown() & e.getKeyChar() == 'N') {
            String input = "\u1E46";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        } else if (e.isAltDown() & e.getKeyChar() == 'n') {
            String input = "\u1E45";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        }
        if (e.isAltDown() & e.isShiftDown() & e.getKeyChar() == 'O') {
            String input = "\u1ECC";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        } else if (e.isAltDown() & e.getKeyChar() == 'o') {
            String input = "\u1ECD";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        }
        if (e.isAltDown() & e.isShiftDown() & e.getKeyChar() == 'U') {
            String input = "\u1EE4";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        } else if (e.isAltDown() & e.getKeyChar() == 'u') {
            String input = "\u1EE5";
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            textArea.insert(normalize, textArea.getCaretPosition());
        } else if (e.isAltDown() & e.getKeyChar() == 'c') {
            e.consume();
            try {
                String text = textArea.getText(textArea.getCaretPosition() - 1, 1);
                String normalize = Normalizer.normalize(text + "\u0301", Normalizer.Form.NFC);
                textArea.insert(normalize, textArea.getCaretPosition() - 1);
                document.remove(textArea.getCaretPosition() - 1, 1);
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (e.isAltDown() & e.getKeyChar() == 'C') {
            e.consume();
            try {
                String text = textArea.getText(textArea.getCaretPosition() - 1, 1);
                String normalize = Normalizer.normalize(text + "\u0301", Normalizer.Form.NFC);
                textArea.insert(normalize, textArea.getCaretPosition() - 1);
                document.remove(textArea.getCaretPosition() - 1, 1);
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (e.isAltDown() & e.getKeyChar() == 'z') {
            e.consume();
            try {
                String text = textArea.getText(textArea.getCaretPosition() - 1, 1);
                String normalize = Normalizer.normalize(text + "\u0300", Normalizer.Form.NFC);
                textArea.insert(normalize, textArea.getCaretPosition() - 1);
                document.remove(textArea.getCaretPosition() - 1, 1);
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (e.isAltDown() & e.getKeyChar() == 'Z') {
            e.consume();
            try {
                String text = textArea.getText(textArea.getCaretPosition() - 1, 1);
                String normalize = Normalizer.normalize(text + "\u0300", Normalizer.Form.NFC);
                textArea.insert(normalize, textArea.getCaretPosition() - 1);
                document.remove(textArea.getCaretPosition() - 1, 1);
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (e.isAltDown() & e.getKeyChar() == 'x') {
            e.consume();
            try {
                String text = textArea.getText(textArea.getCaretPosition() - 1, 1);
                String normalize = Normalizer.normalize(text + "\u0304", Normalizer.Form.NFC);
                textArea.insert(normalize, textArea.getCaretPosition() - 1);
                document.remove(textArea.getCaretPosition() - 1, 1);
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (e.isAltDown() & e.getKeyChar() == 'X') {
            e.consume();
            try {
                String text = textArea.getText(textArea.getCaretPosition() - 1, 1);
                String normalize = Normalizer.normalize(text + "\u0304", Normalizer.Form.NFC);
                textArea.insert(normalize, textArea.getCaretPosition() - 1);
                document.remove(textArea.getCaretPosition() - 1, 1);
            } catch (BadLocationException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
