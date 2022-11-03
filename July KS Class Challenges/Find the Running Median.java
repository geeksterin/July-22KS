import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Double> runningMedian(List<Integer> a) {
    // Write your code here
        List<Double>ans=new ArrayList<>();
        
        PriorityQueue<Double>q1=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Double>q2=new PriorityQueue<>();
        
        for(int i=0;i<a.size();i++){
            
            double num=a.get(i);
            
//             Add 
            if(q1.size()==0 || q1.peek()>num){
                q1.add(num);
            }else {
                q2.add(num);
            }
            
//             Check Difference
            if(q1.size()>q2.size()+1){
                double val=q1.remove();
                q2.add(val);
            }else if(q2.size()>q1.size()+1){
                double val=q2.remove();
                q1.add(val);
            }
            
//             Find Median
            
            if(q1.size()==q2.size()){
//                 We have even number of elements
                double num1=q1.peek();
                double num2=q2.peek();
                
                ans.add((num1+num2)/2.0);
            }else {
                if(q1.size()>q2.size()){
                    ans.add(q1.peek());
                }else {
                    ans.add(q2.peek());
                }
            }
            
        }
        
        return ans;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
