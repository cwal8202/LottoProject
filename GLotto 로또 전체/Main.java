
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLayeredPane;

public class Main extends JFrame {
	public Main() {
		setTitle(DataCenter.getInstance().getMyInfo().getName()+"님의 메인페이지");
		setResizable(false);
		ArrayList<Member> memberList = DataCenter.getInstance().getMemberList();

		getContentPane().setBackground(new Color(44, 195, 248));
		setBounds(100, 100, 442, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 411, 201);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(47, 79, 79));
		lblNewLabel.setBounds(0, 0, 411, 201);
		lblNewLabel.setIcon(new ImageIcon("resource/Image/초기화면 이미지.jpg"));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(12, 221, 411, 315);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("로또 구매");
		btnNewButton.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(39, 111, 320, 40);
		panel_1.add(btnNewButton);

		ActionListener buyevent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainPage().setVisible(true);
				dispose();

			}
		};
		btnNewButton.addActionListener(buyevent);

		JButton btnMypage = new JButton("내 정보");
		btnMypage.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		btnMypage.setBackground(Color.WHITE);
		btnMypage.setBounds(39, 161, 320, 40);
		panel_1.add(btnMypage);

		// Mypage 버튼 이벤트(Mypage 창이동)
		ActionListener mypageEvent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyPage().getFrame().setVisible(true);
				dispose();
			}
		};

		// Logout 버튼 이벤트(Login 창이동)
		JButton btnLogout = new JButton("로그아웃");
		btnLogout.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(39, 211, 320, 40);
		panel_1.add(btnLogout);

		ActionListener logoutEvent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataCenter.getInstance().setMyInfo(null);
				new Login().setVisible(true);
				dispose();
			}
		};

		JButton Exitbtn = new JButton("종료");
		Exitbtn.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		Exitbtn.setBackground(Color.WHITE);
		Exitbtn.setBounds(39, 261, 320, 40);
		panel_1.add(Exitbtn);

		JLabel qqq = new JLabel("");
		qqq.setBackground(new Color(128, 128, 128));
		qqq.setForeground(new Color(128, 128, 128));
		qqq.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		qqq.setBounds(49, 10, 339, 91);
		qqq.setText(DataCenter.getInstance().getMyInfo().getName() + "님 환영합니다.");
		panel_1.add(qqq);

		btnMypage.addActionListener(mypageEvent);
		btnLogout.addActionListener(logoutEvent);
		Exitbtn.addActionListener(logoutEvent);
		setVisible(true);
	}
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}