package e10_1;

public class RfEx1 {
	private static final int DEFAULT_AMOUNT = 0;

	public void printAmount() {
		int amount = DEFAULT_AMOUNT;
		for (int i = 1; i < 5; i++) {
			amount += i;
		}
		printDetails(amount);
	}
	//

	private void printDetails(int amount) {
		// TODO Auto-generated method stub
	}
}
