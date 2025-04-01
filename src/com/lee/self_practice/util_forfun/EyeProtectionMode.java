package com.lee.self_practice.util_forfun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EyeProtectionMode {
    private static JFrame frame;
    private static boolean isActive = false;
    private static Color overlayColor = new Color(255, 200, 100, 100); // 預設護眼顏色
    private static JWindow overlay;
    private static Robot robot;

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

        toggleButton.addActionListener(e -> {
            if (isActive) {
                closeOverlay();
                toggleButton.setText("開啟護眼模式");
            } else {
                openOverlay();
                toggleButton.setText("關閉護眼模式");
            }
            isActive = !isActive;
        });

        colorButton.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(frame, "選擇護眼模式顏色", overlayColor);
            if (selectedColor != null) {
                overlayColor = new Color(selectedColor.getRed(), selectedColor.getGreen(), selectedColor.getBlue(), 100); // 保持透明度
                if (isActive) {
                    closeOverlay();
                    openOverlay();
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(toggleButton);
        panel.add(colorButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void openOverlay() {
        if (overlay != null) {
            overlay.dispose();
        }

        overlay = new JWindow();
        overlay.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        overlay.setBackground(new Color(overlayColor.getRed(), overlayColor.getGreen(), overlayColor.getBlue(), 100));
        overlay.setAlwaysOnTop(true);
        overlay.setFocusableWindowState(false);

        // 讓滑鼠點擊可以穿透
        overlay.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                passClickThrough(e);
            }
        });

        overlay.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                overlay.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        });

        overlay.setVisible(true);
    }

    private static void closeOverlay() {
        if (overlay != null) {
            overlay.dispose();
            overlay = null;
        }
    }

    private static void passClickThrough(MouseEvent e) {
        try {
            if (robot == null) {
                robot = new Robot();
            }

            Point location = e.getLocationOnScreen();
            overlay.setVisible(false); // 隱藏遮罩以避免干擾點擊
            robot.mouseMove(location.x, location.y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            overlay.setVisible(true); // 點擊後再顯示回來

        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
}
