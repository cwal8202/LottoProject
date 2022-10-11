import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class myBuyHistory extends JDialog {
   public myBuyHistory() {
      System.out.println("회차" + (WinnerCreate.gamecount));
      System.out.println(
            "1회차의 유저가 선택한 번호" + DataCenter.getInstance().getMyInfo().getTotalNumlist().get(WinnerCreate.gamecount));
      for (int i = 0; i < DataCenter.getInstance().getMyInfo().getTotalNumlist().size(); i++) {
         System.out.println("1회차의 유저가 선택한 번호" + i + "줄"
               + DataCenter.getInstance().getMyInfo().getTotalNumlist().get(WinnerCreate.gamecount).get(i));
         System.out.println("유저의 당첨 결과"
               + DataCenter.getInstance().getMyInfo().getUserRankingList().get(WinnerCreate.gamecount).get(i));
      }
      System.out.println("내 구매내역");
      JPanel pnl = new JPanel();

      getContentPane().add(pnl);
      pnl.setLayout(null);

//       System.out.println("데이터 센터에 들어간 UserLottoNumbers는 = " + DataCenter.getInstance().getMyInfo().getTotalNumlist());

   int y = 30;
   JPanel resultPanel[] = new JPanel[5];
   JLabel times[] = new JLabel[5];
   JLabel myBuyLottoNumber[][] = new JLabel[5][6];
   JLabel myRankingResult[] = new JLabel[5];
   for (int i = 0; i < 5; i++) {

      resultPanel[i] = new JPanel();
      resultPanel[i].setBounds(12, y, 460, 77);
      times[i] = new JLabel("N회차");
      myRankingResult[i] = new JLabel("결과");

      resultPanel[i].setBounds(12, y, 460, 77);
      y += 77;
      
      
      pnl.add(resultPanel[i]);
      resultPanel[i].setLayout(null);
      myRankingResult[i]
            .setText("" + DataCenter.getInstance().getMyInfo().getUserRankingList().get(WinnerCreate.gamecount).get(i));
      myRankingResult[i].setBounds(366, 18, 45, 40);
      resultPanel[i].add(myRankingResult[i]);
      int x = 64;
      for (int j = 0; j < 6; j++) {
         myBuyLottoNumber[i][j] = new JLabel("" + i + "번째 줄의 " + j + "번");
         myBuyLottoNumber[i][j].setText("" + DataCenter.getInstance().getMyInfo().getTotalNumlist().get(WinnerCreate.gamecount).get(i));
         myBuyLottoNumber[i][j].setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage()
                     .get(DataCenter.getInstance().getMyInfo().getTotalNumlist().get(WinnerCreate.gamecount).get(i)));
         myBuyLottoNumber[i][j].setBounds(x, 16, 45, 45);
         resultPanel[i].add(myBuyLottoNumber[i][j]);
         x += 45;
      }
      times[i].setText("" + WinnerCreate.gamecount + "회차");
      times[i].setBounds(12, 18, 40, 40);
      resultPanel[i].add(times[i]);
   }
////////////////////////////2째줄 끝/////////////////////////////////////////////////////////////////////////////////////////////////////////


      setSize(500, 500);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }

   public static void main(String[] args) {
      new myBuyHistory().setVisible(true);
   }
}