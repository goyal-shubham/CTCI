package RecursionAndDP;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {
    public static long makeChange(int[] coins, int money) {

        int[] minCoins = new int[money + 1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        minCoins[0] = 0;
        for(int i = 1; i <= money; i++) {

            for(int coin : coins){

                if(i >= coin) {
                    int result = minCoins[i - coin];
                    if(result != Integer.MAX_VALUE && result + 1 < minCoins[i]) {
                        minCoins[i] = 1 + result;
                    }
                }
            }
        }

        return minCoins[money] == Integer.MAX_VALUE ? 0 : minCoins[money];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }

        System.out.println(makeChange(coins, n));
    }
}
