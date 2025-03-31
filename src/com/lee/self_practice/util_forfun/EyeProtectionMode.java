package com.lee.self_practice.util_forfun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EyeProtectionMode {
    private static JFrame frame;
    private static boolean isActive = false;
    private static Color overlayColor = new Color(255, 200, 100, 100); // 預設顏色

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EyeProtectionMode::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        frame = new JFrame("護眼模式");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JButton toggleButton = new JButton("開啟護眼模式");
        JButton colorButton = new JButton("選擇顏色");

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isActive) {
                    closeOverlay();
                    toggleButton.setText("開啟護眼模式");
                } else {
                    openOverlay();
                    toggleButton.setText("關閉護眼模式");
                }
                isActive = !isActive;
            }
        });

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(frame, "選擇護眼模式顏色", overlayColor);
                if (selectedColor != null) {
                    overlayColor = new Color(selectedColor.getRed(), selectedColor.getGreen(), selectedColor.getBlue(), 100); // 保持透明度
                    if (isActive) {
                        closeOverlay();
                        openOverlay();
                    }
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(toggleButton);
        panel.add(colorButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static JWindow overlay;

    private static void openOverlay() {
        overlay = new JWindow();
        overlay.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        overlay.setBackground(overlayColor);
        overlay.setAlwaysOnTop(true);
        overlay.setVisible(true);
    }

    private static void closeOverlay() {
        if (overlay != null) {
            overlay.dispose();
        }
    }
}
