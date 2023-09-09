public static void staircase(int n) {
        
        for(int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for(int z=1; z<=i; z++){
                System.out.print("#");
            }
            
            System.out.println();
        }

    }

//link --> https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
