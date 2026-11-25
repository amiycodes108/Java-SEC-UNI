class Solution {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0], sum = 0;
        for (int value : salary) {
            min = Math.min(min, value);
            max = Math.max(max, value);
            sum += value;
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
