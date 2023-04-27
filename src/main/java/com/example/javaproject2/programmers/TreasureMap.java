package com.example.javaproject2.programmers;

class TreasureMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n만큼의 길이를 가진 answer 배열을 초기화합니다.
        String[] answer = new String[n];

        // arr1과 arr2의 각각의 요소에 대해 반복합니다.
        for (int i = 0; i < n; i++){
            // arr1과 arr2의 i번째 요소를 OR 연산한 결과를 이진수로 변환합니다.
            String binaryStr = Integer.toBinaryString(arr1[i] | arr2[i]);

            // 이진수에서 1을 #으로, 0을 공백으로 대체합니다.
            binaryStr = binaryStr.replace("1","#").replace("0"," ");

            // answer[i]의 길이를 맞추기 위해 공백을 삽입합니다.
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n - binaryStr.length(); j++){
                sb.append(" ");
            }
            sb.append(binaryStr);

            // 결과를 answer 배열에 저장합니다.
            answer[i] = sb.toString();
        }

        return answer;
    }
}
