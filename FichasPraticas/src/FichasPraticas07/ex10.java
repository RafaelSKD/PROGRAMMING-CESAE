package FichasPraticas07;

import java.io.*;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;
import static Header.console.*;

public class ex10 {
    public static void main(String[] args) {
        String srcOrigin = "src/FichasPraticas07/Ficheiros/exercicio_10.csv";
        String src = "src/FichasPraticas07/NewFiles/exercicio_10.csv";
        String splitter = ",";
        try {
            dupFile(srcOrigin, src);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
        int count, option;
        while (true) {
            option = menu();
            if (option == 0)
                return;
            dispatcher(src, splitter, option);
        }
    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\nO que deseja procurar?\n");
            System.out.println("#1- Todos os Formandos");
            System.out.println("#2- Informacoes de um Formando");
            System.out.println("#3- Formandos incritos num Curso");
            System.out.println("#4- Formando mais Velho");
            System.out.println("#5- Formandos que frequentam mais que um Curso");
            System.out.println("#6- Quantidade de Formandos Total");
            System.out.println("#7- Alterar Dados");
            System.out.println("\n#0- Sair");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 7);
        return option;
    }

    public static void dispatcher(String src, String splitter, int option) {
        switch (option) {
            case 1: //imprimir todos os formandos
                findStudentsMenu(src, splitter);
                break;
            case 2: //Dado um número de matrícula, retorne todas as informações do formando.
                findStudentInfoMenu(src, splitter);
                break;
            case 3: //Dado um curso, imprima todos os seus formandos (nome e matrícula) + contagem
                findStudentsOfCourseMenu(src, splitter);
                break;
            case 4: //Imprimir o aluno mais velho.
                findOlderStudentMenu(src, splitter);
                break;
            case 5: // Imprimir alunos que estão inscritos em mais de um curso.
                countStudentsMoreThanOneCourseMenu(src, splitter);
                break;
            case 6: // Número de formandos no ficheiro.
                countStudentsMenu(src, splitter);
                break;
            case 7: // Menu de edicao
                editMenu(src, splitter);
                break;
        }
    }

    public static void editMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            String[][] dataMatriz = fillArrayWithFile(src, splitter, 5);
            int option;
            do {
                cleanConsole();
                System.out.println("=========== Menu ===========");
                System.out.println("*School finder\n#7- Alterar Dados\n");
                System.out.println("#1- Criar Formando");
                System.out.println("#2- Editar Formando");
                System.out.println("#3- Eliminar Formando");
                System.out.println("\n#0- Sair");
                System.out.print("\nOpcao: ");
                option = input.nextInt();
            }while (option < 0 || option > 3);

            switch (option) {
                case 1:
                    createStudent(src, splitter, dataMatriz);
                    break;
                case 2:
                    editStudentMenu(src, splitter, dataMatriz);
                    break;
                case 3:
                    killStudentMenu(src, splitter, dataMatriz);
                    break;
                case 0:
                    break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void killStudentMenu(String src, String splitter, String[][] matriz) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        cleanConsole();
        System.out.println("=========== Menu ===========");
        System.out.println("*School finder\n#7- Alterar Dados - #3- Eliminar Formando\n");
        String id;
        do {
            System.out.print(" - Introduzir ID: ");
            id = input.nextLine();
        } while (!isTargetInFile(matriz, id, 1));

        try {
            killStudent(src, splitter, id, matriz);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        } catch (IOException e) {
            System.out.println("Erro");
        }

    }

    public static void killStudent(String src, String splitter, String id, String[][] matriz) throws IOException {
        Scanner input = new Scanner(System.in);
        cleanConsole();
        char option;
        String course, name, email, age;
        System.out.println("=========== Menu ===========");
        System.out.println("*School finder\n#7- Alterar Dados - #2- Editar Formando\n");
        name = findContentInFile(src, splitter, id, 1, 0);
        System.out.println("Nome: " + name + "  ID = " + id + "\n");
        do{
            System.out.print("\nEliminar? (S/N)");
            option = input.nextLine().toUpperCase().charAt(0);
        }while (option != 'S' && option != 'N');

        if (option == 'S'){
            delStudentData(src, splitter, id, 1);
            System.out.println("\nFormando Eliminado com sucesso!\n");
        }

    }

    public static void delStudentData(String src, String splitter, String id, int targetPosition) throws IOException {
        String[][] matriz = fileToMatriz(src, splitter, 5);
        int x = 0;

        while (x < matriz.length){
            if(matriz[x][targetPosition].equals(id)){
                delMatrizLine(matriz, x);
                x--;
            }
            x++;
        }
        matrizToFile(src, splitter, matriz, 5);
    }

    public static void editStudentMenu(String src, String splitter, String[][] matriz) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        String id;
        cleanConsole();
        System.out.println("=========== Menu ===========");
        System.out.println("*School finder\n#7- Alterar Dados - #2- Editar Formando\n");

        do {
            System.out.print(" - Introduzir ID: ");
            id = input.nextLine();
        } while (!isTargetInFile(matriz, id, 1));

        try {
            editStudent(src, splitter, id, matriz);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        } catch (IOException e) {
            System.out.println("Erro");
        }

    }

    public static void editStudent(String src, String splitter, String id, String[][] matriz) throws IOException {
        Scanner input = new Scanner(System.in);
        cleanConsole();
        char option;
        String course, name, email, age;
        System.out.println("=========== Menu ===========");
        System.out.println("*School finder\n#7- Alterar Dados - #2- Editar Formando\n");
        System.out.println("Formando ID = " + id + "\n");
        do{
            System.out.print("Adicionar novo Curso (S/N) -");
            option = input.nextLine().toUpperCase().charAt(0);
        }while (option != 'S' && option != 'N');

        if (option == 'S'){
            do{
                System.out.print("Introduzir Curso a adicionar - ");
                course = input.nextLine();
            }while (!isTargetInFile(matriz, course, 2));

        name = findContentInFile(src, splitter, id, 1, 0);
        email = findContentInFile(src, splitter, id, 1, 3);;
        age = findContentInFile(src, splitter, id, 1, 4);;
        addStudent(src, splitter, name, id, course, email, age);
        }

            name = findContentInFile(src, splitter, id, 1, 0);
            System.out.print("Nome - " + name);
            do{
                System.out.print("\nAlterar? (S/N)");
                option = input.nextLine().toUpperCase().charAt(0);
            }while (option != 'S' && option != 'N');

            if (option == 'S'){
                System.out.print("Novo Nome -");
                String newName = input.nextLine();
                editFile(src, splitter, id, 1, newName, 0);
            }


            email = findContentInFile(src, splitter, id, 1, 3);
            System.out.print("Email - " + email);
            do{
                System.out.print("\nAlterar? (S/N)");
                option = input.nextLine().toUpperCase().charAt(0);
            }while (option != 'S' && option != 'N');
            if (option == 'S'){
                System.out.print("Novo Email -");
                String newEmail = input.nextLine();
                editFile(src, splitter, id, 1, newEmail, 3);
            }


            age = findContentInFile(src, splitter, id, 1, 4);
            System.out.print("Idade - " + age);
            do{
                System.out.print("\nAlterar? (S/N)");
                option = input.nextLine().toUpperCase().charAt(0);
            }while (option != 'S' && option != 'N');
            if (option == 'S'){
                System.out.print("Nova Idade -");
                String newAge = input.nextLine();
                editFile(src, splitter, id, 1, newAge, 4);
            }
        System.out.print("\n Editado com sucesso\n\n... para continuar digite qualquer coisa ");
        input.next();
    }
    public static void createStudent(String src, String splitter, String[][] matriz) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        String name, surname, id, course, email, age;
        cleanConsole();
        System.out.println("=========== Menu ===========");
        System.out.println("*School finder\n#7- Alterar Dados - #1- Criar Formando\n");
        System.out.print(" - Introduzir Nome: ");
        name = input.nextLine();
        System.out.print(" - Introduzir Apelido: ");
        surname = input.nextLine();
        name = name + ' ' + surname;

        do {
            System.out.print(" - Introduzir novo ID - unico: ");
            id = input.nextLine();
        } while (isTargetInFile(matriz, id, 1));


        do {
            System.out.print(" - Introduzir o Curso: ");
            course = input.nextLine();
        }while (!isTargetInFile(matriz, course, 2));


        System.out.print(" - Introduzir Email: ");
        email = input.nextLine();

        System.out.print(" - Introduzir Idade: ");
        age = input.nextLine();
        try {
            addStudent(src, splitter, name, id, course, email, age);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        } catch (IOException e) {
            System.out.println("Erro");
        }

    }

    public static void addStudent(String src, String splitter, String name, String id, String course, String email, String age) throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File(src);
        Scanner scanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter(file,true);

        String newStudent = name + splitter + id + splitter + course + splitter + email + splitter + age;

        while (scanner.hasNextLine()){
            scanner.nextLine();
        }
        fileWriter.append(newStudent+"\n");
        fileWriter.close();
        scanner.close();
        System.out.println(" - Adicionado com sucesso!\n");
    }


    public static void countStudentsMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            cleanConsole();
            String[][] dataMatriz = fillArrayWithFile(src, splitter, 5);
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#6- Quantidade de Formandos Total\n");
            findAndPrintTotalStudents(dataMatriz);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }


    public static void findAndPrintTotalStudents(String[][] dataMatriz){
        int y, x = 1, count = 0;

        while (x < dataMatriz.length){
            y = x + 1;
            while (y < dataMatriz.length){
                if(dataMatriz[x][1].equals(dataMatriz[y][1])){
                    break;
                }
                y++;
            }
            count++;
            x++;
        }
        System.out.println("O numero total de Formandos inscritos na escola e de: " + count);
    }


    public static void findStudentsMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#1- Todos os Formandos\n");
            printContent(src);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findStudentInfoMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#2- Informacoes de um Formando\n");
            System.out.print("Digite o ID do aluno a pesquisar: ");
            String id = input.nextLine();
            System.out.println();
            printContentOccurrences(src, splitter, id, 1, 0, 2, 3, 4);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findStudentsOfCourseMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#3- Formandos incritos num Curso\n");
            System.out.print("Digite o Curso a pesquisar: ");
            String id = input.nextLine();
            System.out.println();
            printContentOccurrences(src, splitter, id, 2, 0, 1);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findOlderStudentMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#4- Formando mais Velho\n");
            String age = findOlderAge(src, splitter);
            System.out.println();
            printContentOccurrences(src, splitter, age, 2, 0, 1, 4);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static String findOlderAge(String src, String splitter) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));

        int age, older = 0;

        String line = data.nextLine(); // ignores 1st line
        String olderAge = "";
        while (data.hasNextLine()){
            line = data.nextLine();
            String[] contentLine = line.split(splitter);
            String dupStr = contentLine[4];
            age = Integer.parseInt(dupStr);
            if (age > older){
                older = age;
                olderAge = dupStr;
            }
        }
        data.close();

        return olderAge;
    }

    public static void countStudentsMoreThanOneCourseMenu(String src, String splitter) {
        try {
            String[][] dataMatriz = fillArrayWithFile(src, splitter, 5);
            Scanner input = new Scanner(System.in);
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#5- Formandos que frequentam mais que um Curso\n");
            System.out.println();
            findAndPrintDups(dataMatriz);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findAndPrintDups(String[][] dataMatriz){
        int y, flag, x = 1;

        while (x < dataMatriz.length){
            y = x + 1;
            flag = 0;
            while (y < dataMatriz.length){
                if(dataMatriz[x][1].equals(dataMatriz[y][1])){
                    if (flag == 0){
                        System.out.print(" " + dataMatriz[x][0]);
                        System.out.println(" - " + dataMatriz[x][1]);
                        System.out.println(" -" + dataMatriz[x][2]);
                        flag = 1;
                    }
                    System.out.println(" -" + dataMatriz[y][2]);
                }
                y++;
            }
            if (flag == 1)
                System.out.println("\n");
            x++;
        }
    }
}