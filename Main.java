import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Jakie działanie chcesz wykonać? Do wyboru: +, -, *, /");
        String operation = sc.nextLine();
            if (operation.equals("+")){
                System.out.println(add());
            }
            else if (operation.equals("-")){
                System.out.println(subtract());
            }
            else if (operation.equals("*")){
                System.out.println(multiply());
            }
            else if (operation.equals("/")){
                System.out.println(divide());
            }
            else{
                System.out.print("Nieprawidłowy znak");
            }

    }
    static float add(){
        float suma= 0;
        System.out.println("Ile liczb mam dodać?");
        int count = sc.nextInt();
        System.out.println("Podaj te liczby: ");
        for (int i = 0; i < count; i++) {
            suma = suma + sc.nextFloat();
        }
        return suma;
    }
    static float subtract(){
        System.out.println("Od jakiej liczby mam odejmować?");
        float suma = sc.nextFloat();
        System.out.println("Ile liczb mam odjąć?");
        int count = sc.nextInt();
        System.out.println("Podaj te liczby: ");
        for (int i = 0; i < count; i++) {
            suma = suma - sc.nextFloat();
        }
        return suma;
    }
    static float multiply(){
        float suma = 1;
        System.out.println("Ile liczb mam pomnożyć?");
        int count = sc.nextInt();
        System.out.println("Podaj te liczby: ");
        for (int i = 0; i < count; i++) {
            suma = suma * sc.nextFloat();
        }
        return suma;
    }
    static float divide(){
        System.out.println("Podaj liczbę, którą będziemy dzielić");
        float a = sc.nextFloat();
        System.out.println("Podaj liczbę, przez którą będziemy dzielić");
        float b = sc.nextFloat();
        return a/b;
    }

}

