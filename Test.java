import java.util.Random;
class test{
        public static void main(String args[]){
               Random rand=new Random();
               int rand_int1 = rand.nextInt(2);
               if(rand_int1==1){
                  System.out.println("Present !! ");
                  int WAGE_PER_HOUR=20;
                  int HOUR=8;
                  int total_sal;
                  total_sal=WAGE_PER_HOUR*HOUR;
                  System.out.println(" Total Salary of full day is : "+total_sal);
               }
               else{
                  System.out.println("Absent !! ");
               }
        }
}

