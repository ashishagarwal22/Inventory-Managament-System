import javax.swing.*;
import java.awt.*;
public class login extends javax.swing.JFrame {
    login(){
        JPanel btnPanel = new JPanel(new GridLayout(2, 3, 0, 75));
        JButton admin_button = new javax.swing.JButton();
        admin_button.setBackground(new java.awt.Color(255, 255, 255));
        admin_button.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        admin_button.setText("Admin");
        admin_button.setBorder(null);
        admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_user(evt);
            }
        });
        JButton cust_button = new javax.swing.JButton();
        cust_button.setBackground(new java.awt.Color(255, 255, 255));
        cust_button.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        cust_button.setText("Customer");
        cust_button.setBorder(null);
        cust_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_user(evt);
            }
        });
        JLabel head = new JLabel("Login",SwingConstants.CENTER);
        JLabel blank1 = new JLabel("");
        JLabel blank2 = new JLabel("");
        JLabel blank3 = new JLabel("");
        head.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        btnPanel.add(blank1);
        btnPanel.add(admin_button);
        btnPanel.add(blank2);
        btnPanel.add(blank3);
        btnPanel.add(cust_button);
        setLayout(new GridLayout(3,1));
        add(head);
        add(btnPanel);     
        setSize(400,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void admin_user(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_display_page
        User a= new Admin(); 
    }

    private void cust_user(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_display_page
        User a= new Cust(); 
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        login a = new login();
        a.setVisible(true);
    }
}
class User{
    User(){
        render();
    }
    private void render(){
        Inventory a = new Inventory();
        a.setVisible(true);
    }
}
class Admin extends User{
    Admin(){
        render();
    }
    private void render(){
        Inventory a = new Inventory(1);
        a.setVisible(true);
    }
}
class Cust extends User{
    Cust(){
        render();
    }
    private void render(){
        Inventory a = new Inventory(0);
        a.setVisible(true);
    }
}
