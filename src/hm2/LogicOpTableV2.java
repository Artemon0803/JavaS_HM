package hm2;

public class LogicOpTableV2 {
    static int convert(boolean val){
        return val ? 1 : 0;
    }
    static void print(boolean p, boolean q){
        System.out.print(convert(p) + "\t" + convert(q) +"\t");
        System.out.print(convert(p&q) + "\t" + convert(p|q) + "\t");
        System.out.println(convert(p^q) + "\t" + convert(!p));
    }
    public static void main(String[] args) {
        //Compact version
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        print(true, true);
        print(true, false);
        print(false, true);
        print(false, false);


        //Full version
        /*
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p=true; q=true;
        if(p) System.out.print("1\t");
        else System.out.print("0\t");
        if(q) System.out.print("1\t");
        else System.out.print("0\t");
        if((p&q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((p|q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        //
        if((p^q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((!p)) System.out.println("1");
        else System.out.println("0");

        p=true; q=false;
        if(p) System.out.print("1\t");
        else System.out.print("0\t");
        if(q) System.out.print("1\t");
        else System.out.print("0\t");
        if((p&q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((p|q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        //
        if((p^q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((!p)) System.out.println("1");
        else System.out.println("0");

        p=false; q=true;
        if(p) System.out.print("1\t");
        else System.out.print("0\t");
        if(q) System.out.print("1\t");
        else System.out.print("0\t");
        if((p&q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((p|q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        //
        if((p^q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((!p)) System.out.println("1");
        else System.out.println("0");

        p=false; q=false;
        if(p) System.out.print("1\t");
        else System.out.print("0\t");
        if(q) System.out.print("1\t");
        else System.out.print("0\t");
        if((p&q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((p|q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        //
        if((p^q)) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if((!p)) System.out.println("1");
        else System.out.println("0");
         */
    }
}
