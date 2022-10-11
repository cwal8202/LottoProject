import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManegeMember {

   private JFrame frame;
   private ArrayList<Member> memberList;
   
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ManegeMember window = new ManegeMember();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public ManegeMember() {

      
      frame = new JFrame();
      frame.setBackground(new Color (44,195,248));
      frame.setBounds(100, 100, 468, 582);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      
       ArrayList<Member> memberList = DataCenter.getInstance().getMemberList();
      
       
      //Panel
      JPanel namepnl = new JPanel();
      namepnl.setBackground(new Color(44,195,248));
      namepnl.setBounds(12, 10, 428, 39);
      frame.getContentPane().add(namepnl);
      
      JPanel numpnl = new JPanel();
      numpnl.setBackground(new Color(44,195,248));
      numpnl.setBounds(12, 83, 50, 416);
      frame.getContentPane().add(numpnl);
      numpnl.setLayout(null);
      
      JPanel menupnl = new JPanel();
      menupnl.setBackground(new Color(44,195,248));
      menupnl.setBounds(12, 48, 428, 32);
      frame.getContentPane().add(menupnl);
      menupnl.setLayout(null);
      
      JPanel pnlm1 = new JPanel();
      pnlm1.setBackground(new Color(44,195,248));
      pnlm1.setBounds(68, 83, 372, 39);
      frame.getContentPane().add(pnlm1);
      pnlm1.setLayout(null);
      
      JPanel pnlm2 = new JPanel();
      pnlm2.setBackground(new Color(44,195,248));
      pnlm2.setLayout(null);
      pnlm2.setBounds(68, 126, 372, 39);
      frame.getContentPane().add(pnlm2);
      
      JPanel pnlm3 = new JPanel();
      pnlm3.setBackground(new Color(44,195,248));
      pnlm3.setLayout(null);
      pnlm3.setBounds(68, 167, 372, 39);
      frame.getContentPane().add(pnlm3);
      
      JPanel pnlm4 = new JPanel();
      pnlm4.setBackground(new Color(44,195,248));
      pnlm4.setLayout(null);
      pnlm4.setBounds(68, 206, 372, 39);
      frame.getContentPane().add(pnlm4);
      
      JPanel pnlm5 = new JPanel();
      pnlm5.setBackground(new Color(44,195,248));
      pnlm5.setLayout(null);
      pnlm5.setBounds(68, 248, 372, 39);
      frame.getContentPane().add(pnlm5);
      
      JPanel pnlm6 = new JPanel();
      pnlm6.setBackground(new Color(44,195,248));
      pnlm6.setLayout(null);
      pnlm6.setBounds(68, 288, 372, 39);
      frame.getContentPane().add(pnlm6);
      
      JPanel pnlm7 = new JPanel();
      pnlm7.setBackground(new Color(44,195,248));
      pnlm7.setLayout(null);
      pnlm7.setBounds(68, 330, 372, 39);
      frame.getContentPane().add(pnlm7);
      
      JPanel pnlm8 = new JPanel();
      pnlm8.setBackground(new Color(44,195,248));
      pnlm8.setLayout(null);
      pnlm8.setBounds(68, 371, 372, 39);
      frame.getContentPane().add(pnlm8);
      
      JPanel pnlm9 = new JPanel();
      pnlm9.setBackground(new Color(44,195,248));
      pnlm9.setLayout(null);
      pnlm9.setBounds(68, 411, 372, 39);
      frame.getContentPane().add(pnlm9);
      
      JPanel pnlm10 = new JPanel();
      pnlm10.setBackground(new Color(44,195,248));
      pnlm10.setLayout(null);
      pnlm10.setBounds(68, 449, 372, 39);
      frame.getContentPane().add(pnlm10);
      
      //제목 Label
      JLabel lblNewLabel = new JLabel("전체회원정보");
      lblNewLabel.setFont(new Font("휴먼엑스포", Font.BOLD, 16));
      namepnl.add(lblNewLabel);
      
      //메뉴 라벨
      JLabel lblNewLabel_2 = new JLabel("순번");
      lblNewLabel_2.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_2.setBounds(0, 10, 42, 15);
      menupnl.add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("이름");
      lblNewLabel_3.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_3.setBounds(80, 10, 57, 15);
      menupnl.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("아이디");
      lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 12));
      lblNewLabel_4.setBounds(191, 10, 57, 15);
      menupnl.add(lblNewLabel_4);
      
      JLabel lblNewLabel_5 = new JLabel("전화번호");
      lblNewLabel_5.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_5.setBounds(315, 10, 82, 15);
      menupnl.add(lblNewLabel_5);
      
      //숫자 라벨
      JLabel lblnum1 = new JLabel("1");
      lblnum1.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblnum1.setBounds(0, 10, 57, 20);
      numpnl.add(lblnum1);
      
      JLabel lblnum2 = new JLabel("2");
      lblnum2.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblnum2.setBounds(0, 50, 57, 20);
      numpnl.add(lblnum2);
      
      JLabel lblNewLabel_1_2 = new JLabel("3");
      lblNewLabel_1_2.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_2.setBounds(0, 91, 57, 20);
      numpnl.add(lblNewLabel_1_2);
      
      JLabel lblNewLabel_1_3 = new JLabel("4");
      lblNewLabel_1_3.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_3.setBounds(0, 130, 57, 20);
      numpnl.add(lblNewLabel_1_3);
      
      JLabel lblNewLabel_1_4 = new JLabel("5");
      lblNewLabel_1_4.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_4.setBounds(0, 168, 57, 20);
      numpnl.add(lblNewLabel_1_4);
      
      JLabel lblNewLabel_1_5 = new JLabel("6");
      lblNewLabel_1_5.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_5.setBounds(0, 208, 57, 20);
      numpnl.add(lblNewLabel_1_5);
      
      JLabel lblNewLabel_1_6 = new JLabel("7");
      lblNewLabel_1_6.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_6.setBounds(0, 250, 57, 20);
      numpnl.add(lblNewLabel_1_6);
      
      JLabel lblNewLabel_1_7 = new JLabel("8");
      lblNewLabel_1_7.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_7.setBounds(0, 291, 57, 20);
      numpnl.add(lblNewLabel_1_7);
      
      JLabel lblNewLabel_1_8 = new JLabel("9");
      lblNewLabel_1_8.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_8.setBounds(0, 332, 57, 20);
      numpnl.add(lblNewLabel_1_8);
      
      JLabel lblNewLabel_1_9 = new JLabel("10");
      lblNewLabel_1_9.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
      lblNewLabel_1_9.setBounds(0, 376, 57, 20);
      numpnl.add(lblNewLabel_1_9);
      
      //각 멤버 이름,ID리스트 생성 
      List<JLabel> namelist = new ArrayList<>();
      List<JLabel> idlist = new ArrayList<>();
      List<JLabel> ftellist = new ArrayList<>();
      List<JLabel> mtellist = new ArrayList<>();
      List<JLabel> ltellist = new ArrayList<>();
      
      
      //1번 멤버    
      JLabel name1 = new JLabel("name10의 이름");
      name1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name1.setBounds(0, 10, 82, 29);
      pnlm1.add(name1);
      namelist.add(name1);
      
      JLabel id1 = new JLabel("New label");
      id1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id1.setBounds(110, 10, 81, 29);
      pnlm1.add(id1);
      idlist.add(id1);
      
      JLabel ftel1 = new JLabel("New label");
      ftel1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel1.setBounds(203, 13, 34, 22);
      pnlm1.add(ftel1);
      ftellist.add(ftel1);
      
      JLabel mtel1 = new JLabel("New label");
      mtel1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel1.setBounds(251, 13, 34, 22);
      pnlm1.add(mtel1);
      mtellist.add(mtel1);
      
      JLabel ltel1 = new JLabel("New label");
      ltel1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel1.setBounds(315, 13, 45, 22);
      pnlm1.add(ltel1);
      ltellist.add(ltel1);
      
      
      JLabel lblNewLabel_6_1 = new JLabel("-");
      lblNewLabel_6_1.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1.setBounds(297, 17, 20, 22);
      pnlm1.add(lblNewLabel_6_1);
      
      JLabel lblNewLabel_6_1_1 = new JLabel("-");
      lblNewLabel_6_1_1.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1.setBounds(236, 17, 20, 22);
      pnlm1.add(lblNewLabel_6_1_1);
      
      //2번멤버
      JLabel name2 = new JLabel("New label");
      name2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name2.setBounds(0, 10, 82, 29);
      pnlm2.add(name2);
      namelist.add(name2);
      
      JLabel id2 = new JLabel("New label");
      id2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id2.setBounds(110, 10, 126, 29);
      pnlm2.add(id2);
      idlist.add(id2);
      
      JLabel ftel2 = new JLabel("New label");
      ftel2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel2.setBounds(203, 10, 34, 22);
      pnlm2.add(ftel2);
      ftellist.add(ftel2);
      
      
      JLabel lblNewLabel_6_2_1 = new JLabel("-");
      lblNewLabel_6_2_1.setFont(new Font("굴림", Font.BOLD, 14));
      lblNewLabel_6_2_1.setBounds(236, 14, 20, 22);
      pnlm2.add(lblNewLabel_6_2_1);
      
      
      JLabel mtel2 = new JLabel("New label");
      mtel2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel2.setBounds(251, 10, 34, 22);
      pnlm2.add(mtel2);
      mtellist.add(mtel2);
      
      
      JLabel lblNewLabel_6_1_2 = new JLabel("-");
      lblNewLabel_6_1_2.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_2.setBounds(297, 14, 20, 22);
      pnlm2.add(lblNewLabel_6_1_2);
      
      JLabel ltel2 = new JLabel("New label");
      ltel2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel2.setBounds(315, 10, 45, 22);
      pnlm2.add(ltel2);
      ltellist.add(ltel2);
      
      
      //3번멤버
      JLabel name3 = new JLabel("New label");
      name3.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name3.setBounds(0, 10, 82, 29);
      pnlm3.add(name3);
      
      JLabel id3 = new JLabel("New label");
      id3.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id3.setBounds(110, 10, 126, 29);
      pnlm3.add(id3);
      namelist.add(name3);
      idlist.add(id3);
      
      JLabel ftel3 = new JLabel("New label");
      ftel3.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel3.setBounds(203, 13, 34, 22);
      pnlm3.add(ftel3);
      ftellist.add(ftel3);
      
      
      JLabel lblNewLabel_6_1_1_2 = new JLabel("-");
      lblNewLabel_6_1_1_2.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_2.setBounds(236, 17, 20, 22);
      pnlm3.add(lblNewLabel_6_1_1_2);
      
      JLabel mtel3 = new JLabel("New label");
      mtel3.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel3.setBounds(251, 13, 34, 22);
      pnlm3.add(mtel3);
      mtellist.add(mtel3);
      
      
      JLabel lblNewLabel_6_1_3 = new JLabel("-");
      lblNewLabel_6_1_3.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_3.setBounds(297, 17, 20, 22);
      pnlm3.add(lblNewLabel_6_1_3);
      
      JLabel ltel3 = new JLabel("New label");
      ltel3.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel3.setBounds(315, 13, 45, 22);
      pnlm3.add(ltel3);
      ltellist.add(ltel3);
      
      
      //4번멤버
      JLabel name4 = new JLabel("New label");
      name4.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name4.setBounds(0, 10, 82, 29);
      pnlm4.add(name4);
      namelist.add(name4);
      
      JLabel id4 = new JLabel("New label");
      id4.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id4.setBounds(110, 10, 126, 29);
      pnlm4.add(id4);
      idlist.add(id4);
      
      JLabel ftel4 = new JLabel("New label");
      ftel4.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel4.setBounds(203, 13, 34, 22);
      pnlm4.add(ftel4);
      ftellist.add(ftel4);
      
      
      JLabel lblNewLabel_6_1_1_3 = new JLabel("-");
      lblNewLabel_6_1_1_3.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_3.setBounds(236, 17, 20, 22);
      pnlm4.add(lblNewLabel_6_1_1_3);
      
      JLabel mtel4 = new JLabel("New label");
      mtel4.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel4.setBounds(251, 13, 34, 22);
      pnlm4.add(mtel4);
      mtellist.add(mtel4);
      
      
      JLabel lblNewLabel_6_1_4 = new JLabel("-");
      lblNewLabel_6_1_4.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_4.setBounds(297, 17, 20, 22);
      pnlm4.add(lblNewLabel_6_1_4);
      
      JLabel ltel4 = new JLabel("New label");
      ltel4.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel4.setBounds(315, 13, 45, 22);
      pnlm4.add(ltel4);
      ltellist.add(ltel4);
      
      
      
      //5번멤버
      JLabel name5 = new JLabel("New label");
      name5.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name5.setBounds(0, 10, 82, 29);
      pnlm5.add(name5);
      namelist.add(name5);
      
      JLabel id5 = new JLabel("New label");
      id5.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id5.setBounds(110, 10, 126, 29);
      pnlm5.add(id5);
      idlist.add(id5);
      
      JLabel ftel5 = new JLabel("New label");
      ftel5.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel5.setBounds(203, 13, 34, 22);
      pnlm5.add(ftel5);
      ftellist.add(ftel5);
      
      
      JLabel lblNewLabel_6_1_1_4 = new JLabel("-");
      lblNewLabel_6_1_1_4.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_4.setBounds(236, 17, 20, 22);
      pnlm5.add(lblNewLabel_6_1_1_4);
      
      JLabel mtel5 = new JLabel("New label");
      mtel5.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel5.setBounds(251, 13, 34, 22);
      pnlm5.add(mtel5);
      mtellist.add(mtel5);
      
      
      JLabel lblNewLabel_6_1_5 = new JLabel("-");
      lblNewLabel_6_1_5.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_5.setBounds(297, 17, 20, 22);
      pnlm5.add(lblNewLabel_6_1_5);
      
      JLabel ltel5 = new JLabel("New label");
      ltel5.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel5.setBounds(315, 13, 45, 22);
      pnlm5.add(ltel5);
      ltellist.add(ltel5);
      
      
      //6번멤버
      JLabel name6 = new JLabel("New label");
      name6.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name6.setBounds(0, 10, 82, 29);
      pnlm6.add(name6);
      namelist.add(name6);
      
      JLabel id6 = new JLabel("New label");
      id6.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id6.setBounds(110, 10, 126, 29);
      pnlm6.add(id6);
      idlist.add(id6);
      
      JLabel ftel6 = new JLabel("New label");
      ftel6.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel6.setBounds(203, 13, 34, 22);
      pnlm6.add(ftel6);
      ftellist.add(ftel6);
      
      
      JLabel lblNewLabel_6_1_1_5 = new JLabel("-");
      lblNewLabel_6_1_1_5.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_5.setBounds(236, 17, 20, 22);
      pnlm6.add(lblNewLabel_6_1_1_5);
      
      JLabel mtel6 = new JLabel("New label");
      mtel6.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel6.setBounds(251, 13, 34, 22);
      pnlm6.add(mtel6);
      mtellist.add(mtel6);
      
      
      JLabel lblNewLabel_6_1_6 = new JLabel("-");
      lblNewLabel_6_1_6.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_6.setBounds(297, 17, 20, 22);
      pnlm6.add(lblNewLabel_6_1_6);
      
      JLabel ltel6 = new JLabel("New label");
      ltel6.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel6.setBounds(315, 13, 45, 22);
      pnlm6.add(ltel6);
      ltellist.add(ltel6);
      
      

      //7번멤버
      JLabel name7 = new JLabel("New label");
      name7.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name7.setBounds(0, 10, 82, 29);
      pnlm7.add(name7);
      namelist.add(name7);
      
      JLabel id7 = new JLabel("New label");
      id7.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id7.setBounds(110, 10, 126, 29);
      pnlm7.add(id7);
      idlist.add(id7);
      
      JLabel ftel7 = new JLabel("New label");
      ftel7.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel7.setBounds(203, 13, 34, 22);
      pnlm7.add(ftel7);
      ftellist.add(ftel7);
      
      
      JLabel lblNewLabel_6_1_1_6 = new JLabel("-");
      lblNewLabel_6_1_1_6.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_6.setBounds(236, 17, 20, 22);
      pnlm7.add(lblNewLabel_6_1_1_6);
      
      JLabel mtel7 = new JLabel("New label");
      mtel7.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel7.setBounds(251, 13, 34, 22);
      pnlm7.add(mtel7);
      mtellist.add(mtel7);
      
      
      JLabel lblNewLabel_6_1_7 = new JLabel("-");
      lblNewLabel_6_1_7.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_7.setBounds(297, 17, 20, 22);
      pnlm7.add(lblNewLabel_6_1_7);
      
      JLabel ltel7 = new JLabel("New label");
      ltel7.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel7.setBounds(315, 13, 45, 22);
      pnlm7.add(ltel7);
      ltellist.add(ltel7);
      
      
      
      //8번멤버
      JLabel name8 = new JLabel("New label");
      name8.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name8.setBounds(0, 10, 82, 29);
      pnlm8.add(name8);
      namelist.add(name8);
      
      JLabel id8 = new JLabel("New label");
      id8.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id8.setBounds(110, 10, 126, 29);
      pnlm8.add(id8);
      idlist.add(id8);
      
      JLabel ftel8 = new JLabel("New label");
      ftel8.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel8.setBounds(203, 13, 34, 22);
      pnlm8.add(ftel8);
      ftellist.add(ftel8);
      
      
      JLabel lblNewLabel_6_1_1_7 = new JLabel("-");
      lblNewLabel_6_1_1_7.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_7.setBounds(236, 17, 20, 22);
      pnlm8.add(lblNewLabel_6_1_1_7);
      
      JLabel mtel8 = new JLabel("New label");
      mtel8.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel8.setBounds(251, 13, 34, 22);
      pnlm8.add(mtel8);
      mtellist.add(mtel8);
      
      
      JLabel lblNewLabel_6_1_8 = new JLabel("-");
      lblNewLabel_6_1_8.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_8.setBounds(297, 17, 20, 22);
      pnlm8.add(lblNewLabel_6_1_8);
      
      JLabel ltel8 = new JLabel("New label");
      ltel8.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel8.setBounds(315, 13, 45, 22);
      pnlm8.add(ltel8);
      ltellist.add(ltel8);
      
      
      //9번멤버
      JLabel name9 = new JLabel("New label");
      name9.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name9.setBounds(0, 10, 82, 29);
      pnlm9.add(name9);
      namelist.add(name9);
      
      JLabel id9 = new JLabel("New label");
      id9.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id9.setBounds(110, 10, 126, 29);
      pnlm9.add(id9);
      idlist.add(id9);
      
      JLabel ftel9 = new JLabel("New label");
      ftel9.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel9.setBounds(203, 13, 34, 22);
      pnlm9.add(ftel9);
      ftellist.add(ftel9);
      
      
      JLabel lblNewLabel_6_1_1_8 = new JLabel("-");
      lblNewLabel_6_1_1_8.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_8.setBounds(236, 17, 20, 22);
      pnlm9.add(lblNewLabel_6_1_1_8);
      
      JLabel mtel9 = new JLabel("New label");
      mtel9.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel9.setBounds(251, 13, 34, 22);
      pnlm9.add(mtel9);
      mtellist.add(mtel9);
      
      
      JLabel lblNewLabel_6_1_9 = new JLabel("-");
      lblNewLabel_6_1_9.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_9.setBounds(297, 17, 20, 22);
      pnlm9.add(lblNewLabel_6_1_9);
      
      JLabel ltel9 = new JLabel("New label");
      ltel9.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel9.setBounds(315, 13, 45, 22);
      pnlm9.add(ltel9);
      ltellist.add(ltel9);
      
      
      //10번멤버
      JLabel name10 = new JLabel("10번이름라벨");
      name10.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name10.setBounds(0, 10, 82, 29);
      pnlm10.add(name10);
      namelist.add(name10);
      
      JLabel id10 = new JLabel("New label");
      id10.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id10.setBounds(110, 10, 126, 29);
      pnlm10.add(id10);
      idlist.add(id10);
      
      JLabel ftel10 = new JLabel("New label");
      ftel10.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ftel10.setBounds(203, 13, 34, 22);
      pnlm10.add(ftel10);
      ftellist.add(ftel10);
      
      
      JLabel lblNewLabel_6_1_1_9 = new JLabel("-");
      lblNewLabel_6_1_1_9.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_1_9.setBounds(236, 17, 20, 22);
      pnlm10.add(lblNewLabel_6_1_1_9);
      
      JLabel mtel10 = new JLabel("New label");
      mtel10.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      mtel10.setBounds(251, 13, 34, 22);
      pnlm10.add(mtel10);
      mtellist.add(mtel10);
      
      
      JLabel lblNewLabel_6_1_10 = new JLabel("-");
      lblNewLabel_6_1_10.setFont(new Font("굴림", Font.BOLD, 15));
      lblNewLabel_6_1_10.setBounds(297, 17, 20, 22);
      pnlm10.add(lblNewLabel_6_1_10);
      
      JLabel ltel10 = new JLabel("New label");
      ltel10.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      ltel10.setBounds(315, 13, 45, 22);
      pnlm10.add(ltel10);
      ltellist.add(ltel10);
      
      
      
      for(int i =0; i<namelist.size();i++) {      
         try {
         namelist.get(i).setText(memberList.get(i).getName());
         idlist.get(i).setText(memberList.get(i).getID());
         ftellist.get(i).setText(memberList.get(i).getFPhone());
         mtellist.get(i).setText(memberList.get(i).getMPhone());
         ltellist.get(i).setText(memberList.get(i).getLPhone());
         
         } catch(IndexOutOfBoundsException e) {
            namelist.get(i).setText(" ");
            idlist.get(i).setText(" ");
            ftellist.get(i).setText(" ");
            mtellist.get(i).setText(" ");
            ltellist.get(i).setText(" ");
            
         }
      }
      
      //초기화면 버튼 
      JButton manageulbtn = new JButton("초기화면");
      manageulbtn.setBackground(new Color(255, 255, 255));
      manageulbtn.setBounds(166, 510, 97, 23);
      frame.getContentPane().add(manageulbtn);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(44,195,248));
      panel.setBounds(0, 0, 452, 543);
      frame.getContentPane().add(panel);
      manageulbtn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new ManageUI().setVisible(true);
            frame.dispose();
         }
         
      });
      
   }

   /**
    * @return the frame
    */
   public JFrame getFrame() {
      return frame;
   }

   /**
    * @param frame the frame to set
    */
   public void setFrame(JFrame frame) {
      this.frame = frame;
   }

   /**
    * @return the memberList
    */
   public ArrayList<Member> getMemberList() {
      return memberList;
   }

   /**
    * @param memberList the memberList to set
    */
   public void setMemberList(ArrayList<Member> memberList) {
      this.memberList = memberList;
   }

   public ManegeMember(JFrame frame, ArrayList<Member> memberList) {
      super();
      this.frame = frame;
      this.memberList = memberList;
   }
}