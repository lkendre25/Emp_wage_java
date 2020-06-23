import java.util.Random;
class test{
        public static void main(String args[]){
            Random rand=new Random();
            int rand_int1 = rand.nextInt(3);
            int WAGE_PER_HOUR=20;
            int FULLDAY=8;
            int HALFDAY=4;
            switch (rand_int1){
               case 1:
                  int total_sal;
                  total_sal=WAGE_PER_HOUR*FULLDAY;
                  System.out.println("Total Salary of full day is : "+total_sal);
               break;
               case 2:
                  System.out.println("Half Day!! ");
                  total_sal=WAGE_PER_HOUR*HALFDAY;
                  System.out.println("Half day salary is : "+total_sal);
               break;
               case 0:
                  System.out.println("Absent!! ");
               break;
               default:
                  System.out.println("Invalid Input");
            }
   }
}

