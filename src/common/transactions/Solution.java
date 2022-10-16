package common.transactions;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[][] transactions = new int[][]{{1, 2, 1200}, {3, 1, 1000}, {2, 3, 500}, {4, 5, 5000}, {5, 4, 1000}};
       performTransaction(transactions);
    }

    public static void performTransaction(int[][] transactions) {

        //storing the transactions for users
        HashMap<Integer, Integer> usersTransactions = new HashMap<>();

        for (int i = 0; i < transactions.length; i++) {

            usersTransactions.put(transactions[i][0], usersTransactions.getOrDefault(transactions[i][0], 0) - transactions[i][2]);

            usersTransactions.put(transactions[i][1], usersTransactions.getOrDefault(transactions[i][1], 0) + transactions[i][2]);

        }
        usersTransactions.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
