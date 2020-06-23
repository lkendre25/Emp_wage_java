import java.util.Random;
class Test{

        public static void main(String args[]){
               Random rand=new Random();
               int rand_int1 = rand.nextInt(2);
               if(rand_int1==1){
               System.out.println("Present !! ");
               }
               else{

                  System.out.println("Absent !! ");
               }

        }


}

