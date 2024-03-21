public class compcode {
    public static void main(String args[]) {
       int digitsum = 0;
       int altsum = 1;
       int a = 0;
       int b = 0;
       int c = 0;
       int num = 0;
       int d = 0;
       int e = 0;
       char aa;
       char bb;
       char cc;
       String x = "1";
       String[] two = {};
       while(true) {
           if(x.length() == 1) {
               a = Integer.parseInt(x);
               digitsum = a;
               altsum = a;
           }
           if(x.length() == 2) {
               aa = x.charAt(0);
               bb = x.charAt(1);
               a = aa - '0';
               b = bb - '0';
               digitsum = a + b;
               altsum = a - b;
           }
           if(x.length() == 3) {
               aa = x.charAt(0);
               bb = x.charAt(1);
               cc = x.charAt(2);
               a = aa - '0';
               b = bb - '0';
               c = cc - '0';
               digitsum = a + b + c;
               altsum = a - b + c;
           }
           num = Integer.parseInt(x);
           d = digitsum % 9;
           e = num % 4;
           if(d == 0 && e == 0 && altsum == 0) {
               System.out.println("Number found! " + x);              
               System.exit(0);
           }
           else {
               System.out.println("No match found for " + x);
               num++;
               x = Integer.toString(num);
           }
       }
    }
}
