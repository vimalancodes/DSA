n = 5 #number of rows
for i in range(1, n+1): # print rows
    for j in range (i,n): # print spaces
        print(" ",end=" ")
    for k in range (1, i*2): #print *
        print("*", end=" ")
    print("\n")