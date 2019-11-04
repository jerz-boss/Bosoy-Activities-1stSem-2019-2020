public class CC2_Lab3{
      public static void main(String [] args){
       
      char q = 'J'; 
      char w = 'E';
      char e = 'R';
      char r = 'Z';
      char t = '!';
      
      int n1 = q;
      int n2 = w;
      int n3 = e;
      int n4 = r;
      int n5 = t;
      int sum = (n1+n2+n3+n4+n5);
      int pro = (n1*n2*n3*n4*n5);
      int ave = sum/4;
      int rem = pro % ave;
      
     
      System.out.println(q + "-" + n1);
      System.out.println(w + "-" + n2);
      System.out.println(e + "-" + n3);
      System.out.println(r + "-" + n4);
      System.out.println(t + "-" + n5);
      System.out.println(q+ "" + w + "" +  e + "" + r + "" + t);
      System.out.println("Sum:        " + sum);
      System.out.println("Product:    " + pro);
      System.out.println("Average:    " + ave);
      System.out.println("Remainder:  " + rem);
      
  }
}
      
      
      
      
      
      
      
      
          