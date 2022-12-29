
with open('input3.txt') as f:
 processes=[]
 
 process_completed=[]
 time=0

 qntm= int(input("Give Quantam Time : "))
 
 for line in f:
    data = line.split() 
   
    processes.append((data[1],data[2],data[0],data[2],-1,0,0,0))
    
processes.sort()


for i in processes:
    y=list(i)
    if (int(y[4])==-1): 
        y[4]=time
    if int(y[3])>0 :
        if int(y[3]) > qntm :
            y[3]=int(y[3])-qntm 
            time= time+qntm
            i = tuple(y)
            processes.append(i)
        else :
            time= time+int(y[3])
            y[3]=0
            
            #Complete time
            CT=time
            #Turnarround time
            TA = time-int(y[0])
            #Waiting time 
            WA= time - int(y[1])-int(y[0])
            
            process_completed.append((y[0],y[1],y[2],y[3],y[4],TA,WA,CT))
            i = tuple(y)


for i in process_completed:
    p=list(i)
    print("--------------------")
    print("For " + p[2] + " Turnarround time is " + str(p[5]))
    print("For " + p[2] + " Waiting time is " + str(p[6]))
    print("For " + p[2] + " Complete time is " + str(p[7]))
           
    
