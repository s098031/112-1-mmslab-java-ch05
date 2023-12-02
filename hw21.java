public class hw21 {
    public static void main(String[] args) {
        Company21 cmp = new Company21();
        Driver21 drv1 = new Driver21(cmp);
        drv1.start();
        Driver21 drv2 = new Driver21(cmp);
        drv2.start();
    }
}

class Company21 {
    private int sum = 0;

    public void add(int a) {
        int tmp = sum;
        System.out.println("目前合計金額是" + tmp + "元");
        System.out.println("賺到了" + a + "元");
        tmp = tmp + a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}

class Driver21 extends Thread {
    private Company21 cmp;

    public Driver21(Company21 c) {
        cmp = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cmp.add(50);
        }
    }
}