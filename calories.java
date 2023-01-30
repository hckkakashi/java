public class calories{
    public static void main(String [] args){
    
    double weight=150;
    double Tweight=150/2.2;
    
    double running=10;
    double calorie1= 0.0175* running * Tweight;
    
    double basketball=8;
    double calorie2= 0.0175* basketball* Tweight;
    
    double sleeping=1;
    double calorie3= 0.0175* sleeping * Tweight;
    
    double totalcalories= calorie1 + calorie2+ calorie3;
    System.out.println("Total calories burned by a 150 pound person ="+totalcalories);
    }}