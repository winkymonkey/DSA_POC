package org.example.dsa.dd_greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ***************************************************************************************
 * Job Sequencing Problem
 * ***************************************************************************************
 * Given a set of N jobs where each job i has a deadline and a profit associated with it.
 * Each job takes 1 unit of time to complete and only 1 job can be scheduled at a time.
 * We earn the associated profit only if the job is completed by its deadline.
 * Find the maximum profit and the number of jobs done.
 * ***************************************************************************************
 * Input:
 * N = 4
 * Jobs = (1,4,20) (2,1,10) (3,1,40) (4,1,30)
 * 
 * Output:
 * 2 60			// 2 jobs can be done with max profit of 60 (=20+40)
 * 
 * ***************************************************************************************
 */

public class A03_jobSequencingProblem {
	/*
	 * If we want to maximize the profit, we should choose tasks having the higher profits.
	 * Each job has a deadline. For example, if a job has deadline of 4, it means that the job can be done in 1st / 2nd / 3rd / 4th slot of time. 
	 * So its better to do the job on the last possible day so that we can accommodate other jobs before that.
	 * 
	 * JobID  Deadline  Profit
	 *   1		4		  20
	 * 	 2		5		  60
	 *   3		6		  70
	 *   4		6		  65
	 *   5		4		  25
	 *   6		2		  80
	 *   7		6		  10
	 *   8		2		  22
	 * 
	 * Now sort the array A[] in descending order of profits.
	 * 
	 * JobID  Deadline  Profit
	 *   6		2		  80
	 * 	 3		6		  70
	 *   4		6		  65
	 *   2		5		  60
	 *   5		4		  25
	 *   8		2		  22
	 *   1		4		  20
	 *   7		2		  10
	 * 
	 * Now find the max value of the Deadline which is 6 in our example.
	 * So create an array TIME[] of size 6 and initialize it with -1.
	 * 
	 * Traverse the array A[]
	 * if (TIME[i] != -1) {
	 * 	  TIME[i] = A[i].jobID
	 * }
	 * else {
	 *    traverse the array from i to 0 to find a slot whose value is -1 and put "A[i].jobID" there
	 *    if no such position is found, then break and declare no more job can be scheduled
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		List<Job> list = new ArrayList<Job>();
		list.add(new Job(1, 4, 20));
		list.add(new Job(2, 5, 60));
		list.add(new Job(3, 6, 70));
		list.add(new Job(4, 6, 65));
		list.add(new Job(5, 4, 25));
		list.add(new Job(6, 2, 80));
		list.add(new Job(7, 6, 10));
		list.add(new Job(8, 2, 22));
		
		scheduleJob(list);
	}
	
	
	private static void scheduleJob(List<Job> jobList) {
		Collections.sort(jobList, (j1,j2)->j2.profit-j1.profit);
		
		int maxDeadline = Integer.MIN_VALUE;
		for (Job job : jobList) {
			maxDeadline = Math.max(maxDeadline, job.deadline);
		}
		int time[] = new int[maxDeadline+1];
		Arrays.fill(time, -1);
		
		int maxProfit = 0;
		for (int i=0; i<jobList.size(); i++) {
			Job job = jobList.get(i);
			if (time[job.deadline] == -1) {
				time[job.deadline] = job.id;
				maxProfit = maxProfit + job.profit;
			}
			else {
				for (int k=job.deadline-1; k>=1; k--) {
					if (time[k] == -1) {
						time[k] = job.id;
						maxProfit = maxProfit + job.profit;
						break;
					}
				}
			}
		}
		
		System.out.println(maxProfit);
		System.out.println(Arrays.toString(time));
	}
	
	
	static class Job {
		public int id;
		public int deadline;
		public int profit;
		
		Job (int id, int deadline, int profit) {
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
		
		public String toString() {
			return id+","+deadline+","+profit;
		}
	}
	
}
