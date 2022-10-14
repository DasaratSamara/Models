import java.util.Scanner;

public class Main {
    public static int summa(int a, int b) {
        int result;
        result = a + b;
        return result;

    }

    public static int raznost(int a, int b) {
        int rezult;
        rezult = a - b;
        return rezult;

    }

    public static int proizved(int a, int b) {
        int rezult;
        rezult = a * b;
        return rezult;

    }

    public static int delenie(int a, int b) {
        int rezult;
        rezult = a / b;
        return rezult;

    }

    public static int operand2() {
        int operand2;
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("������� ������� 2, ����� �����:");
        operand2 = scanner.nextInt();// ���������� �������� 2
        return operand2;

    }

    public static void main(String[] args) {

        System.out.println("������ ����! ����� ���� ������� �����������!�� ����� ��������� ��������� ��������:");
        System.out.println("����� - �������� ��������");
        System.out.println("�������� - �������� ����� ��������� 1 � ��������� 2");
        System.out.println("������������ - ��������� �������� 1 �� ������� 2");
        System.out.println("������� - ������� �������� 1 �� ������� 2");
        char operation = '0';
        int operand1 = 0;
        int operand2 = 0;
        while (operation != 's') {
            Scanner scanner = new Scanner(System.in, "UTF-8");
            if (operand1 == 0) {
                System.out.println("������� ������� 1, ����� �����:");
                operand1 = scanner.nextInt();// ���������� �������� 1
            } else {
                System.out.println("������� 1 �����:" + operand1);// ������� ���������
            }

            do {
                System.out.println("������� �������� �� �������� C - ������� ���������, f - �����, r-��������, p-�����������,d - �������, s - ��������� �����������");
                operation = scanner.next().charAt(0);// ���������� ��������
                System.out.println(operation == 'f' || operation == 'r' || operation == 'p' || operation == 'd' || operation == 's' || operation == 'C' ? "���� �������� " + operation : "�������� �� ��������������!��������� ����!");
            }
            while (operation != 'f' && operation != 'r' && operation != 'p' && operation != 'd' && operation != 's' && operation != 'C');
            if (operation == 's') {//�������� ������� ��� ����������� ����� while � ���������� ������������
                continue;
            }

            switch (operation) {
                case 'f':
                    operand2 = Main.operand2();//�������� ����� ��� ���������� ������� ��������
                    int rezult = Main.summa(operand1, operand2);//�������� ����� ��� �������� ���� ���������
                    System.out.println("��������� ��������:" + rezult);// ������� ���������
                    operand1 = rezult;
                    break;
                case 'r':
                    operand2 = Main.operand2();//�������� ����� ��� ���������� ������� ��������
                    rezult = Main.raznost(operand1, operand2);//�������� ����� ��� ��������� ���� ���������
                    System.out.println("��������� ���������:" + rezult);// ������� ���������
                    operand1 = rezult;
                    break;
                case 'p':
                    operand2 = Main.operand2();//�������� ����� ��� ���������� ������� ��������
                    rezult = Main.proizved(operand1, operand2);//�������� ����� ��� ������������ ���� ���������
                    System.out.println("��������� ������������:" + rezult);// ������� ���������
                    operand1 = rezult;
                    break;
                case 'd':
                    operand2 = Main.operand2();//�������� ����� ��� ���������� ������� ��������
                    rezult = Main.delenie(operand1, operand2);//�������� ����� ��� ������� ���� ���������
                    System.out.println("��������� �������:" + rezult);// ������� ���������
                    operand1 = rezult;
                    break;
                case 'C':
                    operand1 = 0;
                    operand2 = 0;
                    rezult = 0;
                    System.out.println("�� �������� �������� � ���������");// ������� ���������
                    break;
            }
        }

    }

}
