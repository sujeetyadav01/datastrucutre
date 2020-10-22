{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0\c84706;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \expnd0\expndtw0\kerning0
class Solution \{\
    public double findMedianSortedArrays(int[] nums1, int[] nums2) \{\
        int m=nums1.length;\
        int n=nums2.length;\
        int[] arr3=new int[m+n];\
        int i=0,j=0,k=0;\
        while(i<m && j<n)\
        \{\
           if (nums1[i] < nums2[j]) \
                arr3[k++] = nums1[i++]; \
            else\
                arr3[k++] = nums2[j++]; \
        \}\
        while(i<m)\
        \{\
           arr3[k++]=nums1[i];  \
                i++; \
        \}\
        while(j<n)\
        \{\
           arr3[k++]=nums2[j];  \
                j++; \
        \}\
        \
        if((m+n)%2==0)\
        \{\
            int index=(m+n)/2;\
            double val=(arr3[index-1]+arr3[index]);\
            double res;\
            res=val/2;\
            // System.out.println(arr3[index-1]);\
            // System.out.printl
            // System.out.println(res);\
            return res;\
        \}\
        else\
        \{\
            return arr3[(m+n)/2];\
        \}\
    \}\
\}}