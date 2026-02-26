public class BubbleSort {

    /**
     * Bubble sort: sorts an integer array in ascending order.
     * 冒泡排序：对整型数组进行升序排列
     *
     * @param arr the array to sort (modified in place) / 待排序的数组（原地修改）
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果本趟没有发生交换，说明数组已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Calculator class: provides basic arithmetic operations
     * 计算器类：提供基本的算术运算
     */
    public static class Calculator {
        
        /**
         * Addition / 加法
         * @param a first number
         * @param b second number
         * @return sum of a and b
         */
        public static double add(double a, double b) {
            return a + b;
        }
        
        /**
         * Subtraction / 减法
         * @param a first number
         * @param b second number
         * @return difference of a and b (a - b)
         */
        public static double subtract(double a, double b) {
            return a - b;
        }
        
        /**
         * Multiplication / 乘法
         * @param a first number
         * @param b second number
         * @return product of a and b
         */
        public static double multiply(double a, double b) {
            return a * b;
        }
        
        /**
         * Division / 除法
         * @param a dividend (numerator)
         * @param b divisor (denominator)
         * @return quotient of a divided by b
         * @throws ArithmeticException if divisor is zero
         */
        public static double divide(double a, double b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero / 除数不能为零");
            }
            return a / b;
        }
        
        /**
         * Integer addition / 整数加法
         * @param a first integer
         * @param b second integer
         * @return sum of a and b
         */
        public static int add(int a, int b) {
            return a + b;
        }
        
        /**
         * Integer subtraction / 整数减法
         * @param a first integer
         * @param b second integer
         * @return difference of a and b (a - b)
         */
        public static int subtract(int a, int b) {
            return a - b;
        }
        
        /**
         * Integer multiplication / 整数乘法
         * @param a first integer
         * @param b second integer
         * @return product of a and b
         */
        public static int multiply(int a, int b) {
            return a * b;
        }
        
        /**
         * Integer division / 整数除法
         * @param a dividend
         * @param b divisor
         * @return integer quotient of a divided by b
         * @throws ArithmeticException if divisor is zero
         */
        public static int divide(int a, int b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero / 除数不能为零");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        // 原有的冒泡排序演示
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Before sorting / 排序前: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.print("After sorting / 排序后: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        // 新增的计算器功能演示
        System.out.println("=== Calculator Demo / 计算器演示 ===");
        
        // 浮点数运算演示
        double x = 15.5, y = 3.2;
        System.out.printf("add(%.1f, %.1f) = %.2f / 加法%n", x, y, Calculator.add(x, y));
        System.out.printf("subtract(%.1f, %.1f) = %.2f / 减法%n", x, y, Calculator.subtract(x, y));
        System.out.printf("multiply(%.1f, %.1f) = %.2f / 乘法%n", x, y, Calculator.multiply(x, y));
        
        // 除法演示（包含异常处理）
        try {
            System.out.printf("divide(%.1f, %.1f) = %.2f / 除法%n", x, y, Calculator.divide(x, y));
            System.out.printf("divide(%.1f, %.1f) = %.2f / 除法（除数为0）%n", x, 0.0, Calculator.divide(x, 0.0));
        } catch (ArithmeticException e) {
            System.out.println("Error / 错误: " + e.getMessage());
        }
        
        System.out.println();
        
        // 整数运算演示
        int p = 20, q = 7;
        System.out.printf("add(%d, %d) = %d / 整数加法%n", p, q, Calculator.add(p, q));
        System.out.printf("subtract(%d, %d) = %d / 整数减法%n", p, q, Calculator.subtract(p, q));
        System.out.printf("multiply(%d, %d) = %d / 整数乘法%n", p, q, Calculator.multiply(p, q));
        System.out.printf("divide(%d, %d) = %d / 整数除法（结果取整）%n", p, q, Calculator.divide(p, q));
    }
}