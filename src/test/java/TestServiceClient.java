import com.fasterxml.jackson.databind.ObjectMapper;
import com.leeannjakel.entity.Info;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://openlibrary.org/isbn/9781599906959.json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Info bookInfo = mapper.readValue(response, Info.class);
        assertEquals("Throne of glass", bookInfo.getTitle());

        //assertEquals("{\"publishers\": [\"Bloomsbury USA Children's\"], \"identifiers\": {}, \"description\": \"After she has served a year of hard labor in the salt mines of Endovier for her crimes, Crown Prince Dorian offers eighteen-year-old assassin Celaena Sardothien her freedom on the condition that she act as his champion in a competition to find a new royal assassin.\", \"covers\": [7268940], \"local_id\": [\"urn:phillips:31867003075806\", \"urn:sfpl:31223104421707\", \"urn:sfpl:31223117515172\", \"urn:sfpl:31223117515164\", \"urn:sfpl:31223126766097\", \"urn:sfpl:31223104504270\", \"urn:sfpl:31223126766105\", \"urn:sfpl:31223117515149\", \"urn:sfpl:31223117515156\", \"urn:sfpl:31223104421715\", \"urn:sfpl:31223126766113\", \"urn:sfpl:31223104504296\", \"urn:sfpl:31223115641244\", \"urn:sfpl:31223115641236\", \"urn:sfpl:31223117515180\", \"urn:sfpl:31223123101637\", \"urn:sfpl:31223126766220\", \"urn:sfpl:31223126766238\", \"urn:sfpl:31223104421749\", \"urn:sfpl:31223126766121\", \"urn:sfpl:31223126766139\", \"urn:sfpl:31223126766147\", \"urn:sfpl:31223126766154\", \"urn:sfpl:31223117515131\", \"urn:sfpl:31223117515099\", \"urn:sfpl:31223126766162\", \"urn:sfpl:31223104504304\", \"urn:sfpl:31223117515206\", \"urn:sfpl:31223117515123\", \"urn:sfpl:31223126766170\", \"urn:sfpl:31223126766188\", \"urn:sfpl:31223117515198\", \"urn:sfpl:31223126766196\", \"urn:sfpl:31223104504312\", \"urn:sfpl:31223126766204\", \"urn:sfpl:31223104504320\", \"urn:sfpl:31223126766212\"], \"physical_format\": \"Hardcover\", \"lc_classifications\": [\"PZ7.M111575 Thr 2012\", \"PZ7.M111575Thr 2012\"], \"latest_revision\": 9, \"key\": \"/books/OL25290141M\", \"authors\": [{\"key\": \"/authors/OL7115219A\"}], \"publish_places\": [\"New York\"], \"languages\": [{\"key\": \"/languages/eng\"}], \"pagination\": \"p. cm.\", \"classifications\": {}, \"source_records\": [\"marc:marc_loc_updates/v40.i17.records.utf8:13803272:1249\", \"marc:marc_loc_updates/v40.i29.records.utf8:8629089:1250\", \"marc:marc_openlibraries_phillipsacademy/PANO_FOR_IA_05072019.mrc:79473568:2362\", \"marc:marc_openlibraries_sanfranciscopubliclibrary/sfpl_chq_2018_12_24_run04.mrc:254540245:9273\", \"bwb:9781599906959\", \"marc:marc_loc_2016/BooksAll.2016.part39.utf8:184630151:1255\"], \"title\": \"Throne of glass\", \"lccn\": [\"2012011229\"], \"number_of_pages\": 406, \"isbn_13\": [\"9781599906959\"], \"created\": {\"type\": \"/type/datetime\", \"value\": \"2012-04-25T09:48:38.192850\"}, \"edition_name\": \"1st U.S. ed.\", \"dewey_decimal_class\": [\"[Fic]\"], \"subjects\": [\"Assassins\", \"Princes\", \"JUVENILE FICTION / Love & Romance\", \"Prisoners\", \"Fiction\", \"Fantasy\", \"JUVENILE FICTION / Action & Adventure / General\", \"Court and courtiers\", \"JUVENILE FICTION / Fantasy & Magic\"], \"publish_date\": \"2012\", \"publish_country\": \"nyu\", \"last_modified\": {\"type\": \"/type/datetime\", \"value\": \"2020-10-17T23:09:51.962337\"}, \"by_statement\": \"by Sarah J. Maas\", \"works\": [{\"key\": \"/works/OL16607146W\"}], \"type\": {\"key\": \"/type/edition\"}, \"revision\": 9}", response);
    }
}