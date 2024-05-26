package Backend.Board;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
/**
 * Class used for importing all the properties from
 * properties.json file to an ArrayList allProperties.
 */
public class JSONPropertiesImporter {
    private final ArrayList<Property> allProperties;

    public JSONPropertiesImporter(){
        this.allProperties = new ArrayList<>();
    }
    public void importProperties(){
        try{
            importStreets();
            importUtilities();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void importStreets() throws IOException {
        String properties = new String(Files.readAllBytes(Paths.get("rsc/properties.json")));
        JSONObject jsonObject = new JSONObject(properties);
        JSONArray streetList = jsonObject.getJSONArray("streetList");

        for (int i = 0; i < streetList.length(); i++) {
            Street street = new Street();
            street.setName(streetList.getJSONObject(i).getString("name"));
            street.setColour(streetList.getJSONObject(i).getString("colour"));
            street.setPrice(streetList.getJSONObject(i).getInt("price"));
            street.setMortgage(streetList.getJSONObject(i).getInt("mortgage"));
            street.setHousePrice(streetList.getJSONObject(i).getInt("housePrice"));
            int[] rentArray = new int[6];
            for (int j = 0; j < rentArray.length; j++) {
                rentArray[j] = streetList.getJSONObject(i).getJSONArray("rent").getInt(j);
            }
            street.setRent(rentArray);
            allProperties.add(street);
        }
    }

    private void importUtilities() throws IOException {
        String properties = new String(Files.readAllBytes(Paths.get("rsc/properties.json")));
        JSONObject jsonObject = new JSONObject(properties);
        JSONArray utilityList = jsonObject.getJSONArray("utilityList");

        for (int i = 0; i < utilityList.length(); i++) {
            Utility utility = new Utility();
            utility.setName(utilityList.getJSONObject(i).getString("name"));
            utility.setType(utilityList.getJSONObject(i).getString("type"));
            utility.setPrice(utilityList.getJSONObject(i).getInt("price"));
            utility.setMortgage(utilityList.getJSONObject(i).getInt("mortgage"));
            int[] rentArray = new int[utilityList.getJSONObject(i).getJSONArray("rent").length()];
            for (int j = 0; j < rentArray.length; j++) {
                rentArray[j] = utilityList.getJSONObject(i).getJSONArray("rent").getInt(j);
            }
            utility.setRent(rentArray);
            allProperties.add(utility);
        }
    }
    public ArrayList<Property> getAllProperties() {
        return allProperties;
    }
}
