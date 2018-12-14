
public class defendingCalc {
	
	public double defending(int determination, int levelOfDiscipline, int motivating, int defending, int tactics) {
		

	double defStars = 0;
	
	int defendingStars = (defending * 8) + (tactics * 3) + ((determination + levelOfDiscipline + motivating) * 3);
	
	System.out.println(defendingStars);
	
	if (defendingStars < 39) {
		defStars = 0.5;
	} else if (defendingStars >= 40 && defendingStars < 79  ) {
		defStars = 1;
	} else if (defendingStars >= 80 && defendingStars <= 119  ) {
		defStars = 1.5;
	} else if (defendingStars >= 120 && defendingStars <= 159  ) {
		defStars = 2;
	} else if (defendingStars >= 160 && defendingStars <= 199  ) {
		defStars = 2.5;
	} else if (defendingStars >= 200 && defendingStars <= 239  ) {
		defStars = 3;
	} else if (defendingStars >= 240 && defendingStars <= 279  ) {
		defStars = 3.5;
	} else if (defendingStars >= 280 && defendingStars <= 319 ) {
		defStars = 4;
	} else if (defendingStars >= 320 && defendingStars <= 359  ) {
		defStars = 4.5;
	} else if (defendingStars >=360) {
		defStars = 5;
	}

return defStars;
	
	}
	
	

}
