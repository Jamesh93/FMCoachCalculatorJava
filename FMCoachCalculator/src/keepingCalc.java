
public class keepingCalc {
	
	public double keeping(int determination, int levelOfDiscipline, int motivating, int keeping, int tactics) {
		

	double keepStars = 0;
	
	int keepingStars = (keeping * 8) + (tactics * 3) + ((determination + levelOfDiscipline + motivating) * 2);
	
	
	if (keepingStars < 39) {
		keepStars = 0.5;
	} else if (keepingStars >= 40 && keepingStars < 79  ) {
		keepStars = 1;
	} else if (keepingStars >= 80 && keepingStars <= 119  ) {
		keepStars = 1.5;
	} else if (keepingStars >= 120 && keepingStars <= 159  ) {
		keepStars = 2;
	} else if (keepingStars >= 160 && keepingStars <= 199  ) {
		keepStars = 2.5;
	} else if (keepingStars >= 200 && keepingStars <= 239  ) {
		keepStars = 3;
	} else if (keepingStars >= 240 && keepingStars <= 279  ) {
		keepStars = 3.5;
	} else if (keepingStars >= 280 && keepingStars <= 319  ) {
		keepStars = 4;
	} else if (keepingStars >= 320 && keepingStars <= 359  ) {
		keepStars = 4.5;
	} else if (keepingStars >= 360) {
		keepStars = 5;
	}

return keepStars;
	
	}
	

}
