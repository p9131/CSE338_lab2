public class EvenOdd {
        private float test_number;

        public String even_odd(){
            if(test_number-(int)test_number !=0){
                System.out.println("Please enter an integer.");
                return null;
            }
            if(test_number%2==0)
                return "even";
            else return "odd";
        }
        public void inittest_number(float num){
            test_number=num;
        }

}
