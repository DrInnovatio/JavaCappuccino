package Algorithm;

public class NearValueAlgorithm {

    public static void main(String[] args){
        // 1. 초기화 및 선언
        int[] data = { 10,15,18,25,30,35 }; // 데이터
        int near = 24;                              // 찾을 숫자
        int min = Integer.MAX_VALUE;    // 기준데이터 최소값 - Interger형의 최대값으로 값을 넣는다.
        int nearData = 0;                       // 가까운 값을 저장할 변수
        // 2. process
        for(int i=0;i<data.length;i++){
            int a = Math.abs(data[i]-near);  // 절대값을 취한다.
            if(min > a){
                min = a;
                nearData = data[i];
            }
        }
        System.out.println(near + "에 근접한 값 : " + nearData);
    }
}


