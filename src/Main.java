class Print2Task {
    public static void printArr(String[]  arr) {
        for(String i : arr)
            System.out.print(!i.equals(arr[arr.length - 1]) ? i + ", " : i + "\n");
    }

    public static void printArr(int[] arr) {
        for(Object i : arr)
            System.out.print(!i.equals(arr[arr.length - 1]) ? i + ", " : i + "\n");
    }

    public static void printArr(double[] arr) {
        for(Object i : arr)
            System.out.print(!i.equals(arr[arr.length - 1]) ? i + ", " : i + "\n");
    }

    public static void printArrBackwards(String[] arr) {
        for(int i = arr.length - 1; i >= 0; i--)
            System.out.print( i != 0 ? arr[i] + ", " : arr[i] + "\n");
    }

    public static void printArrBackwards(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--)
            System.out.print( i != 0 ? arr[i] + ", " : arr[i] + "\n");
    }

    public static void printArrBackwards(double[] arr) {
        for(int i = arr.length - 1; i >= 0; i--)
            System.out.print( i != 0 ? arr[i] + ", " : arr[i] + "\n");
    }
}

public class Main {
    public static void task1To3() {
        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        double[] secondArr = {1.57, 7.654, 9.986};
        String[] seasons  = {"Winter", "Spring", "Summer", "Autumn"};

        Print2Task.printArr(firstArr);
        Print2Task.printArr(secondArr);
        Print2Task.printArr(seasons);

        System.out.println("\nОбратный вывод: \n");

        Print2Task.printArrBackwards(firstArr);
        Print2Task.printArrBackwards(secondArr);
        Print2Task.printArrBackwards(seasons);
    }

    public static int[] task4(int[] arr){
        for(int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) arr[i] += 1;
        return arr;
    }

    public static void main(String[] args) {
        task1To3();
    }
}