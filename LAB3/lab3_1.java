 abstract class Bharatvanshi {
    protected String name;
    
    public Bharatvanshi(String name) {
        this.name = name;
    }
    
    public void fight() {
        System.out.println(name + " is fighting!");
    }
    
    public abstract void obey();
    public abstract void kind();
}

class Pandav extends Bharatvanshi {
    public Pandav(String name) {
        super(name);
    }
    
    @Override
    public void obey() {
        System.out.println(name + " obeys his elders and follows dharma.");
    }
    
    @Override
    public void kind() {
        System.out.println(name + " is kind-hearted.");
    }
}

class Arjun extends Pandav {
    public Arjun() {
        super("Arjun");
    }
}

class Bheem extends Pandav {
    public Bheem() {
        super("Bheem");
    }
    
    @Override
    public void kind() {
        System.out.println(name + " is kind, but not as much as Arjun.");
    }
}

class Kaurav extends Bharatvanshi {
    public Kaurav(String name) {
        super(name);
    }
    
    @Override
    public void obey() {
        System.out.println(name + " disobeys orders and is rebellious.");
    }
    
    @Override
    public void kind() {
        System.out.println(name + " is cruel and unkind.");
    }
}

class Duryodhan extends Kaurav {
    public Duryodhan() {
        super("Duryodhan");
    }
}

class Vikarn extends Kaurav {
    public Vikarn() {
        super("Vikarn");
    }
    
    @Override
    public void obey() {
        System.out.println(name + " is obedient, showing his noble nature.");
    }
    
    @Override
    public void kind() {
        System.out.println(name + " is kind and compassionate.");
    }
}

public class lab3_1 {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();
        
        System.out.println("=== Pandavs ===");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        
        System.out.println();
        
        bheem.fight();
        bheem.obey();
        bheem.kind();
        
        System.out.println("\n=== Kauravs ===");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        
        System.out.println();
        
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
