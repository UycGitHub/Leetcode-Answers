def birthdayCakeCandles(candles):
    n = len(candles)
    maxnum = 0
    
    for i in range(n):
        if candles[i]>maxnum:
            maxnum = candles[i]
            count =1
        elif candles[i]==maxnum:
            count+=1
        
    return count
