
import java.awt.Color;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyPage extends JFrame {
	
	ArrayList<Member> memberList = DataCenter.getInstance().getMemberList();
	private Member user = DataCenter.getInstance().getMyInfo();
	private JFrame frame;
	List<JLabel> chnumlist = new ArrayList<>();
	private NumberToImages numberToImage;
	private JLabel Namelbl;
	private JLabel IDlbl;
	private JLabel onum;
	private JLabel tnum;
	private JLabel fnum;
	private UserCheck uC = new UserCheck();
	private infoChange iC = new infoChange();

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

	public MyPage(JFrame frame) {
		super();
		this.frame = frame;
	}

	public List<JLabel> getChnumlist() {
		return chnumlist;
	}

	public void setChnumlist(List<JLabel> chnumlist) {
		this.chnumlist = chnumlist;
	}

	public MyPage(List<JLabel> chnumlist) {
		super();
		this.chnumlist = chnumlist;
	}

//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               MyPage window = new MyPage();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }   

	/**
	 * Create the application.
	 */
	public MyPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		numberToImage = new NumberToImages();

		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 456, 643);
		frame.setTitle("MyPage");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(11, 10, 423, 102);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		

		JLabel lblNewLabel = new JLabel("My Page");
		lblNewLabel.setBounds(132, 26, 155, 46);
		lblNewLabel.setFont(new Font("휴먼모음T", Font.PLAIN, 39));
		panel.add(lblNewLabel);
		
		JLabel pnlInputImg = new JLabel("");
		pnlInputImg.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\김정욱\\GLotto\\resource\\lottoimage\\user-data.png"));
		pnlInputImg.setBounds(12, 0, 102, 102);
		panel.add(pnlInputImg);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(11, 122, 423, 395);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

//		JLabel lblNewLabel_1 = new JLabel("");
//		lblNewLabel_1.setIcon(new ImageIcon("resource/Image/사람아이콘.PNG"));
//		lblNewLabel_1.setBounds(22, 10, 62, 80);
//		panel_1.add(lblNewLabel_1);
		
		
		Namelbl = new JLabel("New label");
		Namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		Namelbl.setFont(new Font("휴먼모음T", Font.PLAIN, 22));
		Namelbl.setText(DataCenter.getInstance().getMyInfo().getName() + "님의 마이페이지");
		Namelbl.setBounds(66, 20, 290, 57);

		panel_1.add(Namelbl);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(325, 19, 62, 80);
		panel_1.add(lblNewLabel_3);

		JLabel ID = new JLabel("ID");
		ID.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		ID.setBounds(34, 142, 45, 41);
		panel_1.add(ID);

		JLabel Tel = new JLabel("Tel");
		Tel.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		Tel.setBounds(34, 206, 32, 41);
		panel_1.add(Tel);

		JLabel LuckNum = new JLabel("조상님픽");
		LuckNum.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		LuckNum.setBounds(22, 266, 82, 41);
		panel_1.add(LuckNum);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(95, 258, 302, 70);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = MyPage.class.getClassLoader().getResource("lottoimage/circle.png");
		ImageIcon image = new ImageIcon(kit.getImage(url));

		JLabel lblnum1 = new JLabel("");
		lblnum1.setIcon(image);
		lblnum1.setBounds(2, 9, 40, 40);
		panel_2.add(lblnum1);
		chnumlist.add(lblnum1);

		JLabel lblnum2 = new JLabel("");
		lblnum2.setIcon(image);
		lblnum2.setBounds(49, 10, 40, 40);
		panel_2.add(lblnum2);
		chnumlist.add(lblnum2);

		JLabel lblnum3 = new JLabel("");
		lblnum3.setIcon(image);
		lblnum3.setBounds(97, 11, 40, 40);
		panel_2.add(lblnum3);
		chnumlist.add(lblnum3);

		JLabel lblnum4 = new JLabel("");
		lblnum4.setIcon(image);
		lblnum4.setBounds(146, 10, 40, 40);
		panel_2.add(lblnum4);
		chnumlist.add(lblnum4);

		JLabel lblnum5 = new JLabel("");
		lblnum5.setIcon(image);
		lblnum5.setBounds(196, 9, 40, 40);
		panel_2.add(lblnum5);
		chnumlist.add(lblnum5);

		JLabel lblnum6 = new JLabel("");
		lblnum6.setIcon(image);
		lblnum6.setBounds(245, 9, 40, 40);
		panel_2.add(lblnum6);
		chnumlist.add(lblnum6);

		Member m = new Member();
		for (int i = 0; i < DataCenter.getInstance().getMyInfo().getMyNumList().size(); i++) {
			try {
				
				chnumlist.get(i).setIcon((ImageIcon) numberToImage.getNumberToImage()
						.get(DataCenter.getInstance().getMyInfo().getMyNumList().get(i)));
			} catch (NullPointerException e) {
				chnumlist.get(i).setText("");
				System.out.println(DataCenter.getInstance().getMyInfo().getMyNumList());
			}
		}

		JButton InputBtn = new JButton("접신");
		InputBtn.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		InputBtn.setBackground(Color.WHITE);
		InputBtn.setBounds(305, 338, 82, 41);
		panel_1.add(InputBtn);

		onum = new JLabel("New label");
		onum.setHorizontalAlignment(SwingConstants.CENTER);
		onum.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		onum.setBounds(123, 205, 62, 43);
		onum.setText(DataCenter.getInstance().getMyInfo().getFPhone());
		panel_1.add(onum);

		tnum = new JLabel("New label");
		tnum.setHorizontalAlignment(SwingConstants.CENTER);
		tnum.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		tnum.setBounds(223, 205, 62, 43);
		tnum.setText(DataCenter.getInstance().getMyInfo().getMPhone());
		panel_1.add(tnum);

		fnum = new JLabel("New label");
		fnum.setHorizontalAlignment(SwingConstants.CENTER);
		fnum.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		fnum.setBounds(321, 205, 62, 43);
		fnum.setText(DataCenter.getInstance().getMyInfo().getLPhone());
		panel_1.add(fnum);

		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		lblNewLabel_4.setIcon(new ImageIcon("resource/Image/하이픈.PNG"));
		lblNewLabel_4.setBounds(185, 205, 32, 43);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel();
		lblNewLabel_4_1.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		lblNewLabel_4_1.setIcon(new ImageIcon("resource/Image/하이픈.PNG"));
		lblNewLabel_4_1.setBounds(287, 205, 32, 43);
		panel_1.add(lblNewLabel_4_1);

		IDlbl = new JLabel("New label");
		IDlbl.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		IDlbl.setBounds(119, 142, 206, 40);
		IDlbl.setText(DataCenter.getInstance().getMyInfo().getID());
		panel_1.add(IDlbl);
		
		JLabel lblPhoneImg = new JLabel("");
		lblPhoneImg.setBounds(64, 207, 40, 40);
		lblPhoneImg.setIcon(new ImageIcon("resource/lottoimage/phone-call.png"));
		panel_1.add(lblPhoneImg);
		
		JLabel lblPhoneImg_1 = new JLabel("");
		lblPhoneImg_1.setIcon(new ImageIcon("resource/lottoimage/id.png"));
		lblPhoneImg_1.setBounds(66, 142, 40, 40);
		panel_1.add(lblPhoneImg_1);

		InputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyLottoChoice().setVisible(true);
				frame.dispose();
			}
		});

		JButton button = new JButton("정보수정");
		button.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				uC.getNameText().setText("");
				uC.getRrnText1().setText("");
				uC.getRrnText2().setText("");
				uC.getIdText().setText("");
				uC.getPwText().setText("");
				uC.setVisible(true);

			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(56, 539, 122, 42);
		frame.getContentPane().add(button);

		JButton MPbtn = new JButton("초기화면");
		MPbtn.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		MPbtn.setBackground(Color.WHITE);
		MPbtn.setBounds(263, 539, 122, 42);
		frame.getContentPane().add(MPbtn);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(44,195,248));
		panel_3.setBounds(0, 0, 440, 604);
		frame.getContentPane().add(panel_3);

		uC.getCheck().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (user.getName().equals(uC.getNameText().getText())
						&& user.getFnum().equals(uC.getRrnText1().getText())
						&& user.getBnum().equals(uC.getRrnText2().getText())
						&& user.getID().equals(uC.getIdText().getText())
						&& user.getPw().equals(uC.getPwText().getText())) {

					iC.getNameText().setText(user.getName());
					iC.getPhoneNum1().setText(user.getFPhone());
					iC.getPhoneNum2().setText(user.getMPhone());
					iC.getPhoneNum3().setText(user.getLPhone());
					iC.getIdText().setText(user.getID());
					iC.getPwText1().setText(user.getPw());
					iC.getPwText2().setText(user.getPw());

					iC.getNameChange().setText("수정");
					iC.getIdChange().setText("수정");
					iC.getPwChange().setText("수정");
					iC.getPhoneNumChange().setText("수정");
					iC.getPwValidation().setText("");

					iC.getNameText().setEnabled(false);
					iC.getPhoneNum1().setEnabled(false);
					iC.getPhoneNum2().setEnabled(false);
					iC.getPhoneNum3().setEnabled(false);
					iC.getIdText().setEnabled(false);
					iC.getPwText1().setEnabled(false);
					iC.getPwText2().setEnabled(false);

					iC.setDoubleCheckOk(false);

					uC.dispose();
					iC.setVisible(true);

				}

				else {
					JOptionPane.showMessageDialog(uC, "본인정보와 다릅니다.");
				}

			}
		});

		iC.getChangeCheck().addActionListener(new ActionListener() {

			int userIndex = memberList.indexOf(user);

			@Override
			public void actionPerformed(ActionEvent e) {

				if (iC.getNameChange().getText().equals("수정") && iC.getIdChange().getText().equals("수정")
						&& iC.getPwChange().getText().equals("수정") && iC.getPhoneNumChange().getText().equals("수정")) {

					memberList.get(userIndex).setName(iC.getNameText().getText());
					memberList.get(userIndex).setID(iC.getIdText().getText());
					memberList.get(userIndex).setPw(iC.getPwText1().getText());
					memberList.get(userIndex).setFPhone(iC.getPhoneNum1().getText());
					memberList.get(userIndex).setMPhone(iC.getPhoneNum2().getText());
					memberList.get(userIndex).setLPhone(iC.getPhoneNum3().getText());

					JOptionPane.showMessageDialog(iC, "수정이 완료되었습니다.");

					iC.dispose();

					Namelbl.setText(iC.getNameText().getText());
					IDlbl.setText(iC.getIdText().getText());
					onum.setText(iC.getPhoneNum1().getText());
					tnum.setText(iC.getPhoneNum2().getText());
					fnum.setText(iC.getPhoneNum3().getText());

				} else {
					JOptionPane.showMessageDialog(iC, "수정 완료버튼을 눌러주세요.");
				}
			}
		});

		MPbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main a = new Main();
				a.setVisible(true);
				frame.dispose();
			}
		});
	}
}