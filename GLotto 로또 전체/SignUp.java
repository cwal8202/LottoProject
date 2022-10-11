import java.awt.Color;  
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JDialog {
   
   private JTextField nameText;
   private JTextField rrnText1;
   private JTextField rrnText2;
   private JTextField idText;
   private JButton doubleCheck;
   private JTextField pwText;
   private JTextField pwText2;
   private JTextField pText2;
   private JTextField pText3;
   private JButton signUp;
   private JComboBox comboBox;
   private JLabel pwValidation;
   private ArrayList<Member> memberList; 

   public SignUp() {
      this.memberList = DataCenter.getInstance().getMemberList();
      this.showView();
      this.addListener();
   }

   /**
    * 화면 컴포넌트
    */
   private void showView() {
      setModal(true);
      setTitle("Green Lotto 회원가입");

      JPanel pnl = new JPanel();
      pnl.setBackground(new Color(44,195,248));

      JLabel title = new JLabel("Lotto Member");
      title.setForeground(new Color(255, 255, 255));
      title.setBounds(100, 50, 195, 36);
      title.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 33));

      JLabel name = new JLabel("이름  ");
      name.setForeground(new Color(255, 255, 255));
      name.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      name.setBounds(12, 5, 60, 20);

      nameText = new JTextField();
      nameText.setBounds(100, 5, 116, 21);

      JPanel nameBand = new JPanel();
      nameBand.setBounds(0, 120, 384, 35);
      nameBand.setLayout(null);
      nameBand.add(name);
      nameBand.add(nameText);
      nameBand.setBackground(new Color(44,195,248));

      JLabel rrn = new JLabel("주민번호");
      rrn.setForeground(new Color(255, 255, 255));
      rrn.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      rrn.setBounds(12, 11, 60, 15);

      rrnText1 = new JTextField();
      rrnText1.setBounds(100, 5, 116, 21);

      JLabel hyphen1 = new JLabel("-");
      hyphen1.setBounds(218, 8, 6, 15);

      rrnText2 = new JPasswordField(10);
      rrnText2.setBounds(226, 5, 116, 21);

      JPanel rrnBand = new JPanel();
      rrnBand.setBounds(0, 170, 384, 35);
      rrnBand.setLayout(null);
      rrnBand.add(rrn);
      rrnBand.add(rrnText1);
      rrnBand.add(hyphen1);
      rrnBand.add(rrnText2);

      rrnBand.setBackground(new Color(44,195,248));

      JLabel id = new JLabel("ID(7글자 이상)");
      id.setForeground(new Color(255, 255, 255));
      id.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      id.setBounds(12, 5, 93, 21);

      idText = new JTextField();
      idText.setBounds(100, 5, 120, 21);

      doubleCheck = new JButton("중복확인");
      doubleCheck.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      doubleCheck.setBackground(new Color(255, 255, 255));
      doubleCheck.setBounds(220, 5, 87, 21);

      JPanel idBand = new JPanel();
      idBand.setBounds(0, 220, 384, 35);
      idBand.setLayout(null);
      idBand.add(id);
      idBand.add(idText);
      idBand.add(doubleCheck);

      idBand.setBackground(new Color(44,195,248));

      JLabel pw = new JLabel("PW");
      pw.setForeground(new Color(255, 255, 255));
      pw.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      pw.setBounds(12, 11, 60, 15);
      pwText = new JPasswordField();
      pwText.setBounds(100, 5, 120, 21);

      JPanel pwBand = new JPanel();
      pwBand.setBounds(0, 270, 384, 49);
      pwBand.setLayout(null);
      pwBand.add(pw);
      pwBand.add(pwText);

      pwBand.setBackground(new Color(44,195,248));

      JLabel pw2 = new JLabel("PW2");
      pw2.setForeground(new Color(255, 255, 255));
      pw2.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      pw2.setBounds(12, 11, 60, 15);
      pwText2 = new JPasswordField();
      pwText2.setBounds(100, 5, 120, 21);

      JPanel pwBand2 = new JPanel();
      pwBand2.setBounds(0, 320, 384, 35);
      pwBand2.setLayout(null);
      pwBand2.add(pw2);
      pwBand2.add(pwText2);
      pwBand2.setBackground(new Color(44,195,248));

      JLabel phoneNum = new JLabel("전화번호");
      phoneNum.setForeground(new Color(255, 255, 255));
      phoneNum.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      phoneNum.setBounds(12, 11, 60, 15);
      JLabel hyphen2 = new JLabel("-");
      hyphen2.setBounds(169, 8, 6, 15);
      pText2 = new JTextField();
      pText2.setBounds(183, 5, 60, 21);
      JLabel hyphen3 = new JLabel("-");
      hyphen3.setBounds(255, 8, 6, 15);

      pText3 = new JTextField();
      pText3.setBounds(271, 5, 60, 21);
      JPanel phoneNumBand = new JPanel();
      phoneNumBand.setBounds(0, 370, 384, 35);
      phoneNumBand.setLayout(null);
      phoneNumBand.add(phoneNum);
      phoneNumBand.add(hyphen2);
      phoneNumBand.add(pText2);
      phoneNumBand.add(hyphen3);
      phoneNumBand.add(pText3);
      phoneNumBand.setBackground(new Color(44,195,248));

      signUp = new JButton("가입하기");
      signUp.setBackground(new Color(255, 255, 255));
      signUp.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
      signUp.setBounds(90, 5, 200, 23);
      JPanel underBtn = new JPanel();
      underBtn.setBounds(0, 455, 384, 35);
      underBtn.setLayout(null);
      underBtn.add(signUp);
      underBtn.setBackground(new Color(44,195,248));

      ImageIcon icon = new ImageIcon("images.png");
      Image img = icon.getImage();
      Image changeImg = img.getScaledInstance(70, 70, Image.SCALE_AREA_AVERAGING);
      ImageIcon changeIcon = new ImageIcon(changeImg);
      JLabel image = new JLabel(changeIcon);
      image.setBounds(5, 13, 100, 100);

      pnl.setLayout(null);

      pnl.add(title);
      pnl.add(nameBand);
      pnl.add(rrnBand);
      pnl.add(idBand);
      pnl.add(pwBand);
      pnl.add(pwBand2);
      pnl.add(phoneNumBand);

      String[] firstPhoneNum = { "010", "011" };
      comboBox = new JComboBox(firstPhoneNum);
      comboBox.setBackground(new Color(255, 255, 255));
      comboBox.setBounds(100, 5, 60, 21);
      phoneNumBand.add(comboBox);
      
      pnl.add(underBtn);
      pnl.add(image);

      pwValidation = new JLabel("");
      pwValidation.setFont(new Font("굴림", Font.PLAIN, 12));
      pwValidation.setForeground(Color.GREEN);
      pwValidation.setBounds(225, 5, 150, 20);
      pwBand.add(pwValidation);
      pwValidation.show(false);

      getContentPane().add(pnl);
      
      JLabel lblNewLabel = new JLabel("모든 정보사항 필수 기입!!");
      lblNewLabel.setFont(new Font("휴먼엑스포", Font.BOLD, 17));
      lblNewLabel.setForeground(new Color(255, 0, 0));
      lblNewLabel.setBounds(10, 415, 234, 30);
      pnl.add(lblNewLabel);

      setSize(400, 600);
   }

   /**
    * 버튼 별 이벤트 기능
    */
   
   private void addListener() {
      
         nameText.addKeyListener(new KeyAdapter() {

             @Override //네임텍스트에 키를누르고 땟을때 이벤트 발생
             public void keyReleased(KeyEvent e) {
                for (int i = 0; i < nameText.getText().length(); i++) { 
                   if (!(Character.isAlphabetic(nameText.getText().charAt(i)))) { // 텍스트 하나하나를 분석해서 문자가아닐때 
                      
                         JOptionPane.showMessageDialog(SignUp.this, "문자만 입력 가능");
                         
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
                      
                         JOptionPane.showMessageDialog(SignUp.this, "숫자만 입력해주세요.");
                         String a;
                         a = rrnText1.getText();
                         rrnText1.setText(a.replaceAll("[^0-9]", "")); // 숫자빼고 다 삭제
                      }    


                   else if (rrnText1.getText().length() > 6 ) {
                         rrnText1.setText(rrnText1.getText().substring(0, 6)); // 앞 주민번호 텍스트길이가 6개보다 많아지면 6개만남기고 삭제
                      }  
                   else if (rrnText1.getText().length() == 6 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                         && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
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
                         JOptionPane.showMessageDialog(SignUp.this, "숫자만 입력해주세요.");
                         String a;
                         a = rrnText2.getText();
                         rrnText2.setText(a.replaceAll("[^0-9]", "")); // 숫자빼고 다 삭제
                         
                      }

                   else if (rrnText2.getText().length() > 7) {
                         rrnText2.setText(rrnText2.getText().substring(0, 7));
                      } // 앞 주민번호 텍스트길이가 7개보다 많아지면 7개만남기고 삭제
                   else if (rrnText2.getText().length() == 7 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                         && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
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
                       JOptionPane.showMessageDialog(SignUp.this, "영어, 숫자만 입력가능");
                       idText.setText(a.replaceAll("[^a-zA-Z0-9]", ""));  // 비교해서 영어와 숫자뺴고는 다 지운다
                    }
                 }

              }
           });
      
      pText2.addKeyListener(new KeyAdapter() {

         @Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
         public void keyReleased(KeyEvent e) {

            for (int i = 0; i < pText2.getText().length(); i++) {
               
               if (!(Character.isDigit(pText2.getText().charAt(i)))) {
                  JOptionPane.showMessageDialog(SignUp.this, "숫자만 입력해주세요.");
                  String a;
                  a = pText2.getText();
                  pText2.setText(a.replaceAll("[^0-9]", ""));
               }

               else if (pText2.getText().length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                            && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
                  pText2.setText(pText2.getText().substring(0, 4));
                  pText2.transferFocus();
               }
            }
         }

      });

      pText3.addKeyListener(new KeyAdapter() {

         @Override // 전화번호 뒷번호 텍스트
         public void keyReleased(KeyEvent e) {

            for (int i = 0; i < pText3.getText().length(); i++) {
               if (!(Character.isDigit(pText3.getText().charAt(i)))) {
                  JOptionPane.showMessageDialog(SignUp.this, "숫자만 입력해주세요.");
                  String a;
                  a = pText3.getText();
                  pText3.setText(a.replaceAll("[^0-9]", ""));
               }

               else if (pText3.getText().length() >= 4 ) {
                  pText3.setText(pText3.getText().substring(0, 4));
               }
            }
         }
      });
      
      // 패스워드 일치 불일치 이벤트
      KeyAdapter adapter = new KeyAdapter() {
         @Override
         public void keyReleased(KeyEvent e) {
            pwValidation.show(false); // 키를입력할때마다 false 를 반환후 조건에 부합하면 true로 만들어준다
            String valiTxt = ""; // 일치 불일치 텍스트 초기값(공백) 초기화
            if (pwText.getText().length() < 8 && pwText.getText().length() > 0) {
               valiTxt = "PW는 8문자 이상"; // pwText 8문자 미만일때
               pwValidation.setForeground(Color.RED);
            } else if (pwText.getText().length() <= 0) {
               valiTxt = ""; // pwText 값 길이가 0일때 (칸이 비어있을때)
            } else if (!pwText.getText().equals(pwText2.getText())) {
               valiTxt = "불일치"; // pwTex값이 8문자 이상이지만 pwText, pwText2 값이 다를때
               pwValidation.setForeground(Color.RED);
            } else if (pwText.getText().equals(pwText2.getText())) {
               valiTxt = "일치"; // pwText 값이 8문자 이상이고 pwText, pwText2 값이 같을때 (일치할때)
               pwValidation.setForeground(Color.GREEN);
            }
            pwValidation.setText(valiTxt); // 앞의 조건을 설정하고 맞는조건의 valiTxt를 pwValidation 에 설정한후
            pwValidation.show(true); // 보이게한다. 
         }
      };

      pwText.addKeyListener(adapter);
      pwText2.addKeyListener(adapter);
      

      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            dispose();
         }
      }); 
      
      
         // 각종 버튼 리스너
      ActionListener litener = new ActionListener() {

         boolean memberPlusOk;
         String idCheck;

         @Override
         public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("가입하기")) {
               // 이름 입력칸에 길이가 0이하일때 (비어있을때) 
               if (nameText.getText().length() <= 0) {
                  JOptionPane.showMessageDialog(SignUp.this, "이름을 입력해 주세요.");
               } 
               // 주민번호1 길이:6, 주민번호2 길이:7 이 아닐때
               else if (!(rrnText1.getText().length() == 6 && rrnText2.getText().length() == 7)) {
                  JOptionPane.showMessageDialog(SignUp.this, "주민번호를 길이를 확인해 주세요");
               } 
               // 비밀번호 길이가 8보다 작거나 pwText, pwText2 번호가 다를때
               else if (!(pwText.getText().length() >= 8) || !pwText.getText().equals(pwText2.getText())) {
                  JOptionPane.showMessageDialog(SignUp.this, "PW를 확인해주세요.");
               } 
               // 전화번호 중간번호의 길이가 3~4 끝번호의 길이가 4가 아닐때
               else if (!((pText2.getText().length() == 3 || pText2.getText().length() == 4)
                     && (pText3.getText().length() == 4))) {
                  JOptionPane.showMessageDialog(SignUp.this, "전화번호를 확인해주세요");
               } 
               // memberPlusOk 가 true 값이고 idCheck 의 String 값과 idText.getText의값이 같을때
               else if (memberPlusOk && idCheck.equals(idText.getText())) {
                  
                  DataCenter.getInstance().addMemberList(new Member(nameText.getText(), idText.getText(), pwText.getText(),
                        rrnText1.getText(), rrnText2.getText(), comboBox.getSelectedItem().toString(),
                        pText2.getText(), pText3.getText())); // DataCenter 의 getInstance(싱글 패턴, 같은값 참조하기위한)에 추가한다
                  JOptionPane.showMessageDialog(SignUp.this, "회원가입이 완료되었습니다.");
                  dispose();
               }

               else { //d memberPlusOk 가 true가 아니거나, idCheck와 idText.getText 값이 다르면 ID중복확인 메세지
                  JOptionPane.showMessageDialog(SignUp.this, "ID 중복확인을 해주세요.");
               }

            }

            else if (e.getActionCommand().equals("중복확인")) { // 중복확인 버튼을 눌렸을때 이벤트

               if (idText.getText().length() >= 7) {
                  boolean sameId = false; 

                  for (int i = 0; i < memberList.size(); i++) {
                     if (memberList.get(i).getID().equals(idText.getText())) {
                        sameId = true; // 멤버리스트의 아이뒤중 텍스트에 입력된아이뒤와 같은 아이뒤가 있을경우 sameId = true
                     }
                  }

                  if (sameId == true) {
                     JOptionPane.showMessageDialog(SignUp.this, "이미 존재하는 ID 입니다.");
                  } else {//sameId false 일때 memberPlusOk에 true를 주고 idCheck에 idText.getText를 담는다.
                     JOptionPane.showMessageDialog(SignUp.this, "사용가능한 ID 입니다.");
                     memberPlusOk = true;
                     idCheck = idText.getText();
                  }
               } else { // id텍스트가 7문자 이하일때 
                  JOptionPane.showMessageDialog(SignUp.this, "ID를 7문자 이상 작성해 주세요.");
               }

            }

         }
      };
      doubleCheck.addActionListener(litener);
      signUp.addActionListener(litener);
   }
}