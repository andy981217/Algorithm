class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        for(int i = -100; i<100; i++){
            int count=0;
            if(lines[0][0]<=i && lines[0][1]>i) count++;
            if(lines[1][0]<=i && lines[1][1]>i) count++;
            if(lines[2][0]<=i && lines[2][1]>i) count++;
            
            if(count>1) answer++;
        }
        
        
        return answer;
        
    
    
    
    }
}

