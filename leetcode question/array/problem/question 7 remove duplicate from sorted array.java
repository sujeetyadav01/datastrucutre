{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue-Bold;\f1\fnil\fcharset0 HelveticaNeue;\f2\fnil\fcharset0 HelveticaNeue-Italic;
\f3\fnil\fcharset0 Menlo-Regular;\f4\fnil\fcharset0 Menlo-Italic;\f5\fmodern\fcharset0 Courier;
}
{\colortbl;\red255\green255\blue255;\red25\green25\blue25;\red55\green146\blue55;\red67\green91\blue103;
\red29\green38\blue42;\red220\green161\blue13;\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c12941\c12941\c12941;\cssrgb\c26275\c62745\c27843;\cssrgb\c32941\c43137\c47843;
\cssrgb\c14902\c19608\c21961;\cssrgb\c89412\c68627\c3922;\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\b\fs32 \cf2 \expnd0\expndtw0\kerning0
Q:7 Remove Duplicates from Sorted Array\
\pard\pardeftab720\partightenfactor0

\f1\b0\fs26 \cf3 Easy\
\pard\pardeftab720\partightenfactor0

\fs24 \cf4 \
3014\
\
5865\
\
Add to List\
\
Share\
\pard\pardeftab720\partightenfactor0
\cf5 Given a sorted array 
\f2\i \cf5 nums
\f1\i0 \cf5 , remove the duplicates {\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/In-place_algorithm"}}{\fldrslt \cf6 \ul \ulc6 in-place}} such that each element appears only 
\f2\i \cf5 once
\f1\i0 \cf5  and returns the new length.\
Do not allocate extra space for another array, you must do this by modifying the input array {\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/In-place_algorithm"}}{\fldrslt \cf6 \ul \ulc6 in-place}} with O(1) extra memory.\
Clarification:\
Confused why the returned value is an integer but your answer is an array?\
Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.\
Internally you can think of this:\
\pard\pardeftab720\partightenfactor0

\f3\fs26 \cf5 \cb7 // nums is passed in by reference. (i.e., without making a copy)\
int len = removeDuplicates(nums);\
\
// any modification to nums in your function would be known by the caller.\
// using the length returned by your function, it prints the first len elements.\
for (int i = 0; i < len; i++) \{\
\'a0 \'a0 print(nums[i]);\
\}\
\pard\pardeftab720\partightenfactor0

\f1\fs24 \cf5 \cb1  \
Example 1:\
\pard\pardeftab720\partightenfactor0

\f3\fs26 \cf5 \cb7 Input: nums = [1,1,2]\
Output: 2, nums = [1,2]\
Explanation:\'a0Your function should return length = 2, with the first two elements of 
\f4\i \cf5 \cb7 nums
\f3\i0 \cf5 \cb7  being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.\
\pard\pardeftab720\partightenfactor0

\f1\fs24 \cf5 \cb1 Example 2:\
\pard\pardeftab720\partightenfactor0

\f3\fs26 \cf5 \cb7 Input: nums = [0,0,1,1,1,2,2,3,3,4]\
Output: 5, nums = [0,1,2,3,4]\
Explanation:\'a0Your function should return length = 5, with the first five elements of 
\f4\i \cf5 \cb7 nums
\f3\i0 \cf5 \cb7  being modified to\'a00, 1, 2, 3, and\'a04 respectively. It doesn't matter what values are set beyond\'a0the returned length.\
\pard\pardeftab720\partightenfactor0

\f1\fs24 \cf5 \cb1  \
Constraints:\
\pard\tx220\tx720\pardeftab720\li720\fi-720\partightenfactor0
\ls1\ilvl0
\f5\fs26 \cf4 \cb7 \kerning1\expnd0\expndtw0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
0 <= nums.length <= 3 * 10
\fs19\fsmilli9750 4
\f1\fs28 \cf5 \cb1 \
\ls1\ilvl0
\f5\fs26 \cf4 \cb7 \kerning1\expnd0\expndtw0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
-10
\fs19\fsmilli9750 4
\fs26  <= nums[i] <= 10
\fs19\fsmilli9750 4
\f1\fs28 \cf5 \cb1 \
\ls1\ilvl0
\f5\fs26 \cf4 \cb7 \kerning1\expnd0\expndtw0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
nums
\f1\fs28 \cf5 \cb1  is sorted in ascending order.}
