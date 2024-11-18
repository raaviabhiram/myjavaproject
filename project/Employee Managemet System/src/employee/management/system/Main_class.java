package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,800,500);
        add(img) ;

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(230 , 125 , 400 , 40);
        heading.setFont(new Font("Raleway" ,Font.BOLD ,  20));
        img.add(heading);

        JButton add = new JButton("ADD EMPLOYEE");
        add.setBounds(179 , 230 , 150 , 40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new AddEmployee();
                    setVisible(false);
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        img.add(add);

        JButton add1 = new JButton("VIEW EMPLOYEE ");
        add1.setBounds(400 , 230 , 150 , 40);
        add1.setForeground(Color.WHITE);
        add1.setBackground(Color.BLACK);
        add1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new ViewEmployee();
                    setVisible(false);
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        img.add(add1);

        JButton add2 = new JButton("REMOVE EMPLOYEE");
        add2.setBounds(300 , 300 , 190 ,40);
        add2.setForeground(Color.WHITE);
        add2.setBackground(Color.BLACK);
        add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new RemoveEmployee();
                    setVisible(false);
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        img.add(add2);


        setSize(800,500);
        setLocation(250, 100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
