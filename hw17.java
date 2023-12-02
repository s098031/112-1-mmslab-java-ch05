public class hw17 {
    public static void main(String[] args) {
        Car15 car1 = new Car15("1號車");
        car1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行main()的處裡工作");
        }
    }
}

class Car15 extends Thread {
    private String name;

    public Car15(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
                System.out.println("正在進行" + name + "的處裡工作");
            } catch (Exception e) {
            }
        }
    }

}