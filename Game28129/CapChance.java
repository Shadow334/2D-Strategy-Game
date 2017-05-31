// ignore these


import java.util.Scanner;
public class CapChance {

    public static double factorial(double n) {
        if (n == 1 || n == 0) {return 1;}
        else {
            for (double i = (n - 1); i > 0; i--) {
                n = n * i;
            }
        }
        return n;
    }

    public static double nChooseX(double n, double x) {
        if (n < x) {return 0;}
        if (n == x) {return 1;}
        double j;
        double y = 0;
        double z = 0;

        y = n - x; 
        z = factorial(y) * factorial(x);
        if(z <= 0) {z = 1;}
        j = factorial(n)/z;
        return j;
    }

    public static double binomialTheorem(double n, double k, double p) {
        double probability = 0.0;
        probability = nChooseX(n, k) * Math.pow(p, k) * Math.pow((1 - p), (n - k));
        return probability;
    }

    public static void main(String[] args) {

        double start[] = new double[8];
        double growth[] = new double[8];
        double cap[] = new double[8];
        double need[] = new double[8];
        double bonus[] = new double[8];
        double prob[] = new double[8];
        int maxLevel = 0;
        System.out.println("Type 1 if the unit has yet to promote; 2 if he or she is a prepromote, a laguz, or Sothe:");
        Scanner input3 = new Scanner(System.in); 
        int promo; 
        promo = input3.nextInt();
        if(promo == 1) {maxLevel = 39;}
        else {maxLevel = 20;}

        System.out.println("Type the starting level of the unit:");
        Scanner input4 = new Scanner(System.in); 
        int level; 
        level = input4.nextInt();
        if (promo == 1) {
            System.out.println("Please input the starting stat, growth rates, caps, and promotion");
            System.out.println("bonuses (if any) for each area for the unit in question:");
        } else {
            System.out.println("Please input the starting stat, growth rates,");
            System.out.println("and caps for each area for the unit in question:");
        }
        for(int i = 0; i < start.length; i++) {
            switch (i) {
                case 0: System.out.println("HP:"); break;
                case 1: System.out.println("STR:"); break;
                case 2: System.out.println("MAG:"); break;
                case 3: System.out.println("SKILL:"); break;
                case 4: System.out.println("SP:"); break;
                case 5: System.out.println("LCK:"); break;
                case 6: System.out.println("DEF:"); break;
                case 7: System.out.println("RES:"); break;
                default: System.out.println("Invalid stat.");break;
            }
            Scanner input = new Scanner(System.in); 
            double stat; 
            stat = input.nextDouble();
            Scanner input1 = new Scanner(System.in); 
            double growth1; 
            growth1 = input1.nextDouble();
            Scanner input2 = new Scanner(System.in); 
            double cap1; 
            cap1 = input2.nextDouble();
            double bonus1 = 0;
            if (promo == 1) {
                Scanner input5 = new Scanner(System.in); 
                bonus1 = input5.nextDouble();
            }

            start[i] = stat;
            growth[i] = growth1;
            cap[i] = cap1;
            bonus[i] = bonus1;

            need[i] = cap[i] - bonus[i] - start[i];
            prob[i] = 0.0;
        }

        for(int j = 0; j < prob.length; j++) {
            for(double k = need[j]; k <= (maxLevel - level); k++) {
                if (need[j] == 0) {prob[j] = 100; break;}
                if (prob[j] >= 100) {prob[j] = 100; break;}
                prob[j] = prob[j] + 100 * binomialTheorem(maxLevel, k, growth[j]);
            }
        }
        for(int l = 0; l < prob.length; l++) {
            switch (l) {
                case 0: System.out.println("The chance to cap HP is " + prob[l] + "%."); break;
                case 1: System.out.println("The chance to cap STR is " + prob[l] + "%."); break;
                case 2: System.out.println("The chance to cap MAG is " + prob[l] + "%."); break;
                case 3: System.out.println("The chance to cap SKILL is " + prob[l] + "%."); break;
                case 4: System.out.println("The chance to cap SP is " + prob[l] + "%."); break;
                case 5: System.out.println("The chance to cap LCK is " + prob[l] + "%."); break;
                case 6: System.out.println("The chance to cap DEF is " + prob[l] + "%."); break;
                case 7: System.out.println("The chance to cap RES is " + prob[l] + "%."); break;
                default: System.out.println("Invalid stat.");break;
            }
        }
    }
}
