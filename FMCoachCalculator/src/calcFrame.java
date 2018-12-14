import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calcFrame {
	
	public void Frame() {
		
		JFrame frame;
		frame = new JFrame();
		frame.setLayout(null);
		
		//attribute entry labels
		JLabel ld;
		JLabel lm;
		JLabel ll;
		JLabel lf;
		JLabel lk;
		JLabel lt;
		JLabel lte;
		JLabel lme;
		JLabel ldef;
		JLabel la;
		
		//attribute entry textfields
		JTextField textDetermination = new JTextField(20); 
		JTextField textDiscipline = new JTextField(20);
		JTextField textMotivating = new JTextField(20);
		JTextField textFitness = new JTextField(20);
		JTextField textKeeping = new JTextField(20);
		JTextField textTactics = new JTextField(20);
		JTextField textTechnique = new JTextField(20);
		JTextField textMental = new JTextField(20);
		JTextField textDefending = new JTextField(20);
		JTextField textAttacking = new JTextField(20);
		
		//result label
		JLabel resultfitness;
		JLabel resultkeeping;
		JLabel resulttactics;
		JLabel resultballcontrol;
		JLabel resultdefending;
		JLabel resultattacking;
		JLabel resultshooting;
		
	    resultfitness=new JLabel("Fitness Stars:");  
	    resultkeeping=new JLabel("Goalkeeping Stars:");  
	    resulttactics=new JLabel("Tactical Stars:");  
	    resultballcontrol=new JLabel("Ball Control Stars:");  
	    resultdefending=new JLabel("Defending Stars:");
	    resultattacking=new JLabel("Attacking Stars:");
	    resultshooting=new JLabel("Shooting Stars:");
		
	    ld=new JLabel("Determination:");  
	    ll=new JLabel("Level of Discipline:");  
	    lm=new JLabel("Motivating:");  
	    lf=new JLabel("Fitness:");  
	    lk=new JLabel("GoalKeeping:");
	    lt=new JLabel("Tactics:");
	    lte=new JLabel("Technique:");
	    lme=new JLabel("Mental:");
	    ldef=new JLabel("Defending:");
	    la=new JLabel("Attacking:");
	    
	    
	    textDetermination.setBounds(120, 62, 30, 20); 
	    textDiscipline.setBounds(120, 92, 30, 20);
	    textMotivating.setBounds(120, 122, 30, 20);
	    textFitness.setBounds(120, 152, 30, 20);
	    textKeeping.setBounds(120, 182, 30, 20);
	    textTactics.setBounds(120, 212, 30, 20);
	    textTechnique.setBounds(120, 242, 30, 20);
	    textMental.setBounds(120, 272, 30, 20);
	    textDefending.setBounds(120, 302, 30, 20);
	    textAttacking.setBounds(120, 332, 30, 20);
	    
	    ld.setBounds(0, 20, 150, 100);ll.setBounds(0, 50, 150, 100);lm.setBounds(0, 80, 150, 100);lf.setBounds(0, 110, 150, 100);lk.setBounds(0, 140, 150, 100);lt.setBounds(0, 170, 150, 100);lte.setBounds(0, 200, 150, 100);lme.setBounds(0, 230, 150, 100);ldef.setBounds(0, 260, 150, 100);la.setBounds(0, 290, 150, 100);    
	    resultfitness.setBounds(400, 20, 150, 100);resultkeeping.setBounds(400, 50, 150, 100);resulttactics.setBounds(400, 80, 150, 100);resultballcontrol.setBounds(400, 110, 150, 100);resultattacking.setBounds(400, 140, 150, 100);resultdefending.setBounds(400, 170, 150, 100);resultshooting.setBounds(400, 200, 150, 100);
	    
	    frame.add(ld);frame.add(lm);frame.add(ll);frame.add(lf);frame.add(lk);frame.add(lt);frame.add(lte);frame.add(lme);frame.add(ldef);frame.add(la);
	    frame.add(resultfitness);frame.add(resultkeeping);frame.add(resulttactics);frame.add(resultballcontrol);frame.add(resultdefending);frame.add(resultattacking);frame.add(resultshooting);    
	    frame.add(textDetermination);frame.add(textMotivating);frame.add(textDiscipline);frame.add(textFitness);frame.add(textKeeping);frame.add(textTactics);frame.add(textTechnique);frame.add(textMental);frame.add(textDefending);frame.add(textAttacking);
	    
	    JButton b = new JButton("Calculate Stars");   
	    b.setBounds(200, 100, 150, 50);
	    frame.add(b);
	    b.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	    		String determination;
	    		String levelOfDiscipline;
	    		String motivating;
	    		String fitness;
	    		String keeping;
	    		String tactics;
	    		String mental;
	    		String technique;
	        	String defending;
	        	String attacking;
	        	
	        	determination = textDetermination.getText();
	        	int detfinal = Integer.parseInt(determination);
	        	
	        	motivating = textMotivating.getText();
	        	int motfinal = Integer.parseInt(motivating);
	        	
	        	levelOfDiscipline = textDiscipline.getText();
	        	int lodfinal = Integer.parseInt(levelOfDiscipline);
	        	
	        	fitness = textFitness.getText();
	        	int fitfinal = Integer.parseInt(fitness);
	        	
	        	keeping = textKeeping.getText();
	        	int keepfinal = Integer.parseInt(keeping);
	        	
	        	tactics = textTactics.getText();
	        	int tacticfinal = Integer.parseInt(tactics);
	        	
	        	technique = textTechnique.getText();
	        	int techniquefinal = Integer.parseInt(technique);
	        	
	        	mental = textMental.getText();
	        	int mentalfinal = Integer.parseInt(mental);
	        	
	        	defending = textDefending.getText();
	        	int defendingfinal = Integer.parseInt(defending);
	        	
	        	attacking = textAttacking.getText();
	        	int attackingfinal = Integer.parseInt(attacking);
	        	
	    		fitnessCalc fitnessCalc = new fitnessCalc();
	    		double fitStars = fitnessCalc.fitness(detfinal, lodfinal, motfinal, fitfinal);
	    		
	    		keepingCalc keepingCalc = new keepingCalc();
	    		double keepStars = keepingCalc.keeping(detfinal, lodfinal, motfinal, keepfinal, tacticfinal);
	    		
	    		tacticsCalc tacticsCalc = new tacticsCalc();
	    		double tactStars = tacticsCalc.tactics(detfinal, lodfinal, motfinal, tacticfinal);
	    		
	    		controlCalc controlCalc = new controlCalc();
	    		double techStars = controlCalc.ballControl(detfinal, lodfinal, motfinal, techniquefinal, mentalfinal);
	    		
	    		defendingCalc defendingCalc = new defendingCalc();
	    		double defStars = defendingCalc.defending(detfinal, lodfinal, motfinal, defendingfinal, tacticfinal);
	    		
	    		attackingCalc attackingCalc = new attackingCalc();
	    		double attStars = attackingCalc.attacking(detfinal, lodfinal, motfinal, attackingfinal, tacticfinal);
	    		
	    		shootingCalc shootingCalc = new shootingCalc();
	    		double shootStars = shootingCalc.shooting(detfinal, lodfinal, motfinal, techniquefinal, attackingfinal);
	    		
	    		resultfitness.setText("Fitness Stars:" + fitStars);
	    		resultkeeping.setText("Goalkeeping Stars:" + keepStars);
	    		resulttactics.setText("Tactical Stars:" + tactStars);
	    		resultballcontrol.setText("Ball Control Stars:" + techStars);
	    		resultdefending.setText("Defending Stars:" + defStars);
	    		resultattacking.setText("Attacking Stars:" + attStars);
	    		resultshooting.setText("Shooting Stars:" + shootStars);

	        }
	    });
		
	

	   
		frame.setSize(600,600);
		frame.setVisible(true);		
}
}
