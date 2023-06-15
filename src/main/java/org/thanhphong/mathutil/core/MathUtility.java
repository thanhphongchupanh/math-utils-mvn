package org.thanhphong.mathutil.core;

/**
 *
 * @author ADMIN
 */
// class này clone lại 100% cái class java.util.Math của JDK
// Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    // tính n! = 1.2.3...n
    // thiết kế/quy ước cho hàm/method này
    // 0! = 1! = 1
    // ko áp dụng giai thừa cho số âm. Nếu n < 0: CHỬI
    // ko áp dụng số > 20. Vì 20! vừa đủ khớp kiểu long 18 số 0
    // 21!: CHỬI
    public static long getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if(n < 0 || n > 20){
           throw new IllegalArgumentException("Invalid n. Must be n < 0 || n > 20 ");
            //System.out.println("Invalid n. Must be n < 0 || n > 20");
        }
        long product = 1;     
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

