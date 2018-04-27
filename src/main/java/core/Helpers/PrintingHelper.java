package core.Helpers;

import MedicalStatisticsSpb.TemplateContent;
import MedicalStatisticsSpb.TemplatesList;
import core.Enums.PrintingDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class PrintingHelper {
    static String targetUrl;

    //region --- Printing Methods ---
    public static void setTargetUrl(String Url)
    {
        targetUrl = Url;
    }
    public static void setInputStream(InputStream stream)
    {
        //inputStream = stream;
    }

    public static void printResponse(TemplatesList templates)
    {
        System.out.println("\n--- Printing Template Summary Details  --- ");
        int i = 0;
        int totalCount = templates.getContent().size();
        System.out.println("Response contains: " + totalCount + ", records.\n");

        while (i < totalCount) {
            try {
                System.out.println("\n((<<------------------------ TEMPLATE ID: " + templates.getContent().get(i).getId() +
                        " ---------------------------------------->>))");
                System.out.println("Template Name; " + templates.getContent().get(i).getName());
                System.out.println("Template Description: " + templates.getContent().get(i).getDescription());
                i++;
            } catch (Exception e) {
                System.out.println("Exception in Template printout: " +e.getMessage());
                break;
            }
        }
    }

    public static void printResponse(TemplatesList templates, PrintingDetails printingDetails)
    {
        switch(printingDetails) {
            case FullContent: //FullContent
                System.out.println("_____________________________");
                System.out.println("Printing Detail: " + printingDetails);
                printRawContent();
                break;
            default:
                System.out.println("_____________________________");
                System.out.println("Printing Detail: " + printingDetails);
                printResponse(templates);
                break;
        }
    }

    public static void printResponse(TemplateContent content)
    {
        System.out.println("\n--- Printing Content Short Summary Details  --- ");
       try {
            System.out.println("((<<------------------------ TEMPLATE ID: " + content.getId() + " ---------------------------------------->>))");
            System.out.println("Template ID: " + content.getId());
            System.out.println("Template Name; " + content.getName());
            System.out.println("Template Description: " + content.getDescription());
        } catch (Exception e) {
            System.out.println("Exception in Content printout: " +e.getMessage());
        }
    }

    public static void printResponse(TemplateContent content, PrintingDetails printingDetails)
    {
        switch(printingDetails) {
            case Default:
                System.out.println("_____________________________");
                System.out.println("Printing Detail: " + printingDetails);
                printResponse(content);
                break;
            case FullContent:
                System.out.println("_____________________________");
                System.out.println("Printing Detail: " + printingDetails);
                printRawContent();
                break;
            case ShortSummary:
                System.out.println("_____________________________");
                System.out.println("Printing Detail: " + printingDetails);
                printResponse(content);
                break;
        }
    }



    public static void printoutFullResponse(InputStream inputStream) {
        try {

            int len = inputStream.available();
            if (len == 0) {
                System.out.println("Available to read form Input Stream: " + inputStream.available() + " bytes.");
                System.out.println("Empty Content.");
            } else {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result);
                }
            }
        } catch (IOException e) {
            System.out.println("IOException Exception in Response printout: " + e.getMessage());
        }
    }

    private static void printRawContent () {
        try {
            URL getUrl = new URL(targetUrl);
            URLConnection conn = getUrl.openConnection();
            System.out.println("\n ____________________________");
            System.out.println("|                            |");
            System.out.println("| Printing FULL/RAW Content: |");
            System.out.println("|____________________________| \n");

            InputStream input = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result);

        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException Exception in Response printout: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException Exception in Response printout: " + e.getMessage());
        }
    }
//endregion

}


