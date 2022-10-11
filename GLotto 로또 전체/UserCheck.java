
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UserCheck extends JDialog {

	private JTextField nameText;
	private JTextField rrnText1;
	private JPasswordField rrnText2;
	private JTextField idText;
	private JPasswordField pwText;
	private JButton check;
	private Member user;

	public JTextField getIdText() {
		return idText;
	}

	public void setIdText(JTextField idText) {
		this.idText = idText;
	}

	public JTextField getNameText() {
		return nameText;
	}

	public void setNameText(JTextField nameText) {
		this.nameText = nameText;
	}

	public JTextField getRrnText1() {
		return rrnText1;
	}

	public void setRrnText1(JTextField rrnText1) {
		this.rrnText1 = rrnText1;
	}

	public JPasswordField getRrnText2() {
		return rrnText2;
	}

	public void setRrnText2(JPasswordField rrnText2) {
		this.rrnText2 = rrnText2;
	}

	public JPasswordField getPwText() {
		return pwText;
	}

	public void setPwText(JPasswordField pwText) {
		this.pwText = pwText;
	}

	public JButton getCheck() {
		return check;
	}

	public void setCheck(JButton check) {
		this.check = check;
	}

	public UserCheck() {
		this.user = DataCenter.getInstance().getMyInfo();
		this.showView();
		this.addListener();
	}

	private void showView() {
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(0, 191, 255));

		JPanel panel_1_1 = new JPanel();

		JLabel title = new JLabel("본인 확인");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("휴먼모음T", Font.BOLD, 30));
		title.setBounds(115, 10, 127, 69);

		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBounds(12, 10, 360, 89);
		panel_1_1.setLayout(null);
		panel_1_1.add(title);
		pnl.add(panel_1_1);

		JLabel lblUserImg = new JLabel("");
		lblUserImg.setIcon(new ImageIcon("resource/lottoimage/id-card.png"));
		lblUserImg.setBounds(14, 0, 89, 89);
		panel_1_1.add(lblUserImg);

		setSize(400, 376);
		pnl.setLayout(null);

		getContentPane().add(pnl);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(12, 109, 360, 158);
		pnl.add(panel_1);
		panel_1.setLayout(null);

		JLabel name = new JLabel("이름");
		name.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		name.setBounds(28, 10, 55, 27);
		panel_1.add(name);

		nameText = new JTextField();
		nameText.setBounds(105, 11, 81, 27);
		panel_1.add(nameText);

		JLabel rrnNum = new JLabel("주민번호");
		rrnNum.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		rrnNum.setBounds(28, 47, 80, 27);
		panel_1.add(rrnNum);

		JLabel id = new JLabel("ID");
		id.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		id.setBounds(28, 84, 55, 27);
		panel_1.add(id);

		JLabel pw = new JLabel("PW");
		pw.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		pw.setBounds(28, 121, 55, 27);
		panel_1.add(pw);

		rrnText1 = new JTextField();
		rrnText1.setBounds(105, 47, 81, 27);
		panel_1.add(rrnText1);

		JLabel hypen = new JLabel("-");
		hypen.setBounds(198, 57, 6, 15);
		panel_1.add(hypen);

		rrnText2 = new JPasswordField();
		rrnText2.setBounds(216, 47, 81, 27);
		panel_1.add(rrnText2);

		idText = new JTextField();
		idText.setBounds(105, 84, 81, 27);
		panel_1.add(idText);

		pwText = new JPasswordField();
		pwText.setBounds(105, 122, 81, 27);
		panel_1.add(pwText);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(12, 277, 360, 50);
		pnl.add(panel);
		panel.setLayout(null);

		check = new JButton("확인");
		check.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		check.setBounds(124, 10, 104, 30);
		check.setForeground(new Color(0, 0, 0));
		check.setToolTipText("");
		check.setBackground(new Color(255, 255, 255));
		panel.add(check);

	}

	private void addListener() {

		nameText.addKeyListener(new KeyAdapter() {

			@Override // 네임텍스트에 키를누르고 땟을때 이벤트 발생
			public void keyReleased(KeyEvent e) {
				for (int i = 0; i < nameText.getText().length(); i++) {
					if (!(Character.isAlphabetic(nameText.getText().charAt(i)))) { // 텍스트 하나하나를 분석해서 문자가아닐때

						JOptionPane.showMessageDialog(UserCheck.this, "문자만 입력 가능");

						String a;
						a = nameText.getText();
						nameText.setText(a.replaceAll("[^a-zA-Zㄱ-ㅎ가-힣]", "")); // 네임텍스트에 영어나 한글빼고는 전부 삭제

					}
				}

			}
		});

		rrnText1.addKeyListener(new KeyAdapter() {

			@Override // 앞 주민번호 텍스트에서 키를 누르고 땟을때 이벤트 발생
			public void keyReleased(KeyEvent e) {

				for (int i = 0; i < rrnText1.getText().length(); i++) {
					if (!(Character.isDigit(rrnText1.getText().charAt(i)))) {

						JOptionPane.showMessageDialog(UserCheck.this, "숫자만 입력해주세요.");
						String a;
						a = rrnText1.getText();
						rrnText1.setText(a.replaceAll("[^0-9]", "")); // 숫자빼고 다 삭제
					}

					else if (rrnText1.getText().length() > 6) {
						rrnText1.setText(rrnText1.getText().substring(0, 6)); // 앞 주민번호 텍스트길이가 6개보다 많아지면 6개만남기고 삭제
					} else if (rrnText1.getText().length() == 6 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
							&& !(e.getKeyCode() == KeyEvent.VK_LEFT) && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
						rrnText1.transferFocus(); // (백스페이스, 오른쪽,왼쪽 버튼제외) 눌렀을때 텍스트길이가 6개가 되면 다음텍스트로 포커스이동
					}
				}
			}
		});

		rrnText2.addKeyListener(new KeyAdapter() {

			@Override // 뒤 주민번호 텍스트에서 키를 누르고 땟을때 이벤트 발생
			public void keyReleased(KeyEvent e) {

				for (int i = 0; i < rrnText2.getText().length(); i++) {
					if (!(Character.isDigit(rrnText2.getText().charAt(i)))) {
						JOptionPane.showMessageDialog(UserCheck.this, "숫자만 입력해주세요.");
						String a;
						a = rrnText2.getText();
						rrnText2.setText(a.replaceAll("[^0-9]", "")); // 숫자빼고 다 삭제

					}

					else if (rrnText2.getText().length() > 7) {
						rrnText2.setText(rrnText2.getText().substring(0, 7));
					} // 앞 주민번호 텍스트길이가 7개보다 많아지면 7개만남기고 삭제
					else if (rrnText2.getText().length() == 7 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
							&& !(e.getKeyCode() == KeyEvent.VK_LEFT) && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
						rrnText2.transferFocus(); // (백스페이스, 오른쪽,왼쪽 버튼제외) 눌렀을때 텍스트길이가 7개가 되면 다음텍스트로 포커스이동
					}
				}
			}
		});

		idText.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {

				for (int i = 0; i < idText.getText().length(); i++) {
					String a;
					a = idText.getText();
					String b = String.valueOf(a.charAt(i)); // 아이디 텍스트를 한글자씩 쪼개서 비교

					if (b.matches("^[a-zA-Z0-9]")) {

					} else {
						JOptionPane.showMessageDialog(UserCheck.this, "영어, 숫자만 입력가능");
						idText.setText(a.replaceAll("[^a-zA-Z0-9]", "")); // 비교해서 영어와 숫자뺴고는 다 지운다
					}
				}

			}
		});

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// new MyPage().getFrame().setVisible(true);
				dispose();
			}

		});

	}
}