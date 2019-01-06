package ie.gmit.sw.listener;

import ie.gmit.sw.models.GameAttr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSpriteListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent arg0) {
        JRadioButton temp = (JRadioButton) arg0.getSource();
        if (temp.isSelected()) {
            GameAttr.gameSprite = temp.getText().toLowerCase();
        }
    }
}
