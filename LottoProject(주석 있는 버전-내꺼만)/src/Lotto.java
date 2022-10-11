import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lotto extends JFrame {
	public JPanel pnl;
	private List<Integer> userSelectNumbers;	// 유저가 선택한 번호가 들어가는 int배열
	private JLabel[] userSelectNumberImages;	// 유저가 선택한 번호의 이미지가 들어오는 Label 배열

	private JButton resultButton;	// 유저의 번호와 당첨번호 비교하는 버튼
	
	public List<Integer> getUserSelectNumbers() {
		return userSelectNumbers;
	}

	public JLabel[] getUserSelectNumberImages() {
		return userSelectNumberImages;
	}

	public JPanel getPnl() {
		return pnl;
	}


	public Lotto() {
		pnl = new JPanel();
	//----------------------------제목------------------------------------------------//
		JLabel winnerNumberTitle = new JLabel("<1등 번호>");
		pnl.add(winnerNumberTitle);
	//----------------------------제목 끝------------------------------------------------//
		
	//----------------------------1등 랜덤 숫자 출력------------------------------------------------//
		LottoInstance lottoInstance = LottoInstance.getInstance();	// 당첨 번호 호출
		
//	LottoNumber winnerNumbers = new LottoNumber();

	System.out.println("당첨번호 첫번째는" + (lottoInstance.getWinnerLottoNumbers().get(0)));	// LottoNumber의 당첨번호 확인할려고 출력함.
	Toolkit kit = Toolkit.getDefaultToolkit();
	HashMap map = new HashMap();
	
	//	image == map.get("a"); 처음에 JLabel의 생성자에 ImageIcon을 Value로 가지는 map.get("a")를 넣었더니 JLabel은 Object를 
	// 가지는 생성자는 없다면서 오류가 났다. 그래서 map.get("a")를 형변환 (ImageIcon)map.get("a") 이걸로 변환했더니 적용이 되었다.
	JLabel[] lblAll = new JLabel[7];
	for (int i = 0; i < lblAll.length; i++) {
		lblAll[i] = new JLabel((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(lottoInstance.getWinnerLottoNumbers().get(i)));
		pnl.add(lblAll[i]);
	}
	// 배열 반복으로 가능하다.....!
//	JLabel lbl1 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(0)));	// 1등 첫번째 수.
//	pnl.add(lbl1);
//	JLabel lbl2 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(1)));	// 1등 두번째 수.
//	pnl.add(lbl2);
//	JLabel lbl3 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(2)));	// 1등 세번째 수.
//	pnl.add(lbl3);
//	JLabel lbl4 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(3)));	// 1등 네번째 수.
//	pnl.add(lbl4);
//	JLabel lbl5 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(4)));	// 1등 다섯번째 수.
//	pnl.add(lbl5);
//	JLabel lbl6 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(5)));	// 1등 여섯번째 수.
//	pnl.add(lbl6);
//	JLabel lbl7 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(6)));	// 1등 보너스 수.
//	pnl.add(lbl7);

	//---------------------------1등 랜덤 숫자 출력 마지막-----------------------------------------------------//
	
	//---------------------------사용자 수 가져오기 시작 ----------------------------------------------------//
	userSelectNumbers = new ArrayList<>();	// 사용자가 선택한 수가 들어가는 ArrayList이다.
	userSelectNumberImages = new JLabel[6];	// 사용자가 선택한 수의 이미지 들어가는 라벨
	for (int i = 0; i < userSelectNumberImages.length; i++) {
		userSelectNumberImages[i] = new JLabel("[유저의 " + (i + 1) +"번째 번호]");
		pnl.add(userSelectNumberImages[i]);
	}
	// 메인페이지를 작동시키면 userSelectNumbers[i]에 UserChoiceNumber의 번호이미지를 가져 올 것이다.
	// UserChoiceNumber의 번호는 userChoiceNumber.getFinalUserNumbersList().get(i)로 가져온다.
	
	
	//---------------------------사용자 수 가져오기 마지막 ----------------------------------------------------//
	
	///////////////////////////연습추가/////////////////////////////////////
//	UserChoiceNumber userChoiceNumber = new UserChoiceNumber();
//	userChoiceNumber.getNextButton().addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("UserChoiceNumber 에서 눌리면 넘어가길!!");
//			setVisible(true);
//			userChoiceNumber.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		}
//	});
	//System.out.println(userChoiceNumber.getUserNumbersList());
//	userNumbersCheck.setIcon(icon);
	/////////////////////////// 연습추가 끝///////////////////////////////////
	
	
	//////////////////////////////////////// 맞은 번호 색칠되기 /////////////////////////////////////////////
	JLabel rankResult = new JLabel("나의 등수는 ???????");
	resultButton = new JButton("결과알아보기버튼");
	resultButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {			// ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
			int count = 0;
			System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers.size());
			for (int i = 0; i < userSelectNumbers.size(); i ++) {
				System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers.get(i));
				System.out.println("1등 번호의" + i + "번째 번호는 = " + lottoInstance.getWinnerLottoNumbers().get(i));
				if (userSelectNumbers.contains(lottoInstance.getWinnerLottoNumbers().get(i))) {	// 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
					System.out.println("맞은 번호 = " + lottoInstance.getWinnerLottoNumbers().get(i));		// 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게 했다.
					// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
					System.out.println("맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers.indexOf(lottoInstance.getWinnerLottoNumbers().get(i)));	// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
					// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
					// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
//					userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
					userSelectNumberImages[userSelectNumbers.indexOf(lottoInstance.getWinnerLottoNumbers().get(i))].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(lottoInstance.getWinnerLottoNumbers().get(i) + 45));
//					userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
											// 유저의 당첨번호 위치 인덱스 값																							// 당첨번호 + 45의 값
					count++;
				}
				if (userSelectNumbers.contains(lottoInstance.getWinnerLottoNumbers().get(6))) {	// 보너스 번호  맞으면 사용자의 당첨번호 라벨 이미지 바뀜
					System.out.println("보너스점수로 맞았다");
					userSelectNumberImages[userSelectNumbers.indexOf(lottoInstance.getWinnerLottoNumbers().get(6))].setIcon((ImageIcon)NumberToImages.getInstance().getNumberToImage().get(lottoInstance.getWinnerLottoNumbers().get(6) + 90));
				}
				System.out.println("결과버튼이 눌러졌습니다.");
			}
				///////////////////////// 1등 ~6등 ///////////////////////////
		    if(count == 6) {
		    	System.out.println("1등");
		    	rankResult.setText("1등");
		    }
		    if(count == 5 && userSelectNumbers.contains(lottoInstance.getWinnerLottoNumbers().get(6))) {
		    	System.out.println("2등");
		    	rankResult.setText("2등");
		    }
		    if(count == 5) {
		    	System.out.println("3등");
		    	rankResult.setText("3등");
		    }
		    if(count == 4) {
		    	System.out.println("4등");
		    	rankResult.setText("4등");
		    }
		    if(count == 3) {
		    	System.out.println("5등");
		    	rankResult.setText("5등");
		    }
		    if(count <= 2) {
		    	System.out.println("낙첨");
		    	rankResult.setText("낙첨");
		    }
		    ///////////////////////// 1등 ~6등 ///////////////////////////
		}
	});
	pnl.add(rankResult);
	pnl.add(resultButton);
	
	//////////////////////////////////////// 맞은 번호 색칠되기  끝 /////////////////////////////////////////////
	
	
	//----------------------------- 등수 매기기 마지막 ---------------------------------------//	
	add(pnl);
	
	setSize(500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}

	
	public static void main(String[] args) {
		new Lotto().setVisible(true);
	
        
	}
}

