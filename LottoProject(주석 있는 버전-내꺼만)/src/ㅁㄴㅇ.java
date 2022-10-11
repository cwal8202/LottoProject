import javax.swing.JFrame;

public class ㅁㄴㅇ extends JFrame{
	public static void main(String[] args) {
		LottoInstance lotto = LottoInstance.getInstance();
		System.out.println("당첨번호 = " + lotto.getWinnerLottoNumbers());
		lotto.resetWinnerLottoNumbers();
		System.out.println("당첨번호 = " + lotto.getWinnerLottoNumbers());
	}
}
