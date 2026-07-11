import java.util.Arrays;

public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] amt =new int [amount+1];
        Arrays.fill(amt,amount+1);
        amt[0]=0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(i>= coins[j]){
                    amt[i]= Math.min(amt[i],1+amt[i-coins[j]]);
                }
            }
        }
        if(amt[amount]<amount+1){
            return amt[amount];
        }
        return -1;
    }
    public static void main(String[] args) {
        Coin_Change coinChange = new Coin_Change();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange.coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
