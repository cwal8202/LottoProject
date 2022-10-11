import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class UserChoiceNumber extends JFrame {
//	Lotto lo = new Lotto();
	int count = 0;

	static boolean cou = false;

	List<Integer> finalUserNumbersList1;
	List<Integer> finalUserNumbersList2;
	List<Integer> finalUserNumbersList3;
	List<Integer> finalUserNumbersList4;
	List<Integer> finalUserNumbersList5;
	/////// 연습추가 /////
	JButton nextButton;

	////////// 1등버튼////////
	public JButton winnerButton;
	////////// 1등버튼///////

	public JButton getNextButton() {
		return nextButton;
	}

	/////// 연습추가끝 /////
	public List<Integer> getFinalUserNumbersList1() {
		return finalUserNumbersList1;
	}

	public List<Integer> getFinalUserNumbersList2() {
		return finalUserNumbersList2;
	}

	public List<Integer> getFinalUserNumbersList3() {
		return finalUserNumbersList3;
	}

	public List<Integer> getFinalUserNumbersList4() {
		return finalUserNumbersList4;
	}

	public List<Integer> getFinalUserNumbersList5() {
		return finalUserNumbersList5;
	}

	public UserChoiceNumber() {
		super("번호 선택 창");
		setResizable(false);

//      lottoChoice[] lottochoiceList = new lottoChoice[5];
		lottoChoice lottochoice1 = new lottoChoice();
		lottoChoice lottochoice2 = new lottoChoice();
		lottoChoice lottochoice3 = new lottoChoice();
		lottoChoice lottochoice4 = new lottoChoice();
		lottoChoice lottochoice5 = new lottoChoice();

//      List<Integer>[] finalUserNumbersListAll = new ArrayList<Integer>(lottochoice[].getUserGetLottoNumbers());

		finalUserNumbersList1 = new ArrayList<Integer>(lottochoice1.getUserGetLottoNumbers());
		finalUserNumbersList2 = new ArrayList<Integer>(lottochoice2.getUserGetLottoNumbers());
		finalUserNumbersList3 = new ArrayList<Integer>(lottochoice3.getUserGetLottoNumbers());
		finalUserNumbersList4 = new ArrayList<Integer>(lottochoice4.getUserGetLottoNumbers());
		finalUserNumbersList5 = new ArrayList<Integer>(lottochoice5.getUserGetLottoNumbers());

		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = UserChoiceNumber.class.getClassLoader().getResource("lottoimage/finalLo3.png");
		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(800, 1200, Image.SCALE_FAST));
		ImagePanel imgPanel = new ImagePanel(new ImageIcon(url).getImage());
		imgPanel.setBackground(Color.WHITE);

		URL urlBingo = lottoChoice.class.getClassLoader().getResource("lottoimage/bingo.png");
		ImageIcon imageBingo = new ImageIcon(kit.getImage(urlBingo).getScaledInstance(200, 200, Image.SCALE_SMOOTH));

		JPanel panel = new JPanel();
//      JPanel pnl = new JPanel();
		imgPanel.setBounds(0, 0, 802, 1061);

		JLabel cash = new JLabel("0원");

		//////////////////////////////////////////////////// PanelAll시작/////////////////////////////////////////////////////////
		JPanel PanelA = new JPanel();
		PanelA.setBackground(Color.WHITE);
		PanelA.setBounds(174, 456, 447, 60);
		JPanel PanelB = new JPanel();
		PanelB.setBackground(Color.WHITE);
		PanelB.setBounds(174, 526, 447, 60);
		JPanel PanelC = new JPanel();
		PanelC.setBackground(Color.WHITE);
		PanelC.setBounds(174, 596, 447, 60);
		JPanel PanelD = new JPanel();
		PanelD.setBackground(Color.WHITE);
		PanelD.setBounds(174, 666, 447, 60);
		JPanel PanelE = new JPanel();
		PanelE.setBackground(Color.WHITE);
		PanelE.setBounds(174, 736, 447, 60);

		PanelA.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
		PanelB.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
		PanelC.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
		PanelD.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
		PanelE.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));

		JLabel userChoiceNumbersImages1[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages1.length; i++) {
			userChoiceNumbersImages1[i] = new JLabel();
			PanelA.add(userChoiceNumbersImages1[i]);
		}

		lottochoice1.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(
						"lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice1.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice1.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList1.add(lottochoice1.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList1에 값이 들어갔을까?" + finalUserNumbersList1);
				for (int i = 0; i < lottochoice1.getUserGetLottoNumbers().size(); i++) {
//               userChoiceNumbersImages1[i].setText(" lottoChoice 숫자 = " + lottochoice1.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages1[i].setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage()
							.get(lottochoice1.getUserGetLottoNumbers().get(i)));
				}
				if (count < 1) {
					count++;
				}
				cash.setText((count * 1000) + "원");
				panel.add(cash);
			}
		});

		JLabel userChoiceNumbersImages2[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages2.length; i++) {
			userChoiceNumbersImages2[i] = new JLabel();
			PanelB.add(userChoiceNumbersImages2[i]);
		}

		lottochoice2.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(
						"lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice2.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice2.getUserGetLottoNumbers().size(); i++) {
					getFinalUserNumbersList2().add(lottochoice2.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList2에 값이 들어갔을까?" + getFinalUserNumbersList2());
				for (int i = 0; i < lottochoice2.getUserGetLottoNumbers().size(); i++) {
//               userChoiceNumbersImages2[i].setText(" lottoChoice 숫자 = " + lottochoice2.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages2[i].setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage()
							.get(lottochoice2.getUserGetLottoNumbers().get(i)));
				}
				if (count < 2) {
					count++;
				}
				cash.setText((count * 1000) + "원");
				panel.add(cash);
			}
		});

		JLabel userChoiceNumbersImages3[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages3.length; i++) {
			userChoiceNumbersImages3[i] = new JLabel();
			PanelC.add(userChoiceNumbersImages3[i]);
		}

		lottochoice3.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(
						"lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice3.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice3.getUserGetLottoNumbers().size(); i++) {
					getFinalUserNumbersList3().add(lottochoice3.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList3에 값이 들어갔을까?" + getFinalUserNumbersList3());
				for (int i = 0; i < lottochoice3.getUserGetLottoNumbers().size(); i++) {
//               userChoiceNumbersImages3[i].setText(" lottoChoice 숫자 = " + lottochoice3.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages3[i].setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage()
							.get(lottochoice3.getUserGetLottoNumbers().get(i)));
				}
				if (count < 3) {
					count++;
				}
				cash.setText((count * 1000) + "원");
				panel.add(cash);
			}
		});

		JLabel userChoiceNumbersImages4[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages4.length; i++) {
			userChoiceNumbersImages4[i] = new JLabel();
			PanelD.add(userChoiceNumbersImages4[i]);
		}

		lottochoice4.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(
						"lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice4.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice4.getUserGetLottoNumbers().size(); i++) {
					getFinalUserNumbersList4().add(lottochoice4.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList4에 값이 들어갔을까?" + getFinalUserNumbersList4());
				for (int i = 0; i < lottochoice4.getUserGetLottoNumbers().size(); i++) {
//               userChoiceNumbersImages4[i].setText(" lottoChoice 숫자 = " + lottochoice4.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages4[i].setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage()
							.get(lottochoice4.getUserGetLottoNumbers().get(i)));
				}
				if (count < 4) {
					count++;
				}
				cash.setText((count * 1000) + "원");
				panel.add(cash);

			}
		});

		JLabel userChoiceNumbersImages5[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages5.length; i++) {
			userChoiceNumbersImages5[i] = new JLabel();
			PanelE.add(userChoiceNumbersImages5[i]);
		}

		lottochoice5.getCheckButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(
						"lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice5.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice5.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList5.add(lottochoice5.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList5에 값이 들어갔을까?" + finalUserNumbersList5);
				for (int i = 0; i < lottochoice5.getUserGetLottoNumbers().size(); i++) {
//               userChoiceNumbersImages5[i].setText(" lottoChoice 숫자 = " + lottochoice5.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages5[i].setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage()
							.get(lottochoice5.getUserGetLottoNumbers().get(i)));
				}
				if (count < 5) {
					count++;
				}
				cash.setText((count * 1000) + "원");
				panel.add(cash);
			}
		});
		getContentPane().setLayout(null);
		imgPanel.setLayout(null);

		imgPanel.add(PanelA);

		imgPanel.add(PanelB);
		imgPanel.add(PanelC);
		imgPanel.add(PanelD);
		imgPanel.add(PanelE);
		getContentPane().add(imgPanel);
		getContentPane().add(imgPanel);

		// 연습추가 //
		nextButton = new JButton("결과확인");
		nextButton.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		nextButton.setBackground(new Color(255, 240, 245));
		nextButton.setBounds(383, 829, 167, 45);
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러짐!");
				System.out.println("***" + "UserChoicNumber창에서 클릭한 nextButton에서 생기는 이벤트입니다. 유저가 선택한 번호는 바로 = "
						+ lottochoice1.getUserGetLottoNumbers() + "***");
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});

		//////////////////////////////////////////////////// PanelE끝/////////////////////////////////////////////////////////

		///////////////////////////// 1등 버튼 끝///////////////////////
		imgPanel.add(nextButton);

		panel.setBackground(Color.WHITE);
		panel.setBounds(204, 829, 167, 45);
		panel.setLayout(null);
		imgPanel.add(panel);

		cash.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		cash.setHorizontalAlignment(SwingConstants.CENTER);
		cash.setBounds(0, 0, 167, 45);

		panel.add(cash);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(imageBingo);
		lblNewLabel.setBounds(528, 10, 249, 261);
		imgPanel.add(lblNewLabel);

		//////////////////////////////////////////////////// PanelAll시작/////////////////////////////////////////////////////////

		//////////////////////////////////////////////////// PanelA시작/////////////////////////////////////////////////////////

		JButton lottoChoiceButton1 = new JButton("A\uC5F4 \uB85C\uB610\r\n");
		lottoChoiceButton1.setBounds(633, 456, 85, 60);
		imgPanel.add(lottoChoiceButton1);
		lottoChoiceButton1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		lottoChoiceButton1.setForeground(new Color(0, 0, 0));
		lottoChoiceButton1.setBackground(new Color(255, 240, 245));
		//////////////////////////////////////////////////// PanelA끝/////////////////////////////////////////////////////////

		//////////////////////////////////////////////////// PanelB시작/////////////////////////////////////////////////////////

		JButton lottoChoiceButton2 = new JButton("B\uC5F4 \uB85C\uB610");
		lottoChoiceButton2.setBounds(633, 526, 85, 60);
		imgPanel.add(lottoChoiceButton2);
		lottoChoiceButton2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		lottoChoiceButton2.setBackground(new Color(255, 240, 245));
		//////////////////////////////////////////////////// PanelB끝/////////////////////////////////////////////////////////

		//////////////////////////////////////////////////// PanelC시작/////////////////////////////////////////////////////////

		JButton lottoChoiceButton3 = new JButton("C\uC5F4 \uB85C\uB610");
		lottoChoiceButton3.setBounds(633, 596, 85, 60);
		imgPanel.add(lottoChoiceButton3);
		lottoChoiceButton3.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		lottoChoiceButton3.setBackground(new Color(255, 240, 245));
		//////////////////////////////////////////////////// PanelC끝/////////////////////////////////////////////////////////

		//////////////////////////////////////////////////// PanelD시작/////////////////////////////////////////////////////////

		JButton lottoChoiceButton4 = new JButton("D\uC5F4 \uB85C\uB610");
		lottoChoiceButton4.setBounds(633, 666, 85, 60);
		imgPanel.add(lottoChoiceButton4);
		lottoChoiceButton4.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		lottoChoiceButton4.setBackground(new Color(255, 240, 245));
		//////////////////////////////////////////////////// PanelD끝/////////////////////////////////////////////////////////

		//////////////////////////////////////////////////// PanelE시작/////////////////////////////////////////////////////////

		JButton lottoChoiceButton5 = new JButton("E\uC5F4 \uB85C\uB610");
		lottoChoiceButton5.setBounds(633, 736, 85, 60);
		imgPanel.add(lottoChoiceButton5);
		lottoChoiceButton5.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		lottoChoiceButton5.setBackground(new Color(255, 240, 245));

		lottoChoiceButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce5창이 켜집니다");
				lottochoice5.setVisible(true);

			}
		});

		lottoChoiceButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce4창이 켜집니다");
				lottochoice4.setVisible(true);

			}
		});

		lottoChoiceButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce3창이 켜집니다");
				lottochoice3.setVisible(true);

			}
		});

		lottoChoiceButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce2창이 켜집니다");
				lottochoice2.setVisible(true);

			}
		});

		lottoChoiceButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce창이 켜집니다");
				lottochoice1.setVisible(true);
			}
		});
////////////////////////////////////////구매하기 버튼////////////////////////////////      
		List finalUserNumbersListAll = new ArrayList();
		finalUserNumbersListAll.add(getFinalUserNumbersList1());
		finalUserNumbersListAll.add(getFinalUserNumbersList2());
		finalUserNumbersListAll.add(getFinalUserNumbersList3());
		finalUserNumbersListAll.add(getFinalUserNumbersList4());
		finalUserNumbersListAll.add(getFinalUserNumbersList5());

		JButton buyButton = new JButton("구매하기");
		buyButton.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		buyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				///////////////////// 구매버튼 눌리면 선택한 번호들이 totalNumber(List)에
				///////////////////// 들어간다./////////////////////////
				System.out.println("구매가 결정되면 데이터센터의 TotalNumList에 User의 finalUserNumbersList가 들어간다.");
				if (getFinalUserNumbersList1().size() > 0) {
					finalUserNumbersListAll.add(getFinalUserNumbersList1());
					DataCenter.getInstance().getMyInfo().getTotalNumlist().put(1, finalUserNumbersListAll);
					System.out.println("데이터 센터 TotalNumlist에 들어간 1회차 1번째줄 UserLottoNumbers는 = "
							+ DataCenter.getInstance().getMyInfo().getTotalNumlist());
				}
				if (getFinalUserNumbersList2().size() > 0) {
					finalUserNumbersListAll.add(getFinalUserNumbersList2());
					DataCenter.getInstance().getMyInfo().getTotalNumlist().put(1, finalUserNumbersListAll);
					System.out.println("데이터 센터 TotalNumlist에 들어간 1회차 2번째줄 UserLottoNumbers는 = "
							+ DataCenter.getInstance().getMyInfo().getTotalNumlist());
				}
				if (getFinalUserNumbersList3().size() > 0) {
					finalUserNumbersListAll.add(getFinalUserNumbersList3());
					DataCenter.getInstance().getMyInfo().getTotalNumlist().put(1, finalUserNumbersListAll);
					System.out.println("데이터 센터 TotalNumlist에 들어간 1회차 3번째줄 UserLottoNumbers는 = "
							+ DataCenter.getInstance().getMyInfo().getTotalNumlist());
				}
				if (getFinalUserNumbersList4().size() > 0) {
					finalUserNumbersListAll.add(getFinalUserNumbersList4());
					DataCenter.getInstance().getMyInfo().getTotalNumlist().put(1, finalUserNumbersListAll);
					System.out.println("데이터 센터 TotalNumlist에 들어간 1회차 4번째줄 UserLottoNumbers는 = "
							+ DataCenter.getInstance().getMyInfo().getTotalNumlist());
				}
				if (getFinalUserNumbersList5().size() > 0) {
					finalUserNumbersListAll.add(getFinalUserNumbersList5());
					DataCenter.getInstance().getMyInfo().getTotalNumlist().put(1, finalUserNumbersListAll);
					System.out.println("데이터 센터 TotalNumlist에 들어간 1회차 5번째줄 UserLottoNumbers는 = "
							+ DataCenter.getInstance().getMyInfo().getTotalNumlist());
				}
				
				if (WinnerCreate.gamecount > 0) {
					cou = true;
					DataCenter.getInstance().getMyInfo().setMembercheck(cou);
				}
			}
		});

//		lo.getMyPageBtn().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
		buyButton.setBackground(new Color(255, 240, 245));
		buyButton.setBounds(562, 829, 157, 45);
		imgPanel.add(buyButton);

////////////////////////////////////////////구매하기 버튼/////////////////////////////////////

		setSize(800, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new UserChoiceNumber().setVisible(true);
	}
}