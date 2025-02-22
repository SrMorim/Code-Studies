package application;

import entities.*;
import java.util.*;
public class Main {

    static void tri() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Valores de X");
        System.out.print("Declare o primeiro valor do trianguloX: ");x.a = sc.nextDouble();
        System.out.print("Declare o segundo valor do trianguloX: ");x.b = sc.nextDouble();
        System.out.print("Declare o terceiro valor do trianguloX: ");x.c = sc.nextDouble();
        System.out.println("Valores de Y");
        System.out.print("Declare o primeiro valor do trianguloY: ");y.a = sc.nextDouble();
        System.out.print("Declare o segundo valor do trianguloY: ");y.b = sc.nextDouble();
        System.out.print("Declare o terceiro valor do trianguloY: ");y.c = sc.nextDouble();

        System.out.println("\nA área do triangulo X é: " + x.area());
        System.out.println("A área do triangulo Y é: " + y.area());

        sc.close();
    }

    static void ret() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo x = new Retangulo();

        System.out.print("Altura do retângulo: "); x.altura = sc.nextDouble();
        System.out.print("Largura do retângulo: "); x.largura = sc.nextDouble();

        System.out.println("Área: " + x.area());
        System.out.println("Perímetro: " + x.perimetro());
        System.out.println("Diagonal: " + x.diagonal());

        sc.close();
    }

    static void emp() {
        Scanner sc = new Scanner(System.in);
        Funcionario employee = new Funcionario();



        System.out.print("Name: "); employee.name = sc.nextLine();
        System.out.print("Gross Salary: "); employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: "); employee.tax = sc.nextDouble();

        System.out.println("Employed: " + employee.name + ", $" + employee.netSalary());

        System.out.print("Which percentage to increase salary?: "); double plus = sc.nextDouble();

        System.out.println("Update data: " + employee.name + ", $" + employee.increaseSalary(plus));


        sc.close();
    }

    static void std() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: "); student.name = sc.nextLine();
        System.out.print("Exam 1: "); student.p1 = sc.nextDouble();
        System.out.print("Exam 2: "); student.p2 = sc.nextDouble();
        System.out.print("Exam 3: "); student.p3 = sc.nextDouble();

        System.out.println("Final grade: " + student.finalGrade());
        student.result();

        sc.close();
    }

    static void convert() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor do dolar: "); Calculator.doll = sc.nextDouble();
        System.out.print("Quantos dolares quer comprar?: "); Calculator.qtdoll = sc.nextDouble();
        System.out.print("Vai custar: R$" + Calculator.convertbrl());

        sc.close();
    }

    static void bank() {
        //Deve limpar o buffer de entrada
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");int acc = sc.nextInt();
        System.out.print("Enter account holder: ");String hacc = sc.nextLine();
        Account account = new Account(hacc, acc);

        System.out.printf("Entrando na conta %d pertencente ao %s", acc, hacc);



        sc.close();
    }

    public static void main(String[] args) {
        //Sistema para adicionar produtos em um estoque.
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de adição de produtor no estoque (digite 0 para sair):");
        int n = 1;
        int qtd = 0;

        while (n != 0){
            System.out.print("Adicionar produto?: "); n = sc.nextInt();
            sc.nextLine();

            if (n == 0) {
                break;
            }

            System.out.print("Nome do produto: "); String pnome = sc.nextLine();
            System.out.print("Valor do produto: "); double pvalor = sc.nextDouble();
            System.out.print("Quantidade para armazenar: "); int quantidade = sc.nextInt();

            Stock produto = new Stock(pnome, pvalor, quantidade);
            System.out.printf("produto %s no valor de %.2f adicionado a quantidade de %d no estoque.\n", pnome, pvalor, quantidade);

            qtd++;


        }
        System.out.printf("Você registrou %d produtos diferentes no estoque.", qtd);
        System.out.printf("Os produtos adicionados foram: ");


        sc.close();

    }
}
