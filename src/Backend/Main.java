package Backend;

public class Main {
    public static void main (String[] args){
        JSONPropertiesImporter jp = new JSONPropertiesImporter();
        jp.importProperties();
        for(Property p : jp.getAllProperties()){
            System.out.println(p.toString());
        }
    }
}
