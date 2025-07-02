package FichasPraticas.FichaPratica1.Ex03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager session;
    private static int sessionToken = 0; // int aleatorio
    private String lastAccessTime;

    private UserSessionManager(int sessionToken) {
        this.sessionToken = sessionToken;
        this.lastAccessTime = String.valueOf(System.currentTimeMillis());
        updateLastAccessTime();
    }

    public static UserSessionManager getInstance(){
        if (sessionToken == 0)
            session = new UserSessionManager(token());
        return session;
    }

    private static int token(){
        return new Random().nextInt(1000);
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccessTime() {
        return lastAccessTime;
    }

    public void updateLastAccessTime(){
        // Obter a data e hora atuais no formato "dd/MM/yyyy HH:mm:ss"
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.lastAccessTime = now.format(formatter);
    }
}
