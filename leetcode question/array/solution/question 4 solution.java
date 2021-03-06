{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0\c84706;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
class Solution \{\
    public List<List<Integer>> threeSum(int[] nums) \{\
        Arrays.sort(nums);\
        ArrayList<List<Integer>> result=new ArrayList<List<Integer>>();\
        for(int i=0;i<nums.length;i++)\{\
            int j=i+1;\
            int k=nums.length-1;\
            if(i>0 && nums[i]==nums[i-1])\
            \{\
                continue;\
            \}\
            while(j<k)\
            \{\
                if(k<nums.length-1 && nums[k]==nums[k+1])\
                \{\
                    k--;\
                    continue;\
                \}\
                \
                if(nums[i]+nums[j]+nums[k]<0)\
                \{\
                    j++;\
                \}\
                else if(nums[i]+nums[j]+nums[k]>0)\
                \{\
                    k--;\
                \}\
                else\
                \{\
                    ArrayList<Integer> l=new ArrayList<Integer>();\
                    l.add(nums[i]);\
                    l.add(nums[j]);\
                    l.add(nums[k]);\
                    result.add(l);\
                    j++;\
                    k--;\
                \}\
            \}\
        \}\
        return result;\
    \}\
\} \
}
