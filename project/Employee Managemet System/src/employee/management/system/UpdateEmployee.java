package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.* ;

public class UpdateEmployee extends JFrame implements ActionListener {
    JTextField tedu,tfname ,taddress , tphone, taadhar , temail ,tsalary , tdesignation ;
    JLabel tempid ;
    JButton add , back ;
    String number ;

    UpdateEmployee(String number){
        this.number = number ;
        getContentPane().setBackground(new Color(163 , 255 , 188));

        JLabel heading1 = new JLabel("Add Employee Details");
        heading1.setBounds(320 , 30 , 500 , 50);
        heading1.setFont(new Font("serif" , Font.BOLD , 25));
        add(heading1);

        JLabel name = new JLabel("Name");
        name.setBounds(50 ,150 ,150 ,30);
        name.setFont(new Font("SAN_SERIF" , Font.BOLD , 20));
        add(name);

        JLabel tname = new JLabel();
        tname.setBounds(200,150,150,30);
        tname.setBackground(new Color(177 , 252,197));
        add(tname);

        JLabel faname = new JLabel("Fathers Name");
        faname.setBounds(400,150,150,30);
        faname.setFont(new Font("SAN_SERIF" , Font.BOLD , 20));
        add(faname);

        tfname = new JTextField();
        tfname.setBounds(600,150,150,30);
        tfname.setBackground(new Color(177 , 252 , 197));
        add(tfname);

        JLabel dob = new JLabel("DOB");
        dob.setBounds(50 , 200 , 150 , 30);
        dob.setFont(new Font("SAN_SERIF" , Font.BOLD , 20));
        add(dob);

        JLabel tdob = new JLabel();
        tdob.setBounds(200 , 200 , 150 , 30);
        tdob.setBackground(new Color(177 , 252 , 197));
        add(tdob);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(400 , 200 , 150 , 30);
        salary.setFont(new Font("SAN_SERIF" , Font.BOLD , 20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600 , 200 , 150 , 30);
        tsalary.setBackground(new Color(177 , 252 , 197));
        add(tsalary);

        JLabel address = new JLabel("Address");
        address.setBounds(50 , 250 , 150 , 30);
        address.setFont(new Font("SAN_SERIF" , Font.BOLD , 20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200 , 250 , 150 , 30);
        taddress.setBackground(new Color(177 , 252 , 197));
        add(taddress);

        JLabel phone = new JLabel("Phone ");
        phone.setBounds( 400,250 , 150 , 30);
        phone.setFont(new Font("SEN_SERIF" , Font.BOLD , 20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(600 ,250 , 150 , 30);
        tphone.setBackground(new Color(177 , 252 , 197));
        add(tphone);

        JLabel email = new JLabel("Email ");
        email.setBounds( 50,300 , 150 , 30);
        email.setFont(new Font("SEN_SERIF" , Font.BOLD , 20));
        add(email);

        temail = new JTextField();
        temail.setBounds(200 ,300 , 150 , 30);
        temail.setBackground(new Color(177 , 252 , 197));
        add(temail);

        JLabel edu = new JLabel("Highest Education");
        edu.setBounds(400 , 300 , 150 , 30);
        edu.setFont(new Font("SAN_SERIF" , Font.BOLD , 20));
        add(edu);

        tedu = new JTextField();
        tedu.setBounds(600 ,300 , 150 , 30);
        tedu.setBackground(new Color(177 , 252 , 197));
        add(tedu);



        JLabel aadhar = new JLabel(" Aadhar");
        aadhar.setBounds( 400,350 , 150 , 30);
        aadhar.setFont(new Font("SEN_SERIF" , Font.BOLD , 20));
        add(aadhar);

        JLabel taadhar = new JLabel();
        taadhar.setBounds(600 ,350 , 150 , 30);
        taadhar.setBackground(new Color(177 , 252 , 197));
        add(taadhar);

        JLabel empid = new JLabel(" EmpId");
        empid.setBounds( 50,400 , 150 , 30);
        empid.setFont(new Font("SEN_SERIF" , Font.BOLD , 20));
        add(empid);

        tempid = new JLabel();
        tempid.setBounds(200 ,400 , 150 , 30);
        tempid.setFont(new Font("SAN_SARIF" , Font.BOLD , 20));
        tempid.setForeground(Color.RED);
        add(tempid);

        JLabel designation = new JLabel(" Designation");
        designation.setBounds( 50,350 , 150 , 30);
        designation.setFont(new Font("SEN_SERIF" , Font.BOLD , 20));
        add(designation);

        tdesignation = new JTextField();
        tdesignation.setBounds(200 ,350 , 150 , 30);
        tdesignation.setBackground(new Color(177 , 252 , 197));
        add(tdesignation);

        try{
            conn c = new conn();
            String query = "select * from employee where empId ='"+number+"'" ;
            ResultSet resultSet = c.statement.executeQuery(query);
            while(resultSet.next()){
                tname.setText(resultSet.getString("name"));
                tfname.setText(resultSet.getString("fname"));
                tdob.setText(resultSet.getString("dob"));
                taddress.setText(resultSet.getString("address"));
                tsalary.setText(resultSet.getString("salary"));
                tphone.setText(resultSet.getString("phone"));
                temail.setText(resultSet.getString("email"));
                tedu.setText(resultSet.getString("education"));
                taadhar.setText(resultSet.getString("aadhar"));
                tempid.setText(resultSet.getString("empid"));
                tdesignation.setText(resultSet.getString("designation"));
            }
        }catch(Exception E){
            E.printStackTrace();
        }

        add = new JButton("UPDATE");
        add.setBounds(450 , 550 , 150 , 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250 , 550 , 150 , 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);




        setSize(900,650);
        setLayout(null);
        setLocation(200,20);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String edu = tedu.getText();
            String designation = tdesignation.getText();


            try{
                conn c = new conn();
                String query = "update employee set fname = '"+fname+"' , salary = '"+salary+"' , address = '"+address+"' , phone = '"+phone+"' , email = '"+email+"' , education = '"+edu+"' , designation = '"+designation+"' where empId = '"+number+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null , "Details update successfully");
                setVisible(false);
                new Main_class();
            }catch(Exception E){
                E.printStackTrace();
            }
        }
        else{
            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }


}
