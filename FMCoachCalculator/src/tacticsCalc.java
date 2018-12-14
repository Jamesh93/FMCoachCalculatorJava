
public class tacticsCalc {
	
	public double tactics(int determination, int levelOfDiscipline, int motivating, int tactics) {
		

	double tactStars = 0;
	
	int tacticStars = (tactics * 2) + (determination + levelOfDiscipline + motivating);
	System.out.println(tacticStars);
	
	if (tacticStars < 9) {
		tactStars = 0.5;
	} else if (tacticStars >= 10 && tacticStars < 19  ) {
		tactStars = 1;
	} else if (tacticStars >= 20 && tacticStars <= 29  ) {
		tactStars = 1.5;
	} else if (tacticStars >= 30 && tacticStars <= 39  ) {
		tactStars = 2;
	} else if (tacticStars >= 40 && tacticStars <= 49  ) {
		tactStars = 2.5;
	} else if (tacticStars >= 50 && tacticStars <= 59  ) {
		tactStars = 3;
	} else if (tacticStars >= 60 && tacticStars <= 69  ) {
		tactStars = 3.5;
	} else if (tacticStars >= 70 && tacticStars <= 79 ) {
		tactStars = 4;
	} else if (tacticStars >= 80 && tacticStars <= 89  ) {
		tactStars = 4.5;
	} else if (tacticStars >=90) {
		tactStars = 5;
	}

return tactStars;
	
	}
	
	

}
