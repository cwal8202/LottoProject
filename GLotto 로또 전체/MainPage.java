import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainPage extends JFrame{
   public MainPage() {
	   super("만 19세 미만 청소년 구매금지");
	   setResizable(false);
      
      Toolkit kit = Toolkit.getDefaultToolkit();
      JPanel pnl = new JPanel();
      
      
      
      URL url = MainPage.class.getClassLoader().getResource("lottoimage/복권나이제한.jpg");
      ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
      ImagePanel panel = new ImagePanel(new ImageIcon(url).getImage());
      panel.setBounds(0, 0, 504, 499);
      
      JButton inputOpenButton = new JButton("확인했습니다");
      inputOpenButton.setFont(new Font("휴먼모음T", Font.BOLD, 25));
      inputOpenButton.setBackground(new Color(255, 255, 0));
      inputOpenButton.setBounds(302, 75, 179, 48);
      JButton test = new JButton("test");
      
      UserChoiceNumber userChoiceNumber = new UserChoiceNumber();   // 이벤트 발생전에 호출을 하면 시간이 걸리지만 userChoiceNumber의 nextbutton이벤트 메소드를 설정하기 위해선 밖에 있어야 한다..
      
      inputOpenButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             if(DataCenter.getInstance().getMyInfo().getMembercheck()==true && UserChoiceNumber.cou == true) {
                 JOptionPane.showMessageDialog(MainPage.this, "이미 회차를 진행하셨습니다 다음회차가 시작할때까지 기다려주세요!");
              }
               else if(UserChoiceNumber.cou == false) {
                  DataCenter.getInstance().getMyInfo().setMembercheck(false);
                  System.out.println("버튼을 눌려서 UserChoiceNumber창이 켜집니다");    
                    System.out.println("*******************UserChoiceNumber창이 켜집니다*****************");
                    userChoiceNumber.setVisible(true);
               }
               
               
               else {
               System.out.println("버튼을 눌려서 UserChoiceNumber창이 켜집니다");
               System.out.println("*******************UserChoiceNumber창이 켜집니다*****************");
               userChoiceNumber.setVisible(true);
               }
             dispose();
         }
      });
      
      userChoiceNumber.nextButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("userChoiceNumber에서 얻은 finalUserNumbersList 의 값은 = " + userChoiceNumber.getFinalUserNumbersList1());
            
            System.out.println("메인페이지에서 연 UserChoiceNumber의 nextButton에서만 지금 이벤트가 발생합니다.");
            System.out.println("*******************lotto창이 켜집니다*****************");
            Lotto resultLotto = new Lotto(); // 이벤트 발생전에 호출을 하면 자동으로 랜덤 당첨번호를 만들어서 들어가는데 시간이 걸린다.
            System.out.println("메인창에서 연  UserChoiceNumber의 nextButton를 눌려서 getUserNumbersCheck의 글자가 바뀜");
            for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList1().size(); i++) {
               resultLotto.getUserSelectNumberImages1()[i].setText("" + userChoiceNumber.getFinalUserNumbersList1().get(i));
               resultLotto.getUserSelectNumberImages1()[i].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(userChoiceNumber.getFinalUserNumbersList1().get(i)));
               resultLotto.getUserSelectNumbers1().add(userChoiceNumber.getFinalUserNumbersList1().get(i));
               System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers1().get(i));
            }
             //////////////////////////// 유저의 천원치 (1줄)의 선택 수를 담는 데이터/////////////////////// 
               UserLottoData.getInstance().setUserAll(userChoiceNumber.getFinalUserNumbersList1());
               System.out.println("데이터 창에 들어간 1째줄 UserLottoNumbers는 = " + UserLottoData.getInstance().getUserAll());
               ////////////////////////////유저의 천원치 (1줄)의 선택 수를 담는 데이터 끝///////////////////////
               
               for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList2().size(); i++) {
                  resultLotto.getUserSelectNumberImages2()[i].setText("" + userChoiceNumber.getFinalUserNumbersList2().get(i));
                  resultLotto.getUserSelectNumberImages2()[i].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(userChoiceNumber.getFinalUserNumbersList2().get(i)));
                  resultLotto.getUserSelectNumbers2().add(userChoiceNumber.getFinalUserNumbersList2().get(i));
                  System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers2().get(i));
               }
               //////////////////////////// 유저의 2천원치 (2줄)의 선택 수를 담는 데이터/////////////////////// 
               UserLottoData.getInstance().setUserAll(userChoiceNumber.getFinalUserNumbersList2());
               System.out.println("데이터 창에 들어간 2째줄 UserLottoNumbers는 = " + UserLottoData.getInstance().getUserAll());
               ////////////////////////////유저의 2천원치 (2줄)의 선택 수를 담는 데이터 끝///////////////////////
               
               for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList3().size(); i++) {
                  resultLotto.getUserSelectNumberImages3()[i].setText("" + userChoiceNumber.getFinalUserNumbersList3().get(i));
                  resultLotto.getUserSelectNumberImages3()[i].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(userChoiceNumber.getFinalUserNumbersList3().get(i)));
                  resultLotto.getUserSelectNumbers3().add(userChoiceNumber.getFinalUserNumbersList3().get(i));
                  System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers3().get(i));
               }
               //////////////////////////// 유저의 3천원치 (3줄)의 선택 수를 담는 데이터/////////////////////// 
               UserLottoData.getInstance().setUserAll(userChoiceNumber.getFinalUserNumbersList3());
               System.out.println("데이터 창에 들어간 3째줄 UserLottoNumbers는 = " + UserLottoData.getInstance().getUserAll());
               ////////////////////////////유저의 3천원치 (3줄)의 선택 수를 담는 데이터 끝///////////////////////
               
               for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList4().size(); i++) {
                  resultLotto.getUserSelectNumberImages4()[i].setText("" + userChoiceNumber.getFinalUserNumbersList4().get(i));
                  resultLotto.getUserSelectNumberImages4()[i].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(userChoiceNumber.getFinalUserNumbersList4().get(i)));
                  resultLotto.getUserSelectNumbers4().add(userChoiceNumber.getFinalUserNumbersList4().get(i));
                  System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers4().get(i));
               }
               //////////////////////////// 유저의 4천원치 (4줄)의 선택 수를 담는 데이터/////////////////////// 
               UserLottoData.getInstance().setUserAll(userChoiceNumber.getFinalUserNumbersList4());
               System.out.println("데이터 창에 들어간 4째줄 UserLottoNumbers는 = " + UserLottoData.getInstance().getUserAll());
               ////////////////////////////유저의 4천원치 (4줄)의 선택 수를 담는 데이터 끝///////////////////////
               
               for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList5().size(); i++) {
                  resultLotto.getUserSelectNumberImages5()[i].setText("" + userChoiceNumber.getFinalUserNumbersList5().get(i));
                  resultLotto.getUserSelectNumberImages5()[i].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(userChoiceNumber.getFinalUserNumbersList5().get(i)));
                  resultLotto.getUserSelectNumbers5().add(userChoiceNumber.getFinalUserNumbersList5().get(i));
                  System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers5().get(i));
               }
               //////////////////////////// 유저의 5천원치 (5줄)의 선택 수를 담는 데이터/////////////////////// 
               UserLottoData.getInstance().setUserAll(userChoiceNumber.getFinalUserNumbersList5());
               System.out.println("데이터 창에 들어간 5째줄 UserLottoNumbers는 = " + UserLottoData.getInstance().getUserAll());
               ////////////////////////////유저의 5천원치 (5줄)의 선택 수를 담는 데이터 끝///////////////////////

            resultLotto.pnl.add(test);
            resultLotto.setVisible(true);
         }
      });
      getContentPane().setLayout(null);
      
      panel.add(inputOpenButton);
      
      getContentPane().add(panel);
      panel.setLayout(null);
      
      setSize(520, 543);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);
   }
   
   
   public static void main(String[] args) {
      new MainPage().setVisible(true);
   }

}
