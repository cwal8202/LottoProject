import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LottoLayOut extends JFrame {
	public LottoLayOut() {
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 96);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("< 1 등 번 호 >");
		lblNewLabel.setBounds(196, 10, 106, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1등 1번");
		lblNewLabel_1.setBounds(12, 29, 57, 57);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1등 2번");
		lblNewLabel_1_1.setBounds(73, 29, 57, 57);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("1등 3번");
		lblNewLabel_1_2.setBounds(134, 29, 57, 57);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("1등 4번");
		lblNewLabel_1_3.setBounds(196, 29, 57, 57);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("1등 5번");
		lblNewLabel_1_4.setBounds(258, 29, 57, 57);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("1등 6번");
		lblNewLabel_1_5.setBounds(320, 29, 57, 57);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("1등 7번");
		lblNewLabel_1_6.setBounds(402, 29, 57, 57);
		panel.add(lblNewLabel_1_6);
		
		/////////////////////////////////////  user1 창///////////////////////////////////////////////////////
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 95, 484, 66);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("user1");
		lblNewLabel_2.setBounds(12, 10, 46, 46);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("1번");
		lblNewLabel_2_1.setBounds(89, 10, 46, 46);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("2번");
		lblNewLabel_2_1_1.setBounds(136, 10, 46, 46);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("New label");
		lblNewLabel_2_1_2.setBounds(183, 10, 46, 46);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("New label");
		lblNewLabel_2_1_3.setBounds(230, 10, 46, 46);
		panel_1.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("New label");
		lblNewLabel_2_1_4.setBounds(277, 10, 46, 46);
		panel_1.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("New label");
		lblNewLabel_2_1_5.setBounds(324, 10, 46, 46);
		panel_1.add(lblNewLabel_2_1_5);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(399, 22, 73, 23);
		panel_1.add(btnNewButton);
		
		/////////////////////////////////////  user1 창 끝///////////////////////////////////////////////////////
		
		/////////////////////////////////////  user2 창///////////////////////////////////////////////////////
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 163, 484, 66);
		getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("user2");
		lblNewLabel_2_2.setBounds(12, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("New label");
		lblNewLabel_2_1_6.setBounds(89, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1_1.setBounds(136, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("New label");
		lblNewLabel_2_1_2_1.setBounds(183, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("New label");
		lblNewLabel_2_1_3_1.setBounds(230, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("New label");
		lblNewLabel_2_1_4_1.setBounds(277, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("New label");
		lblNewLabel_2_1_5_1.setBounds(324, 10, 46, 46);
		panel_1_1.add(lblNewLabel_2_1_5_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(399, 22, 73, 23);
		panel_1_1.add(btnNewButton_1);
		
		/////////////////////////////////////  user2 창 끝///////////////////////////////////////////////////////
		
		/////////////////////////////////////  user3 창///////////////////////////////////////////////////////
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(0, 229, 484, 66);
		getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("user3");
		lblNewLabel_2_3.setBounds(12, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("New label");
		lblNewLabel_2_1_7.setBounds(89, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("New label");
		lblNewLabel_2_1_1_2.setBounds(136, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("New label");
		lblNewLabel_2_1_2_2.setBounds(183, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("New label");
		lblNewLabel_2_1_3_2.setBounds(230, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_1_3_2);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("New label");
		lblNewLabel_2_1_4_2.setBounds(277, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_1_4_2);
		
		JLabel lblNewLabel_2_1_5_2 = new JLabel("New label");
		lblNewLabel_2_1_5_2.setBounds(324, 10, 46, 46);
		panel_1_2.add(lblNewLabel_2_1_5_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(399, 22, 73, 23);
		panel_1_2.add(btnNewButton_2);
		
		/////////////////////////////////////  user3 창 끝///////////////////////////////////////////////////////
		
		/////////////////////////////////////  user4 창///////////////////////////////////////////////////////
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(0, 296, 484, 66);
		getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("user4");
		lblNewLabel_2_4.setBounds(12, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("New label");
		lblNewLabel_2_1_8.setBounds(89, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_1_8);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("New label");
		lblNewLabel_2_1_1_3.setBounds(136, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("New label");
		lblNewLabel_2_1_2_3.setBounds(183, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_1_2_3);
		
		JLabel lblNewLabel_2_1_3_3 = new JLabel("New label");
		lblNewLabel_2_1_3_3.setBounds(230, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_1_3_3);
		
		JLabel lblNewLabel_2_1_4_3 = new JLabel("New label");
		lblNewLabel_2_1_4_3.setBounds(277, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_1_4_3);
		
		JLabel lblNewLabel_2_1_5_3 = new JLabel("New label");
		lblNewLabel_2_1_5_3.setBounds(324, 10, 46, 46);
		panel_1_3.add(lblNewLabel_2_1_5_3);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(399, 22, 73, 23);
		panel_1_3.add(btnNewButton_3);
		
		/////////////////////////////////////  user4 창 끝///////////////////////////////////////////////////////
		
		/////////////////////////////////////  user5 창///////////////////////////////////////////////////////
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(0, 363, 484, 66);
		getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("user5");
		lblNewLabel_2_5.setBounds(12, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_1_9 = new JLabel("New label");
		lblNewLabel_2_1_9.setBounds(89, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_1_9);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("New label");
		lblNewLabel_2_1_1_4.setBounds(136, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_2_4 = new JLabel("New label");
		lblNewLabel_2_1_2_4.setBounds(183, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_1_2_4);
		
		JLabel lblNewLabel_2_1_3_4 = new JLabel("New label");
		lblNewLabel_2_1_3_4.setBounds(230, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_1_3_4);
		
		JLabel lblNewLabel_2_1_4_4 = new JLabel("New label");
		lblNewLabel_2_1_4_4.setBounds(277, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_1_4_4);
		
		JLabel lblNewLabel_2_1_5_4 = new JLabel("New label");
		lblNewLabel_2_1_5_4.setBounds(324, 10, 46, 46);
		panel_1_4.add(lblNewLabel_2_1_5_4);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(399, 22, 73, 23);
		panel_1_4.add(btnNewButton_4);
		
		/////////////////////////////////////  user5 창 끝///////////////////////////////////////////////////////
	}
	public static void main(String[] args) {
		new LottoLayOut().setVisible(true);
	}
}
