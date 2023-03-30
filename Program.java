/* 1491. Average Salary Excluding the Minimum and Maximum Salary
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500 */

class Solution {
    public double average(int[] salary) {
        
        double count=0, max=0 , min=100000, total=0;
		for (int i=0; i<salary.length; i++){
		        if(salary[i] > max) {
		        	max = salary[i];
		        }
		        if(salary[i] < min ) {
		        	min = salary[i];
		        }
		        
		        total+=salary[i];
				count++;
		        }
		return (total - max - min) / (count-2);
		}
}
