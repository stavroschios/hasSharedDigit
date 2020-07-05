public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19, 99));
    }

    public static boolean hasSharedDigit(int num1 , int num2){

        if((num1>=10 && num1<=99) && (num2>=10 && num2<=99)){

            int firstn1 = num1/10;
            int lastn1 = num1%10;
            int firstn2 = num2/10;
            int lastn2 = num2%10;

            if((firstn1==firstn2) || (firstn1==lastn2) || (firstn2==lastn1)|| (lastn1==lastn2)){

                return true;
            }
            else
                return false;

        }
        else
            return false;


    }


}
