import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class aMyBuyHistory extends JDialog{
   public aMyBuyHistory() {
      System.out.println("�� ���ų���");
      JPanel pnl = new JPanel();
      
      getContentPane().add(pnl);
      pnl.setLayout(null);
      
//       System.out.println("������ ���Ϳ� �� UserLottoNumbers�� = " + DataCenter.getInstance().getMyInfo().getTotalNumlist());
   
////////////////////////////1°�� ����/////////////////////////////////////////////////////////////////////////////////////////////////////////
                
      JPanel resultPanel1 = new JPanel();
      resultPanel1.setBounds(12, 30, 460, 77);
      pnl.add(resultPanel1);
      resultPanel1.setLayout(null);
      
      JLabel myRankingResult1 = new JLabel("���");
      myRankingResult1.setBounds(366, 18, 45, 40);
      resultPanel1.add(myRankingResult1);
      
      JLabel myBuyLotto1Number1 = new JLabel("1��");
      myBuyLotto1Number1.setBounds(64, 16, 45, 45);
      resultPanel1.add(myBuyLotto1Number1);
      
      JLabel myBuyLotto1Number2 = new JLabel("2��");
      myBuyLotto1Number2.setBounds(109, 16, 45, 45);
      resultPanel1.add(myBuyLotto1Number2);
      
      JLabel myBuyLotto1Number3 = new JLabel("3��");
      myBuyLotto1Number3.setBounds(154, 16, 45, 45);
      resultPanel1.add(myBuyLotto1Number3);
      
      JLabel myBuyLotto1Number4 = new JLabel("4��");
      myBuyLotto1Number4.setBounds(199, 16, 45, 45);
      resultPanel1.add(myBuyLotto1Number4);
      
      JLabel myBuyLotto1Number5 = new JLabel("5��");
      myBuyLotto1Number5.setBounds(244, 16, 45, 45);
      resultPanel1.add(myBuyLotto1Number5);
      
      JLabel myBuyLotto1Number6 = new JLabel("6��");
      myBuyLotto1Number6.setBounds(289, 16, 45, 45);
      resultPanel1.add(myBuyLotto1Number6);
      JLabel times1 = new JLabel("Nȸ��");
      times1.setBounds(12, 18, 40, 40);
      resultPanel1.add(times1);
////////////////////////////1°�� ��/////////////////////////////////////////////////////////////////////////////////////////////////////////      
      
////////////////////////////2°�� ����/////////////////////////////////////////////////////////////////////////////////////////////////////////      
      
      JPanel resultPanel2 = new JPanel();
      resultPanel2.setLayout(null);
      resultPanel2.setBounds(12, 107, 460, 77);
      pnl.add(resultPanel2);
      
      JLabel myRankingResult2 = new JLabel("���");
      myRankingResult2.setBounds(366, 18, 45, 40);
      resultPanel2.add(myRankingResult2);
      
      JLabel myBuyLotto2Number1 = new JLabel("1��");
      myBuyLotto2Number1.setBounds(64, 16, 45, 45);
      resultPanel2.add(myBuyLotto2Number1);
      
      JLabel myBuyLotto2Number2 = new JLabel("2��");
      myBuyLotto2Number2.setBounds(109, 16, 45, 45);
      resultPanel2.add(myBuyLotto2Number2);
      
      JLabel myBuyLotto2Number3 = new JLabel("3��");
      myBuyLotto2Number3.setBounds(154, 16, 45, 45);
      resultPanel2.add(myBuyLotto2Number3);
      
      JLabel myBuyLotto2Number4 = new JLabel("4��");
      myBuyLotto2Number4.setBounds(199, 16, 45, 45);
      resultPanel2.add(myBuyLotto2Number4);
      
      JLabel myBuyLotto2Number5 = new JLabel("5��");
      myBuyLotto2Number5.setBounds(244, 16, 45, 45);
      resultPanel2.add(myBuyLotto2Number5);
      
      JLabel myBuyLotto2Number6 = new JLabel("6��");
      myBuyLotto2Number6.setBounds(289, 16, 45, 45);
      resultPanel2.add(myBuyLotto2Number6);
      JLabel times2 = new JLabel("Nȸ��");
      times2.setBounds(12, 18, 40, 40);
      resultPanel2.add(times2);
////////////////////////////2°�� ��/////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      
////////////////////////////3°�� ����/////////////////////////////////////////////////////////////////////////////////////////////////////////      
      
      JPanel resultPanel3 = new JPanel();
      resultPanel3.setLayout(null);
      resultPanel3.setBounds(12, 184, 460, 77);
      pnl.add(resultPanel3);
      
      JLabel myRankingResult3 = new JLabel("���");
      myRankingResult3.setBounds(366, 18, 45, 40);
      resultPanel3.add(myRankingResult3);
      
      JLabel myBuyLotto3Number1 = new JLabel("1��");
      myBuyLotto3Number1.setBounds(64, 16, 45, 45);
      resultPanel3.add(myBuyLotto3Number1);
      
      JLabel myBuyLotto3Number2 = new JLabel("2��");
      myBuyLotto3Number2.setBounds(109, 16, 45, 45);
      resultPanel3.add(myBuyLotto3Number2);
      
      JLabel myBuyLotto3Number3 = new JLabel("3��");
      myBuyLotto3Number3.setBounds(154, 16, 45, 45);
      resultPanel3.add(myBuyLotto3Number3);
      
      JLabel myBuyLotto3Number4 = new JLabel("4��");
      myBuyLotto3Number4.setBounds(199, 16, 45, 45);
      resultPanel3.add(myBuyLotto3Number4);
      
      JLabel myBuyLotto3Number5 = new JLabel("5��");
      myBuyLotto3Number5.setBounds(244, 16, 45, 45);
      resultPanel3.add(myBuyLotto3Number5);
      
      JLabel myBuyLotto3Number6 = new JLabel("6��");
      myBuyLotto3Number6.setBounds(289, 16, 45, 45);
      resultPanel3.add(myBuyLotto3Number6);
      
      JLabel times3 = new JLabel("Nȸ��");
      times3.setBounds(12, 18, 40, 40);
      resultPanel3.add(times3);
////////////////////////////3°�� ��/////////////////////////////////////////////////////////////////////////////////////////////////////////   
      

////////////////////////////4°�� ����/////////////////////////////////////////////////////////////////////////////////////////////////////////      
      JPanel resultPanel4 = new JPanel();
      resultPanel4.setLayout(null);
      resultPanel4.setBounds(12, 261, 460, 77);
      pnl.add(resultPanel4);
      
      JLabel myRankingResult4 = new JLabel("���");
      myRankingResult4.setBounds(366, 18, 45, 40);
      resultPanel4.add(myRankingResult4);
      
      JLabel myBuyLotto4Number1 = new JLabel("1��");
      myBuyLotto4Number1.setBounds(64, 16, 45, 45);
      resultPanel4.add(myBuyLotto4Number1);
      
      JLabel myBuyLotto4Number2 = new JLabel("2��");
      myBuyLotto4Number2.setBounds(109, 16, 45, 45);
      resultPanel4.add(myBuyLotto4Number2);
      
      JLabel myBuyLotto4Number3 = new JLabel("3��");
      myBuyLotto4Number3.setBounds(154, 16, 45, 45);
      resultPanel4.add(myBuyLotto4Number3);
      
      JLabel myBuyLotto4Number4 = new JLabel("4��");
      myBuyLotto4Number4.setBounds(199, 16, 45, 45);
      resultPanel4.add(myBuyLotto4Number4);
      
      JLabel myBuyLotto4Number5 = new JLabel("5��");
      myBuyLotto4Number5.setBounds(244, 16, 45, 45);
      resultPanel4.add(myBuyLotto4Number5);
      
      JLabel myBuyLotto4Number6 = new JLabel("6��");
      myBuyLotto4Number6.setBounds(289, 16, 45, 45);
      resultPanel4.add(myBuyLotto4Number6);
      
      JLabel times4 = new JLabel("Nȸ��");
      times4.setBounds(12, 18, 40, 40);
      resultPanel4.add(times4);
////////////////////////////4°�� ��/////////////////////////////////////////////////////////////////////////////////////////////////////////
      
////////////////////////////5°�� ����/////////////////////////////////////////////////////////////////////////////////////////////////////////
      JPanel resultPanel5 = new JPanel();
      resultPanel5.setLayout(null);
      resultPanel5.setBounds(12, 338, 460, 77);
      pnl.add(resultPanel5);
      
      JLabel myRankingResult5 = new JLabel("���");
      myRankingResult5.setBounds(366, 18, 45, 40);
      resultPanel5.add(myRankingResult5);
      
      JLabel myBuyLotto5Number1 = new JLabel("1��");
      myBuyLotto5Number1.setBounds(64, 16, 45, 45);
      resultPanel5.add(myBuyLotto5Number1);
      
      JLabel myBuyLotto5Number2 = new JLabel("2��");
      myBuyLotto5Number2.setBounds(109, 16, 45, 45);
      resultPanel5.add(myBuyLotto5Number2);
      
      JLabel myBuyLotto5Number3 = new JLabel("3��");
      myBuyLotto5Number3.setBounds(154, 16, 45, 45);
      resultPanel5.add(myBuyLotto5Number3);
      
      JLabel myBuyLotto5Number4 = new JLabel("4��");
      myBuyLotto5Number4.setBounds(199, 16, 45, 45);
      resultPanel5.add(myBuyLotto5Number4);
      
      JLabel myBuyLotto5Number5 = new JLabel("5��");
      myBuyLotto5Number5.setBounds(244, 16, 45, 45);
      resultPanel5.add(myBuyLotto5Number5);
      
      JLabel myBuyLotto5Number6 = new JLabel("6��");
      myBuyLotto5Number6.setBounds(289, 16, 45, 45);
      resultPanel5.add(myBuyLotto5Number6);
      
      JLabel times5 = new JLabel("Nȸ��");
      times5.setBounds(12, 18, 40, 40);
      resultPanel5.add(times5);
////////////////////////////5°�� ��/////////////////////////////////////////////////////////////////////////////////////////////////////////      
      
      setSize(500, 500);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }
   
   public static void main(String[] args) {
      new aMyBuyHistory().setVisible(true);
   }
}