import java.util.*;

class Solution {
    
    public class Subject{
        public String name;
        public int time;
        public int processTime;
        
        public Subject(String name, String time, String processTime){
            this.name = name;
            this.time = changeToMinute(time);
            this.processTime = Integer.parseInt(processTime);
        }
        
        public int changeToMinute(String time){
            String[] timeArr = time.split(":");
            int hour = Integer.parseInt(timeArr[0]);
            int min = Integer.parseInt(timeArr[1]);

            return hour*60 + min;
        }
    }
    public String[] solution(String[][] plans) {
        
        PriorityQueue<Subject> subjects = new PriorityQueue<>((s1,s2)-> s1.time - s2.time);
        Stack<Subject> waitingSubjects = new Stack<>();
        List<String> completedSubjects = new ArrayList<>();
        
        for(int i=0;i<plans.length;i++){
            subjects.add(new Subject(plans[i][0],plans[i][1],plans[i][2]));
        }
        
        Subject currSubject = subjects.poll();
        int currTime = currSubject.time;
        boolean flag = true;
        while(flag){
            
            int minTime = 0;
            boolean isProcessing = true;
            
            while(true){
                
                
                if( minTime == currSubject.processTime ){
                    completedSubjects.add(currSubject.name);
                    isProcessing = false;
                    
                    
                    if( !subjects.isEmpty() && currTime == subjects.peek().time){
                        currSubject = subjects.poll();
                        currTime += minTime;
                        break;
                    }
                    
                   
                    else if(!waitingSubjects.isEmpty()){
                        currSubject = waitingSubjects.pop();
                        currTime += minTime;
                        break;
                    }
                    
                   
                    else if(waitingSubjects.isEmpty()&&subjects.isEmpty()){
                        flag = false;
                        break;
                    }
                    
                 }
                
               
                if( !subjects.isEmpty() && (currTime + minTime) == subjects.peek().time ){
                    if(isProcessing){
                        currSubject.processTime -= minTime;
                        waitingSubjects.push(currSubject);    
                    }
                    currSubject = subjects.poll();
                    currTime += minTime;
                    break;
                }
                
                
                minTime++;
            }        
        }
        
        return completedSubjects.toArray(new String[completedSubjects.size()]);
        
        
    }
    
}