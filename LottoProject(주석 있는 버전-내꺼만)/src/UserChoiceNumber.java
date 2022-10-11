import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserChoiceNumber extends JFrame {
	List<Integer> finalUserNumbersList;
	List<Integer> finalUserNumbersList2;
	List<Integer> finalUserNumbersList3;
	List<Integer> finalUserNumbersList4;
	List<Integer> finalUserNumbersList5;
	/////// 연습추가 /////
	JButton nextButton;
	
	public JButton getNextButton() {
		return nextButton;
	}
	/////// 연습추가끝 /////
	public List<Integer> getFinalUserNumbersList() {
		return finalUserNumbersList;
	}

	public UserChoiceNumber() {
		NumberToImages numberToImages = new NumberToImages();
		
		lottoChoice lottochoice = new lottoChoice();	// 로또 번호 입력창
		lottoChoice lottochoice2 = new lottoChoice();	// 로또 번호 입력창
		lottoChoice lottochoice3 = new lottoChoice();	// 로또 번호 입력창
		lottoChoice lottochoice4 = new lottoChoice();	// 로또 번호 입력창
		lottoChoice lottochoice5 = new lottoChoice();	// 로또 번호 입력창
		finalUserNumbersList = new ArrayList<Integer>(lottochoice.getUserGetLottoNumbers()); // 선택or자동선택 번호 6개 들어가는 List
		finalUserNumbersList2 = new ArrayList<Integer>(lottochoice.getUserGetLottoNumbers()); // 선택or자동선택 번호 6개 들어가는 List
		finalUserNumbersList3 = new ArrayList<Integer>(lottochoice.getUserGetLottoNumbers()); // 선택or자동선택 번호 6개 들어가는 List
		finalUserNumbersList4 = new ArrayList<Integer>(lottochoice.getUserGetLottoNumbers()); // 선택or자동선택 번호 6개 들어가는 List
		finalUserNumbersList5 = new ArrayList<Integer>(lottochoice.getUserGetLottoNumbers()); // 선택or자동선택 번호 6개 들어가는 List
		JPanel pnl = new JPanel();
		
		// 연습추가 //
		nextButton = new JButton("연습버튼 => 클릭시  Lotto로 넘어감");
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러짐!");
				System.out.println("***" + "UserChoicNumber창에서 클릭한 nextButton에서 생기는 이벤트입니다. 유저가 선택한 번호는 바로 = " + lottochoice.getUserGetLottoNumbers() + "***");
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		pnl.add(nextButton);
		// 연습추가 끝//
///----------------------------------------------------** 5개 만드는 작업 **---------------------------------------------------////		
		
		JLabel userChoiceNumbersImages[] = new JLabel[6];	// A(천원치)줄에 들어가는 숫자 이미지
		for (int i = 0; i < userChoiceNumbersImages.length; i++) {
			userChoiceNumbersImages[i] = new JLabel("천원치 lottoChoice 숫자" + i + "번이 들어갈 자리");
			pnl.add(userChoiceNumbersImages[i]);
		}
		
		JLabel userChoiceNumbersImages2[] = new JLabel[6];	// B(2천원치)줄에 들어가는 숫자 이미지
		for (int i = 0; i < userChoiceNumbersImages2.length; i++) {
			userChoiceNumbersImages2[i] = new JLabel("2천원치 lottoChoice 숫자" + i + "번이 들어갈 자리");
			pnl.add(userChoiceNumbersImages2[i]);
		}
		
		JLabel userChoiceNumbersImages3[] = new JLabel[6];	// B(2천원치)줄에 들어가는 숫자 이미지
		for (int i = 0; i < userChoiceNumbersImages3.length; i++) {
			userChoiceNumbersImages3[i] = new JLabel("3천원치 lottoChoice 숫자" + i + "번이 들어갈 자리");
			pnl.add(userChoiceNumbersImages3[i]);
		}
		
		JLabel userChoiceNumbersImages4[] = new JLabel[6];	// B(2천원치)줄에 들어가는 숫자 이미지
		for (int i = 0; i < userChoiceNumbersImages4.length; i++) {
			userChoiceNumbersImages4[i] = new JLabel("4천원치 lottoChoice 숫자" + i + "번이 들어갈 자리");
			pnl.add(userChoiceNumbersImages4[i]);
		}
		
		JLabel userChoiceNumbersImages5[] = new JLabel[6];	// B(2천원치)줄에 들어가는 숫자 이미지
		for (int i = 0; i < userChoiceNumbersImages5.length; i++) {
			userChoiceNumbersImages5[i] = new JLabel("5천원치 lottoChoice 숫자" + i + "번이 들어갈 자리");
			pnl.add(userChoiceNumbersImages5[i]);
		}
		
	//	JLabel lbl = new JLabel("ddd");
//		JLabel lbl1 = new JLabel("ddd");
//		JLabel lbl2 = new JLabel("ddd");
//		JLabel lbl3 = new JLabel("ddd");
//		JLabel lbl4 = new JLabel("ddd");
//		JLabel lbl5 = new JLabel("ddd");
		
//////////////////////////////////////////////////// lottoChoice창으로 넘어가기 //////////////////////////////////////////////////////////		
		JButton lottoChoiceButton = new JButton("lottoChoiceButton");

		lottoChoiceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce창이 켜집니다");
				lottochoice.setVisible(true);
			}
		});
		
		JButton lottoChoiceButton2 = new JButton("lottoChoiceButton2");

		lottoChoiceButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce2창이 켜집니다");
				lottochoice2.setVisible(true);
			}
		});
		
		JButton lottoChoiceButton3 = new JButton("lottoChoiceButton3");

		lottoChoiceButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce3창이 켜집니다");
				lottochoice3.setVisible(true);
			}
		});
		
		JButton lottoChoiceButton4 = new JButton("lottoChoiceButton4");

		lottoChoiceButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce4창이 켜집니다");
				lottochoice4.setVisible(true);
			}
		});
		
		JButton lottoChoiceButton5 = new JButton("lottoChoiceButton5");

		lottoChoiceButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce2창이 켜집니다");
				lottochoice5.setVisible(true);
			}
		});
		
		pnl.add(lottoChoiceButton);
		pnl.add(lottoChoiceButton2);
		pnl.add(lottoChoiceButton3);
		pnl.add(lottoChoiceButton4);
		pnl.add(lottoChoiceButton5);
		
		///----------------------------------------------------** 5개 만드는 작업 마지막**---------------------------------------------------////				
		
////////////////////////////////////////////////////lottoChoice창으로 넘어가기 끝 //////////////////////////////////////////////////////////			
		
		lottochoice.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList.add(lottochoice.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList에 값이 들어갔을까?" + finalUserNumbersList);
				for (int i = 0; i < lottochoice.getUserGetLottoNumbers().size(); i++) {
					userChoiceNumbersImages[i].setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice.getUserGetLottoNumbers().get(i)));
				}
				
//				lbl1.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(1));
//				lbl2.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(2));
//				lbl3.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(3));
//				lbl4.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(4));
//				lbl4.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(5));

	//			lbl.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(0)));
//				lbl1.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(1)));
//				lbl2.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(2)));
//				lbl3.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(3)));
//				lbl4.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(4)));
//				lbl5.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(5)));
			}
		});
		
		lottochoice2.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice2에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice2의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice2.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice2.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList2.add(lottochoice2.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList2에 값이 들어갔을까?" + finalUserNumbersList2);
				for (int i = 0; i < lottochoice2.getUserGetLottoNumbers().size(); i++) {
					userChoiceNumbersImages2[i].setText(" lottoChoice2 숫자 = " + lottochoice2.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages2[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice2.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice3.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice3에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice3의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice3.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice3.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList3.add(lottochoice3.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList3에 값이 들어갔을까?" + finalUserNumbersList3);
				for (int i = 0; i < lottochoice3.getUserGetLottoNumbers().size(); i++) {
					userChoiceNumbersImages3[i].setText(" lottoChoice3 숫자 = " + lottochoice3.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages3[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice3.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice4.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice4에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice4의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice4.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice4.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList4.add(lottochoice4.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList4에 값이 들어갔을까?" + finalUserNumbersList4);
				for (int i = 0; i < lottochoice4.getUserGetLottoNumbers().size(); i++) {
					userChoiceNumbersImages4[i].setText(" lottoChoice4 숫자 = " + lottochoice4.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages4[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice4.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice5.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice5에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice5의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice5.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice5.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList2.add(lottochoice5.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList5에 값이 들어갔을까?" + finalUserNumbersList5);
				for (int i = 0; i < lottochoice5.getUserGetLottoNumbers().size(); i++) {
					userChoiceNumbersImages5[i].setText(" lottoChoice5 숫자 = " + lottochoice5.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages5[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice5.getUserGetLottoNumbers().get(i)));
				}
			}
		});
//		lottochoice.getPractice().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println( "lottochoic에서 가져온 숫자는 = " + lottochoice.getUserGetLottoNumbers());
//			}
//		});
	
		
	/////////////////////////////1등 버튼 시작///////////////////////	
//	JButton winner1 = new JButton("1등 버튼");	
//	JButton winner2 = new JButton("2등 버튼");	
//	JButton winner3 = new JButton("3등 버튼");	
//	JButton winner4 = new JButton("4등 버튼");	
//	JButton winner5 = new JButton("5등 버튼");	
//	
//	winner1.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			finalUserNumbersList.add();
//		}
//	});
		
	/////////////////////////////1등 버튼 끝///////////////////////	
		
		
		
		add(pnl);
		
		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UserChoiceNumber().setVisible(true);
	}
}
