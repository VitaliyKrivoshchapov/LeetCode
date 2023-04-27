import java.util.concurrent.RecursiveTask;

public class PalindromeInteger {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.foo(101));

    }
}

class Solution2{
    public boolean foo(int x) {
        String s = String.valueOf(x);
        String reversS = new StringBuilder(s).reverse().toString();
        if (s.equals(reversS))
            return true;
        else return false;
    }
}