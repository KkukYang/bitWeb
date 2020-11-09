package day0909;

interface WindowEvent {
    public void windowClose();

    public void windowIcon();

    public void windowOpen();
}

public class Ex11InnerClass {
    WindowEvent win = new WindowEvent() {
        @Override
        public void windowClose() {
            // TODO Auto-generated method stub
            System.out.println("windowClose");
        }

        @Override
        public void windowIcon() {
            // TODO Auto-generated method stub
            System.out.println("windowIcon");
        }

        @Override
        public void windowOpen() {
            // TODO Auto-generated method stub
            System.out.println("windowOpen");
        }
    };

    class SubWindow implements WindowEvent {
        @Override
        public void windowClose() {
            // TODO Auto-generated method stub
            System.out.println("windowClose");
        }

        @Override
        public void windowIcon() {
            // TODO Auto-generated method stub
            System.out.println("windowIcon");
        }

        @Override
        public void windowOpen() {
            // TODO Auto-generated method stub
            System.out.println("windowOpen");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex11InnerClass ex = new Ex11InnerClass();
        ex.win.windowClose();
        ex.win.windowIcon();
        ex.win.windowOpen();
        System.out.println();

        SubWindow sub = ex.new SubWindow();
        sub.windowClose();
        sub.windowIcon();
        sub.windowOpen();
    }

}
