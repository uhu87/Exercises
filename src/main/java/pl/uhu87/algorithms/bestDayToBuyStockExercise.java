package pl.uhu87.algorithms;

class bestDayToBuyStockExercise {

    public static void main(String[] args) {

        int[] numbers = {20, 24, 10, 18, 3, 4};
        int[] numbers2 = {0, 1};
        int[] numbers3 = {2, 3, 5, 1};
        int[] numbers4 = {6, 4, 3, 0};

        bestDayToBuyStock(numbers);
        bestDayToBuyStock(numbers2);
        bestDayToBuyStock(numbers4);
        bestDayToBuyStock(numbers2);

    }


    public static void bestDayToBuyStock(int[] array) {

        int biggestDifference = 0;
        int bestDaytoBuy = 0;
        int bestDaytoSell = 0;

        for (int i = 0; i < array.length; i++) {


            // System.out.println("Roznice dla dnia" + (i+1));
            for (int y = i; y < array.length; y++) {

                int purchaseResult = array[y] - array[i];
                //System.out.println(purchaseResult);
                if (purchaseResult > biggestDifference) {

                    bestDaytoBuy = i + 1;
                    bestDaytoSell = y + 1;
                    biggestDifference = purchaseResult;

                }
            }
        }
        if (bestDaytoBuy == 0 && bestDaytoSell == 0) {
            System.out.println("You won't earn anything");
        } else {
            System.out.println("Best day to buy is day " + bestDaytoBuy +
                    " and best day to sell is day " + bestDaytoSell);
        }
    }

}