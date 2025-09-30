import java.util.ArrayList;

public class hw4 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");

        for(int i=0; i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }

        String[] test = {"alice","bob","terry","ron","lisa"};
        StringArray arrtest = new StringArray(test);

        for (String word : arrtest) {
            System.out.println(word);
        }
        
    }
}
