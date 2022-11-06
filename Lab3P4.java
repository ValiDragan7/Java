public class Lab3P4{

public static boolean Perfect(int n){
int suma=0;
 for(int i= 1;i<=n/2;i++)
 {
	if(n% i== 0)
		suma += i;
 }
 if(suma== n)
	return true;
 else
 	return false;
}
public static void main(String[] args)
{
	int n;
	System.out.print("Numere perfecte intre 1 si 1000 sunt: ");
	for(n=1; n<=1000;n++){
		if(Perfect(n)== true)
			System.out.print(n+" ");
	}
}
}