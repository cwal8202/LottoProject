import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinnerCreate {
   private static WinnerCreate winnerCreate;
   private Map<Integer, List> winnumList;
   private ArrayList<Integer> oneList;   
   
   static int gamecount =1;
   LottoInstance sn;

   
   public WinnerCreate() {
      winnumList = new HashMap<Integer, List>();
      sn = new LottoInstance();
      winnumList.put(gamecount, sn.getWinnerLottoNumbers());
   }
   
   public static WinnerCreate getInstance() {
      if(winnerCreate ==null) {
         winnerCreate = new WinnerCreate();
      }
      return winnerCreate;
   }
   
   public void addwinnumList(int count, List a) {
      count++;
      sn = new LottoInstance();
      this.winnumList.put(count, sn.getWinnerLottoNumbers());
   }
   
   /**
    * @return the wn

   /**
    * @return the gamecount
    */
   public int getGamecount() {
      return gamecount;
   }

   /**
    * @param gamecount the gamecount to set
    */
   public void setGamecount(int gamecount) {
      this.gamecount = gamecount;
   }



   /**
    * @return the winnumList
    */
   public Map<Integer, List> getWinnumList() {
      return winnumList;
   }

   /**
    * @param winnumList the winnumList to set
    */
   public void setWinnumList(Map<Integer, List> winnumList) {
      this.winnumList = winnumList;
   }

   static void main (String args[]) {
      
   System.out.println();
   System.out.println(WinnerCreate.getInstance().winnumList);
   }



}