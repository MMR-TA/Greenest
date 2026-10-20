import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
           var scan = new Scanner(System.in);

           //Polymorfism här där variabler av typen Plant kan referera till
            // olika underklasser som Palm, Cactus och Carnivorous.
            Plant palmLaura = new Palm("Laura", 5f);
            Plant palmOlof = new Palm("Olof", 1f);
            Plant carnivorous = new Carnivorous("Meatloaf", 0.7f);
            Plant cactus = new Cactus("Igge", 0.2f);

           boolean isRunning = true;

           while (isRunning) {
               System.out.print("Vilken växt ska få vätska?");

               String choice = scan.nextLine().trim().toLowerCase();

               if (choice.isEmpty()) {
                   System.out.println("Du måste ange ett växtnamn.");
                   continue;
               }

               switch (choice) {
                   case "igge" -> {
                       showFluidNeeds(cactus);
                       isRunning = false;
                   }
                   case "meatloaf" -> {
                       showFluidNeeds(carnivorous);
                       isRunning = false;
                   }
                   case "laura" -> {
                       showFluidNeeds(palmLaura);
                       isRunning = false;
                   }
                   case "olof" -> {
                       showFluidNeeds(palmOlof);
                       isRunning = false;
                   }
                   default -> System.out.println(
                           "Växten finns inte. försökt igen.");

               }
           }
          scan.close();
        }

        private static void showFluidNeeds(Plant plant) {
            System.out.printf("%s behöver vätskemängd %.2f liter per dag och vätsketypen är %s%n",
                    plant.getName(),
                    plant.calculateFluidNeeds(),
                    plant.getFluidType()
            );
        }
}
