package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;

import static FichasExtra.Ficheiros.ex03_Dashboard.dashboardMenu;
import static FichasExtra.Ficheiros.ex03_Galery.galeryMenu;
import static FichasExtra.Ficheiros.ex03_NewBooking.newBookingMenu;
import static FichasExtra.Ficheiros.ex03_consultClients.*;
import static FichasExtra.Ficheiros.ex03_consultReservations.consultReservationsMenu;
import static FichasExtra.Ficheiros.ex03_consultRooms.consultRoomsMenu;
import static FichasExtra.Ficheiros.ex03_manageDataBases.*;
import static FichasExtra.Ficheiros.ex03_menuBase.*;

public class ex03_dispacher {
    public static void dispacher(int option) throws IOException {
        switch (option) {
            case 1: // Gerir Base de Dados
                manageDataBasesMenu();
                break;
            case 2: // Consultar Clientes
                consultClientsMenu();
                break;
            case 3: // Consultar Quartos Disponíveis
                consultRoomsMenu();
                break;
            case 4: // Consultar Reservas
                consultReservationsMenu();
                break;
            case 5: // Registar Nova Reserva
                newBookingMenu();
                break;
            case 6: //  Dashboard de Análise
                dashboardMenu();
                break;
            case 7: //  Galeria
                galeryMenu();
                break;
            case 0:
                menuBase();
                break;
        }
    }
}
