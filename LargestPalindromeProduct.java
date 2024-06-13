public class LargestPalindromeProduct
{
    public static int getLargestPalindromeProduct()
    {
        int product = 100 * 100;
        String productToString;
        StringBuilder productToStringReverse = new StringBuilder();

        for(int i = 100; i <= 999; i++)
        {
            for(int j = 100; j <= 999; j++)
            {
                productToString = Integer.toString(i * j);
                productToStringReverse.delete(0, productToStringReverse.length());
                productToStringReverse.append(productToString);
                productToStringReverse.reverse();
                if(productToString.equalsIgnoreCase(String.valueOf(productToStringReverse))) product = Math.max(product, i * j);
            }
        }
        return product;
    }

    public static void main(String[] args)
    {
        System.out.println(getLargestPalindromeProduct());
    }
}
