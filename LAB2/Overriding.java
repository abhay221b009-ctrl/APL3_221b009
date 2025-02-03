class Overriding {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();  

        Child ch = new Child();
        ch.show();  
    }
}
class Mother {
    int x;

    public void show() {
        System.out.println("Mother class");
    }
}

class Child extends Mother {
    public void show() {
        System.out.println("Child class");
    }
}
