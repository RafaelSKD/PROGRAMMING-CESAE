package GrandesNegocios;

import GrandesNegocios.Repositories.SalesRepository;
import GrandesNegocios.Repositories.UsersRepository;
import GrandesNegocios.Views.LoginView;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LoginView lv = new LoginView();
        lv.mainMenu();

    }
}
