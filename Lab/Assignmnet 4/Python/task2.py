
with open('input2.txt') as f:
 processes=[]
 count=0
 completed_process_number=0
 time=0
 ready_queue=[]
 completed_process_list=[]
 
 for line in f:
    data = line.split() 
   
    
    processes.append((data[1],data[2],data[0],data[3],data[1],data[2],-1,0,0,0))
    
    count=len(processes)

  
processes.sort(key=lambda t: (int(t[4]))) 
 
while(True):
    if(completed_process_number == count):
        break;
    if len(processes)!=0:
        
        for i in processes:
             information= list(i) 
             if (time == int(information[0])):
                e
                 information[6]=0 
                 information[4]=time 
                 i=tuple(information)
                 if i not in ready_queue:
                     ready_queue.append(i)
                 
                 ready_queue.sort(key=lambda t: (int(t[3]))) 
                
              
    ready_queue.sort(key=lambda t: (int(t[3])))           
    if len(ready_queue)!= 0:
        information2= list(ready_queue[0])
        if int(information2[5])>0:
            
            information2[5] = int(information2[5])-1
            ready_queue[0]= tuple(information2) 
           
            time=time+1
            
        
        else:
            #Complete time
            CT=time
            #Turnarround time
            TA = time-int(information2[0])
            #Waiting time 
            WA = time - int(information2[1])-int(information2[0])
            completed_process_list.append((information2[0],information2[1],information2[2],information2[3],information2[4],information2[5],information2[6],TA,WA,CT))
            ready_queue[0] = tuple(information2)
            ready_queue.remove(tuple(information2))
            completed_process_number = completed_process_number+1
    else:
        time=time+1
            
        

       
for i in completed_process_list:
    p=list(i)
    print("--------------------")
    print("For " + p[2] + " Turnarround time is " + str(p[7]))
    print("For " + p[2] + " Waiting time is " + str(p[8]))
    print("For " + p[2] + " Complete time is " + str(p[9]))