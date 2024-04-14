import java.util.*;


class Solution {

    static int[][] arr;
    static boolean[][] check;
    static int[] countGift; 

    public static void main(String[] args) {
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}; 
        System.out.println(solution(friends, gifts));
    }

    static public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        arr = new int[friends.length][friends.length];
        check = new boolean[friends.length][friends.length];
        countGift = new int[friends.length];

        HashMap<String, Integer> dataMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            dataMap.put(friends[i], i);
        }

        for (String gift : gifts) {
            StringTokenizer st = new StringTokenizer(gift);
            String from = st.nextToken();
            String to = st.nextToken();
            arr[dataMap.get(from)][dataMap.get(to)]++;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue; 
                if (check[i][j] || check[j][i]) continue; 
                if (arr[i][j] > arr[j][i]) {
                    check[i][j] = true;
                    countGift[i]++;
                } else if (arr[i][j] < arr[j][i]) {
                    check[i][j] = true;
                    countGift[j]++;
                } else if ((arr[i][j] == 0 && arr[j][i] == 0) || arr[i][j] == arr[j][i]) {
                    check[i][j] = true;
                    int giftScoreA, giftScoreB; 
                    int fromA = 0; 
                    int fromB = 0;
                    int toA = 0; 
                    int toB = 0;

                    
                    for (int k = 0; k < arr.length; k++) {
                        toA += arr[i][k];
                        toB += arr[j][k];
                        fromA += arr[k][i];
                        fromB += arr[k][j];
                    }

                    
                    giftScoreA = toA - fromA;
                    giftScoreB = toB - fromB;

                    if (giftScoreA > giftScoreB) {
                        countGift[i]++;
                    } else if (giftScoreB > giftScoreA) {
                        countGift[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < countGift.length; i++){
            if (answer < countGift[i]) answer = countGift[i];
        }

        return answer;
    }

}