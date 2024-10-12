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
        Place trabzon=new Place("TRABZON",840);
        Place trabzon1=new Place("trabzon",840);
        add(placeToVisit,tokat);
        add(placeToVisit,trabzon);
        add(placeToVisit,trabzon1);
        System.out.println(placeToVisit);
    }




    private static void add(LinkedList<Place> list,Place place ){
        if(list.contains(place)){
            System.out.println("found duplicate place..."+place);
            return;
        }
        for(Place p :list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate :"+place);
                return;
            }
        }
        list.add(place);
    }
}