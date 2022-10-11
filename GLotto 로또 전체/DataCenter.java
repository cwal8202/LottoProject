
import java.util.ArrayList;
import java.util.List;

/**
 * 싱글턴 패턴 기반의 데이터 공유센터 제작
 * 회원정보 리스트 및 현재 로그인 한 계정의 정보를 조회 할 수 있는 기능 제공
 * 
 * memberList 
 *  -> 현재 가입된 회원의 리스트를 제공
 * myInfo
 *  -> 현재 로그인 한 계정의 정보를 담고 있음. 
 *  -> 로그인 한 계정의 정보가 없을 경우, null로 반환됨. 
 *  -> 상황에 따라 NullPointException 예외 처리가 필요할 수도 있음
 * @author adgjl
 *
 */
public class DataCenter {
   private static DataCenter dataCenter;
   private ArrayList<Member> memberList;   
   private ArrayList<Member> manegerList;   
   private Member myInfo;
   
   /**
    * 최초 인스턴스 생성 시, ArrayList<Member> 인스턴스화 및 myInfo Null처리 
    * 초기멤버 5명 설정 
    */
   public DataCenter () {
      memberList = new ArrayList<Member>();
      manegerList = new ArrayList<Member>();
      
      myInfo = null;
      memberList.add(new Member("이한주", "hanju1","11111111","474747","2111111"
            ,"010","1111","2122"));
      memberList.add(new Member("최준혁", "junhyuk2","22222222","292929","1111112"
            ,"010","2111","2222"));
      memberList.add(new Member("김정욱", "jungwook3","33333333","585858","2111113"
            ,"010","3111","2322"));
      memberList.add(new Member("최장호", "janhho4","44444444","363636","1111114"
            ,"010","4111","2422"));
      memberList.add(new Member("슈퍼맨", "super5","55555555","010101","2111115"
            ,"011","5111","2522"));   
      //관리자 list
      manegerList.add(new Member("관리자", "apapap6","66666666","010101","2111115"
            ,"011","5111","2522"));   
   }
   
   /**
    * 싱글턴 보장
    * 최초 getInstance() 호출 시, 인스턴스 생성 및 인스턴스 return
    * 최초가 아닌 경우, 인스턴스 return 
    * @return
    */
   public static DataCenter getInstance() {
      if(dataCenter ==null) {
         dataCenter = new DataCenter();
      }
      return dataCenter;
   }

   /**
    * 회원가입한 회원 리스트 조회
    * @return ArrayList<Member>
    */
   public ArrayList<Member> getMemberList() {
      return memberList;
   }

   /**
    * 회원 추가
    * @param Member
    */

   public void addMemberList(Member member) {
      this.memberList.add(member);
   }

   /**
    * 로그인 한 계정의 계정 정보 조회
    * @return Member
    */
   public Member getMyInfo() {
      return myInfo;
   }

   /**
    * 로그인 한 계정 정보 등록
    * 로그아웃 시, Null 기입 
    * @param Member
    */
   public void setMyInfo(Member myInfo) {
      this.myInfo = myInfo;
   }

   /**
    * @return the manegerList
    */
   public ArrayList<Member> getManegerList() {
      return manegerList;
   }

   /**
    * @param manegerList the manegerList to set
    */
   public void setManegerList(ArrayList<Member> manegerList) {
      this.manegerList = manegerList;
   }
   
}