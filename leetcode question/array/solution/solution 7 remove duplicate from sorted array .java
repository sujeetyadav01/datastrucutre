{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue-Bold;\f1\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\b\fs28 \cf2 \expnd0\expndtw0\kerning0
My solution
\f1\b0 \

\f0\b \

\f1\b0 class Solution \{\
    public int removeDuplicates(int[] nums) \{\
        int count=0;\
        for(int i=0;i<nums.length-1-count;i++)\
        \{\
            int n=i+1;\
            int m=i;\
            while(nums[m]==nums[n] && n<=nums.length-1-count)\
            \{\
                if((n+1)>nums.length-1)\
                \{\
                    count++;\
                    break;\
                \}\
                for(int j=i+1;j<nums.length-1-count;j++)\
                \{\
                    nums[j]=nums[j+1];\
                \}\
                count++;\
                 // System.out.println(count);\
                \
                \
            \}\
                \
            \
        \}\
        //System.out.println(count);\
        return nums.length-count;\
    \}\
\}\
\
\
\

\f0\b Best Solution
\f1\b0 \
\
public int removeDuplicates(int[] nums) \{\
    if (nums.length == 0) return 0;\
    int i = 0;\
    for (int j = 1; j < nums.length; j++) \{\
        if (nums[j] != nums[i]) \{\
            i++;\
            nums[i] = nums[j];\
        \}\
    \}\
    return i + 1;\
\}\
\
\
\
\
}
