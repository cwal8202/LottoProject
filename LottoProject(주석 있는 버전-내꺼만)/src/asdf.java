import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class asdf {
	
	public static void main(String[] args) {
		LottoInstance lI = LottoInstance.getInstance();
		lI.getLottoList();
		
		LottoInstance lI2 = LottoInstance.getInstance();
		lI2.getLottoList();
		
		
		LottoNumber lN = new LottoNumber();
		LottoNumber lN2 = new LottoNumber();
	}
}

class LottoNumber {
	// 오름차순 랜덤 숫자 7개 배열을 반환하는 메소드를 만들었다.
	List<Integer> lottoList;		// 당첨번호
	LottoNumber() {
		Set<Integer> lottoNumber = new HashSet<Integer>();
		
		// 7개의 중복이 아닌 랜덤 수를 만들었다.
		while (lottoNumber.size() < 7) {
			int random = (int) (Math.random()*45 + 1);
			lottoNumber.add(random);
		}
		//랜덤 수 7개 뽑았다.
		// set 원소 7개를 필드의 arraylist에 넣었다
        lottoList = new ArrayList<>(lottoNumber);
        Collections.sort(lottoList);	// set원소값을 가지는 arraylist를 오름차순으로 정렬했다.
 
        System.out.println(lottoList);
//        System.out.println(lottoList.get(0));	// 오름차순 된 list의 첫번째 원소 값을 보고 싶을때 
	}
	
}