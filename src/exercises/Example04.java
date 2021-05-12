package exercises;

public class Example04 {
    public static void main(String[] args) {
        Stock stock = new Stock(10);
        Shop shop1 = new Shop(stock, "shop1");
        Shop shop2 = new Shop(stock, "shop2");

        shop1.start();
        shop2.start();
    }
}
class Stock {
    private int count = 0;
    private Object lock = new Object();
    public Stock(int stock) {
        this.count = stock;
    }
    public boolean take(int num) {
        synchronized (lock) {
            if (num <= this.count) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.count -= num;
                return true;
            } else {
                return false;
            }

        }
    }
    public int getCount() {
        return this.count;
    }
}

class Shop extends Thread {
    private Stock stock = null;
    private String name = null;

    public Shop(Stock stock, String name) {
        this.stock = stock;
        this.name = name;
    }
    public void run() {
        while (true) {
            if (!this.stock.take(1)) {
                break;
            }
            System.out.printf("%sを1個取り出しました。 %n",
                    this.name);
        }
        System.out.printf("%s残りの在庫は%d個です。 %n", this.name,
                this.stock.getCount());
    }
}


