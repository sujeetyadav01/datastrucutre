{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0\c84706;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
class Solution \{\
    public int reverse(int x) \{\
        \
        \
       \
         long value = 0;\
        boolean negative = x < 0;\
        long y = x;\
        y = Math.abs(y);\
\
        while (y > 0)\
        \{\
            value *= 10;\
            value += y % 10;\
            y /= 10;\
        \}\
\
        if(value > Integer.MAX_VALUE)\
        \{\
            return 0;\
        \}\
\
        int ret = (int)value;\
\
        if (negative)\
        \{\
            return 0 - ret;\
        \}\
        else\
        \{\
            return ret;\
        \}\
    \}\
\}\
}
