
public class shootingCalc {

	public double shooting(int determination, int levelOfDiscipline, int motivating, int technique, int attacking) {
		

	double shootStars = 0;
	
	int shootingStars = (technique * 6) + (attacking * 3) + ((determination + levelOfDiscipline + motivating)*2);
	System.out.println(shootingStars);
	if (shootingStars < 29) {
		shootStars = 0.5;
	} else if (shootingStars >= 30 && shootingStars < 59  ) {
		shootStars = 1;
	} else if (shootingStars >= 60 && shootingStars <= 89  ) {
		shootStars = 1.5;
	} else if (shootingStars >= 90 && shootingStars <= 119  ) {
		shootStars = 2;
	} else if (shootingStars >= 120 && shootingStars <= 149  ) {
		shootStars = 2.5;
	} else if (shootingStars >= 150 && shootingStars <= 179  ) {
		shootStars = 3;
	} else if (shootingStars >= 180 && shootingStars <= 209  ) {
		shootStars = 3.5;
	} else if (shootingStars >= 210 && shootingStars <= 239 ) {
		shootStars = 4;
	} else if (shootingStars >= 240 && shootingStars <= 269  ) {
		shootStars = 4.5;
	} else if (shootingStars >=270) {
		shootStars = 5;
	}

return shootStars;
	
	}
	
	
	
	
}
