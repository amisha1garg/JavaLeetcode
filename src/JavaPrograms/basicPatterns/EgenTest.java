package JavaPrograms.basicPatterns;

import java.util.*;

public class EgenTest {

    public static void main(String[] args) {
        String[][] queries =
                {
                        {"CREATE_ACCOUNT", "1", "account1"},
                        {"CREATE_ACCOUNT", "2", "account2"},
                        {"CREATE_ACCOUNT", "3", "account3"},
                        {"DEPOSIT", "4", "account1", "1000"},
                        {"DEPOSIT", "5", "account2", "1000"},
                        {"DEPOSIT", "6", "account3", "1000"},
                        {"PAY", "7", "account2", "100"},
                        {"PAY", "8", "account2", "100"},
                        {"PAY", "9", "account3", "100"},
                        {"TOP_ACTIVITY", "10", "3"}};


        String[][] queries2 = {
                {"CREATE_ACCOUNT", "1", "account1"},
                {"CREATE_ACCOUNT", "2", "account2"},
                {"CREATE_ACCOUNT", "3", "account3"},
                {"DEPOSIT", "4", "account1", "2000"},
                {"DEPOSIT", "5", "account2", "3000"},
                {"DEPOSIT", "6", "account3", "4000"},
                {"TOP_ACTIVITY", "7", "3"},
                {"PAY", "8", "account1", "1500"},
                {"PAY", "9", "account2", "250"},
                {"DEPOSIT", "10", "account3", "250"},
                {"TOP_ACTIVITY", "11", "3"}
        };

        System.out.println(Arrays.toString(solution(queries)));
    }

    public static String[] solution(String[][] queries) {

        Map<String, Integer> accounts = new HashMap<>();
        String[] results = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String[] query = queries[i];
            String command = query[0];
            String accountId = query[2];
            int amount = query.length > 3 ? Integer.parseInt(query[3]) : 0;
            int balance = accounts.getOrDefault(accountId, 0);

            switch (command) {
                case "CREATE_ACCOUNT":
                    if (accounts.containsKey(accountId)) {
                        results[i] = "false";
                    } else {
                        accounts.put(accountId, 0);
                        results[i] = "true";
                    }
                    break;
                case "DEPOSIT":
                    if (accounts.containsKey(accountId)) {
                        balance += amount;
                        accounts.put(accountId, balance);
                        results[i] = Integer.toString(balance);
                    } else {
                        results[i] = "";
                    }
                    break;
                case "PAY":
                    if (accounts.containsKey(accountId) && balance >= amount) {
                        balance -= amount;
                        accounts.put(accountId, balance);
                        results[i] = Integer.toString(balance);
                    } else {
                        results[i] = "";
                    }
                    break;

                case "TOP_ACTIVITY":
                    int n = Integer.parseInt(query[2]);
                    results[i] = getTopActivity(n, accounts);
                    break;
                default:
                    results[i] = "";
            }
        }

        return results;

    }

    private static String getTopActivity(int n, Map<String, Integer> accounts) {
        List<Map.Entry<String, Integer>> sortedAccounts = new ArrayList<>(accounts.entrySet());
        sortedAccounts.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(n, sortedAccounts.size()); i++) {
            Map.Entry<String, Integer> entry = sortedAccounts.get(i);
            sb.append(entry.getKey()).append("(").append(entry.getValue()).append("), ");
        }

        // Remove trailing comma and space
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }

}
