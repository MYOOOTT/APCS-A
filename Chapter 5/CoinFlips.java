public class CoinFlips
{
    public static void main(String[] args) {
        final int NUM_FLIPS = 1000;
        int heads = 0;
        int tails = 0;

        Coin myCoin = new Coin(); // instantiate the coin object

        for (int count = 1; count <= NUM_FLIPS; count++) {
            myCoin.flip();

            if (myCoin.isHeads()) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("The number of flips: " + NUM_FLIPS);
        System.out.println("The number of heads: " + heads);
        System.out.println("The number of tails: " + tails);
    }
}