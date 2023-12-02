public class hw22 {
    public static void main(String[] args) {
        Company22 cmp = new Company22();
        Driver22 drv1 = new Driver22(cmp);
        drv1.start();

        Driver22 drv2 = new Driver22(cmp);
        drv2.start();
    }
}

class Company22 {
    private int sum = 0;

    public synchronized void add(int a) {
        int tmp = sum;
        System.out.println("目前合計金額是" + tmp + "元");
        System.out.println("賺到了" + a + "元");
        tmp = tmp + a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}

class Driver22 extends Thread {
    private Company22 cmp;

    public Driver22(Company22 c) {
        cmp = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cmp.add(50);
        }
    }
}