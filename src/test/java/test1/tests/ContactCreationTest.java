package test1.tests;

import test1.model.ContactData;
import org.testng.annotations.Test;
import test1.model.GroupData;


public class ContactCreationTest extends TestBase {

  @Test
    public void contactCreationTest(){
      //предусловие
      //т.к контакт создается с группой, сначала нужно проверить есть ли созданная группа, если нет - создать
        app.getNavigationHelper().goToGroupPage();
      if (! app.getGrHelper().isThereAGroup()){
          app.getGrHelper().createGroup(new GroupData("test1", null, null));
      }
      //тест
        app.getNavigationHelper().goToNewContactPage();
        app.getContactHelper().createContact(new ContactData("Андрей", "Терехов", "Сергеевич", "terehov@gmail.com", "test1"), true);
    }
}
