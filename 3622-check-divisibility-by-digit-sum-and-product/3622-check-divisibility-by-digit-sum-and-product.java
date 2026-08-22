class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int original = n;
        boolean hasZero = false;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            digitSum += digit;
            
            if (digit == 0) {
                hasZero = true;
            }
            if (!hasZero) {
                digitProduct *= digit;
            }
        }

        int divisor = digitSum + (hasZero ? 0 : digitProduct);
        return original % divisor == 0;
    }
}
