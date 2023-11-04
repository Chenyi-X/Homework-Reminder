
import org.homework.controller.WelcomeController;
import org.homework.view.WelcomeUI;
import org.junit.Test;

public class testMain {
    @Test
    public void testmain() {
        /*入口*/
        do {
            WelcomeUI.show();
        } while (WelcomeController.isContinue(true));
    }
}
