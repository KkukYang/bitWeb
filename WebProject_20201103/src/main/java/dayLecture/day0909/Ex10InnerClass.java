package dayLecture.day0909;

abstract class Hello {
    abstract public void showMessage();
}

public class Ex10InnerClass {
    Hello hello1 = new Hello() {
        @Override
        public void showMessage() {
            // TODO Auto-generated method stub
            System.out.println("hello1");
        }
    };

    Hello hello2 = new Hello() {
        @Override
        public void showMessage() {
            // TODO Auto-generated method stub
            System.out.println("hello2");
        }
    };

    class SubHello extends Hello {
        @Override
        public void showMessage() {
            // TODO Auto-generated method stub
            System.out.println("SubHello");
        }
    }

    public void write() {
        SubHello s = new SubHello();
        s.showMessage();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex10InnerClass ex = new Ex10InnerClass();
        ex.hello1.showMessage();
        ex.hello2.showMessage();
        ex.write();

        SubHello h = ex.new SubHello();
        h.showMessage();
    }
}
