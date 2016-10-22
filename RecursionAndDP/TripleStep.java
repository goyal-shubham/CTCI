package RecursionAndDP;

import java.util.Arrays;

/**
 * Created by shubham.goyal on 10/10/16.
 */
public class TripleStep
{
	public static int[] stepsToClimb;


	public static int countWaysToClimb(int noOfSteps)
	{
		if(noOfSteps == 0)
		{
			return 0;
		}
		stepsToClimb = new int[noOfSteps + 1];
		Arrays.fill(stepsToClimb, -1);
		return countWaysToClimbHelper(noOfSteps);
	}

	public static int countWaysToClimbHelper(int noOfSteps)
	{
		if(noOfSteps < 0)
		{
			return 0;
		}
		else if(noOfSteps == 0)
		{
			return 1;
		}
		else if(stepsToClimb[noOfSteps] > 0)
		{
			return stepsToClimb[noOfSteps];
		}
		stepsToClimb[noOfSteps] =  countWaysToClimbHelper(noOfSteps - 1) + countWaysToClimbHelper(noOfSteps - 2) + countWaysToClimbHelper(noOfSteps - 3);
		return stepsToClimb[noOfSteps];
	}

	public static void main(String[] args)
	{
		int n = 3;
		System.out.println(countWaysToClimb(n));
	}
}



