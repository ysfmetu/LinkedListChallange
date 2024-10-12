import java.util.LinkedList;

record Place(String name,int distance){
    @Override
    public String toString() {
        return String.format(" %s (%d)", name,distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place>placeToVisit=new LinkedList<>();
        Place tokat=new Place("TOKAT",550);
        add(placeToVisit,tokat);
        System.out.println(placeToVisit);
    }




    private static void add(LinkedList<Place> list,Place place ){
        if(list.contains(place)){
            System.out.println("found duplicate place..."+place);
            return;
        }
        list.add(place);
    }
}