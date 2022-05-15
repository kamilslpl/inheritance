package pl.sda.arp4.inheritance.ksztalty.domowe;
/*
Stwórz klasę Ptak która posiada metodę ‘śpiewaj():void’ która wypisuje ‘ćwir ćwir’.
        a) stwórz klasę dziedziczącą Bocian która nadpisuje klasę ‘śpiewaj():void’ i wypisuje ‘kle kle’
        b) stwórz klasę dziedziczącą Kukułka która nadpisuje klasę ‘śpiewaj():void’ i wypisuje ‘kuku kuku’
        c) stwórz klasę dziedziczącą Sowa która nadpisuje klasę ‘śpiewaj():void’ i wypisuje ‘hu hu’
        Stwórz kilka instancji każdej klasy i przetestuj działanie metod ‘śpiewaj():void’*/

public class Ptak {
    public void spiewaj(){
        System.out.println("cwir, cwir");

        Sowa s = new Sowa();
        s.spiewaj();

    }
}
