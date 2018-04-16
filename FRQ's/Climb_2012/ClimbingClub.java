import java.util.List; 
import java.util.ArrayList;
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbingClub
{
    private List<ClimbInfo> climbList;
    
    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }
    
    public void addClimb(String peakname, int climbTime){
        ClimbInfo climb = new ClimbInfo(peakname, climbTime);
        for(int i=0;i<climbList.size()-1;i++){
            if(climb.getName().compareTo(climbList.get(i+1).getName()) != 0){
                climbList.add(climb);
                
            }
        }
    }
    
     /** @return the number of distinct names in the list of climbs */
     public int distinctPeakNames()
     {
         if (climbList.size() == 0){
         return 0;
         }
         
         ClimbInfo currInfo = climbList.get(0);
         String prevName = currInfo.getName();
         String currName = null;
         int numNames = 1;
         
         for (int k = 1; k < climbList.size(); k++)
         {
             currInfo = climbList.get(k);
             currName = currInfo.getName();
             if (prevName.compareTo(currName) != 0){
                 numNames++;
                 prevName = currName;
                }
         }
         return numNames;
     } 
}
