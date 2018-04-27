package core;

import MedicalStatisticsSpb.TemplatesList;
import MedicalStatisticsSpb.TemplateContent;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class JacksonMapper {

    public TemplatesList GetTemplate (String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            TemplatesList templates = mapper.readValue(jsonString, TemplatesList.class);
            return templates;
        }catch (JsonParseException e) {
            System.out.println("Exception: JsonParseException:" + e.getMessage());
        } catch (JsonMappingException e) {
            System.out.println("Exception: JsonMappingException:" + e.getMessage());
        } catch (IOException x) {
        System.out.println("Exception: IOException:" + x.getMessage());
        }
        return null;
    }
    public TemplateContent GetContent (String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            TemplateContent content = mapper.readValue(jsonString, TemplateContent.class);
            return content;
        }catch (JsonParseException e) {
            System.out.println("Exception: JsonParseException:" + e.getMessage());
        } catch (JsonMappingException e) {
            System.out.println("Exception: JsonMappingException:" + e.getMessage());
        } catch (IOException x) {
        System.out.println("Exception: IOException:" + x.getMessage());
        }
        return null;
    }

}
