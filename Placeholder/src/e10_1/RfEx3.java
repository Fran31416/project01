package e10_1;

public class RfEx3 {
	int _numberOfLateDeliveries = 0;

	int getRating() {
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}

	boolean moreThanFiveLateDeliveries() {
/**//**/
		return _numberOfLateDeliveries > 5;
	}
}