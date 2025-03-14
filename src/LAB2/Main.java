package LAB2;//package ro.ulbs.paradigme.lab2;

class Form {
    private String color;

    public Form() {
        this.color = "white";
    }

    public Form(String color) {
        this.color = color;
    }

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "This form has the color " + color;
    }
}

class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", LAB2.Triangle with height " + height + " and base " + base;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 && Float.compare(triangle.base, base) == 0 && super.toString().equals(triangle.toString());
    }
}

class Circle extends Form {
    private float radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + ", LAB2.Circle with radius " + radius;
    }
}

class Square extends Form {
    private float side;

    public Square() {
        super();
        this.side = 0;
    }

    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + ", LAB2.Square with side " + side;
    }
}

 class Application {
    public static void main(String[] args) {
        System.out.println("Laborator paradigme de programare\n");

        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Area = " + tri.getArea() + " details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));
    }
}

