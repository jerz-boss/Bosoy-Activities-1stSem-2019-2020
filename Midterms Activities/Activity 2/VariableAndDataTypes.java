public class VariableAndDataTypes{
      public static void main(String [] args){
      
      String TheTemp = "The Tempearture in Baguio City has warmed througout the years.";
      char flet = 'A';
      float temp1 = 16.0f;
      double temp2 = 23.5;
      
      byte hour = 24;
      int day = 7;
      short week = 4;
      long month = 12;
      
      boolean b = false;
      
      //System.out.println("\t" +flet + " recent news article stated that the City has been averaging " + temp1 + " degrees celsius at dawn and " + temp2 + "\n\t\t Regardless, lowlanders still feel cold " + hour + " hours a days, " + day +" days a week, " + week + " weeks per month and " + month + " months a year. ");
      
            
      if(b){
            System.out.println("\t" +flet + " recent news article stated that the City has been averaging " + temp1 + " degrees celsius at dawn and " + temp2 + "\n\t\t Regardless, lowlanders still feel cold " + hour + " hours a days, " + day +" days a week, " + week + " weeks per month and " + month + " months a year. ");
            
      }else{
              System.out.println("\n\tThe boolean was changed to a False value.");
      }
   }
}