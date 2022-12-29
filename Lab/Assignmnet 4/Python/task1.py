
with open('input1.txt') as f:
 process=[]
 total_burst_time=1
 p=()
 ready_queue=[]
 process_completed=[]
 
 for line in f:
    data = line.split() 
    process.append((data[1],data[2],data[0],data[1],data[2],-1,0,0,0))
    total_burst_time=total_burst_time+int(data[2])

    

 
process.sort(key=lambda t: (int(t[3]))) 
First_process_starting_time= list(process[0])
total_burst_time=total_burst_time+int(First_process_starting_time[0])

for j in range(total_burst_time):
    if len(process)!=0:
        
        for i in process:
            
             information = list(i) 
             if (j == int(information[0]) ):
                
                 information[5]=0 
                 information[3]=j 
                 i=tuple(information)
                 if i not in ready_queue:
                     ready_queue.append(i)
                 
                 ready_queue.sort(key=lambda t: ((int(t[4])))) 
                
                 
                
    if len(ready_queue)> 0 :
        information2 = list(ready_queue[0])
        information2[4] = int(information2[4])-1
        ready_queue[0]= tuple(information2) 
        
        if int(information2[4]) == 0:
            #Complete time
            CT=j+1
            #Turnarround time
            TA = j+1-int(information2[0])
            #Waiting time 
            WA = j+1 - int(information2[1])-int(information2[0])
            process_completed.append((information2[0],information2[1],information2[2],information2[3],information2[4],information2[5],TA,WA,CT))
            ready_queue[0] = tuple(information2)
            ready_queue.remove(tuple(information2))
        

      
for i in process_completed:
    p=list(i)
    print("--------------------")
    print("For " + p[2] + " Turnarround time is " + str(p[6]))
    print("For " + p[2] + " Waiting time is " + str(p[7]))
    print("For " + p[2] + " Complete time is " + str(p[8]))