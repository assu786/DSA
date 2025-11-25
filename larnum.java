class MaxSimple {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};
        System.out.println(findMax(arr, 0));
    }

    static int findMax(int[] arr, int i) {
        if (i == arr.length - 1)   
            return arr[i];

        int max = findMax(arr, i + 1); 

        if (arr[i] > max)
            return arr[i];
        return max;
    }
}
