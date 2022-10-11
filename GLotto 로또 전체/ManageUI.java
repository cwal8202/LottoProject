import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ManageUI extends JFrame {
	UserChoiceNumber un;

	public static void main(String[] args) {

		new ManageUI().setVisible(true);
	}

	public ManageUI() {
		getContentPane().setBackground(new Color(44, 195, 248));
		new JFrame();
		setBounds(100, 100, 452, 455);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(22, 10, 391, 88);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("관리자모드");
		lblNewLabel.setBounds(126, 5, 160, 73);
		lblNewLabel.setFont(new Font("휴먼모음T", Font.BOLD, 35));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(
				new ImageIcon("C:\\Users\\Administrator\\Desktop\\김정욱\\GLotto\\resource\\lottoimage\\leader.png"));
		lblNewLabel_1.setBounds(12, 0, 88, 88);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(22, 118, 391, 277);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("추첨시작");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		btnNewButton.setBounds(137, 33, 110, 47);
		panel_1.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (un.cou == true) {
					WinnerCreate.gamecount++;
					UserChoiceNumber.cou = false;

					JOptionPane.showMessageDialog(ManageUI.this, "다음회차가 진행됩니다.");
				} else {
					JOptionPane.showMessageDialog(ManageUI.this, "아직 한명의 회원도 구매하지 않았습니다");
				}
			}
		});

		JButton ShowMember = new JButton("회원정보보기");
		ShowMember.setBackground(new Color(255, 255, 255));
		ShowMember.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		ShowMember.setBounds(137, 113, 110, 47);
		panel_1.add(ShowMember);

		ShowMember.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				new ManegeMember().getFrame().setVisible(true);
			}
		});

		JButton logouEvent = new JButton("Logout");
		logouEvent.setBackground(new Color(255, 255, 255));
		logouEvent.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		logouEvent.setBounds(137, 193, 110, 47);
		panel_1.add(logouEvent);

		logouEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
			}
		});

	}
}