import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;


public class StylistTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void Stylist_OwnerAddStylist_true() {
        Stylist newStylist = new Stylist ("Angel");
        assertEquals(true, newStylist instanceof Stylist);
    }

    @Test
    public void Stylist_getStylistName_String() {
        Stylist myStylist = new Stylist ("Angel");
        assertEquals("Angel", myStylist.getName());
    }

    @Test
    public void equals_returnsTrueIfStylistsNamesAreTheSame() {
        Stylist firstStylist = new Stylist ("Angel");
        Stylist secondStylist = new Stylist ("Angel");
        assertTrue(firstStylist.equals(secondStylist));
    }

    @Test
    public void save_savesStylistName_true() {
        Stylist myStylist = new Stylist ("Angel");
        myStylist.save();
        assertTrue(Stylist.all().get(0).equals(myStylist));
    }

    @Test
    public void save_saveOneIdToEachStylist_int() {
        Stylist myStylist = new Stylist ("Angel");
        myStylist.save();
        Stylist savedStylist = Stylist.all().get(0);
        assertEquals(savedStylist.getId(), myStylist.getId());
    }

    @Test
    public void all_getAllReturnAll_true() {
        Stylist firstStylist = new Stylist ("Angel");
        firstStylist.save();
        Stylist secondStylist = new Stylist ("Linda");
        secondStylist.save();
        assertTrue(Stylist.all().contains(secondStylist));
    }

    @Test
    public void find_findStylistInDataBase_true() {
        Stylist myStylist = new Stylist ("Angel");
        myStylist.save();
        Stylist savedStylist =Stylist.find(myStylist.getId());
        assertTrue(myStylist.equals(savedStylist));
    }

    @Test
    public void update_updateStylistNameInDatabase() {
        Stylist myStylist = new Stylist ("Angel");
        myStylist.save();
        myStylist.update("Alexa");
        assertEquals("Alexa", myStylist.getName());
    }

    @Test
    public void delete_deletesStylist_true(){
        Stylist myStylist = new Stylist ("Angel");
        myStylist.save();
        int myStylistId = myStylist.getId();
        myStylist.delete();
        assertEquals(null, Stylist.find(myStylistId));
    }

    @Test
    public void getClients_retrievesClientsFromDatabase_clients() {
        Stylist myStylist = new Stylist ("Angel");
        myStylist.save();
        Client firstClient = new Client ("Julie", myStylist.getId());
        firstClient.save();
        Client secondClient = new Client ("Leah", myStylist.getId());
        secondClient.save();
        Client[] clients = new Client[] { firstClient, secondClient };
        assertTrue(myStylist.getClients().containsAll(Arrays.asList(clients)));
    }
}

