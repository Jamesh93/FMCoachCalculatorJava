
public class fitnessCalc {
	
	public double fitness(int determination, int levelOfDiscipline, int motivating, int fitness) {
	

	double fitStars = 0;
	
	int fitnessStars = (fitness * 9) + ((determination + levelOfDiscipline + motivating) * 2);
	
	
	if (fitnessStars < 29) {
		fitStars = 0.5;
	} else if (fitnessStars >= 29 && fitnessStars < 59  ) {
		fitStars = 1;
	} else if (fitnessStars >= 60 && fitnessStars <= 89  ) {
		fitStars = 1.5;
	} else if (fitnessStars >= 90 && fitnessStars <= 119  ) {
		fitStars = 2;
	} else if (fitnessStars >= 120 && fitnessStars <= 149  ) {
		fitStars = 2.5;
	} else if (fitnessStars >= 150 && fitnessStars <= 179  ) {
		fitStars = 3;
	} else if (fitnessStars >= 180 && fitnessStars <= 209  ) {
		fitStars = 3.5;
	} else if (fitnessStars >= 210 && fitnessStars <= 239  ) {
		fitStars = 4;
	} else if (fitnessStars >= 240 && fitnessStars <= 269  ) {
		fitStars = 4.5;
	} else if (fitnessStars >= 270) {
		fitStars = 5;
	}

return fitStars;
	
	}

}
