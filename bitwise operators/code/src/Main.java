//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 5 ;

        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;
            n = n >> 1;

            ans += last * base;

            base = base * 5;
        }

        System.out.println(ans);
    }
}