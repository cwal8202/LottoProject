import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
   private Image img;
   
   public ImagePanel(Image img) {
      this.img = img;
      setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
      setLayout(null);
   }
   
   public void paintComponent (Graphics g) {
      g.drawImage(img, 0, 0, null);
      
   }
}

public class ImageExample {
   public static void main(String[] args) {
//      JFrame frame = new JFrame("ImageExample");
//      frame.setSize(640, 460);
//      frame.setLocationRelativeTo(null);
//      frame.setVisible(true);
//      URL url = ImageExample.class.getClassLoader().getResource("lottoimage/back1.jpg");
//      System.out.println(url);
//      ImagePanel panel = new ImagePanel(new ImageIcon(url).getImage());
//      frame.add(panel);
//      frame.pack();
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}