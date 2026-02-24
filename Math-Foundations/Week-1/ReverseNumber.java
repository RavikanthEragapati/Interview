public class ReverseNumber{

    public static void main (String[] args){
        System.out.println(reverseDigit(54321));

    }
    // public static int reverseDigit(int input){
    //     int reminder = input;
    //     StringBuilder result = new StringBuilder();
    //     while(reminder/10 > 0){
    //         result.append(reminder%10);
    //         reminder = reminder/10;
    //     }
    //     result.append(reminder);
    //     return Integer.parseInt(result.toString());
    // }

    public static int reverseDigit(int input){
        int reminder = input;
        int result = 0;
        while (reminder > 0){
            result = result*10 + (reminder%10);
            reminder = reminder/10;
        }
        return result;
    }

}