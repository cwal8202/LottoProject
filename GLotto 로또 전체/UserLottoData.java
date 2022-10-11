import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;

public class UserLottoData {
   //전역 객체변수로 사용하기 위해 static 객체변수로 생성
   static UserLottoData dataInstance;
   
   // UserLottoData의 필드
   private List<Integer> userAll;   //user로또넘버 1~5줄    // 유저 아이디 = user로 가정했을때 user의 1번째 줄 로또 번호 6개

   
   private List<Integer> winnerNumbers;      // user가 구매한 로또의 당첨번호
   
//   private List<JLabel> userRankingAll; // 유저가 구매한 1~5번째 줄 로또의 결과 담은 리스트
   private List<String> userRankingAll;
   private HashMap<String, String> userLottoResult;
   //////////////////////////////// Get메소드 시작 /////////////////////////////////////
   public List<Integer> getUserAll() {
      return userAll;
   }

   public List<Integer> getWinnerNumbers() {
      return winnerNumbers;
   }
   
   public List<String> getUserRankingAll() {
      return userRankingAll;
   }
   
   ////////////////////////////////Get메소드 끝 /////////////////////////////////////
   

   ////////////////////////////////Set메소드 시작 /////////////////////////////////////
   public void setUserAll(List<Integer> userAll) {
      this.userAll = userAll;
   }
   
   public void setWinnerNumbers(List<Integer> winnerNumbers) {
      this.winnerNumbers = winnerNumbers;
   }

   public void setUserRankingAll(List<String> userRankingAll) {
      this.userRankingAll = userRankingAll;
   }

   ////////////////////////////////Set메소드 끝 /////////////////////////////////////
   
   //생성자를 priavte로 만들어 접근을 막는다
   private UserLottoData(){
      userAll = new ArrayList<>();
      userRankingAll = new ArrayList<>();
   }
   
   //getInstance 메소드를 통해 한번만 생성된 객체를 가져온다.
   public static UserLottoData getInstance(){
      if(dataInstance == null){ //최초 한번만 new 연산자를 통하여 메모리에 할당한다.
         dataInstance = new UserLottoData();
      }      
      return dataInstance;
   }
}