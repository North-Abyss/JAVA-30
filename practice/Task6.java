public class Task6 {
    public static void main(String[] args) {
        star s = new star();
        s.uptriangle(5);

        System.out.println("------");

        s.downtriangle(5);
    }
}

class star{
    public void uptriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void downtriangle(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
