package Homwork;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("��������� �����: " + r);
            if (r == 100) {
                System.out.println("������ ����� 100, ������� �� ���� ��������");
                break;
            }
        }
    }
}