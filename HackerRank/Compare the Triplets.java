public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int scoreOfAlice = 0;
        int scoreOfBob = 0;
        List<Integer> resultList=new ArrayList<Integer>();
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>b.get(i)) scoreOfAlice++;
            else if(a.get(i)<b.get(i)) scoreOfBob++;
        }
        resultList.add(scoreOfAlice);
        resultList.add(scoreOfBob);
        return resultList;
        
    }

//link --> https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
