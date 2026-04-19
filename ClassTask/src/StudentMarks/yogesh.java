package StudentMarks;

public class yogesh {
	public static void main(String[] args) {
		
		Rakesh rakesh = new Rakesh();
		
		System.out.println("marks of science => "+rakesh.science +" TOtal marks of science => "+rakesh.TotalMarkScience);
	    System.out.println("marks of math => "+rakesh.math+" Total mark of math"+rakesh.math);
	    System.out.println("marks of chemisrty => "+rakesh.chemistry+" Total mark of math"+rakesh.TotalMarkChemistry);
	    System.out.println("marks of physics => "+rakesh.physics+" Total marks os physics => "+rakesh.TOtalMarkPhysics);
	    System.out.println("marks of biology => "+rakesh.biology+" "
	    		+ "Total mark of biology => "+rakesh.TotalMarkBiology);
	    
	    int mark = rakesh.science + rakesh.math + rakesh.chemistry + rakesh.physics + rakesh.biology;
	    int totalParcentageOfRakesh =rakesh.TotalMarkScience + rakesh.TotlMarkMath +rakesh.TotalMarkChemistry + rakesh.TOtalMarkPhysics +rakesh.TotalMarkBiology;
	    
	    double total=(mark *100)/totalParcentageOfRakesh;
	    System.out.println("Final percentage => "+total);
	    
	    
	    
	    Suresh suresh = new Suresh();
	    System.out.println("marks of science => "+suresh.science+" Total marks of science => "+suresh.MarkOfScience);
	    System.out.println("marks of math => "+suresh.math+" TOtal marks of maths => "+suresh.MarkOfMath);
	    System.out.println("marks of chemistry => "+suresh.chemistry+" Totak marks of chemistry => "+suresh.MarkOfChemistry);
	    System.out.println("marks of physics => "+suresh.physics+" Total marks of physics => "+suresh.physics);
	    System.out.println("marks of biology => "+suresh.biology+" TOtal marks of biology => "+suresh.MarkOfBiology);
	    
	    int SureshMarks = suresh.science + suresh.math + suresh.chemistry + suresh.physics + suresh.biology;
	    int SureshTOtalMarks = suresh.MarkOfScience + suresh.MarkOfMath + suresh.MarkOfChemistry + suresh.MarkOfPhysics +suresh.MarkOfBiology;
	    double FinalPercentageOfSuresh = (SureshMarks * 100)/SureshTOtalMarks;
	    System.out.println("Percentage of Suresh = "+FinalPercentageOfSuresh);
	}

}
