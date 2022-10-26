package testingRevision.vendorMachine;

import java.util.*;

public class VendingMachineImpl {
    private  Inventory<Coin> cashInventory = new Inventory<Coin>();
    private   Inventory<Item> itemInventory = new Inventory<Item>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;

    public VendingMachineImpl() {
        initialize();
    }

    private  void initialize() {
        //initialize machine with 5 coins of each denomination //and 5 cans of each Item
        for (Coin c : Coin.values()) {
            cashInventory.put(c, 5);
        }
        for (Item i : Item.values()) {
            itemInventory.put(i, 5);
        }
    }


    private  List<Coin> getChange(long amount) {
        List<Coin> changes = Collections.EMPTY_LIST;

        if (amount > 0) {
            changes = new ArrayList<Coin>();
            long balance = amount;
            while (balance > 0) {
                if (balance >= Coin.QUARTER.getDenomination()
                        && cashInventory.hasItem(Coin.QUARTER)) {
                    changes.add(Coin.QUARTER);
                    balance = balance - Coin.QUARTER.getDenomination();
                    continue;

                } else if (balance >= Coin.DIME.getDenomination()
                        && cashInventory.hasItem(Coin.DIME)) {
                    changes.add(Coin.DIME);
                    balance = balance - Coin.DIME.getDenomination();
                    continue;

                } else if (balance >= Coin.NICKLE.getDenomination()
                        && cashInventory.hasItem(Coin.NICKLE)) {
                    changes.add(Coin.NICKLE);
                    balance = balance - Coin.NICKLE.getDenomination();
                    continue;

                } else if (balance >= Coin.PENNY.getDenomination()
                        && cashInventory.hasItem(Coin.PENNY)) {
                    changes.add(Coin.PENNY);
                    balance = balance - Coin.PENNY.getDenomination();
                    continue;

                }
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        VendingMachineImpl vendingMachine =new VendingMachineImpl();
        System.out.println(vendingMachine.getChange(1000));

        /*
        or create HshMAP FOR STRING AND VALUE
        PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
        AND ANOTHER hASHmAP FOR SRRING AND HOW  MUCH CASH I HAVE AND CALLED IT CASHE
        AND CREATE METHOSD TAKE paidvalue and item price
        and caluete the differnce
        and return hashmap contain every name and count from it nd multiply by 100
        <quarter,10>
        Nickel ,20, and so on



         */
    }


}
