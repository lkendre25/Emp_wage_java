import java.util.Random;
class test{
        public static void main(String args[]){
            Random rand=new Random();
            int c=0;
            int full_day_present=0;
            int Half_day_present=0;
            //for(int i=1;i<=20;i++){
            //System.out.println(c++);
            while(true){
            int rand_int1 = rand.nextInt(3);
            int WAGE_PER_HOUR=20;
            int FULLDAY=8;
            int HALFDAY=4;
            switch (rand_int1){
               case 1:
                  int total_sal;
                  total_sal=WAGE_PER_HOUR*FULLDAY;
                  c=c+total_sal;
                  full_day_present+=1;
                  System.out.println("Total Salary of full day is : "+total_sal);
               break;
               case 2:
                  System.out.println("Half Day!! ");
                  total_sal=WAGE_PER_HOUR*HALFDAY;
                  c=c+total_sal;
                  Half_day_present+=1;
                  System.out.println("Half day salary is : "+total_sal);
               break;
               case 0:
                  System.out.println("Absent!! ");
               break;
               default:
                  System.out.println("Invalid Input");
            }
            int totalWorkingDay=full_day_present+Half_day_present;
            if(totalWorkingDay==20){
  break;

            }
         }
         System.out.println("Total Full Day Presenty"+full_day_present);
         System.out.println("Total Half Day Present"+Half_day_present);
         System.out.println("Total Salary of Month is : "+c);
   }
}




