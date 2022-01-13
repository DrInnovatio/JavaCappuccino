package Algorithm;

public class NearAlgorithm {

    public static void main(String[] args) {
        // 근사값 알고리즘(Near Algorithm)
        // 차이값의 절대값의 최소값(전체 데이터 중 특정 데이터와 가장 근접한 값)
        int min = Integer.MAX_VALUE; // 차이값의 절대값 최소값 저장

        int[] arr = {10, 29, 21, 24, 30};
        int target = 20; // 해당 데이터와 가장 근접한 값을 찾아야 함
        int answer = 0;

        //
        for(int i = 0; i < arr.length; i++) {
            int abs = Math.abs(arr[i] - target); // 차이값의 절대값 반환
            if(abs < min) { // 절대값이 최소값보다 작다면
                min = abs; // 최소값 교체
                answer = arr[i]; // 정답
            }
        }

        System.out.println(target + "과 가장 가까운 값 : " + answer);
        System.out.println(target + "과 가장 가까운 값의 차이 : " + min);
    }
}
