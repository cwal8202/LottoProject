import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//// 숫자를 입력하면 숫자와 같은 이미지가 나오는 클래스를 만들었다.
class ImageNumber {
   ImageIcon ImageNumber(int number) {
      return new ImageIcon();
   }
   Integer ImageNumber(ImageIcon a) {
      return new Integer(0);
   }
}


public class NumberToImages extends JFrame {
   //전역 객체변수로 사용하기 위해 static 객체변수로 생성
   static NumberToImages instance;
   private HashMap numberToImage;
   //생성자를 priavte로 만들어 접근을 막는다
   public HashMap getNumberToImage() {
      return numberToImage;
   }
   public void setNumberToImage(HashMap numberToImage) {
      this.numberToImage = numberToImage;
   }
   public NumberToImages(){
      numberToImage = new HashMap();
      Toolkit kit = Toolkit.getDefaultToolkit();
      URL[] urlAll = new URL[135];
      for (int i = 0; i < urlAll.length; i++) {
         urlAll[i] = NumberToImages.class.getClassLoader().getResource("images/" + (i + 1) + ".png");
         ImageIcon image = new ImageIcon(kit.getImage(urlAll[i]).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
         numberToImage.put((i + 1), image);   // 1 ~ 45 까지 숫자를 이미지에 대응해서 넣기 위함.
      }
   }
   
//   public void ImageToNumber(ImageIcon imgicon) {
//      
//   }
   //getInstance 메소드를 통해 한번만 생성된 객체를 가져온다.
   public static NumberToImages getInstance(){
      if(instance == null){ //최초 한번만 new 연산자를 통하여 메모리에 할당한다.
         instance = new NumberToImages();
      }      
      return instance;
   }

   public static void main(String[] args) {
      new NumberToImages().setVisible(true);
   }

}