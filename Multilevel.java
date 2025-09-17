class employee {
    String name="bhavik";
    int id=101;
    void Putdata() {
        
        System.out.println("Your name is: "+name);
        System.out.println("Your ID num is: "+id);

    }
}

class worker extends employee{
    String name="ramesh";
    int id=201;
    void Display() {
        System.out.println("Worker name is: "+name);
        System.out.println("Worker ID is: "+id);
    }
}

class job extends worker {
    String job="programer";
    int num=999;
    void put() {
        System.out.println("Your job is: "+job);
        System.out.println("Your pc no. is: "+num);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        job j1 = new job();
         j1.Putdata();
         j1.Display();
         j1.put();
        
    }
}