import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

   private JTextField IDtext;
   private JPasswordField PWtext;
   private ArrayList<Member> memberList;
   private ArrayList<Member> manegerList;
   

   /**
    * Launch the application.
    */

   public Login() {
      setResizable(false);
   //   System.out.println(WinnerCreate.getInstance().toString());
      
      memberList= DataCenter.getInstance().getMemberList();
      manegerList= DataCenter.getInstance().getManegerList();
      
      
      for (int i = 0; i < memberList.size(); i++) {
         System.out.println("Member List ======== >"+memberList.get(i).getID());
         
         
      }

      setTitle("그린 로또");
      getContentPane().setBackground(new Color(44,195,248));
      setBounds(100, 100, 452, 531);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setLayout(null);

      JPanel panel = new JPanel();
      panel.setBackground(new Color(44,195,248));
      panel.setBounds(0, 0, 436, 72);
      getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("Green Lotto");
      lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
      lblNewLabel.setBounds(49, 0, 358, 72);
      panel.add(lblNewLabel);
      lblNewLabel.setFont(new Font("휴먼엑스포", Font.BOLD, 47));
      lblNewLabel.setForeground(new Color(255, 255, 255));

      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(44,195,248));
      panel_1.setBounds(10, 82, 414, 211);
      getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblNewLabel_3 = new JLabel("");
      lblNewLabel_3.setIcon(new ImageIcon("resource/Image/로또이미지.png"));
      lblNewLabel_3.setBounds(99, 12, 220, 205);
      panel_1.add(lblNewLabel_3);

      JLabel lblNewLabel_1 = new JLabel("");
      lblNewLabel_1.setBounds(238, 12, 0, 0);
      lblNewLabel_1.setIcon(new ImageIcon("resource/Image/부자이미지.png"));
      panel_1.add(lblNewLabel_1);

      JPanel panel_2 = new JPanel();
      panel_2.setBackground(new Color(44,195,248));
      panel_2.setBounds(10, 325, 414, 63);
      getContentPane().add(panel_2);
      panel_2.setLayout(null);

      JLabel lblNewLabel_2 = new JLabel("ID");
      lblNewLabel_2.setForeground(new Color(255, 255, 255));
      lblNewLabel_2.setBounds(58, 8, 28, 18);
      lblNewLabel_2.setFont(new Font("휴먼엑스포", Font.BOLD, 15));
      lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
      panel_2.add(lblNewLabel_2);

      IDtext = new JTextField();
      IDtext.setBounds(113, 7, 226, 21);
      panel_2.add(IDtext);
      IDtext.setColumns(20);

      JLabel lblNewLabel_2_1 = new JLabel("Password");
      lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
      lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
      lblNewLabel_2_1.setFont(new Font("휴먼엑스포", Font.BOLD, 15));
      lblNewLabel_2_1.setBounds(12, 37, 89, 18);
      panel_2.add(lblNewLabel_2_1);

      PWtext = new JPasswordField();
      PWtext.setBounds(113, 36, 226, 21);
      panel_2.add(PWtext);

      JPanel panel_3 = new JPanel();
      panel_3.setBackground(new Color(44,195,248));
      panel_3.setBounds(10, 431, 414, 40);
      getContentPane().add(panel_3);
      panel_3.setLayout(null);

      JButton LoginBtn = new JButton("로그인");
      LoginBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      LoginBtn.setBackground(Color.WHITE);
      LoginBtn.setBounds(87, 5, 81, 23);
      panel_3.add(LoginBtn);
      
      //로그인 버튼 이벤트
      LoginBtn.addActionListener(new ActionListener() {
         boolean logCheck = false;
         boolean manegeCheck = false;
         @Override
         public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < memberList.size(); i++) {
               if (memberList.get(i).getID().equals(IDtext.getText())
                     && memberList.get(i).getPw().equals(PWtext.getText())) {
                  logCheck = true;
                  // 아이디와 비밀번호가 동일하면, DataCenter의 MyInfo등록 
                  DataCenter.getInstance().setMyInfo(memberList.get(i));
               }
            }
            for (int i = 0; i < manegerList.size(); i++) {
               if(manegerList.get(i).getID().equals(IDtext.getText())
                     && manegerList.get(i).getPw().equals(PWtext.getText())) {
                     manegeCheck = true;
               }
            }
            
            if (logCheck == true && manegeCheck == false) {
               System.out.println("로그인성공");
               new Main();
               dispose();
            } 
            
            else if(manegeCheck == true) {
               System.out.println("관리자로그인");
               new ManageUI().setVisible(true);
               dispose();
               
            }
            else {
                JOptionPane.showMessageDialog(Login.this, "아이디나 비밀번호가 틀렸습니다");
            }
         }

      });

      JButton SUBtn = new JButton("회원가입");
      SUBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      SUBtn.setBackground(Color.WHITE);
      SUBtn.setBounds(252, 5, 92, 23);
      panel_3.add(SUBtn);

      //회원가입 버튼이벤트
      SUBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println(memberList.size());
            
            if (memberList.size() >= 10 ) {
               JOptionPane.showMessageDialog(Login.this, "더이상 회원가입을 할수없습니다. (최대 10명)");
            } 
            else {
               new SignUp().setVisible(true);
            }

           
         }
      });

      System.out.println(IDtext.getText());
   }

   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Login window = new Login();
               window.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

}