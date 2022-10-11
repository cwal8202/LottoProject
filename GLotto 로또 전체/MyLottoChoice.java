

//�������ڴ� �ѹ��� �������� ��Ұ� �ȵȴ�. �ֳĸ� ����
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyLottoChoice extends JFrame {
   HashSet<Integer> choiceLottoNumbers = new HashSet<>(); // ������ �����ϴ� ����
   int clickNumber; // ������ ������ �̹�����ü�� ���ڰ� ������ ���� �ݺ��ϱ�
   ArrayList<Integer> UserGetLottoNumbers = new ArrayList<>(choiceLottoNumbers); // ������ ���� or �ڵ����� ������ ���ڵ� ����Ʈ
   JPanel pnl;
   JPanel selectPnl;
   MyPage mypage = new MyPage();
   ////////// ������ư//////////
   private JButton checkButton; // Ȯ�ι�ư�� �ʵ�� ����. UserChoiceNumber���� lottoChoice�� ȣ���ؼ� lottoChoice��
   private JPanel selectPnl2;
   private JButton resetButton;
   private NumberToImages NumberToImage;
   // Ȯ�ι�ư�̺�Ʈ �߻��� UserChoiceNumber�� userChoiceNumbersImages[]�� �̹����� �߰��ǰ� �ߴ�.
   // *�� UserChoiceNumber���� lottoChoice�� ��������� �� �̺�Ʈ�� �߻��ϰ� �ߴ�. �׳� lottoChoice��ư��
   // ������ �̺�Ʈ �߻� ���Ѵ�.
   private JLabel[] lblAlls;
   private JLabel userNumberImages[];
   private JButton MyPageButton;

   public JButton getResetButton() {
      return resetButton;
   }

   public JButton getCheckButton() {
      return checkButton;
   }

   ////////// ������ư ��/////////////
   public List<Integer> getUserGetLottoNumbers() {
      return UserGetLottoNumbers;
   }

   public JPanel getPnl() {
      return pnl;
   }

   public JPanel getSelectPnl() {
      return selectPnl;
   }

   public MyLottoChoice() {
      super("���� �ζǹ�ȣ �Է�â");
      getContentPane().setBackground(new Color(255, 255, 255));
      pnl = new JPanel();
      pnl.setBackground(new Color(255, 255, 255));
      pnl.setBounds(77, 145, 479, 240);
      selectPnl = new JPanel();
      selectPnl.setBackground(new Color(255, 255, 255));
      selectPnl.setBounds(157, 56, 302, 60);
      userNumberImages = new JLabel[6];
      for (int i = 0; i < userNumberImages.length; i++) {
         userNumberImages[i] = new JLabel();
         // pnl.add(UserNumberImage[i]);
         selectPnl.add(userNumberImages[i]);
      }

      Toolkit kit = Toolkit.getDefaultToolkit();
      URL url = lottoChoice.class.getClassLoader().getResource("lottoimage/bingo.png");
      ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(70, 70, Image.SCALE_SMOOTH));

      lblAlls = new JLabel[45];
      for (int i = 0; i < lblAlls.length; i++) {
         lblAlls[i] = new JLabel((ImageIcon) NumberToImage.getInstance().getNumberToImage().get(i + 1)); // 0���� 44����
                                                                                 // �Ǳ⶧���� +1��
                                                                                 // �ߴ�.
         pnl.add(lblAlls[i]);
         //////////// Label �̺�Ʈ 45�� ������� + �� Ŭ���ϸ� ��ȣ ��� �޼ҵ� �߰���/////////////////
         lblAlls[i].addMouseListener(new MouseAdapter() {
            int clickcount = 0; // �ش� ���� Ŭ�� �ϴ� Ƚ�� // �ۿ� ���� ������ �ȿ� ������ ��� Ŭ��Ƚ�� 1�����θ� �ν��Ѵ�.

            @Override
            public void mousePressed(MouseEvent e) {
               JLabel clickLabel = (JLabel) e.getSource(); // �̺�Ʈ�� �߻��ϴ� ���� clickLabel��� ���ο� Label�� �������.
               if (choiceLottoNumbers.size() == 0) { // Reset������ clickcount�� ������ �ȵǾ �����ϴ� ���ǹ��� �������.
                  clickcount = 0;
               }
               if (choiceLottoNumbers.size() < 7 && UserGetLottoNumbers.size() < 7) { // 6�� ��á������ ���ǹ��� �ٷ� ��������
                                                                     // Label ��Ұ� �ȵȴ�. �׷��� size��
                                                                     // 6���� 7�� �ٲپ���. ��ȣ �߰��� 6����
                                                                     // �ǰ� �ߴ�.
                  // UserGetLottoNumber < 6 �� ������ �ڵ���ư���� ��ȣ �� ä���µ� ���� Ŭ���ϸ� ��� ���� �ʱ�ȭ �ǰ� ������ ����
                  // ���� �����̴�.
                  for (int i = 0; i < lblAlls.length; i++) {

                     if (clickLabel.equals(lblAlls[i])) { // Ŭ�� �̺�Ʈ�� �߻��� ��ü�� source�� label�̹�����ü�� source�� ������
                                                   // click
                                                   // Ƚ���� �����Ѵ�. ���߿� �����Ҷ� ������
                        clickcount++; // Ƚ�� �˰��ߴ�.
                        clickNumber = (i + 1); // Ŭ���󺧰� (lblAll ���� ���� + 1) �� ������ �� ���ڰ� ������ �ߴ�.
                        System.out.println("Ŭ���� �̹��� ��ȣ = " + clickNumber + ", Ŭ�� Ƚ�� = " + clickcount);
                     }
                  }
                  if (clickcount % 2 != 0 && choiceLottoNumbers.size() < 6) {
                     lblAlls[clickNumber - 1].setIcon(
                           (ImageIcon) NumberToImage.getInstance().getNumberToImage().get(clickNumber + 45)); // ����
                                                                                          // �Ҳ�!!!!
                     choiceLottoNumbers.add(clickNumber); // set�� ����� ������ �����Կ� �־ ���Ұ��� �����ϸ� �ǹǷ� ������ �� ���ؼ� �̰�
                                                   // �����ߴ�.
                  } else if (clickcount % 2 == 0) { // ¦���� Ŭ�������� �� ���� �����ϰ� �ߴ�.
                     choiceLottoNumbers.remove(clickNumber);
                     System.out.println("������!");
                     lblAlls[clickNumber - 1].setIcon(
                           (ImageIcon) NumberToImage.getInstance().getNumberToImage().get((clickNumber)));
                  } else {
                     System.out.println("6�� ����");
                  }
                  System.out.println("set" + choiceLottoNumbers.toString());
                  // set���� ������ ������ �������� �����ߴ�.

                  UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers); // �������� �ٲ�°� ����. �Ƹ� set�� �����ڷ�
                                                                     // ������ ArrayList�� �����ؼ� ��������
                                                                     // �ٲ�� ����.

                  Collections.sort(UserGetLottoNumbers);
                  System.out.println("���� ������ �ζ� ���ڴ� = " + UserGetLottoNumbers);
               } else {
                  System.out.println("6�� ���� �� ���õǾ����ϴ�.");
               }
               // System.out.println(lblTest);
               // System.out.println(numbersImage.numberImage.keySet().toArray()[0]); // 45��
               // �̹��� ���� Ű�� ������� �������� ��� Ű�� �������� map�� ������ ����...
            }
         });
         //////////// Label �̺�Ʈ 45�� ��/////////////////
      }
      getContentPane().setLayout(null);

      getContentPane().add(selectPnl);
      selectPnl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      getContentPane().add(pnl);
      MyPageButton = new JButton("MyPage");
      MyPageButton.setBackground(new Color(255, 255, 255));
      MyPageButton.setBounds(505, 407, 79, 33);
      getContentPane().add(MyPageButton);
      checkButton = new JButton("Ȯ��");
      checkButton.setBackground(new Color(255, 255, 255));
      checkButton.setBounds(218, 407, 68, 33);
      getContentPane().add(checkButton);
      JButton autoButton = new JButton("�ڵ���ư");
      autoButton.setBackground(new Color(255, 255, 255));
      autoButton.setBounds(298, 407, 95, 33);
      getContentPane().add(autoButton);
      resetButton = new JButton("RESET");
      resetButton.setBackground(new Color(255, 255, 255));
      resetButton.setBounds(403, 407, 90, 33);
      getContentPane().add(resetButton);
      JLabel titleLabel = new JLabel();
      titleLabel.setBounds(574, 407, 48, 29);
      getContentPane().add(titleLabel);
      titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

      JLabel lblNewLabel = new JLabel();
      lblNewLabel.setBounds(77, 22, 129, 113);
      getContentPane().add(lblNewLabel);
      lblNewLabel.setIcon(image);

      /////////////////////////////////////////// Reset��ư ����� ����
      resetButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (UserGetLottoNumbers.size() > 0) {
               for (int i = 0; i < UserGetLottoNumbers.size(); i++) { // clear�ϰ� �� �� �̹����� ����� ������ ���� �����Ƿ� index�� ����
                                                         // index ������ ��Ÿ����.
                  lblAlls[UserGetLottoNumbers.get(i) - 1].setIcon((ImageIcon) NumberToImage.getInstance()
                        .getNumberToImage().get(UserGetLottoNumbers.get(i)));
                  userNumberImages[i].setIcon(null); // URL���� ���� 0 �� �̹��� 1�̴�. �� ���ڿ� �̹����� ������ �����Ǵ°� �ƴ� �̹����� ���� + 1��
                                             // ���� �Ǿ���.
               }
               choiceLottoNumbers.clear(); // Set�� ����ϱ� �ذ�Ǿ���!!!!
               UserGetLottoNumbers.clear();
               System.out.println("���µǸ�" + UserGetLottoNumbers.size());
            } else {
               System.out.println("������ ���� �����ϴ�.");
            }
         }
      });
      //////////////////////////////////////////////////// �ζ� ��ȣ ���ϴ� ��Ʈ + �� Ŭ���ϸ� ��ȣ
      //////////////////////////////////////////////////// ��� �޼ҵ�
      //////////////////////////////////////////////////// ��//////////////////////////////////////////////

      /////////////////////////////////////////// �ڵ� ��ư �����
      /////////////////////////////////////////// ����///////////////////////////////////////////////////////
      autoButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = null;
            if (UserGetLottoNumbers.size() == 0) {
               result = "�ڵ�";
            }
            if (UserGetLottoNumbers.size() >= 1 && UserGetLottoNumbers.size() < 6) {
               result = "���ڵ�";
            }
            while (UserGetLottoNumbers.size() < 6) {
               int random = (int) (Math.random() * 45 + 1);
               choiceLottoNumbers.add(random);
               UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers); // ���� ���� �̹��� ���� �̶� ���� �ٲ� �ߺ����ڰ�
                                                                  // ������...
               lblAlls[random - 1]
                     .setIcon((ImageIcon) NumberToImage.getInstance().getNumberToImage().get((random) + 45));
               Collections.sort(UserGetLottoNumbers);
            }
            System.out.println(result + "�ζ� ���ڴ� = " + UserGetLottoNumbers);

         }
      });
      /////////////////////////////////////////// �ڵ� ��ư �����
      /////////////////////////////////////////// ������///////////////////////////////////////////////////////

      ////////////////////////////////////////////////// Ȯ�� ��ư
      ////////////////////////////////////////////////// ����/////////////////////////////////////////////////////
      
      checkButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (UserGetLottoNumbers.size() == 6) {
               for (int i = 0; i < 6; i++) {
                  userNumberImages[i].setIcon((ImageIcon) NumberToImage.getInstance().getNumberToImage()
                        .get(UserGetLottoNumbers.get(i) + 45)); // URL����
               }
               System.out.println("Ȯ�ι�ư ������ ���������� ������ ���ڵ��� = " + UserGetLottoNumbers); // ������ ����
            } else {
               System.out.println("��ȣ �Է��ϼ���");
            }
         }
      });

      MyPageButton.addActionListener(new ActionListener() {
          @Override
             public void actionPerformed(ActionEvent e) {
        	  
                if (UserGetLottoNumbers.size() == 6) {
                     for (int i = 0; i < 6; i++) {
                        mypage.chnumlist.get(i).setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(UserGetLottoNumbers.get(i)));
                     }
                     System.out.println("MyPage�� �̵��մϴ�");  
                     System.out.println(UserGetLottoNumbers);
                     
                  }  
                  else {
                     System.out.println("��ȣ �Է��ϼ���");
                  }
                  for(int i=0; i<=UserGetLottoNumbers.size();i++) {
                  DataCenter.getInstance().getMyInfo().setMyNumList(UserGetLottoNumbers);;
                  }
//                  System.out.println(DataCenter.getInstance().getMyInfo().getMyNumlist());
                  System.out.println("���� ��");
                  mypage.getFrame().setVisible(true);
                setVisible(false);
          }
       });


      setSize(650, 500);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }

   public void resetAll() {
      if (UserGetLottoNumbers.size() > 0) {

         for (int i = 0; i < UserGetLottoNumbers.size(); i++) { // clear�ϰ� �� �� �̹����� ����� ������ ���� �����Ƿ� index�� ���� index
                                                   // ������ ��Ÿ����.
            lblAlls[UserGetLottoNumbers.get(i) - 1].setIcon(
                  (ImageIcon) NumberToImage.getInstance().getNumberToImage().get(UserGetLottoNumbers.get(i)));
            userNumberImages[i].setIcon(null); // URL���� ���� 0 �� �̹��� 1�̴�. �� ���ڿ� �̹����� ������ �����Ǵ°� �ƴ� �̹����� ���� + 1�� ���� �Ǿ���.
         }
         choiceLottoNumbers.clear(); // Set�� ����ϱ� �ذ�Ǿ���!!!!
         UserGetLottoNumbers.clear();
         System.out.println("���µǸ�" + UserGetLottoNumbers.size());
      } else {
         System.out.println("������ ���� �����ϴ�.");
      }

   }

   public static void main(String[] args) {
      new MyLottoChoice().setVisible(true);
   }
}