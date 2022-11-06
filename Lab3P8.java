public class Lab3P8 {
    public static double Volum(int a){
        return (int) Math.pow(a, 3);
    }
    public static double Volum(float a){
        return (float)(Math.sqrt(Math.pow(a, 3)))/12;
    }
    public static double Volum(double a){
        return (Math.PI*4*Math.pow(a, 3))/3;
    }
    public static void main(String[] args) {
        double a= 4;
        System.out.println(Volum((int)a));
        System.out.println(Volum((float)a));
        System.out.println(Volum(a));
    }
}
