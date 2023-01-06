
public class Doctor {
    public static void main(String[] args) throws Exception {
        Heart heart = new Heart("Heart","Healthy",80);
        Eye leftEye = new Eye("Left Eye", "Myopia", false);
        Eye rightEye = new Eye("Right Eye", "Astigmatism", true);
        Stomach stomach = new Stomach("Stomach", "PUD", true);
        Skin skin = new Skin("Skin","Burned");
        Organ[] organs = {leftEye, rightEye, heart, stomach, skin, null};


        boolean inspect = true;
        menu(3, heart);
        /* while(inspect){
            menu()
        } */
    }
    public static void menu(){
        String[] organs = {"Left Eye", "Right Eye", "Heart", "Stomach", "Skin", "Quit"};
        
        System.out.println("Choose an Organ:");
        for(int i = 1; i <= organs.length; i++){
            System.out.println("   "+i + ". "+ organs[i-1]);
        }
    }
    public static boolean menu(int n, Organ organ){
        System.out.println("Organ menu");

        switch(n){
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return false;


        }
    }
}

