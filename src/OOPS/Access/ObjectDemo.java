package OOPS.Access;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num) {
        super();
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}
