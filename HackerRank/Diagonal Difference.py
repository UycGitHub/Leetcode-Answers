def diagonalDifference(arr):
    leftDiag = rightDiag = 0
    
    for i in range(n):
        leftDiag += arr[i][i]
        rightDiag += arr[i][n-1-i]
    return abs(leftDiag-rightDiag)
