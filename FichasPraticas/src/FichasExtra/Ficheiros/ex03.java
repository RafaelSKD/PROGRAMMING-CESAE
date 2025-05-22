package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;

import static FichasExtra.Ficheiros.ex03_1stMenu.*;
import static FichasExtra.Ficheiros.ex03_menuBase.*;
import static FichasExtra.Ficheiros.ex03_login.*;
import static Header.files.dupFile;

public class ex03 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            backupFiles();
            menuHome();
            login();
            menuBase();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void backupFiles() throws FileNotFoundException {
        String loginHotelOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/loginHotel.txt";
        String loginHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/loginHotel.txt";
        dupFile(loginHotelOrigin, loginHotel);

        String clientHotelOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/clientesHotel.csv";
        String clientHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/clientesHotel.csv";
        dupFile(clientHotelOrigin, clientHotel);

        String productsHotelOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/produtosHotel.csv";
        String productsHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/produtosHotel.csv";
        dupFile(productsHotelOrigin, productsHotel);

        String roomsHotelOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/quartosHotel.csv";
        String roomsHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/quartosHotel.csv";
        dupFile(roomsHotelOrigin, roomsHotel);

        String reservationsHotelOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/reservasHotel.csv";
        String reservationsHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/reservasHotel.csv";
        dupFile(reservationsHotelOrigin, reservationsHotel);

        String roomsServiceOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/servicoQuartoHotel.csv";
        String roomServiceHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/servicoQuartoHotel.csv";
        dupFile(roomsServiceOrigin, roomServiceHotel);

        String themesHotelOrigin = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/Ex_03_Hotel_Temático/temasHotel.csv";
        String themesHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/temasHotel.csv";
        dupFile(themesHotelOrigin, themesHotel);
    }
}
