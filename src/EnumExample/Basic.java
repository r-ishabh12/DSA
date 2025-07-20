package EnumExample;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        for (Week day : Week.values()){
            System.out.println(day);
        }

    }
}
