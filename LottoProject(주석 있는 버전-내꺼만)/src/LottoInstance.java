import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoInstance {
	//전역 객체변수로 사용하기 위해 static 객체변수로 생성
	static LottoInstance instance;
	private List<Integer> winnerLottoNumbers;

	public List<Integer> getWinnerLottoNumbers() {
		return winnerLottoNumbers;
	}
	
	// 회차가 바뀌면 winnerLottoNumbers의 값 하나하나를 다시 random번호로 초기화 한다.
	public List<Integer> resetWinnerLottoNumbers() {	// 회차 바뀌면 바뀌는 당첨번호 메소드
		Set<Integer> lottoNumber = new HashSet<Integer>();
		while (lottoNumber.size() < 7) {
			int random = (int) (Math.random()*45 + 1);
			lottoNumber.add(random);
		}
        winnerLottoNumbers = new ArrayList<>(lottoNumber);
        System.out.println("리셋된 당첨번호는 = " + winnerLottoNumbers);
		return winnerLottoNumbers;
	}

	//생성자를 priavte로 만들어 접근을 막는다
	private LottoInstance(){
		int bonus = 0;
		Set<Integer> lottoNumber = new HashSet<Integer>();
		
		// 7개의 중복이 아닌 랜덤 수를 만들었다.
		while (lottoNumber.size() < 7) {
			int random = (int) (Math.random()*45 + 1);
			lottoNumber.add(random);
			if (lottoNumber.size() == 6) {
				bonus = random;
			}
		}
		lottoNumber.remove(bonus);
        winnerLottoNumbers = new ArrayList<>(lottoNumber);
        Collections.sort(winnerLottoNumbers);	// set원소값을 가지는 arraylist를 오름차순으로 정렬했다.
        winnerLottoNumbers.add(bonus);
	}
	
	//getInstance 메소드를 통해 한번만 생성된 객체를 가져온다.
	public static LottoInstance getInstance(){
		if(instance == null){ //최초 한번만 new 연산자를 통하여 메모리에 할당한다.
			instance = new LottoInstance();
		}		
		return instance;
	}
}