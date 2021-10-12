package zadanie4.operatory;

public class main {
    public static void main(String[] args) {
        double x = 42.5;
        double y = 6.9;
        double z = 8.2;
        double w = (x+y+z)/3;//среднее арифметическое
        System.out.println(w);
        double t = w/2;// деление на 2;
        double s = Math.floor(t);//округление
        if (s>3){
            System.out.println("Программа выполнена корректно");
        }






    }
}
