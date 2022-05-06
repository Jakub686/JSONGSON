import com.google.gson.Gson;

public class GsonToJson {
    public static void main(String[] args)
    {
        JObject jObject = new JObject("set",2, "Helloworld" );
        Gson gson = new Gson();
        String json = gson.toJson(jObject);
        System.out.println(json);

    }
}