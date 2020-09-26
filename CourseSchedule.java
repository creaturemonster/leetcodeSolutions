class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //Step 1: We create a HashMap for the list of courses
        HashMap<Integer, List<Integer>> courseDict=new HashMap<>();
        
        //Step 2: Build the graph 
        for(int[] relation : prerequisites){
            //relation[0] depends on relation[1]
            if(courseDict.containsKey(relation[1])){
                courseDict.get(relation[1]).add(relation[0]);
            }else{
                List<Integer> nextCourses=new LinkedList<>();
                nextCourses.add(relation[0]);
                courseDict.put(relation[1],nextCourses);
            }
        }
        
        boolean[] path=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(this.isCyclic(i, courseDict, path)){
                return false;
            }
        }
        return true;
    }
    
    //This is the backtracking method. Backtracking is where we breadcrumb our path and mark the nodes that we visited. If we come across a previously visited node, which means a cycle was detected. We also remove the breadcrumbs for each iteration. 
    protected boolean isCyclic(Integer currCourse, HashMap<Integer, List<Integer>> courseDict, boolean[] path){
        if(path[currCourse]){
            return true;
        }
        
        if(!courseDict.containsKey(currCourse)){
            return false;
        }
        
        path[currCourse]=true;
        
        boolean ret=false;
        for(Integer nextCourse: courseDict.get(currCourse)){
            ret=this.isCyclic(nextCourse, courseDict, path);
            if(ret){
                break;
            }
            
           
        }
         path[currCourse]=false;
            return ret;
        
    }
}
