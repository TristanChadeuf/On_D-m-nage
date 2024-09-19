
public class Main {
    public static void main(String[] args) {

        int nbBoxes = 34;
        int truck= 9;


        while(nbBoxes >= 0){

            if(nbBoxes>=9) {
                System.out.println("un voyage de " + truck + " cartons");
            }else{

                System.out.println("un voyage de " + nbBoxes+ " cartons");
            }
            nbBoxes=nbBoxes-truck;
        }
        
    }
}

