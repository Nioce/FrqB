
/**
 * Write a description of class BatteryCharger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BatteryCharger
{
    private int[] rateTable;
    public BatteryCharger(int [] rateTable){
        this.rateTable=rateTable;
    }
    public int getChargingCost(int startHour, int chargeTime){
        int cost = 0;
        
        for(int i = 0; chargeTime > i; i++){
            cost+=rateTable[(startHour + i) % 24];
        }
        
        return cost;
    }
    
    public int getChargeStartTime(int chargeTime){
        int startTime= 0;
        for(int x = 1; rateTable.length> x; x++){
            if(getChargingCost(x, chargeTime) < getChargingCost(startTime, chargeTime)){
                startTime = x;
            }
        }
        return startTime;
    }
}
