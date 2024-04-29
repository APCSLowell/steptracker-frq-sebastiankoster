import java.util.ArrayList;
public class StepTracker
{
 int minStep;
 private ArrayList<Integer> arr;
 StepTracker(int num){
  arr = new ArrayList<Integer>();
  minStep  = num;
 }
 public void addDailySteps(int num){
  arr.add(num);
 }
 public double averageSteps(){
  if(arr.size()==0) return 0;
  double daySum = 0;
  double stepSum = 0;
  for(int num : arr){
  daySum++;
  stepSum+=num;
  }
  return stepSum/daySum;
 }
 public int activeDays(){
  int sum = 0;
  for(int num : arr){
   if(num>=minStep)
     sum++;
  }
  return sum;
 }
 
} 
