public static void miniMaxSum(List<Integer> arr) {
        int minVariable = arr.get(0);
        int maxVariable = arr.get(0);
        long totalSum = 0;
        
        for(int i=0; i<arr.size(); i++){
            totalSum += arr.get(i);
            if(maxVariable<arr.get(i)) maxVariable = arr.get(i);
            if(minVariable> arr.get(i)) minVariable = arr.get(i);
        }
        
        System.out.println((totalSum - maxVariable)+" "+(totalSum - minVariable));

    }

// link -->  https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
