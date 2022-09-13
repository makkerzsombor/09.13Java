package hu.petrik.elsoora;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Nincs megadva a forrás és a cél");
        }else {
            String source = args[0];
            String destination = args[1];
            System.out.println(source + " --> " + destination);
        }
    }
}
