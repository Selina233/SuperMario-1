package src.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameEnterPanel extends JPanel {
    private JLabel background;
    private JButton button_start;
    private JButton button_end;
    GameEnterPanel() {
        this.setBounds(0,0,800,640);
        this.setLayout(null);

        ImageIcon icon_bg = new ImageIcon("src/image/UIsuperMario.png");
        icon_bg.setImage(icon_bg.getImage().getScaledInstance(800, 640, ABORT));//调整大小
        background = new JLabel(icon_bg);
        background.setBounds(0, 0, 800, 640);
        this.add(background);

        button_start = new JButton("开始游戏");
        button_start.setBounds(200,320,90,30);

        button_end = new JButton("退出游戏");
        button_end.setBounds(200,360,90,30);
        button_end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);//退出程序
            }
        });

        background.add(button_start);
        background.add(button_end);
    }
    public void addAction(ActionListener action){
        button_start.addActionListener(action);
    }
}
