package TwoSumm;

public class Main {
    public static void main(String[] args) {
        ProductOfTwo pd = new ProductOfTwo();
        int ans = pd.sum(10,20);
        System.out.println(ans);

        SumOfTwo sum = new SumOfTwo();
        int ans2 = sum.prod(10,10);
        System.out.println(ans2);
    }
}
