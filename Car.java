class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("�Ͳ��F���l");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("�N�����]��" + num + ",�T�o�q�]��" + gas);
    }

    public void show() {
        System.out.println("�����O" + num);
        System.out.println("�T�o�q�O" + gas);
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("�Ͳ��F�ɨ�");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("�N�ɨ��s���]��" + course);
    }
}