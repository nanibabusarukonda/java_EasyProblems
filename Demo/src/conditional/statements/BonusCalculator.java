package conditional.statements;

public class BonusCalculator {

	public  double calculatorBonus (int experience,int rating, double salary) {
		if(experience>=5 && rating>=9 ) {
			return  salary*0.50;//50% bonus
		}
		else if((experience>=3 && experience<5) && (rating>=7 && rating<9) ) {
			return  salary *0.30;//30% bonus
		}
		else if((experience>=1 && experience<3) && (rating>=5 && rating<7 )  ) {
			return  salary *0.10;// 10% bonus
		}
		
		else {
			return 0;// no bonus
	}
	}
	public static void main(String[] args) {
		BonusCalculator obj=new  BonusCalculator();
double result=obj.calculatorBonus(4,7,60000.0);
System.out.println(result);
	}

}