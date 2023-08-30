public static String timeConversion(String s) {
    String time24String;
    
    if(s.charAt(8)== 'A'){
        if(s.charAt(0) == '1' && s.charAt(1) == '2' ){
           String firstPart = "00";
           String lastPart = s.subSequence(2, 8).toString();
           return firstPart + lastPart;
        }
        else{
            return s.subSequence(0, 8).toString();
        }
        
    }
    
    else{
        if(s.charAt(0) == '1' && s.charAt(1) == '2'){
            return s.subSequence(0, 8).toString();
        }
        else{
            String firstPart = s.subSequence(0, 2).toString();
            String lastPart = s.subSequence(2, 8).toString();
            int number = Integer.parseInt(firstPart) + 12;
            firstPart = Integer.toString(number);
            return firstPart + lastPart;
        }

    }

}

//link --> https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
