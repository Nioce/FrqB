package apcs_array_test;


/**
 *Andrew Wilmovsky, base function
 */
public class CollegeGroup
{
    private College[] myColleges;
    
    public CollegeGroup(College[] myColleges) {
        this.myColleges = myColleges;
    }
    
    public void updateTuition(String collegeName, int newTuition) {
        for(int n = 0; myColleges.length > n ; n++){
            if (collegeName.equals(myColleges[n].getName() ) ) {
                myColleges[n].setTuition( newTuition );
            }
        }
        System.out.println(newTuition);
    }
    
    public College[] getCollegeList(String region, int low, int high){
        int amountTodo = 0;
        for(int n = 0; myColleges.length > n;n++){
            College c = myColleges[n];
            String r = c.getRegion();
            int t = c.getTuition();
            System.out.println("Wow");
            if( ( r.equals( region ) && (t > low) && (t < high ) )){
                amountTodo++;
                System.out.println("Wozw");
            }
        }
        College [] bounds = new College[amountTodo];
        int where = 0;
        for(int n = 0; myColleges.length > n;n++){
            College c = myColleges[n];
            String r = c.getRegion();
            int t = c.getTuition();
            System.out.println("Wow");
            if( ( r.equals( region ) && (t > low) && (t < high ) )){
                bounds[where]=c;
                System.out.println("Wozw");
                where++;
            }
        }
        return bounds;
    }
}
