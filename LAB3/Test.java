interface Testable {
    void display();
}

class Test implements Testable {
    public void display() {
        System.out.println("Display method in Test class");
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

abstract class AbsTest implements Testable {
     
}
