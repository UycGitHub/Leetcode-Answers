public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        if(n!=0){   
            for(int i=0; i<n; i++){
                if(arr.get(i)>0) positives++;
                else if (arr.get(i)<0) negatives++;
                else zeros++;
            }
            
            System.out.println( (double)positives/n );
            System.out.println( (double)negatives/n );
            System.out.println( (double)zeros/n );
        }

    }

// link --> https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
