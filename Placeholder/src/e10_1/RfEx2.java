package e10_1;

public class RfEx2 {
	public class Test {
		private int low, high;

		boolean includes(final int arg) {
			return arg >= getLow() && arg <= high;
		}

		private int getLow() {
			return low;
		}
	}

}