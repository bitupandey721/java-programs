interface CAMERA {
    void capture();
}

interface VIDEO {
    void capture();
}

class Mobile implements CAMERA, VIDEO {
    
    public void capture() {
        System.out.println("Capturing from Mobile (Photo + Video)");
    }
}

public class Interface{
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.capture();
    }
}