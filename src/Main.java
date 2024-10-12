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

        add(placeToVisit,new Place("TOKAT",550));
        add(placeToVisit,new Place("TRABZON",840));
        add(placeToVisit,new Place("TRABzON",840));
        add(placeToVisit,new Place("DİYARBAKIR",950));
        add(placeToVisit,new Place("HAKKARİ",1040));
        add(placeToVisit,new Place("İZMİR",700));
        add(placeToVisit,new Place("ERZURUM",900));
        add(placeToVisit,new Place("ANKARA",0));
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
        int matchIndex=0;
        for(var listPlace:list){
            if(place.distance()<listPlace.distance()){
                 list.add(matchIndex,place);
                 return;
            }
            matchIndex++;

        }
        list.add(place);
    }
}