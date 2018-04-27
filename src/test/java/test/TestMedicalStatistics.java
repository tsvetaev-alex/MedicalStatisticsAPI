package test;

import core.Enums.PrintingDetails;
import org.junit.Test;
import static core.MedicalStatisticsHttpClient.GetTemplateById;

public class TestMedicalStatistics {

    @Test
    public void TestGetAllTemplates()
    {
        System.out.println("\n------------------------------- Cut Line -----------------------------------------------");
        System.out.println("----- Test Case: Get Template by incorrect Id: Expected Result: true(all templates) ----");
        GetTemplateById("", PrintingDetails.ShortSummary, true);
        GetTemplateById("", PrintingDetails.FullContent, true);
    }

    @Test
    public void TestTemplateByCorrectId()
    {
        System.out.println("\n------------------------- Cut Line ----------------------------------------");
        System.out.println("----- Test Case: Get Template by incorrect Id: Expected Result: false ----");
        GetTemplateById("0", false);
    }

    @Test
    public void TestTemplateByNotExistsId()
    {
        System.out.println("\n------------------------ Cut Line ----------------------------------------");
        System.out.println("-------- Test Case: Get Template by correct Id: Expected Result: true ----");
        GetTemplateById("1", PrintingDetails.ShortSummary, true);
        GetTemplateById("1", PrintingDetails.FullContent, true);
        //GetTemplateById("410"); // 410 - valid for minsk
    }

    @Test
    public void TestTemplateByIncorrectId()
    {
        System.out.println("\n------------------------ Cut Line ----------------------------------------");
        System.out.println("------- Test Case: Get Template by Id with incorrect format: Expected Result: false -----");
        GetTemplateById("a03",false);
    }
}