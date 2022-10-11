import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
	private static Member member;
	private String Name;
	private String ID;
	private String Pw;
	private String Fnum; // 주민 앞자리
	private String Bnum; // 주민 뒷자리
	private String FPhone;
	private String MPhone; // 중간 전화번호
	private String LPhone; // 뒷 전화번호
	private ArrayList<Integer> MyNumList= new ArrayList<>();
	private boolean membercheck = false;
	private Map<Integer, List> MyMap = new HashMap<Integer, List>(); // 나의 로또번호 리스트
	private Map<Integer, List> TotalNumlist = new HashMap<Integer, List>(); // 유저가 선택한 번호들 리스트
	private Map<Integer, List> UserRankingList = new HashMap<Integer, List>(); // 유저의 당첨 여부 리스트

	public Member() {
		MyMap.put(WinnerCreate.gamecount, MyNumList);
	}

	public Member(String name, String iD, String pw, String fnum, String bnum, String fPhone, String mPhone,
			String lPhone) {
		super();
		Name = name;
		ID = iD;
		Pw = pw;
		Fnum = fnum;
		Bnum = bnum;
		FPhone = fPhone;
		MPhone = mPhone;
		LPhone = lPhone;
	}

	public static Member getInstance() {
		if (member == null) {
			member = new Member();
		}
		return member;
	}

	/**
	 * S
	 * 
	 * @return the myNumlist
	 */

	public String getName() {
		return Name;
	}

	public boolean getMembercheck() {
		return membercheck;
	}

	public void setMembercheck(boolean membercheck) {
		this.membercheck = membercheck;
	}

	public ArrayList<Integer> getMyNumList() {
		return MyNumList;
	}

	public void setMyNumList(ArrayList<Integer> myNumList) {
		MyNumList = myNumList;
	}

	public Map<Integer, List> getMyMap() {
		return MyMap;
	}

	public Map<Integer, List> getTotalNumlist() {
		return TotalNumlist;
	}

	public Map<Integer, List> getUserRankingList() {
		return UserRankingList;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setMyNumlist(Map<Integer, List> myNumlist) {
		MyMap = myNumlist;
	}

	public void setTotalNumlist(Map<Integer, List> totalNumlist) {
		TotalNumlist = totalNumlist;
	}

	public void setUserRankingList(Map<Integer, List> userRankingList) {
		UserRankingList = userRankingList;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	public String getFnum() {
		return Fnum;
	}

	public void setFnum(String fnum) {
		Fnum = fnum;
	}

	public String getBnum() {
		return Bnum;
	}

	public void setBnum(String bnum) {
		Bnum = bnum;
	}

	public String getFPhone() {
		return FPhone;
	}

	public void setFPhone(String fPhone) {
		FPhone = fPhone;
	}

	public String getMPhone() {
		return MPhone;
	}

	public void setMPhone(String mPhone) {
		MPhone = mPhone;
	}

	public String getLPhone() {
		return LPhone;
	}

	public void setLPhone(String lPhone) {
		LPhone = lPhone;
	}
}