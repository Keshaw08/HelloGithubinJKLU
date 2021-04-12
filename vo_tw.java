public class vo_tw{

    public static void main(String args[]){

        Scanner np = new Scanner(System.in);
        System.out.println("Give me a number : ");
        int n = np.nextInt();
    }
    public int facto(int n){
        int b = 1;
        if(n > 1 ){
            b = n * facto(n-1);
        }else {
            b = 1;
        }
        return b;
    }
}