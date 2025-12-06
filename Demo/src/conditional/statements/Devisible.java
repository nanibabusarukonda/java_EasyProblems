package conditional.statements;

public class Devisible {
	public String Method(int num) {
		if((num%5==0) &&(num%11==0)) {
			return "Devisible";
		}
		else
			return "not Devisible";
	}

	public static void main(String[] args) {

Devisible D=new Devisible();
String result=D.Method(55);
System.out.println(result);

	}

}
