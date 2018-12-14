
public class attackingCalc {

	public double attacking(int determination, int levelOfDiscipline, int motivating, int attacking, int tactics) {
		

	double attackStars = 0;
	
	int attackingStars = (attacking * 6) + (tactics * 3) + ((determination + levelOfDiscipline + motivating)*2);
	System.out.println(attackingStars);
	if (attackingStars < 29) {
		attackStars = 0.5;
	} else if (attackingStars >= 30 && attackingStars < 59  ) {
		attackStars = 1;
	} else if (attackingStars >= 60 && attackingStars <= 89  ) {
		attackStars = 1.5;
	} else if (attackingStars >= 90 && attackingStars <= 119  ) {
		attackStars = 2;
	} else if (attackingStars >= 120 && attackingStars <= 149  ) {
		attackStars = 2.5;
	} else if (attackingStars >= 150 && attackingStars <= 179  ) {
		attackStars = 3;
	} else if (attackingStars >= 180 && attackingStars <= 209  ) {
		attackStars = 3.5;
	} else if (attackingStars >= 210 && attackingStars <= 239 ) {
		attackStars = 4;
	} else if (attackingStars >= 240 && attackingStars <= 269  ) {
		attackStars = 4.5;
	} else if (attackingStars >=270) {
		attackStars = 5;
	}

return attackStars;
	
	}
	
	
	
}
