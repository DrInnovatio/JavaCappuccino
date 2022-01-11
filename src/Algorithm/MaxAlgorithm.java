package Algorithm;

public class MaxAlgorithm {

    public static void main(String[] args) {
        int[] array = new int[]{3,7,4,9,5,6,8,1,20,2};

        int currentMax = array[0];
        for(int i=1;i<=array.length-1;i++){
            if(currentMax < array[i]){
                currentMax = array[i];

            }
        }

        System.out.println("Maximum value is "+ currentMax);
    }

}
