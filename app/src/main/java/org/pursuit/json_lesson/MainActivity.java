package org.pursuit.json_lesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Json Example";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView movieRecyclerView = findViewById(R.id.bird_recyclerview);




//        JSONObject newJsonWeAreMaking = new JSONObject();
//
//        try {
//            newJsonWeAreMaking.put("family_members", new JSONArray()
//                    .put(new JSONObject()
//                            .put("name", "Jose")
//                            .put("role", "Brother")
//                            .put("age", 38))
//                    .put(new JSONObject()
//                            .put("name", "Ramona")
//                            .put("role", "Sister")
//                            .put("age", 42))
//                    .put(new JSONObject()
//                            .put("name", "Joe")
//                            .put("role", "Father")
//                            .put("age", 70))
//                    .put(new JSONObject()
//                            .put("name", "Barbara")
//                            .put("role", "Mother")
//                            .put("age", 72))
//                    .put(new JSONObject()
//                            .put("name", "Aida")
//                            .put("role", "Partner")
//                            .put("age", 42)));
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        String jsonString = newJsonWeAreMaking.toString();

        String birdString = "{\n" +
                "  \"description\": \"Birds of Antarctica, grouped by family\",\n" +
                "  \"source\": \"https://en.wikipedia.org/wiki/List_of_birds_of_Antarctica\",\n" +
                "  \"birds\": [\n" +
                "    {\n" +
                "      \"family\": \"Albatrosses\",\n" +
                "      \"members\": [\n" +
                "        \"Wandering albatross\",\n" +
                "        \"Grey-headed albatross\",\n" +
                "        \"Black-browed albatross\",\n" +
                "        \"Sooty albatross\",\n" +
                "        \"Light-mantled albatross\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Cormorants\",\n" +
                "      \"members\": [\n" +
                "        \"Antarctic shag\",\n" +
                "        \"Imperial shag\",\n" +
                "        \"Crozet shag\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Diving petrels\",\n" +
                "      \"members\": [\n" +
                "        \"South Georgia diving petrel\",\n" +
                "        \"Common diving petrel\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Ducks, geese and swans\",\n" +
                "      \"members\": [\n" +
                "        \"Yellow-billed pintail\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Gulls\",\n" +
                "      \"members\": [\n" +
                "        \"Kelp gull\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Penguins\",\n" +
                "      \"members\": [\n" +
                "        \"King penguin\",\n" +
                "        \"Emperor penguin\",\n" +
                "        \"Gentoo penguin\",\n" +
                "        \"Adelie penguin\",\n" +
                "        \"Chinstrap penguin\",\n" +
                "        \"Rockhopper penguin\",\n" +
                "        \"Macaroni penguin\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Shearwaters and petrels\",\n" +
                "      \"members\": [\n" +
                "        \"Antarctic giant petrel\",\n" +
                "        \"Hall's giant petrel\",\n" +
                "        \"Southern fulmar\",\n" +
                "        \"Antarctic petrel\",\n" +
                "        \"Cape petrel\",\n" +
                "        \"Snow petrel\",\n" +
                "        \"Great-winged petrel\",\n" +
                "        \"White-headed petrel\",\n" +
                "        \"Blue petrel\",\n" +
                "        \"Broad-billed prion\",\n" +
                "        \"Salvin's prion\",\n" +
                "        \"Antarctic prion\",\n" +
                "        \"Slender-billed prion\",\n" +
                "        \"Fairy prion\",\n" +
                "        \"Grey petrel\",\n" +
                "        \"White-chinned petrel\",\n" +
                "        \"Kerguelen petrel\",\n" +
                "        \"Sooty shearwater\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Sheathbills\",\n" +
                "      \"members\": [\n" +
                "        \"Snowy sheathbill\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Skuas and jaegers\",\n" +
                "      \"members\": [\n" +
                "        \"South polar skua\",\n" +
                "        \"Brown skua\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Storm petrels\",\n" +
                "      \"members\": [\n" +
                "        \"Grey-backed storm petrel\",\n" +
                "        \"Wilson's storm petrel\",\n" +
                "        \"Black-bellied storm petrel\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"family\": \"Terns\",\n" +
                "      \"members\": [\n" +
                "        \"Arctic tern\",\n" +
                "        \"Antarctic tern\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

//        Log.d(TAG, "onCreate: " + jsonString);
        Log.d(TAG, "onCreate: " + birdString);

//        try {
//            // First, we're turning the String into a JSONObject
//            JSONObject oldJsonWeAreParsing = new JSONObject(jsonString);
//
//            // Next, we're extracting the part of the JSON we want, the JSONArray,
//            // and using the key "family_members" to get to it:
//            JSONArray familyMembersJsonArray = oldJsonWeAreParsing.getJSONArray("family_members");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        try {
//            JSONObject oldJsonWeAreParsing = new JSONObject(jsonString);
//
//            JSONArray familyMembersJsonArray = oldJsonWeAreParsing.getJSONArray("family_members");
//
//            List<FamilyMember> familyMemberList = new ArrayList<>();
//
//            for (int i = 0; i < familyMembersJsonArray.length(); i++) {
//                FamilyMember member = new FamilyMember();
//                member.setName((String) familyMembersJsonArray.getJSONObject(i).get("name"));
//                member.setRole((String) familyMembersJsonArray.getJSONObject(i).get("role"));
//                member.setAge((Integer) familyMembersJsonArray.getJSONObject(i).get("age"));
//                familyMemberList.add(member);
//            }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        try {
            JSONObject birdJsonWeAreParsing = new JSONObject(birdString);

            JSONArray birdsOfAntarcticaJsonArray = birdJsonWeAreParsing.getJSONArray("birds_of_antarctica");

            List<BirdsOfAntarctica> birdsOfAntarcticaList = new ArrayList<>();

            for (int i = 0; i < birdsOfAntarcticaJsonArray.length(); i++) {
               BirdsOfAntarctica birdsOfAntarctica = new BirdsOfAntarctica();
               birdsOfAntarctica.setFamily((String) birdsOfAntarcticaJsonArray.getJSONObject(i).get("family"));
                birdsOfAntarctica.setMembers((Integer) birdsOfAntarcticaJsonArray.getJSONObject(i).get("members"));
                birdsOfAntarcticaList.add(birdsOfAntarctica);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
