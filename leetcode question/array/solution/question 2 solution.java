{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0\c84706;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs20 \cf2 \expnd0\expndtw0\kerning0
public class Solution \{\
    public int maxArea(int[] height) \{\
        int maxarea = 0, l = 0, r = height.length - 1;\
        while (l < r) \{\
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));\
            if (height[l] < height[r])\
                l++;\
            else\
                r--;\
        \}\
        return maxarea;\
    \}\
\}}