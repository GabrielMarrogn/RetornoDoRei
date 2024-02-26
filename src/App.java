import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int runas = sc.nextInt();
        int amizade = sc.nextInt();
        sc.nextLine();

        // Array que guarda runas e o valor da amisade
        String[] arr = new String[runas];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
        }

        int qtdRunas = sc.nextInt();
        sc.nextLine();

        // guarda as runas selecionadas
        String[] escolhidas = new String[qtdRunas];
        escolhidas = sc.nextLine().split(" ");

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < escolhidas.length; k++){
                if(arr[i].contains(escolhidas[k])){
                    String[] temp = arr[i].split(" ");
                    total += Integer.parseInt(temp[1]);
                }
            }
        }
        
        System.out.println(total);
        if(total < amizade){
            System.out.println("My precioooous");
        }else{
            System.out.println("You shall pass!");
        }

        sc.close();
    }
}
