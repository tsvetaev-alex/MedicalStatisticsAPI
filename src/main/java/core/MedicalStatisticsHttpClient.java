package core;

import MedicalStatisticsSpb.TemplateContent;
import MedicalStatisticsSpb.TemplatesList;

import core.Helpers.PrintingHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import core.Enums.PrintingDetails;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.get;

public class MedicalStatisticsHttpClient {

    private  static final String GET_TEMPLATE_BASE_URL =
            "http://ecsc0010655b.epam.com:10445/kwl/templates/"; //SPb environment;
            //"http://epbyminw2301.minsk.epam.com:9444/kwl/templates/"; //minsk environment;

    public static void main(String args[ ])
    {
    }

    public static void GetTemplateById(String Id, boolean expectedResult) {
        GetTemplateById(Id, PrintingDetails.Default, expectedResult);
    }

    public static void GetTemplateById(String Id, PrintingDetails printingDetails, boolean expectedResult) {
        //private static void GetTemplateById(String Id, boolean ExpectedValue){
        String targetUrl = GET_TEMPLATE_BASE_URL + Id;
        PrintingHelper.setTargetUrl(targetUrl);

        if (Id.isEmpty()) {
            System.out.println("\n--------------------" +
                    "\nTemplate Id is Empty.");
            System.out.println("targetUrl: " + targetUrl);
        } else {
            System.out.println("Template Id: " + Id);
            System.out.println("targetUrl: " + targetUrl);
        }
        JacksonMapper jacksonMapper = new JacksonMapper();
        Response response = get(targetUrl);
        int code = response.getStatusCode();
        PrintingHelper.setInputStream(response.asInputStream());
        System.out.println("Response Status Code: " + code);

        if(code == 200) {
            if (Id.isEmpty()) {
                TemplatesList templates = jacksonMapper.GetTemplate(response.asString());
                PrintingHelper.printResponse(templates, printingDetails);
                if(expectedResult) {
                    System.out.println("\nRESULT: TEST CASE PASSED; Expected value is TRUE: Actual Value: " + code);
                } else {
                    System.out.println("\nRESULT: TEST CASE FAILED; Expected value is TRUE: Actual Value: " + code);
                }
            } // id is empty
            else
            {
                TemplateContent content = jacksonMapper.GetContent(response.asString());
                PrintingHelper.printResponse(content, printingDetails);
            }
        } // code 200
        else
        { // for both casses when ID empty and not.
            if(code == 404) {
                System.out.println("Response code is: " + code + "; Template with ID: " + Id + " not found...");
                PrintingHelper.printoutFullResponse(response.getBody().asInputStream());
            }
            if(code == 400) {
                System.out.println("Response code is: " + code + "; Something went wrong on server side with ID: " + Id + "...");
                PrintingHelper.printoutFullResponse(response.getBody().asInputStream());
            }
            if(code == 500) {
                System.out.println("Response code is: " + code + "; Something went wrong on server side with ID: " + Id + "...");
                PrintingHelper.printoutFullResponse(response.getBody().asInputStream());
            }
            if(expectedResult) {
                System.out.println("\nRESULT: TEST CASE FAILED; Expected value is TRUE: Actual Value: " + code);
            } else {
                System.out.println("\nRESULT: TEST CASE PASSED; Expected value is FALSE: Actual Value: " + code);
            }

        }
        /*


    public static void printourFullResponse(String targetUrl) {
        try {
            URL getUrl = new URL(targetUrl);
            URLConnection conn = getUrl.openConnection();
            int len = conn.getContentLength();
            System.out.println("Content Length: " + len);
            if (len <= 0 ) {
                System.out.println("Empty Content ");
            }
                System.out.println("Content: " + conn.getContent().toString());
                InputStream input = conn.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result);
                }
            }
            catch (MalformedURLException e) {
                System.out.println("MalformedURLException Exception in Response printout: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException Exception in Response printout: " + e.getMessage());
            }
    }
        public static void printoutResponse(InputStream inputStream){

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder result = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result);
        } catch (IOException e)
        {
            System.out.println("IOException Exception in Response printout: " + e.getMessage());
        }

    }


            default: ShortSummary:System.out.println("Printing Detail: " + printingDetails);
                break;
        }
*/

        //String result = IOUtils.toString(response.asInputStream(), StandardCharsets.UTF_8);
        //printourFullResponse(targetUrl);


    }

    //private static void printoutResponse(InputStream inputStream) {
    //}

    private static List<TemplatesList> GetTmeplateContent(Response response)
    {
            return new Gson().fromJson( response.toString().trim(), new TypeToken<List<TemplatesList>>() {}.getType());
    }

    //private static getDataObject()
    //{
    //}
}

