package home_work1;

public class InchToMeter {
    public static void main(String[] args) {
        double Inch, Meter;
        int counter=0;
        for(Inch=1;Inch<=144;Inch++){
            Meter=Inch*(1/39.37);
            System.out.println(Inch+" Inch = "+Meter+" Meter");
            counter++;
            if(counter==12){
                System.out.println();
                counter=0;
            }
        }
    }
}
