package dongu;

public class AsalSayilar {
	
    public static void main(String[] args) {
    	
        int i, j;
        boolean asalMıdır;

        for (i = 2; i <= 100; i++) {
            asalMıdır = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMıdır = false;
                    break;
                }
            }
            if (asalMıdır) {
                System.out.print(i + " ");
            }
        }
    }
}

