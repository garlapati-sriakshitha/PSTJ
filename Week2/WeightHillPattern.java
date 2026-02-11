import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
    public static int weightHillPattern(int input1, int input2, int input3)
    {
        int totalWeight = 0;
        int currentWeight = input2;   // weight of first level
        for (int level = 1; level <= input1; level++)
        {
            // stars = level number
            totalWeight = totalWeight + (level * currentWeight);
           // increase weight for next level
            currentWeight = currentWeight + input3;
        }
        return totalWeight;
    }
}
