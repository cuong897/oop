public class Week4 {
    /**
     * tim max 2 so.
     * @return max
     */
    public static int max2Int(int a , int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a , b);
    }

    /**
     * tim min mang.
     * @return min
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int n = array.length;
        int min = array[0];
        for (int i = 1; i < n; i++){
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * tinh BMI.
     * @return Bmi
     */
    public static String calculateBMI(double weight , double height){
        // Tinh BMI
        double x = weight/(height * height);
        if(x < 18.5) {
            return "Thiếu cân";
        }
        if(x < 23) {
            return "Bình thường";
        }
        if(x < 25) {
            return "Thừa cân";
        }
        if(x >= 25) {
            return "Béo phì";
        }
        return "";
    }
}
