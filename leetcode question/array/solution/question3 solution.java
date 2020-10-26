{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0\c84706;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
import static java.lang.Math.abs; \
class Solution \{\
    public int threeSumClosest(int[] nums, int target) \{\
        Arrays.sort(nums);\
  \
    // To store the closets sum \
    int closestSum =  nums[0] + nums[1] + nums[2] ; \
  \
    // Fix the smallest number among \
    // the three integers \
    for (int i = 0; i < nums.length - 2; i++)  \
    \{ \
  \
        // Two pointer initially pointing at \
        // the last and the element \
        // next to the fixed element \
        int ptr1 = i + 1, ptr2 = nums.length - 1; \
  \
        // While there could be more pairs to check \
        while (ptr1 < ptr2) \
        \{ \
  \
            // Calculate the sum of the current triplet \
            int sum = nums[i] + nums[ptr1] + nums[ptr2]; \
  \
            // If the sum is more closer than \
            // the current closest sum \
            if(Math.abs(target-sum)<Math.abs(target-closestSum)) \
            \{ \
                closestSum = sum; \
            \} \
  \
            // If sum is greater then x then decrement \
            // the second pointer to get a smaller sum \
            if (sum > target)  \
            \{ \
                ptr2--; \
            \} \
  \
            // Else increment the first pointer \
            // to get a larger sum \
            else\
            \{ \
                ptr1++; \
            \} \
        \} \
    \} \
  \
    // Return the closest sum found \
    return closestSum; \
        \
 \
    \}\
\}}
