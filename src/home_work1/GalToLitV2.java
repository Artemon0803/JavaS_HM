package home_work1;

//Task 1.2 from page 52

public class GalToLitV2 {
    public static void main(String[] args){
        double gallons, liters;
        int counter=0;

        for(gallons=1;gallons<=100;gallons++){
            liters=gallons*3.7854;
            System.out.println(gallons+" gallons = "+liters+" liters");
            counter++;
            if(counter==10){
                System.out.println();
                counter=0;
            }
        }
    }
}
