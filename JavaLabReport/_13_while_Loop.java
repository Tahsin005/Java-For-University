package JavaLabReport;

public class _13_while_Loop {
    public static void main(String[] tahsin) {
        int i = 0;
        while(i <= 15){
            i++;
            if(i == 8){
                continue;
            }
            if(i == 13){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
