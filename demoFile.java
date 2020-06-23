import java.util.Random;
class test{
        public static void main(String args[]){
               Random rand=new Random();
               int rand_int1 = rand.nextInt(2);
               if(rand_int1==1){
                  System.out.println("Present !! ");
                  int WAGE_PER_HOUR=20;
                  int FULLDAY=8;
                  int HALFDAY=4;
                  if(FULLDAY==8){
                  int total_sal;
                  total_sal=WAGE_PER_HOUR*FULLDAY;
                  System.out.println("Total Salary of full day is : "+total_sal);
                  }else{
                  int total_sal=WAGE_PER_HOUR*HALFDAY;
                  System.out.println("Half day salary is : "+total_sal);
                  }
               }
               else{
                  System.out.println("Absent !! ");
               }
        }
}

