package FichasPraticas.FichaPratica1.Ex03;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserSessionManager sessionManager = UserSessionManager.getInstance( );
        System.out.println("Token de Acesso:" + sessionManager.getSessionToken( ));
        System.out.println("Último Acesso: " + sessionManager.getLastAccessTime( ));
        sleep(4000);

        // Criar outra instancia para verificar se troca o token - Nao pode - OK
        // Dar update para verificar se troca a hora - Tem de trocas - OK
        UserSessionManager sessionManager2 = UserSessionManager.getInstance( );
        sessionManager2.updateLastAccessTime();
        System.out.println("Token de Acesso:" + sessionManager2.getSessionToken( ));
        System.out.println("Último Acesso: " + sessionManager2.getLastAccessTime( ));
    }
}
