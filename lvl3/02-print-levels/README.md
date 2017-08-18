# Print Binary Tree Level By Level

Overview
---
Given a binary tree, write a method to print the tree level by level. Each 
item in the list is an ArrayList of the format [A[], B,[] .....], where 
A[],B[].... are the nodes at a particular level, stored in an ArrayList.

Usage
---
`java BinaryTree A`, where _A_ is an array of values.

Note
---
This one is a doozy; you many wanna take an hour or so.

Explanation
---
`printLevelByLevel()`
_A linkedlist-based implementation._
Help...

`printLevelByLevel2()`
_A queue-based implementation._
Root is added to the queue and while it is not empty, we create an ArrayList 
for each corresponding level and check to see how many values the queue has 
inside of it; while the size of the queue is not zero, we set the root 
equal to the dequeued node and add it to the level var. Then the root/
dequeued node is check to see if it is a leaf, which if so nothing 
else is add; otherwise, all other children are queued (from left 
to right).