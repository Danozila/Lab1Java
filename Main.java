//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main M = new Main();
        Scanner scan = new Scanner(System.in);
        System.out.println("Лабораторная работа №1(нечетный вариант)");
        System.out.println("Введите номер задания");
        int task_n = scan.nextInt();
        int subtask_n;
        double x_double;
        int x_int, a_int, b_int, c_int, length;
        char x_char;
        int[] arr, arr2;
        switch(task_n){
            case 1:
                System.out.println("Введите номер задачи в Задании 1");
                subtask_n = scan.nextInt();
                switch (subtask_n){
                    case 1:
                        System.out.println("1. Дробная часть");
                        System.out.println("Введите дробное число");
                        x_double = scan.nextDouble();
                        System.out.println("Его дробная часть равна(с точностью до 4 знаков после запятой): ");
                        String result = String.format("%.4f", M.fraction(x_double));
                        System.out.println(result);
                        break;
                    case 3:
                        System.out.println("3. Букву в число");
                        System.out.println("Введите символ");
                        x_char = scan.next().charAt(0);
                        System.out.println("Ваш символ, преобразованный в число:");
                        System.out.println(M.charToNum(x_char));
                        break;
                    case 5:
                        System.out.println("5. Двузначное");
                        System.out.println("Введите число");
                        x_int = scan.nextInt();
                        System.out.println("Двузначное ли ваше число?:");
                        System.out.println(M.is2Digits(x_int));
                        break;
                    case 7:
                        System.out.println("7. Диапозон");
                        System.out.println("Введите границы диапозона");
                        a_int = scan.nextInt();
                        b_int = scan.nextInt();
                        System.out.println("Введите число, которое хотите проверить на вхождение в диапозон");
                        x_int = scan.nextInt();
                        System.out.println("Входит ли число в диапозон?:");
                        System.out.println(M.isInRange(a_int, b_int, x_int));
                        break;
                    case 9:
                        System.out.println("9. Равенство");
                        System.out.println("Введите три числа");
                        a_int = scan.nextInt();
                        b_int = scan.nextInt();
                        c_int = scan.nextInt();
                        System.out.println("Равны ли эти числа?:");
                        System.out.println(M.isEqual(a_int, b_int, c_int));
                        break;
                    default:
                        System.out.println("Такой задачи нет");
                }
                break;
            case 2:
                System.out.println("Введите номер задачи в Задании 2");
                subtask_n = scan.nextInt();
                switch (subtask_n){
                    case 1:
                        System.out.println("1. Модуль числа");
                        System.out.println("Введите число");
                        x_int = scan.nextInt();
                        System.out.println("Модуль вашего числа: ");
                        System.out.println(M.abs(x_int));
                        break;
                    case 3:
                        System.out.println("3. Тридцать пять");
                        System.out.println("Введите число:");
                        x_int = scan.nextInt();
                        System.out.println("Делится ли ваше число на 3 или 5, но не на 15?:");
                        System.out.println(M.is35(x_int));
                        break;
                    case 5:
                        System.out.println("5. Тройной максимум");
                        System.out.println("Введите три числа:");
                        a_int = scan.nextInt();
                        b_int = scan.nextInt();
                        c_int = scan.nextInt();
                        System.out.println("Максимум из ваших чисел:");
                        System.out.println(M.max3(a_int, b_int, c_int));
                        break;
                    case 7:
                        System.out.println("7. Двойная сумма");
                        System.out.println("Введите два числа");
                        a_int = scan.nextInt();
                        b_int = scan.nextInt();
                        System.out.println("Двойная сумма вашего числа:");
                        System.out.println(M.sum2(a_int, b_int));
                        break;
                    case 9:
                        System.out.println("9. День недели");
                        System.out.println("Введите номер дня недели:");
                        x_int = scan.nextInt();
                        System.out.println("Ваш день недели:");
                        System.out.println(M.day(x_int));
                        break;
                    default:
                        System.out.println("Такой задачи нет");
                }
                break;
            case 3:
                System.out.println("Введите номер задачи в Задании 3");
                subtask_n = scan.nextInt();
                switch (subtask_n){
                    case 1:
                        System.out.println("1. Числа подряд");
                        System.out.println("Введите число");
                        x_int = scan.nextInt();
                        System.out.println("Числа от 0 до вашего числа подряд:");
                        System.out.println(M.listNums(x_int));
                        break;
                    case 3:
                        System.out.println("3. Четные");
                        System.out.println("Введите число:");
                        x_int = scan.nextInt();
                        System.out.println("Четные числа от 0 до вашего числа:");
                        System.out.println(M.chet(x_int));
                        break;
                    case 5:
                        System.out.println("5. Длина числа");
                        System.out.println("Введите число:");
                        x_int = scan.nextInt();
                        System.out.println("Длина вашего числа:");
                        System.out.println(M.numLen(x_int));
                        break;
                    case 7:
                        System.out.println("7. Квадрат");
                        System.out.println("Введите длину стороны квадрата:");
                        x_int = scan.nextInt();
                        System.out.println("Квадрат:");
                        M.square(x_int);
                        break;
                    case 9:
                        System.out.println("9. Правый треугольник");
                        System.out.println("Введите высоту треугольника:");
                        x_int = scan.nextInt();
                        System.out.println("Треугольник:");
                        M.rightTriangle(x_int);
                        break;
                    default:
                        System.out.println("Такой задачи нет");
                }
                break;
            case 4:
                System.out.println("Введите номер задачи в Задании 4");
                subtask_n = scan.nextInt();
                switch (subtask_n){
                    case 1:
                        System.out.println("1. Поиск первого значения");
                        System.out.println("Введите длину массива");
                        length = scan.nextInt();
                        arr = new int[length];
                        System.out.println("Введите элементы массива:");
                        for(int i = 0; i < length; i++){
                            x_int = scan.nextInt();
                            arr[i] = x_int;
                        }
                        System.out.println("Введите число, индекс которого вы хотите найти:");
                        x_int = scan.nextInt();
                        System.out.println("Индекс вашего числа в массиве:");
                        System.out.println(M.findFirst(arr, x_int));
                        break;
                    case 3:
                        System.out.println("3. Поиск максимального");
                        System.out.println("Введите длину массива");
                        length = scan.nextInt();
                        arr = new int[length];
                        System.out.println("Введите элементы массива:");
                        for(int i = 0; i < length; i++){
                            x_int = scan.nextInt();
                            arr[i] = x_int;
                        }
                        System.out.println("Максимум по модулю в вашем массиве:");
                        System.out.println(M.maxAbs(arr));
                        break;
                    case 5:
                        System.out.println("5. Вставка массива");
                        System.out.println("Введите длину массива");
                        length = scan.nextInt();
                        arr = new int[length];
                        System.out.println("Введите элементы массива:");
                        for(int i = 0; i < length; i++){
                            x_int = scan.nextInt();
                            arr[i] = x_int;
                        }
                        System.out.println("Введите длину вставляемого массива");
                        length = scan.nextInt();
                        arr2 = new int[length];
                        System.out.println("Введите элементы вставляемого массива:");
                        for(int i = 0; i < length; i++){
                            x_int = scan.nextInt();
                            arr2[i] = x_int;
                        }
                        System.out.println("Введите позицию, куда нужно вставить массив в массив:");
                        x_int = scan.nextInt();
                        System.out.println("Новый массив:");
                        arr = M.add(arr, arr2, x_int);
                        for(int i = 0; i < arr.length; i++){
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        break;
                    case 7:
                        System.out.println("7. Возвратный реверс");
                        System.out.println("Введите длину массива");
                        length = scan.nextInt();
                        arr = new int[length];
                        System.out.println("Введите элементы массива:");
                        for(int i = 0; i < length; i++){
                            x_int = scan.nextInt();
                            arr[i] = x_int;
                        }
                        System.out.println("Обратный массив:");
                        arr = M.reverseBack(arr);
                        for(int i = 0; i < arr.length; i++){
                            System.out.print(arr[i] + " ");
                        }

                        break;
                    case 9:
                        System.out.println("9. Все вхождения");
                        System.out.println("Введите длину массива");
                        length = scan.nextInt();
                        arr = new int[length];
                        System.out.println("Введите элементы массива:");
                        for(int i = 0; i < length; i++){
                            x_int = scan.nextInt();
                            arr[i] = x_int;
                        }
                        System.out.println("Введите число, вхождения которого нужно найти:");
                        x_int = scan.nextInt();
                        System.out.println("Массив с индексами всех вхождений:");
                        arr = M.findAll(arr, x_int);
                        for(int i = 0; i < arr.length; i++){
                            System.out.print(arr[i] + " ");
                        }
                        break;
                    default:
                        System.out.println("Такой задачи нет");
                }
                break;
            default:
                System.out.println("Такой задачи нет");
                break;

        }
    }
    public double fraction (double x){
        return x % 1;

    }
    public int charToNum (char x){
        return (int)(x) - (int) '0';
    }
    public boolean is2Digits (int x){
        return (x > 9 && x < 100);
    }
    public boolean isInRange (int a, int b, int num){
        return (num <= a && num >= b || num >= a && num <= b);
    }
    public boolean isEqual(int a, int b, int c){
        return (a == b && b == c);
    }
    public int abs (int x){
        if (x >= 0){
            return x;
        }else{
            return -x;
        }
    }
    public boolean is35 (int x){
        return ((x % 3 == 0) && (x % 5 != 0)) || ((x % 3 != 0) && (x % 5 == 0));
    }
    public int max3 (int x, int y, int z){
        if(x >= y && x >= z){
            return x;
        }
        if(y >= x && y >= z){
            return y;
        }
        return z;
    }
    public int sum2 (int x, int y){
        int s = x + y;
        if (s >= 10 && s <= 19) {
            return 20;
        }
        return s;
    }
    public String day (int x){
        switch(x){
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }
    public String listNums (int x){
        String ans = "";
        for(int i = 0; i <= x; i++){
            if (ans != ""){
                ans = ans + " " + Integer.toString(i);
            }
            else{
                ans = Integer.toString(i);
            }
        }
        return ans;

    }
    public String chet (int x){
        String ans = "0";
        for(int i = 2; i <= x; i += 2){
            ans += " " + Integer.toString(i);
        }
        return ans;
    }
    public int numLen (long x){
        int ans = 0;
        do{
            x = x / 10;
            ans++;
        }while(x != 0);
        return ans;
    }
    public void square (int x){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public void rightTriangle (int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x - 1 - i; j++){
                System.out.print(" ");
            }
            for(int j = x - 1 - i; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public int findFirst (int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public int maxAbs (int[] arr){
        int max = 0;
        int maxi = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= max){
                max = arr[i];
                maxi = i;
            }else if(arr[i] < 0 && -arr[i] > max){
                max = -arr[i];
                maxi = i;
            }
        }
        return arr[maxi];
    }
    public int[] add (int[] arr, int[] ins, int pos){
        int[] ans = new int[arr.length + ins.length];
        for(int i = 0; i < pos; i++){
            ans[i] = arr[i];
        }
        for(int i = pos; i < pos + ins.length; i++){
            ans[i] = ins[i - pos];
        }
        for(int i = pos + ins.length; i < ans.length; i++){
            ans[i] = arr[i - ins.length];
        }
        return ans;
    }
    public int[] reverseBack (int[] arr){
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reverse[i] = arr[arr.length - i - 1];
        }
        return reverse;
    }
    public int[] findAll (int[] arr, int x){
        int len = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                len++;
            }
        }
        int[] ans = new int[len];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans[j] = i;
                j++;
            }
        }
        return ans;
    }
}