import lombok.*;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor

class StopWatch{
     private long startTime;
     private long stopTime;
     
     public StopWatch(){
          this.startTime = System.currentTimeMillis();
     }
     void start(long startTime){
          this.startTime = startTime;
     }
     
     void stop(){
          this.stopTime = System.currentTimeMillis();
     }
     
     long getElapsedTime(){
          return this.stopTime - this.startTime;
     }
}

public class Reloj {
     
     public static void main(String[] args){
          StopWatch stopWatch = new StopWatch();
          Random random = new Random();
          int[] array = new int[100000];
          stopWatch.getStartTime();
          for(int i = 0; i < array.length; i++){
               array[i]=random.nextInt(100000);
          }
          Arrays.sort(array);
          stopWatch.stop();
          System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " ms");
          
     }
}
