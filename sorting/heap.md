
Heap(Binary tree) is a binary tree having follwing properties
a) has to have all its levels filled up completely except last level that can be partly filled up from left to right.
b) Min heap: Every nodes's value is smaller than or equal to childern nodes values, Max heap: Every nodes value is greater than or equal to children nodes values.


-Heap is not sorted. It can be represented using arrays.

Children node value from parent node: 2*i+1, 2*i+2.
Parent node from Child node: Math.floor(i-1/2)



//Min Heap

- Build Heap


- Shift Down
  Find child nodes
  find the smallest, if it is smaller than parent, swap it.
  else compare parent with the other child.if it is smaller, swap it
  else done
  
- Shift Up
  find the parent node. if it is greater, swap it.
  
- Insert
Insert the element to the last node and do a Shift Up!

- Remove
Swap root with the last element in the heap and do a shift down!


