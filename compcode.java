public class compcode {
    public static void main(String args[]) {
      int digitsum = 0;
      int altsum = 1;
      int a;
      int b;
      int c;
      int num;
      int d;
      int e;
      String x = "1";
      while(true) {
          if(x.length() == 1) {
              a = x.charAt(0);
              digitsum = a;
              altsum = a;
          }
          if(x.length() == 2) {
              a = x.charAt(0);
              b = x.charAt(1);
              digitsum = a + b;
              altsum = a - b;
          }
          if(x.length() == 3) {
              a = x.charAt(0);
              b = x.charAt(1);
              c = x.charAt(2);
              digitsum = a + b + c;
              altsum = a - b + c;
          }
          num = Integer.parseInt(x);
          d = digitsum % 9;
          e = num % 4;
          if(d == 0 && e == 0 && altsum == 0) {
              System.out.println("Number found! " + x);
          }
          else {
              num++;
              x = Integer.toString(num);
          }
      }
    }
}
