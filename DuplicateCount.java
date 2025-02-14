
public class DuplicateCount{
public static void main(String[] args) {
    int [] numbers = {7,2,6,1,4,7,5,4,7,7,3,1}
    for (int i = 0; i < numbers.length; i++) {

        boolean duplicate = false;
        int j = 0;

        while (j < i){

            if ((i != j) && numbers[i] == numbers[j]) {
                duplicate = true;
            }

            j++;
        }

        if (duplicate) {
            System.out.print(numbers[i] + " ");
        }
    }
}
}
