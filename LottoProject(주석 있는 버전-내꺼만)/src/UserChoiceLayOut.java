import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UserChoiceLayOut extends JFrame{
	public UserChoiceLayOut() {
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		/////////////////////////////////////////////// A번째 줄 시작///////////////////////////////////////////
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 44, 484, 69);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("A번호선택");
		btnNewButton.setBounds(428, 10, 44, 49);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(12, 10, 38, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1번번호");
		lblNewLabel_1.setBounds(70, 12, 44, 44);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2번번호");
		lblNewLabel_1_1.setBounds(126, 12, 44, 44);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3번번호");
		lblNewLabel_1_2.setBounds(182, 12, 44, 44);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4번번호");
		lblNewLabel_1_3.setBounds(238, 12, 44, 44);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("5번번호");
		lblNewLabel_1_4.setBounds(294, 12, 44, 44);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("6번번호");
		lblNewLabel_1_5.setBounds(350, 12, 44, 44);
		panel_1.add(lblNewLabel_1_5);
		
		/////////////////////////////////////////////// A번째 줄 끝///////////////////////////////////////////
		
		/////////////////////////////////////////////// B번째 줄 시작///////////////////////////////////////////
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 112, 484, 69);
		getContentPane().add(panel_1_1);
		
		JButton btnNewButton_1 = new JButton("B번호선택");
		btnNewButton_1.setBounds(428, 10, 44, 49);
		panel_1_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setBounds(12, 10, 38, 49);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_6 = new JLabel("1번번호");
		lblNewLabel_1_6.setBounds(70, 12, 44, 44);
		panel_1_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2번번호");
		lblNewLabel_1_1_1.setBounds(126, 12, 44, 44);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("3번번호");
		lblNewLabel_1_2_1.setBounds(182, 12, 44, 44);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("4번번호");
		lblNewLabel_1_3_1.setBounds(238, 12, 44, 44);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("5번번호");
		lblNewLabel_1_4_1.setBounds(294, 12, 44, 44);
		panel_1_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("6번번호");
		lblNewLabel_1_5_1.setBounds(350, 12, 44, 44);
		panel_1_1.add(lblNewLabel_1_5_1);
		
		/////////////////////////////////////////////// B번째 줄 끝///////////////////////////////////////////
		
		/////////////////////////////////////////////// C번째 줄 시작///////////////////////////////////////////
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(0, 180, 484, 69);
		getContentPane().add(panel_1_2);
		
		
		JButton btnNewButton_2 = new JButton("C번호선택");
		btnNewButton_2.setBounds(428, 10, 44, 49);
		panel_1_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("C");
		lblNewLabel_3.setBounds(12, 10, 38, 49);
		panel_1_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_7 = new JLabel("1번번호");
		lblNewLabel_1_7.setBounds(70, 12, 44, 44);
		panel_1_2.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("2번번호");
		lblNewLabel_1_1_2.setBounds(126, 12, 44, 44);
		panel_1_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("3번번호");
		lblNewLabel_1_2_2.setBounds(182, 12, 44, 44);
		panel_1_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("4번번호");
		lblNewLabel_1_3_2.setBounds(238, 12, 44, 44);
		panel_1_2.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("5번번호");
		lblNewLabel_1_4_2.setBounds(294, 12, 44, 44);
		panel_1_2.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("6번번호");
		lblNewLabel_1_5_2.setBounds(350, 12, 44, 44);
		panel_1_2.add(lblNewLabel_1_5_2);
		
		/////////////////////////////////////////////// C번째 줄 끝///////////////////////////////////////////
		
		/////////////////////////////////////////////// D번째 줄 시작///////////////////////////////////////////
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(0, 250, 484, 69);
		getContentPane().add(panel_1_2_1);

		JButton btnNewButton_2_1 = new JButton("D번호선택");
		btnNewButton_2_1.setBounds(428, 10, 44, 49);
		panel_1_2_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("D");
		lblNewLabel_3_1.setBounds(12, 10, 38, 49);
		panel_1_2_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("1번번호");
		lblNewLabel_1_7_1.setBounds(70, 12, 44, 44);
		panel_1_2_1.add(lblNewLabel_1_7_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("2번번호");
		lblNewLabel_1_1_2_1.setBounds(126, 12, 44, 44);
		panel_1_2_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("3번번호");
		lblNewLabel_1_2_2_1.setBounds(182, 12, 44, 44);
		panel_1_2_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("4번번호");
		lblNewLabel_1_3_2_1.setBounds(238, 12, 44, 44);
		panel_1_2_1.add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("5번번호");
		lblNewLabel_1_4_2_1.setBounds(294, 12, 44, 44);
		panel_1_2_1.add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("6번번호");
		lblNewLabel_1_5_2_1.setBounds(350, 12, 44, 44);
		panel_1_2_1.add(lblNewLabel_1_5_2_1);
		
		/////////////////////////////////////////////// D번째 줄 끝///////////////////////////////////////////
		
		/////////////////////////////////////////////// E번째 줄 시작///////////////////////////////////////////
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBounds(0, 317, 484, 69);
		getContentPane().add(panel_1_2_2);

		JButton btnNewButton_2_2 = new JButton("E번호선택");
		btnNewButton_2_2.setBounds(428, 10, 44, 49);
		panel_1_2_2.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("E");
		lblNewLabel_3_2.setBounds(12, 10, 38, 49);
		panel_1_2_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_7_2 = new JLabel("1번번호");
		lblNewLabel_1_7_2.setBounds(70, 12, 44, 44);
		panel_1_2_2.add(lblNewLabel_1_7_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("2번번호");
		lblNewLabel_1_1_2_2.setBounds(126, 12, 44, 44);
		panel_1_2_2.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("3번번호");
		lblNewLabel_1_2_2_2.setBounds(182, 12, 44, 44);
		panel_1_2_2.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("4번번호");
		lblNewLabel_1_3_2_2.setBounds(238, 12, 44, 44);
		panel_1_2_2.add(lblNewLabel_1_3_2_2);
		
		JLabel lblNewLabel_1_4_2_2 = new JLabel("5번번호");
		lblNewLabel_1_4_2_2.setBounds(294, 12, 44, 44);
		panel_1_2_2.add(lblNewLabel_1_4_2_2);
		
		JLabel lblNewLabel_1_5_2_2 = new JLabel("6번번호");
		lblNewLabel_1_5_2_2.setBounds(350, 12, 44, 44);
		panel_1_2_2.add(lblNewLabel_1_5_2_2);
		/////////////////////////////////////////////// E번째 줄 끝///////////////////////////////////////////
		
		////////////////////////////////////////////// 결과확인 버튼 시작 ///////////////////////////////////////////
		JButton btnNewButton_5 = new JButton("결과확인");
		btnNewButton_5.setBounds(375, 407, 97, 44);
		getContentPane().add(btnNewButton_5);
		////////////////////////////////////////////// 결과확인 버튼 끝 ///////////////////////////////////////////
		
	}
	public static void main(String[] args) {
		new UserChoiceLayOut().setVisible(true);
	}
}
