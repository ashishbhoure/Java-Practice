package Complexity;

import java.util.Arrays;

public class TripletSum {

        public static int tripletSum(int[] arr,int num){
            Arrays.sort(arr);
            int n = arr.length;
            int numTriplets = 0;

            for(int i=0;i<n;i++){
                int pairSumFor = num - arr[i];
                int numPair = pairSum(arr, (i+1),(n-1),pairSumFor);

                numTriplets += numPair;
            }
            return numTriplets;
        }


        public static int pairSum(int[] arr,int startIndex,int endIndex, int num){
        int numPair =0;

        while(startIndex < endIndex){
            if(arr[startIndex ] + arr[endIndex] < num){
                startIndex++;
            }
            else if(arr[startIndex] + arr[endIndex] > num){
                endIndex--;
            }
            else{
                int elementAtStart = arr[startIndex];
                int elementAtEnd= arr[endIndex];

                if(elementAtStart == elementAtEnd){
                    int totalElementsFromStartToEnd = (endIndex - startIndex) +1;
                    numPair += (totalElementsFromStartToEnd * (totalElementsFromStartToEnd -1) / 2);

                    return numPair;
                }
                int tempStartIndex = startIndex +1;
                int tempEndindex = endIndex -1;

                while(tempStartIndex <= tempEndindex && arr[tempStartIndex] == elementAtStart){
                    tempStartIndex += 1;
                }
                while(tempEndindex >= tempStartIndex && arr[tempEndindex] == elementAtEnd){
                    tempEndindex -= 1;
                }

                int totalElementsFromStart = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndindex);

                numPair += (totalElementsFromStart * totalElementsFromEnd);

                startIndex = tempStartIndex;
                endIndex = tempEndindex;
            }
        }
        return numPair;
    }

    public static void main(String[] args) {
        int[] arr = {6,-8,4,1,-6,2,-4,15};
        int num = 0;
        System.out.println(tripletSum(arr, num));
    }
}
