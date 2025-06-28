package Searching;

public class Maxwealth {
    static int maxW(int[][] accounts){
        int max = 0;
        for (int person = 0; person < accounts.length; person++){
            int wealth = 0;
            for (int account = 0 ; account < accounts[person].length; account++){
                wealth += accounts[person][account];
            }
            if (wealth > max){
                max = wealth;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3} , {3,2,1},{7,8}};
        System.out.println(maxW(arr));
    }
}
