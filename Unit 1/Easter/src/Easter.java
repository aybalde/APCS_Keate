//aybalde
public class Easter {
        public static String date(){
            int year = 2021; //2022
            int a,b,c,d,e,f,g,h,i,k,m,n,p,r;
            a = year % 19; // the modulo return the remainder
            b = year / 100; // the divider return the quotient
            c = year % 100;
            d = b / 4;
            e = b % 4;
            f = (b + 8) / 25;
            g = (b - f + 1) / 3;
            h = (19 * a + b - d - g + 15) % 30;
            i = c / 4;
            k = c % 4;
            r = (32 + 2 * e +  2 * i - h -k) % 7;
            m = (a + 11 * h + 22 * r) / 451;
            n = (h + r - 7 * m + 114) / 31;
            p = (h + r - 7 * m + 114) % 31;

            return("The date of Easter in " + year + " is " + n + "/" + (p + 1));
        }
        public static void main(String[] args)
        {
           System.out.println(Easter.date());
        }
}