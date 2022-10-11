import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class qweqwe {

	public static void main(String[] args) {
		Set<Integer> lottoNumber = new HashSet<Integer>();
		int bonus = 0;
		// 7개의 중복이 아닌 랜덤 수를 만들었다.
		while (lottoNumber.size() < 7) {
			int random = (int) (Math.random()*45 + 1);
			lottoNumber.add(random);
			if (lottoNumber.size() == 6) {
				bonus = random;
			}
		}
		System.out.println("보너스" + bonus);
		lottoNumber.remove(bonus);
		//랜덤 수 7개 뽑았다.
		// set 원소 7개를 필드의 arraylist에 넣었다
		List<Integer> winnerLottoNumbers = new ArrayList<>(lottoNumber);
		winnerLottoNumbers.add(bonus);
        Collections.sort(winnerLottoNumbers);	// set원소값을 가지는 arraylist를 오름차순으로 정렬했다.
 
        System.out.println(winnerLottoNumbers);
//        System.out.println(lottoList.get(0));	// 오름차순 된 list의 첫번째 원소 값을 보고 싶을때 
	}

}
