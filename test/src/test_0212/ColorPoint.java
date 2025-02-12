package test_0212;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(int x, int y) {
        move(x, y);
    }

    @Override
    public String toString() {
        return color + "색으로 " + "(" + getX() + ", " + getY()+")";
    }

    public void show() {
        System.out.println(toString()); // 객체 정보 출력
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("PINK");
        cp.show();
    }
}
