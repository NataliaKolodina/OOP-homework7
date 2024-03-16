

import java.util.Scanner;

public class Calculator {

    MyOpFactory myOpFactory;
    
    public Calculator(MyOpFactory myOpFactory){
        this.myOpFactory = myOpFactory;
    }

    public void exec(){
        boolean nextStep = true;
        boolean p = true;
        double buf = 0;
        Scanner in = new Scanner(System.in);
        do {
            double num1;
            num1 = buf;
            if(p){
                System.out.println("Введите первое число");
                try{
                if(!in.hasNextDouble()) {
                    throw new NumberFormatException();
                    } else
                        num1 = in.nextDouble();
                }catch(NumberFormatException e){
                    System.out.println(e);
                    break;
                }
            }

            System.out.println("Выберите операцию:");
            System.out.print("0 - сумма\t");
            System.out.print("1 - разность\t");
            System.out.print("2 - умножение\t");
            System.out.print("3 - деление");
            System.out.println();
            int operation = in.nextInt();
            
            System.out.println("Введите второе число: ");
            double num2 = in.nextDouble();
 
            System.out.print("Результат равен:\t");
            Operation op = myOpFactory.getOpInstance(operation);
            if (op != null){
                System.out.println(op.exec(num1, num2));
                buf = (int) op.exec(num1, num2);
            }
            else System.out.println("Недопустимая операция!!!");
            
            System.out.println("Хотите использовать результат как первое число?");
            System.out.print("1 - Да\t");
            System.out.println("2 - Нет");
            int what = in.nextInt();
            if (what == 1){
                p = false;
                continue;
            }
            else p = true;
            
            System.out.println("Хотите продолжить?");
            System.out.print("1 - Продолжить\t");
            System.out.println("2 - Выйти");
            int whatDo = in.nextInt();
            if (whatDo == 2)
                nextStep = false;
        } while (nextStep);
    }
}
