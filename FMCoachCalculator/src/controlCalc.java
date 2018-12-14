
public class controlCalc {
	
	public double ballControl(int determination, int levelOfDiscipline, int motivating, int technique, int mental) {
		

	double techStars = 0;
	
	int techniqueStars = (technique * 6) + (mental * 3) + ((determination + levelOfDiscipline + motivating)*2);
	System.out.println(techniqueStars);
	if (techniqueStars < 29) {
		techStars = 0.5;
	} else if (techniqueStars >= 30 && techniqueStars < 59  ) {
		techStars = 1;
	} else if (techniqueStars >= 60 && techniqueStars <= 89  ) {
		techStars = 1.5;
	} else if (techniqueStars >= 90 && techniqueStars <= 119  ) {
		techStars = 2;
	} else if (techniqueStars >= 120 && techniqueStars <= 149  ) {
		techStars = 2.5;
	} else if (techniqueStars >= 150 && techniqueStars <= 179  ) {
		techStars = 3;
	} else if (techniqueStars >= 180 && techniqueStars <= 209  ) {
		techStars = 3.5;
	} else if (techniqueStars >= 210 && techniqueStars <= 239 ) {
		techStars = 4;
	} else if (techniqueStars >= 240 && techniqueStars <= 269  ) {
		techStars = 4.5;
	} else if (techniqueStars >=270) {
		techStars = 5;
	}

return techStars;
	
	}
	

}
