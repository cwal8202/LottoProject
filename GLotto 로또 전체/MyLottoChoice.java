

//랜덤숫자는 한번더 눌렀을때 취소가 안된다. 왜냐면 랜ㄷ
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
   HashSet<Integer> choiceLottoNumbers = new HashSet<>(); // 유저가 선택하는 숫자
   int clickNumber; // 유저가 선택한 이미지객체의 숫자가 맞을때 까지 반복하기
   ArrayList<Integer> UserGetLottoNumbers = new ArrayList<>(choiceLottoNumbers); // 유저가 선택 or 자동으로 선택한 숫자들 리스트
   JPanel pnl;
   JPanel selectPnl;
   MyPage mypage = new MyPage();
   ////////// 연습버튼//////////
   private JButton checkButton; // 확인버튼을 필드로 뺐다. UserChoiceNumber에서 lottoChoice를 호출해서 lottoChoice의
   private JPanel selectPnl2;
   private JButton resetButton;
   private NumberToImages NumberToImage;
   // 확인버튼이벤트 발생시 UserChoiceNumber의 userChoiceNumbersImages[]에 이미지가 추가되게 했다.
   // *단 UserChoiceNumber에서 lottoChoice를 열어야지만 그 이벤트가 발생하게 했다. 그냥 lottoChoice버튼을
   // 눌리면 이벤트 발생 안한다.
   private JLabel[] lblAlls;
   private JLabel userNumberImages[];
   private JButton MyPageButton;

   public JButton getResetButton() {
      return resetButton;
   }

   public JButton getCheckButton() {
      return checkButton;
   }

   ////////// 연습버튼 끝/////////////
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
      super("나의 로또번호 입력창");
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
         lblAlls[i] = new JLabel((ImageIcon) NumberToImage.getInstance().getNumberToImage().get(i + 1)); // 0부터 44까지
                                                                                 // 되기때문에 +1을
                                                                                 // 했다.
         pnl.add(lblAlls[i]);
         //////////// Label 이벤트 45개 만들었다 + 라벨 클릭하면 번호 담는 메소드 추가함/////////////////
         lblAlls[i].addMouseListener(new MouseAdapter() {
            int clickcount = 0; // 해당 라벨을 클릭 하는 횟수 // 밖에 넣은 이유는 안에 넣으면 계속 클릭횟수 1번으로만 인식한다.

            @Override
            public void mousePressed(MouseEvent e) {
               JLabel clickLabel = (JLabel) e.getSource(); // 이벤트가 발생하는 라벨을 clickLabel라는 새로운 Label을 만들었다.
               if (choiceLottoNumbers.size() == 0) { // Reset했을때 clickcount는 리셋이 안되어서 리셋하는 조건문을 만들었다.
                  clickcount = 0;
               }
               if (choiceLottoNumbers.size() < 7 && UserGetLottoNumbers.size() < 7) { // 6개 다찼을때는 조건문이 바로 나가져서
                                                                     // Label 취소가 안된다. 그래서 size를
                                                                     // 6에서 7로 바꾸었다. 번호 추가는 6개만
                                                                     // 되게 했다.
                  // UserGetLottoNumber < 6 한 이유는 자동버튼으로 번호 다 채웠는데 숫자 클릭하면 모든 값이 초기화 되고 선택한 값이
                  // 들어갔기 때문이다.
                  for (int i = 0; i < lblAlls.length; i++) {

                     if (clickLabel.equals(lblAlls[i])) { // 클릭 이벤트가 발생한 객체의 source와 label이미지객체의 source가 같으면
                                                   // click
                                                   // 횟수가 증가한다. 나중에 삭제할때 쓸려고
                        clickcount++; // 횟수 알게했다.
                        clickNumber = (i + 1); // 클릭라벨과 (lblAll 라벨의 숫자 + 1) 값 같으면 그 숫자가 나오게 했다.
                        System.out.println("클릭한 이미지 번호 = " + clickNumber + ", 클릭 횟수 = " + clickcount);
                     }
                  }
                  if (clickcount % 2 != 0 && choiceLottoNumbers.size() < 6) {
                     lblAlls[clickNumber - 1].setIcon(
                           (ImageIcon) NumberToImage.getInstance().getNumberToImage().get(clickNumber + 45)); // 수정
                                                                                          // 할꺼!!!!
                     choiceLottoNumbers.add(clickNumber); // set을 사용한 이유는 제거함에 있어서 원소값만 제거하면 되므로 과정이 더 편해서 이걸
                                                   // 선택했다.
                  } else if (clickcount % 2 == 0) { // 짝수번 클릭했을때 그 원소 삭제하게 했다.
                     choiceLottoNumbers.remove(clickNumber);
                     System.out.println("삭제됨!");
                     lblAlls[clickNumber - 1].setIcon(
                           (ImageIcon) NumberToImage.getInstance().getNumberToImage().get((clickNumber)));
                  } else {
                     System.out.println("6개 다참");
                  }
                  System.out.println("set" + choiceLottoNumbers.toString());
                  // set으로 가져온 값들을 오름차순 정렬했다.

                  UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers); // 참조값이 바뀌는거 같다. 아마 set을 생성자로
                                                                     // 가지는 ArrayList를 생성해서 참조값이
                                                                     // 바뀐것 같다.

                  Collections.sort(UserGetLottoNumbers);
                  System.out.println("내가 선택한 로또 숫자는 = " + UserGetLottoNumbers);
               } else {
                  System.out.println("6개 숫자 다 선택되었습니다.");
               }
               // System.out.println(lblTest);
               // System.out.println(numbersImage.numberImage.keySet().toArray()[0]); // 45개
               // 이미지 맵의 키를 순서대로 가져오는 방법 키를 가져오면 map쓴 이유가 없다...
            }
         });
         //////////// Label 이벤트 45개 끝/////////////////
      }
      getContentPane().setLayout(null);

      getContentPane().add(selectPnl);
      selectPnl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      getContentPane().add(pnl);
      MyPageButton = new JButton("MyPage");
      MyPageButton.setBackground(new Color(255, 255, 255));
      MyPageButton.setBounds(505, 407, 79, 33);
      getContentPane().add(MyPageButton);
      checkButton = new JButton("확인");
      checkButton.setBackground(new Color(255, 255, 255));
      checkButton.setBounds(218, 407, 68, 33);
      getContentPane().add(checkButton);
      JButton autoButton = new JButton("자동버튼");
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

      /////////////////////////////////////////// Reset버튼 만들기 시작
      resetButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (UserGetLottoNumbers.size() > 0) {
               for (int i = 0; i < UserGetLottoNumbers.size(); i++) { // clear하고 난 뒤 이미지를 지우면 데이터 값이 없으므로 index가 없어
                                                         // index 오류가 나타난다.
                  lblAlls[UserGetLottoNumbers.get(i) - 1].setIcon((ImageIcon) NumberToImage.getInstance()
                        .getNumberToImage().get(UserGetLottoNumbers.get(i)));
                  userNumberImages[i].setIcon(null); // URL에서 숫자 0 이 이미지 1이다. 즉 숫자와 이미지가 완전히 대응되는게 아닌 이미지가 숫자 + 1의
                                             // 값이 되었다.
               }
               choiceLottoNumbers.clear(); // Set을 지우니깐 해결되었다!!!!
               UserGetLottoNumbers.clear();
               System.out.println("리셋되면" + UserGetLottoNumbers.size());
            } else {
               System.out.println("리셋할 값이 없습니다.");
            }
         }
      });
      //////////////////////////////////////////////////// 로또 번호 정하는 파트 + 라벨 클릭하면 번호
      //////////////////////////////////////////////////// 담는 메소드
      //////////////////////////////////////////////////// 끝//////////////////////////////////////////////

      /////////////////////////////////////////// 자동 버튼 만들기
      /////////////////////////////////////////// 시작///////////////////////////////////////////////////////
      autoButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = null;
            if (UserGetLottoNumbers.size() == 0) {
               result = "자동";
            }
            if (UserGetLottoNumbers.size() >= 1 && UserGetLottoNumbers.size() < 6) {
               result = "반자동";
            }
            while (UserGetLottoNumbers.size() < 6) {
               int random = (int) (Math.random() * 45 + 1);
               choiceLottoNumbers.add(random);
               UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers); // 랜덤 숫자 이미지 삽입 이랑 순서 바뀌어서 중복숫자가
                                                                  // 뽑혔다...
               lblAlls[random - 1]
                     .setIcon((ImageIcon) NumberToImage.getInstance().getNumberToImage().get((random) + 45));
               Collections.sort(UserGetLottoNumbers);
            }
            System.out.println(result + "로또 숫자는 = " + UserGetLottoNumbers);

         }
      });
      /////////////////////////////////////////// 자동 버튼 만들기
      /////////////////////////////////////////// 마지막///////////////////////////////////////////////////////

      ////////////////////////////////////////////////// 확인 버튼
      ////////////////////////////////////////////////// 시작/////////////////////////////////////////////////////
      
      checkButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (UserGetLottoNumbers.size() == 6) {
               for (int i = 0; i < 6; i++) {
                  userNumberImages[i].setIcon((ImageIcon) NumberToImage.getInstance().getNumberToImage()
                        .get(UserGetLottoNumbers.get(i) + 45)); // URL에서
               }
               System.out.println("확인버튼 눌리면 최종적으로 나오는 숫자들은 = " + UserGetLottoNumbers); // 수정한 내용
            } else {
               System.out.println("번호 입력하세요");
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
                     System.out.println("MyPage로 이동합니다");  
                     System.out.println(UserGetLottoNumbers);
                     
                  }  
                  else {
                     System.out.println("번호 입력하세요");
                  }
                  for(int i=0; i<=UserGetLottoNumbers.size();i++) {
                  DataCenter.getInstance().getMyInfo().setMyNumList(UserGetLottoNumbers);;
                  }
//                  System.out.println(DataCenter.getInstance().getMyInfo().getMyNumlist());
                  System.out.println("마페 끝");
                  mypage.getFrame().setVisible(true);
                setVisible(false);
          }
       });


      setSize(650, 500);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }

   public void resetAll() {
      if (UserGetLottoNumbers.size() > 0) {

         for (int i = 0; i < UserGetLottoNumbers.size(); i++) { // clear하고 난 뒤 이미지를 지우면 데이터 값이 없으므로 index가 없어 index
                                                   // 오류가 나타난다.
            lblAlls[UserGetLottoNumbers.get(i) - 1].setIcon(
                  (ImageIcon) NumberToImage.getInstance().getNumberToImage().get(UserGetLottoNumbers.get(i)));
            userNumberImages[i].setIcon(null); // URL에서 숫자 0 이 이미지 1이다. 즉 숫자와 이미지가 완전히 대응되는게 아닌 이미지가 숫자 + 1의 값이 되었다.
         }
         choiceLottoNumbers.clear(); // Set을 지우니깐 해결되었다!!!!
         UserGetLottoNumbers.clear();
         System.out.println("리셋되면" + UserGetLottoNumbers.size());
      } else {
         System.out.println("리셋할 값이 없습니다.");
      }

   }

   public static void main(String[] args) {
      new MyLottoChoice().setVisible(true);
   }
}