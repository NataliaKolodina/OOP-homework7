

public class Main {
    
    public static void main(String[]args){
        MyOpFactory myOpFactory = new MyOpFactory();
        Calculator calc = new Calculator(myOpFactory);
        calc.exec();
    }
}

