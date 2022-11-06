
public class Lab3P2{

public static double transformareInGradeCelsius(double f){
	return (double)5/9*(f-32);
}
public static double transformareInGradeFahrenheit(double c){
	return (double)9/5*c+32;
}

public static void main(String[] args){

	double f = 50;
	double c= 30;
	double n1=transformareInGradeCelsius(f);
	System.out.print(f+ " grade fahrenheit in celsius este ");
	System.out.println(n1+" grade");
	double n2= transformareInGradeFahrenheit(c);
	System.out.print(c+ " grade celsius in fahrenheit este ");
	System.out.print(n2 + " grade");
}
}