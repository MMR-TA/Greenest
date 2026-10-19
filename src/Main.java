import java.util.Scanner;

public class Main {
        public static void main(String[] args){
           var scan = new Scanner(System.in);

            Plant cactus = new Cactus("Igge", 0.2f);

           boolean isRunning = true;

           while (isRunning) {
               System.out.print("Vilken växt ska få vätska");

               String choice = scan.nextLine().trim();

               if (choice.isEmpty()) {
                   System.out.println("Du måste ange ett växtnamn.");
                   continue;
               }

               switch (choice) {
                   case "Igge" -> {
                       showFluidNeeds(cactus);
                       isRunning = false;
                   }
                   default -> System.out.println(
                           "Växten finns inte, försökt igen.");

               }
           }
          scan.close();
        }

        private static void showFluidNeeds(Plant plant) {
            System.out.println("vätskemängd " +
                    plant.calculateFluidNeeds() +
                    " liter per dag och vätsketypen är "
                    + plant.getFluidType());
        }
}
