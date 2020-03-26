package pl.accenture.szkolka;

public class Main {
    public static void main(String[] args) {
        printPersonInfoV("Agata", "koziol", "wiek: 21", "wzrost 182");
        printPersonInfoV("jan", "kowalski", "wiek: 35", "wzros: 164","zainteresowania: sport");
        printPersonInfoV("kasia", "nowak");


    }
    static void printPersonInfoV(String name, String lastName, String ... additionalInfo){
        System.out.println("name: " + name);
        System.out.println("last name: " + lastName);
        if(additionalInfo.length > 0){
            System.out.println("Additional info: " + additionalInfo.length );
            for (String s : additionalInfo) {
                System.out.println(s);
            }
        }
        System.out.println("---------------------");
    }

}
