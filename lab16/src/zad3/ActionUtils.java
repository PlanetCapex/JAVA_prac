package zad3;

import static javax.swing.JOptionPane.showMessageDialog;

public class ActionUtils {
    static LoginData[] loginData = {
            new LoginData("Amazon", "name" , "pwd"),
            new LoginData("Steam","username", "123")
    };

    public static void auth(LoginData lg){
        for (LoginData log:
             loginData) {
            if(log.equals(lg)){
                showMessageDialog(null, "Авторизация успешна");
                return;
            }
        }
        showMessageDialog(null, "Не удалось авторизоваться!");
    }

}
