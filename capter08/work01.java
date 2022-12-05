package capter08;

public class work01 {
    public static void main(String[] args) {
        PC pc = new PC("inter", 23, "sd", "ew");
        pc.printInfo();
    }
}

class Computer {
    String cpu;
    int nc;
    String yp;

    public Computer(String cpu, int nc, String yp) {
        this.cpu = cpu;
        this.nc = nc;
        this.yp = yp;
    }

    public String getDetail() {
        return "cpu=" + cpu + " nc=" + nc + " yp= " + yp;
    }
}

class PC extends Computer {
    String brand;

    public PC(String cup, int nc, String yp, String brand) {
        super(cup, nc, yp);
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println(getDetail() + " brand=" + brand);
    }
}