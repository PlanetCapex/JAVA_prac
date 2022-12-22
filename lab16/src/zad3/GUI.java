package zad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {

    public static class LoginDialog extends JDialog
    {

        public JTextField tfService, tfLogin, tfPassword;
        public JButton    btnOk, btnCancel;

        public LoginDialog(JFrame parent)
        {
            super(parent, "Enter in system");
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                    System.exit(0);
                }
            });

            getContentPane().add(createGUI());

            pack();

            setVisible(true);
        }

        private JPanel createGUI()
        {

            JPanel panel = BoxLayoutUtils.createVerticalPanel();

            panel.setBorder (BorderFactory.createEmptyBorder(12,12,12,12));

            JPanel service = BoxLayoutUtils.createHorizontalPanel();
            JLabel serviceLabel = new JLabel("Service:");
            service.add(serviceLabel);
            service.add(Box.createHorizontalStrut(12));
            tfService = new JTextField(15);
            service.add(tfService);

            JPanel name = BoxLayoutUtils.createHorizontalPanel();
            JLabel nameLabel = new JLabel("User name:");
            name.add(nameLabel);
            name.add(Box.createHorizontalStrut(12));
            tfLogin = new JTextField(15);
            name.add(tfLogin);

            JPanel password = BoxLayoutUtils.createHorizontalPanel();
            JLabel passwordLabel = new JLabel("Password:");
            password.add(passwordLabel);
            password.add(Box.createHorizontalStrut(12));
            tfPassword = new JTextField(15);
            password.add(tfPassword);

            JPanel flow = new JPanel( new FlowLayout( FlowLayout.RIGHT, 0, 0) );
            JPanel grid = new JPanel( new GridLayout( 1,2,5,0) );
            btnOk = new JButton("Enter");
            btnOk.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ActionUtils.auth(new LoginData(tfService.getText(),tfLogin.getText(), tfPassword.getText()));
                }
            });
            btnCancel = new JButton("Cancel");
            btnCancel.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tfService.setText("");
                    tfLogin.setText("");
                    tfPassword.setText("");
                }
            });
            grid.add(btnOk    );
            grid.add(btnCancel);
            flow.add(grid);

            BoxLayoutUtils.setGroupAlignmentX(new JComponent[] { service, name, password, panel, flow },
                    Component.LEFT_ALIGNMENT);

            BoxLayoutUtils.setGroupAlignmentY(new JComponent[] { tfService, tfLogin, tfPassword, serviceLabel, nameLabel, passwordLabel},
                    Component.CENTER_ALIGNMENT);

            GUITools.makeSameSize(new JComponent[] { serviceLabel, nameLabel, passwordLabel } );
            GUITools.createRecommendedMargin(new JButton[] { btnOk, btnCancel } );

            GUITools.fixTextFieldSize(tfService);
            GUITools.fixTextFieldSize(tfLogin   );
            GUITools.fixTextFieldSize(tfPassword);


            panel.add(service);
            panel.add(Box.createVerticalStrut(10));
            panel.add(name);
            panel.add(Box.createVerticalStrut(12));
            panel.add(password);
            panel.add(Box.createVerticalStrut(17));
            panel.add(flow);

            return panel;
        }
    }
}
