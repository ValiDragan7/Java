import javax.swing.*;
public class Lab3P3{

public static void Patrat(int n){

	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1|| i==n || j==1 ||j == n)
				System.out.print('z' + " ");
			else 
				System.out.print("  ");
		}
		System.out.print("\n");
	}
}
public static void main(String[] args){
	String s = JOptionPane.showInputDialog("Introduceti lungimea patratului: ");
	int n1 = Integer.parseInt(s);
	Patrat(n1);
}
}