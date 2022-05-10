package PrimitiveDataTypes;

public class Implict_Explict {
    public static void main(String[] args) {
        int A = 200;                // Converting int to double
        double B = A;
        System.out.println(B);
        int C = 241;                // Converting int to double
        double D = C;
        System.out.println(D);

double E = 20.5;                    // Converting double to int
int F = (int)E;
System.out.println(F);


double G = 100.9;                   // Converting double to int
int H = (int)G;
System.out.println(H);

double m = 100.49;                  // Math.round
double n = Math.round(m);
        System.out.println(n);

        double p = 100.51;          // Math.round

        double k = Math.round(p);
        System.out.println(k);



          double a = 123.12;
          double b = Math.round(a);
          System.out.println(b);

          double c = 123.52;
          double d = Math.round(c);
          System.out.println(d);   // 124
          System.out.println(c);   // 123.52

//        int v = 100;
//        byte l = (byte)v;
//        System.out.println(l);   // nothing changed - answer is 100
//
//        byte h = 100;
//        int  j = (int)h;
//        System.out.println(j);    // nothing changed - answer is 100
        int aba = 108;
        double bba = aba;

        System.out.println(bba);

            }




}
