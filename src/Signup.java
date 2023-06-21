import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Signup extends JFrame {
    Signup(){
        super("Sign Up Page");
        setBounds(450,150,700,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(30,30,650,300);
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173,216,230), 2), "Create Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(172,216,230)));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(new Color(34,139,34));
        add(panel);

        //adding labels
        //Create Account
        JLabel heading = new JLabel("Create Account As");
        heading.setBounds(100,50,140,20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(heading);

        //Create account input
        Choice accountType = new Choice();
        accountType.add("Admin");
        accountType.add("Customer");
        accountType.setBounds(260,50,150,20);
        panel.add(accountType);

        //Meter Number
        JLabel lblmeter = new JLabel("Meter Number");
        lblmeter.setBounds(100,90,140,20);
        lblmeter.setForeground(Color.GRAY);
        lblmeter.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblmeter);

        //Meter Number input
        JTextField meter = new JTextField();
        meter.setBounds(260,90,150,20);
        panel.add(meter);

        //User Name
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100,130,140,20);
        lblusername.setForeground(Color.GRAY);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblusername);

        //User Name input
        JTextField username = new JTextField();
        username.setBounds(260,130,150,20);
        panel.add(username);

        //Number
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(100,170,140,20);
        lblnumber.setForeground(Color.GRAY);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblnumber);

        //Number input
        JTextField number = new JTextField();
        number.setBounds(260,170,150,20);
        panel.add(number);

        //Password
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(100,210,140,20);
        lblpassword.setForeground(Color.GRAY);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblpassword);

        //Password input
        JTextField password = new JTextField();
        password.setBounds(260,210,150,20);
        panel.add(password);

        //Buttons
        JButton create = new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(140,260,120,25);
        panel.add(create);

        //Back Button
        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300,260,120,25);
        panel.add(back);

        //Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(415,30,250,250);
        panel.add(image);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
