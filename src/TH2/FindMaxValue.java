package TH2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWirteFile readAndWirteFile = new ReadAndWirteFile();
        String PATH_NUMBER = "K:\\Tai Lieu Hoc Rikkei Academy\\Module 2\\untitled33\\src\\TH2\\number";
        String PATH_RESULT = "K:\\Tai Lieu Hoc Rikkei Academy\\Module 2\\untitled33\\src\\TH2\\test";
        List<Integer> nnumbers = readAndWirteFile.readFile(PATH_NUMBER);
        int maxvalue = findMax(nnumbers);
        readAndWirteFile.writeFile(PATH_RESULT, maxvalue);
    }
}
