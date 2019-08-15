package BusinessControler;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class WsAlbum {


    public static void main(String[] args) {

        String respuesta= consumirWsGet("https://jsonplaceholder.typicode.com/albums");
        System.out.println("Respuesta WS traida del metodo: " +respuesta);

        String atributoRespuesta= elementoWS(respuesta,"id","2");
        System.out.println("respuesta WS desde los metodos: " +atributoRespuesta);


      /*  //IniciaConsumoWS
        String endPoint = "https://jsonplaceholder.typicode.com/albums";
        RestAssured.useRelaxedHTTPSValidation();

        String response = RestAssured.given().contentType(ContentType.JSON).when().get(endPoint).asString();

        System.out.println(":::::::::::::" + response);
        //FinalizaConsumoWS



        JsonParser jsonParser = new JsonParser();

        JsonArray jsonArray = jsonParser.parse(response).getAsJsonArray();

        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.get("id").getAsString().equals("2")) {
                System.out.println("Elemento del objeto: " +jsonObject.get("id")+" - "+jsonObject.get("title").getAsString());
            }
        }
        ///////////////////

        List<JsonObject> jsonObjectsList = new ArrayList<>();

        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            if (jsonObject.get("userId").getAsString().equals("8")) {
                jsonObjectsList.add(jsonObject);

            }
        }
        System.out.println("LISTA DE Objetos::::::::  " + jsonObjectsList);


        List<JsonObject> jsonObjectList = jsonObjectsList.stream()
                .filter(e -> e.get("id").getAsString().contains("8"))
                .filter(e -> e.get("title").getAsString().contains("est"))
                .collect(toList());

        jsonObjectList.forEach(e -> System.out.println("Impresion con Filter 1: "+e.toString()));

        for (JsonObject object : jsonObjectList) {
            System.out.println("Impresion con Filter 2: " + object.toString());
        }*/
    }


    public static String consumirWsGet(String endPoint){
        RestAssured.useRelaxedHTTPSValidation();
        String response;
        return
                response=RestAssured.given().contentType(ContentType.JSON).when().get(endPoint).asString();
    }

    public static String elementoWS(String response, String atributo, String atribValor) {
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = jsonParser.parse(response).getAsJsonArray();
        String atributoValorResponse = null;
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.get(atributo).getAsString().equals(atribValor)) {
                System.out.println("Elemento del objeto: " + jsonObject.get(atributo) + "-" + jsonObject.get(atribValor));
                atributoValorResponse= String.valueOf(jsonObject.get(atribValor));
            }
        }
        return atributoValorResponse;
    }




}
