package WebClasses;

public class Game {

	private Boolean status = false;
	int dice1;
	int dice2;

	public String play() {
		if (status) {
			dice2 = (int) (1 + Math.random() * 6);
			status = false;
			if (dice2 > dice1) {
				return "First throw was " + String.valueOf(dice1) + "\nSecond throw you hit " + String.valueOf(dice2)
				+ ", You Won";
			} else if (dice2 == dice1) {
				return "First throw was " + String.valueOf(dice1) + "\nSecond throw you hit " + String.valueOf(dice2)
				+ ", It's a Draw";
			}

			else {
				return "First throw was " + String.valueOf(dice1) + "\nSecond throw you hit " + String.valueOf(dice2)
				+ ", You Lost";
			}

		} else {
			dice1 = (int) (1 + Math.random() * 6);
			status = true;
			return "First throw you hit " + String.valueOf(dice1);
		}

	}

}
