import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lotto extends JFrame {
	Main m = new Main();
	int click = 0;
	public JPanel pnl;
//   private JButton resultButton1; // 유저의 번호와 당첨번호 비교하는 버튼
//   private JButton resultButton2;
//   private JButton resultButton3;
//   private JButton resultButton4;
//   private JButton resultButton5;

	private JLabel[] userSelectNumberImages1; // 유저가 선택한 번호의 이미지가 들어오는 Label 배열
	private JLabel[] userSelectNumberImages2;
	private JLabel[] userSelectNumberImages3;
	private JLabel[] userSelectNumberImages4;
	private JLabel[] userSelectNumberImages5;

	private List<Integer> userSelectNumbers1; // 유저가 선택한 번호가 들어가는 int배열
	private List<Integer> userSelectNumbers2;
	private List<Integer> userSelectNumbers3;
	private List<Integer> userSelectNumbers4;
	private List<Integer> userSelectNumbers5;

	// private JButton[] resultButtonList;

	private JLabel[] rankResultList;
	private List<String> rankResultText;
	public List rankResultTextAll = new ArrayList<>();
	private JButton myPageBtn;

	public JButton getMyPageBtn() {
		return myPageBtn;
	}

	public List<Integer> getUserSelectNumbers1() {
		return userSelectNumbers1;
	}

	public List<Integer> getUserSelectNumbers2() {
		return userSelectNumbers2;
	}

	public List<Integer> getUserSelectNumbers3() {
		return userSelectNumbers3;
	}

	public List<Integer> getUserSelectNumbers4() {
		return userSelectNumbers4;
	}

	public List<Integer> getUserSelectNumbers5() {
		return userSelectNumbers5;
	}

	public JLabel[] getUserSelectNumberImages1() {
		return userSelectNumberImages1;
	}

	public JLabel[] getUserSelectNumberImages2() {
		return userSelectNumberImages2;
	}

	public JLabel[] getUserSelectNumberImages3() {
		return userSelectNumberImages3;
	}

	public JLabel[] getUserSelectNumberImages4() {
		return userSelectNumberImages4;
	}

	public JLabel[] getUserSelectNumberImages5() {
		return userSelectNumberImages5;
	}

	public JPanel getPnl() {
		return pnl;
	}

	public Lotto() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = Lotto.class.getClassLoader().getResource("lottoimage/img.jpg");
		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		ImagePanel imgPanel = new ImagePanel(new ImageIcon(url).getImage());

		URL urlTrophy = Lotto.class.getClassLoader().getResource("lottoimage/trophy.png");
		ImageIcon Throphy = new ImageIcon(kit.getImage(urlTrophy).getScaledInstance(70, 70, Image.SCALE_SMOOTH));

		URL urlTrophy2 = Lotto.class.getClassLoader().getResource("lottoimage/trophy(1).png");
		ImageIcon Throphy2 = new ImageIcon(kit.getImage(urlTrophy2).getScaledInstance(70, 70, Image.SCALE_SMOOTH));

		URL urlTrophy3 = Lotto.class.getClassLoader().getResource("lottoimage/trophy(2).png");
		ImageIcon Throphy3 = new ImageIcon(kit.getImage(urlTrophy3).getScaledInstance(70, 70, Image.SCALE_SMOOTH));
		
//		URL urlTrophy4 = Lotto.class.getClassLoader().getResource("lottoimage/game-over.png.png");
//		ImageIcon Throphy4 = new ImageIcon(kit.getImage(urlTrophy).getScaledInstance(70, 70, Image.SCALE_SMOOTH));
//		
//		URL urlTrophy5 = Lotto.class.getClassLoader().getResource("lottoimage/game-over.png.png");
//		ImageIcon Throphy5 = new ImageIcon(kit.getImage(urlTrophy).getScaledInstance(70, 70, Image.SCALE_SMOOTH));
//		
//		URL urlTrophy6 = Lotto.class.getClassLoader().getResource("lottoimage/game-over.png.png");
//		ImageIcon Throphy6 = new ImageIcon(kit.getImage(urlTrophy6).getScaledInstance(70, 70, Image.SCALE_SMOOTH));

		pnl = new JPanel();
		pnl.setBackground(new Color(0, 191, 255));
		pnl.setLayout(null);
		// ----------------------------제목------------------------------------------------//

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(107, 10, 600, 80);

		JLabel winnerNumberTitle = new JLabel();
		winnerNumberTitle.setBounds(163, 10, 480, 60);
		// getContentPane().add(winnerNumberTitle);
		winnerNumberTitle.setIcon(Throphy);

		panel.add(winnerNumberTitle);
		// ----------------------------제목
		// 끝------------------------------------------------//
		WinnerCreate winnerCreate = WinnerCreate.getInstance(); // 당첨 번호 호출

		UserLottoData.getInstance().setWinnerNumbers(winnerCreate.getInstance().getWinnumList().get(1)); // 당첨번호를
																											// UserLottoData에
																											// 넣었다.
		System.out.println(winnerCreate.getInstance().getWinnumList().get(1).get(6));
		System.out.println("당첨번호가 WinnerNumbers데이터에 들어갔습니다." + UserLottoData.getInstance().getWinnerNumbers());

		// ----------------------------1등 랜덤 숫자
		// 출력------------------------------------------------//

		System.out.println("당첨번호 첫번째는" + (winnerCreate.getInstance().getWinnumList().get(1).get(0))); // LottoNumber의
																										// 당첨번호 확인할려고
																										// 출력함.
		HashMap map = new HashMap();

		// image == map.get("a"); 처음에 JLabel의 생성자에 ImageIcon을 Value로 가지는 map.get("a")를
		// 넣었더니 JLabel은 Object를
		// 가지는 생성자는 없다면서 오류가 났다. 그래서 map.get("a")를 형변환 (ImageIcon)map.get("a") 이걸로 변환했더니
		// 적용이 되었다.
//      JLabel[] lblAll = new JLabel[7];
//      for (int i = 0; i < lblAll.length; i++) {
//         lblAll[i] = new JLabel((ImageIcon) NumberToImages.getInstance().getNumberToImage().get((int)winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
//         panel.add(lblAll[i]);
//      }

		//////////////////////////////////
		JLabel[] lblAll = new JLabel[7];
		for (int i = 0; i < 6; i++) {
			lblAll[i] = new JLabel((ImageIcon) NumberToImages.getInstance().getNumberToImage()
					.get((int) winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
	         lblAll[i].setHorizontalTextPosition(0); // 글자를 이미지와 같은 위치에 뒀다.
	         lblAll[i].setForeground(new Color(0, 0, 0, 0)); // 글자의 색깔을 투명하게 바꿨다.
			panel.add(lblAll[i]);
		}

		JLabel lblHi = new JLabel();
		lblHi.setIcon(new ImageIcon("resource/image/하이픈.png"));
		panel.add(lblHi);
		lblAll[6] = new JLabel((ImageIcon) NumberToImages.getInstance().getNumberToImage()
				.get((int) winnerCreate.getInstance().getWinnumList().get(1).get(6) + 90));
		panel.add(lblAll[6]);

		JLabel winnerNumberTitle2 = new JLabel();
		winnerNumberTitle2.setBounds(163, 10, 480, 200);
		// getContentPane().add(winnerNumberTitle);
		winnerNumberTitle2.setIcon(Throphy);
		panel.add(winnerNumberTitle2);

		// 배열 반복으로 가능하다.....!

		// ---------------------------1등 랜덤 숫자 출력
		// 마지막-----------------------------------------------------//

		// ---------------------------사용자 수 가져오기 시작
		// ----------------------------------------------------//
		userSelectNumbers1 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers2 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers3 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers4 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers5 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.

		JPanel userSelectNumberImages1pnl = new JPanel();
		userSelectNumberImages1pnl.setBackground(new Color(255, 255, 255));
		userSelectNumberImages1pnl.setBounds(37, 178, 630, 90);

		JPanel userSelectNumberImages2pnl = new JPanel();
		userSelectNumberImages2pnl.setBackground(new Color(255, 255, 255));
		userSelectNumberImages2pnl.setBounds(37, 278, 630, 90);

		JPanel userSelectNumberImages3pnl = new JPanel();
		userSelectNumberImages3pnl.setBackground(new Color(255, 255, 255));
		userSelectNumberImages3pnl.setBounds(37, 378, 630, 90);

		JPanel userSelectNumberImages4pnl = new JPanel();
		userSelectNumberImages4pnl.setBackground(new Color(255, 255, 255));
		userSelectNumberImages4pnl.setBounds(37, 478, 630, 90);

		JPanel userSelectNumberImages5pnl = new JPanel();
		userSelectNumberImages5pnl.setBackground(new Color(255, 255, 255));
		userSelectNumberImages5pnl.setBounds(37, 578, 630, 90);

		userSelectNumberImages1 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages1.length; i++) {
			userSelectNumberImages1[i] = new JLabel();
			userSelectNumberImages1pnl.add(userSelectNumberImages1[i]);
		}
		userSelectNumberImages2 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages2.length; i++) {
			userSelectNumberImages2[i] = new JLabel();
			userSelectNumberImages2pnl.add(userSelectNumberImages2[i]);
		}
		userSelectNumberImages3 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages3.length; i++) {
			userSelectNumberImages3[i] = new JLabel();
			userSelectNumberImages3pnl.add(userSelectNumberImages3[i]);
		}
		userSelectNumberImages4 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages4.length; i++) {
			userSelectNumberImages4[i] = new JLabel();
			userSelectNumberImages4pnl.add(userSelectNumberImages4[i]);
		}
		userSelectNumberImages5 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages5.length; i++) {
			userSelectNumberImages5[i] = new JLabel();
			userSelectNumberImages5pnl.add(userSelectNumberImages5[i]);
		}
		// 메인페이지를 작동시키면 userSelectNumbers[i]에 UserChoiceNumber의 번호이미지를 가져 올 것이다.
		// UserChoiceNumber의 번호는 userChoiceNumber.getFinalUserNumbersList().get(i)로
		// 가져온다.

		// ---------------------------사용자 수 가져오기 마지막
		// ----------------------------------------------------//
		//////////////////////////////////////// 맞은 번호 색칠되기
		//////////////////////////////////////// /////////////////////////////////////////////

		rankResultList = new JLabel[5];
		for (int i = 0; i < rankResultList.length; i++) {
			rankResultList[i] = new JLabel("나의 등수는?!");
		}

//      resultButtonList = new JButton[5];
		rankResultText = new ArrayList<String>();

		JLabel resultLbl1 = new JLabel();
		resultLbl1.setIcon(Throphy);

		JLabel resultLbl2 = new JLabel();
		resultLbl2.setIcon(Throphy2);

		JLabel resultLbl3 = new JLabel();
		resultLbl3.setIcon(Throphy3);
		
//		JLabel resultLbl4 = new JLabel();
//		resultLbl4.setIcon(urlTrophy6);
//		
//		JLabel resultLbl5 = new JLabel();
//		resultLbl5.setIcon();
		
//		JLabel resultLbl6 = new JLabel();
//		resultLbl6.setIcon(Throphy6);

//      JButton resultButton1 = new JButton();
//      JButton resultButton2 = new JButton();
//      JButton resultButton3 = new JButton();
//      JButton resultButton4 = new JButton();
//      JButton resultButton5 = new JButton();

//      for (int i = 0; i < resultButtonList.length; i++) {
//         resultButtonList[i] = new JButton((i + 1) + "번째 결과 버튼");
//         resultButtonList[i].setBackground(new Color(255, 255, 255));
//         resultButtonList[i].addActionListener(resultButtonAction);
//      }
		// ==================================================================== 2번
		// =======================================//
//            ///////////////////////// 1등 ~6등 ///////////////////////////
//         }
//      });

		userSelectNumberImages1pnl.add(rankResultList[0]);
		userSelectNumberImages2pnl.add(rankResultList[1]);
		userSelectNumberImages3pnl.add(rankResultList[2]);
		userSelectNumberImages4pnl.add(rankResultList[3]);
		userSelectNumberImages5pnl.add(rankResultList[4]);
		pnl.add(userSelectNumberImages1pnl);
		pnl.add(userSelectNumberImages2pnl);
		pnl.add(userSelectNumberImages3pnl);
		pnl.add(userSelectNumberImages4pnl);
		pnl.add(userSelectNumberImages5pnl);

//      for (int i = 0; i < 5; i++) {
//         pnl.add([i]);
//      }
		getContentPane().add(pnl);
		getContentPane().add(pnl);

		pnl.add(panel);

		//////////////////////////////////////// 맞은 번호 색칠되기 끝
		//////////////////////////////////////// /////////////////////////////////////////////

		// ----------------------------- 등수 매기기 마지막
		// ---------------------------------------//

		JButton resultButton1 = new JButton("결과 확인");
		resultButton1.setFont(new Font("휴먼모음T", Font.BOLD, 17));
		resultButton1.setBounds(679, 199, 123, 50);
		pnl.add(resultButton1);

		JButton resultButton2 = new JButton("결과 확인");
		resultButton2.setFont(new Font("휴먼모음T", Font.BOLD, 17));
		resultButton2.setBounds(679, 295, 123, 50);
		pnl.add(resultButton2);

		JButton resultButton3 = new JButton("결과 확인");
		resultButton3.setFont(new Font("휴먼모음T", Font.BOLD, 17));
		resultButton3.setBounds(679, 401, 123, 50);
		pnl.add(resultButton3);

		JButton resultButton4 = new JButton("결과 확인");
		resultButton4.setFont(new Font("휴먼모음T", Font.BOLD, 17));
		resultButton4.setBounds(679, 495, 123, 50);
		pnl.add(resultButton4);

		JButton resultButton5 = new JButton("결과 확인");
		resultButton5.setFont(new Font("휴먼모음T", Font.BOLD, 17));
		resultButton5.setBounds(679, 596, 123, 50);
		pnl.add(resultButton5);

		myPageBtn = new JButton("MyPageBtn");
		myPageBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		myPageBtn.setBounds(648, 708, 154, 50);
		pnl.add(myPageBtn);

		resultButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers5.size());
				for (int i = 0; i < userSelectNumbers5.size(); i++) {
					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers5.get(i));
					System.out.println(
							"1등 번호의" + i + "번째 번호는 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i));
					if (userSelectNumbers5.contains(winnerCreate.getInstance().getWinnumList().get(1).get(i))) { // 당첨
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("맞은 번호 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i)); // 사용자번호와
																													// 당첨번호가
																													// 같으면
																													// 당첨번호를
																													// 출력하게
						// 했다.
						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
						System.out.println("맞은번호는 유저의 몇번째 번호인가? = "
								+ userSelectNumbers5.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i)));
						userSelectNumberImages5[userSelectNumbers5
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
						count++;
					}
					if (userSelectNumbers5.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) { // 보너스
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("보너스점수로 맞았다");
						userSelectNumberImages5[userSelectNumbers5
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(6))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(6) + 90));
					}
					System.out.println("결과버튼이 눌러졌습니다.");
				}
				///////////////////////// 1등 ~6등 ///////////////////////////
				if (count == 6) {
					System.out.println("1등");
					rankResultList[4].setText("1등");
					rankResultText.add("1등");
					userSelectNumberImages5pnl.add(resultLbl1);
				}
				if (count == 5
						&& userSelectNumbers5.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) {
					System.out.println("2등");
					rankResultList[4].setText("2등");
					rankResultText.add("2등");
					userSelectNumberImages5pnl.add(resultLbl2);
				}
				if (count == 5) {
					System.out.println("3등");
					rankResultList[4].setText("3등");
					rankResultText.add("3등");
					userSelectNumberImages5pnl.add(resultLbl3);
				}
				if (count == 4) {
					System.out.println("4등");
					rankResultList[4].setText("4등");
					rankResultText.add("4등");
				}
				if (count == 3) {
					System.out.println("5등");
					rankResultList[4].setText("5등");
					rankResultText.add("5등");
				}
				if (count <= 2) {
					System.out.println("낙첨");
					rankResultList[4].setText("낙첨");
					rankResultText.add("낙첨");
//					userSelectNumberImages5pnl.add(resultLbl6);
				}

				//// 유저의 1번줄 랭킹 끝////
				rankResultTextAll.add(rankResultText);
				DataCenter.getInstance().getMyInfo().getUserRankingList().put(1, rankResultTextAll);
				System.out.println("데이터에 담긴 유저의 첫줄 랭킹은 = " + DataCenter.getInstance().getMyInfo().getUserRankingList());
				//// 유저의 1번줄 랭킹 끝////

				///////////////////////// 1등 ~6등 ///////////////////////////
			}
		});

		resultButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers4.size());
				for (int i = 0; i < userSelectNumbers4.size(); i++) {
					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers4.get(i));
					System.out.println(
							"1등 번호의" + i + "번째 번호는 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i));
					if (userSelectNumbers4.contains(winnerCreate.getInstance().getWinnumList().get(1).get(i))) { // 당첨
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("맞은 번호 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i)); // 사용자번호와
																													// 당첨번호가
																													// 같으면
																													// 당첨번호를
																													// 출력하게
						// 했다.
						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
						System.out.println("맞은번호는 유저의 몇번째 번호인가? = "
								+ userSelectNumbers4.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i)));
						userSelectNumberImages4[userSelectNumbers4
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
						count++;
					}
					if (userSelectNumbers4.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) { // 보너스
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("보너스점수로 맞았다");
						userSelectNumberImages4[userSelectNumbers4
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(6))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(6) + 90));
					}
					System.out.println("결과버튼이 눌러졌습니다.");
				}
				///////////////////////// 1등 ~6등 ///////////////////////////
				if (count == 6) {
					System.out.println("1등");
					rankResultList[3].setText("1등");
					rankResultText.add("1등");
					userSelectNumberImages4pnl.add(resultLbl1);
				}
				if (count == 5
						&& userSelectNumbers4.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) {
					System.out.println("2등");
					rankResultList[3].setText("2등");
					rankResultText.add("2등");
					userSelectNumberImages4pnl.add(resultLbl2);
				}
				if (count == 5) {
					System.out.println("3등");
					rankResultList[3].setText("3등");
					rankResultText.add("3등");
					userSelectNumberImages4pnl.add(resultLbl3);
				}
				if (count == 4) {
					System.out.println("4등");
					rankResultList[3].setText("4등");
					rankResultText.add("4등");
				}
				if (count == 3) {
					System.out.println("5등");
					rankResultList[3].setText("5등");
					rankResultText.add("5등");
				}
				if (count <= 2) {
					System.out.println("낙첨");
					rankResultList[3].setText("낙첨");
					rankResultText.add("낙첨");
//					userSelectNumberImages4pnl.add(resultLbl6);
				}

				//// 유저의 1번줄 랭킹 끝////
				rankResultTextAll.add(rankResultText);
				DataCenter.getInstance().getMyInfo().getUserRankingList().put(1, rankResultTextAll);
				System.out.println("데이터에 담긴 유저의 첫줄 랭킹은 = " + DataCenter.getInstance().getMyInfo().getUserRankingList());
				//// 유저의 1번줄 랭킹 끝////

				///////////////////////// 1등 ~6등 ///////////////////////////
			}
		});

		resultButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers3.size());
				for (int i = 0; i < userSelectNumbers3.size(); i++) {
					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers3.get(i));
					System.out.println(
							"1등 번호의" + i + "번째 번호는 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i));
					if (userSelectNumbers3.contains(winnerCreate.getInstance().getWinnumList().get(1).get(i))) { // 당첨
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("맞은 번호 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i)); // 사용자번호와
																													// 당첨번호가
																													// 같으면
																													// 당첨번호를
																													// 출력하게
						// 했다.
						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
						System.out.println("맞은번호는 유저의 몇번째 번호인가? = "
								+ userSelectNumbers3.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i)));
						userSelectNumberImages3[userSelectNumbers3
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
						count++;
					}
					if (userSelectNumbers3.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) { // 보너스
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("보너스점수로 맞았다");
						userSelectNumberImages3[userSelectNumbers3
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(6))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(6) + 90));
					}
					System.out.println("결과버튼이 눌러졌습니다.");
				}
				///////////////////////// 1등 ~6등 ///////////////////////////
				if (count == 6) {
					System.out.println("1등");
					rankResultList[2].setText("1등");
					rankResultText.add("1등");
					userSelectNumberImages3pnl.add(resultLbl1);
				}
				if (count == 5
						&& userSelectNumbers3.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) {
					System.out.println("2등");
					rankResultList[2].setText("2등");
					rankResultText.add("2등");
					userSelectNumberImages3pnl.add(resultLbl2);
				}
				if (count == 5) {
					System.out.println("3등");
					rankResultList[2].setText("3등");
					rankResultText.add("3등");
					userSelectNumberImages3pnl.add(resultLbl3);
				}
				if (count == 4) {
					System.out.println("4등");
					rankResultList[2].setText("4등");
					rankResultText.add("4등");
				}
				if (count == 3) {
					System.out.println("5등");
					rankResultList[2].setText("5등");
					rankResultText.add("5등");
				}
				if (count <= 2) {
					System.out.println("낙첨");
					rankResultList[2].setText("낙첨");
					rankResultText.add("낙첨");
//					userSelectNumberImages3pnl.add(resultLbl6);
				}

				//// 유저의 1번줄 랭킹 끝////
				rankResultTextAll.add(rankResultText);
				DataCenter.getInstance().getMyInfo().getUserRankingList().put(1, rankResultTextAll);
				System.out.println("데이터에 담긴 유저의 첫줄 랭킹은 = " + DataCenter.getInstance().getMyInfo().getUserRankingList());
				//// 유저의 1번줄 랭킹 끝////

				///////////////////////// 1등 ~6등 ///////////////////////////
			}
		});

		resultButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers2.size());
				for (int i = 0; i < userSelectNumbers2.size(); i++) {
					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers2.get(i));
					System.out.println(
							"1등 번호의" + i + "번째 번호는 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i));
					if (userSelectNumbers2.contains(winnerCreate.getInstance().getWinnumList().get(1).get(i))) { // 당첨
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("맞은 번호 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i)); // 사용자번호와
																													// 당첨번호가
																													// 같으면
																													// 당첨번호를
																													// 출력하게
						// 했다.
						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
						System.out.println("맞은번호는 유저의 몇번째 번호인가? = "
								+ userSelectNumbers2.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i)));
						userSelectNumberImages2[userSelectNumbers2
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
						count++;
					}
					if (userSelectNumbers2.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) { // 보너스
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("보너스점수로 맞았다");
						userSelectNumberImages2[userSelectNumbers2
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(6))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(6) + 90));
					}
					System.out.println("결과버튼이 눌러졌습니다.");
				}
				///////////////////////// 1등 ~6등 ///////////////////////////
				if (count == 6) {
					System.out.println("1등");
					rankResultList[1].setText("1등");
					rankResultText.add("1등");
					userSelectNumberImages2pnl.add(resultLbl1);
				}
				if (count == 5
						&& userSelectNumbers2.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) {
					System.out.println("2등");
					rankResultList[1].setText("2등");
					rankResultText.add("2등");
					userSelectNumberImages2pnl.add(resultLbl2);
				}
				if (count == 5) {
					System.out.println("3등");
					rankResultList[1].setText("3등");
					rankResultText.add("3등");
					userSelectNumberImages2pnl.add(resultLbl3);
				}
				if (count == 4) {
					System.out.println("4등");
					rankResultList[1].setText("4등");
					rankResultText.add("4등");
				}
				if (count == 3) {
					System.out.println("5등");
					rankResultList[1].setText("5등");
					rankResultText.add("5등");
				}
				if (count <= 2) {
					System.out.println("낙첨");
					rankResultList[1].setText("낙첨");
					rankResultText.add("낙첨");
//					userSelectNumberImages2pnl.add(resultLbl6);
				}

				//// 유저의 1번줄 랭킹 끝////
				rankResultTextAll.add(rankResultText);
				DataCenter.getInstance().getMyInfo().getUserRankingList().put(1, rankResultTextAll);
				System.out.println("데이터에 담긴 유저의 첫줄 랭킹은 = " + DataCenter.getInstance().getMyInfo().getUserRankingList());
				//// 유저의 1번줄 랭킹 끝////

				///////////////////////// 1등 ~6등 ///////////////////////////
			}
		});

		resultButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;

				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers1.size());
				for (int i = 0; i < userSelectNumbers1.size(); i++) {
					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers1.get(i));
					System.out.println(
							"1등 번호의" + i + "번째 번호는 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i));
					if (userSelectNumbers1.contains(winnerCreate.getInstance().getWinnumList().get(1).get(i))) { // 당첨
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("맞은 번호 = " + winnerCreate.getInstance().getWinnumList().get(1).get(i)); // 사용자번호와
																													// 당첨번호가
																													// 같으면
																													// 당첨번호를
																													// 출력하게
						// 했다.
						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
						System.out.println("맞은번호는 유저의 몇번째 번호인가? = "
								+ userSelectNumbers1.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i)));
						userSelectNumberImages1[userSelectNumbers1
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(i))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(i) + 45));
						count++;
					}
					if (userSelectNumbers1.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) { // 보너스
																													// 번호
																													// 맞으면
																													// 사용자의
																													// 당첨번호
																													// 라벨
																													// 이미지
																													// 바뀜
						System.out.println("보너스점수로 맞았다");
						userSelectNumberImages1[userSelectNumbers1
								.indexOf(winnerCreate.getInstance().getWinnumList().get(1).get(6))]
										.setIcon((ImageIcon) NumberToImages.getInstance().getNumberToImage().get(
												(int) winnerCreate.getInstance().getWinnumList().get(1).get(6) + 90));
					}
					System.out.println("결과버튼이 눌러졌습니다.");
				}
				///////////////////////// 1등 ~6등 ///////////////////////////
				if (count == 6) {
					System.out.println("1등");
					rankResultList[0].setText("1등");
					// rankResultText.add("1등");
					userSelectNumberImages1pnl.add(resultLbl1);
				}
				if (count == 5
						&& userSelectNumbers1.contains(winnerCreate.getInstance().getWinnumList().get(1).get(6))) {
					System.out.println("2등");
					rankResultList[0].setText("2등");
					// rankResultText.add("2등");
					userSelectNumberImages1pnl.add(resultLbl2);
				}
				if (count == 5) {
					System.out.println("3등");
					rankResultList[0].setText("3등");
					// rankResultText.add("3등");
					userSelectNumberImages1pnl.add(resultLbl3);
				}
				if (count == 4) {
					System.out.println("4등");
					rankResultList[0].setText("4등");
					// rankResultText.add("4등");
				}
				if (count == 3) {
					System.out.println("5등");
					rankResultList[0].setText("5등");
					// rankResultText.add("5등");
				}
				if (count <= 2) {
					System.out.println("낙첨");
					rankResultList[0].setText("낙첨");
					// rankResultText.add("낙첨");
//					userSelectNumberImages1pnl.add(resultLbl6);
				}

				//// 유저의 1번줄 랭킹 끝////
				rankResultTextAll.add(rankResultText);
				DataCenter.getInstance().getMyInfo().getUserRankingList().put(1, rankResultTextAll);
				System.out.println("데이터에 담긴 유저의 첫줄 랭킹은 = " + DataCenter.getInstance().getMyInfo().getUserRankingList());
				//// 유저의 1번줄 랭킹 끝////

				///////////////////////// 1등 ~6등 ///////////////////////////
			}
		});
		myPageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setVisible(true);
				dispose();
			}
		});

		setSize(830, 807);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Lotto().setVisible(true);

	}
}