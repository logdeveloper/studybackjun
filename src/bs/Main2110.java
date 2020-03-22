package bs;

import java.util.Arrays;
import java.util.Scanner;

public class Main2110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left = 1;
        int right = arr[n-1]-arr[0];
        int d = 0;
        int ans = 0;

        while(left <= right){
            System.out.println("----- 시작 ------");

            int mid= (left + right) /2;
            int start = arr[0];
            int count =1;
            System.out.println(">>>> left " + left + "| right " +
                    right + "| d "  + d + "| mid "+ mid+"| start "+start + "| count "+ count  );
            for (int i = 0; i <n ; i++) { //집집마다 검색함.
                d= arr[i]-start;
                if(d >= mid){ //만약 첫번째 집과의 거리가 더 크다면 찾았다고 count 올려주고, 내가 찾는집에 이번 집을 넣어준다.
                    count++;
                    start = arr[i];
                }
            }

            if(count>=c){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid-1;
            }
            System.out.println("**** left " + left + "| right " +
                    right + "| d "  + d + "| mid "+ mid+"| start "+start + "| count "+ count  );
        }
        System.out.println(ans);
    }
}

