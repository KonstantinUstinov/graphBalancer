Given:
 - Tree of arbitrary depth
 - Tree nodes have leaves (0 - N)
 - Each sheet has an associated weight - a non-zero integer
 - Leaves for each node are presented as a unidirectional linked list.

Need to:
 - For each node - sort the leaves by weight without using library sorting functions,
   while the sum of the weights of the leaves for each specific node of the tree should not exceed the given constant W,
   the extra leaves are transferred to the next tree node (in accordance with the tree node bypass algorithm), the extra leaves of the very last
   tree node discarded.

Example:
   The tree node has 3 child nodes (a1, a2, a3) as well as 4 sheets b1, b2, b3, b4 with resp. weights: 1 for b1, 2 for b2, 3 for b3 and 4 for b4
   Constant w = 3

   The initial state of the leaf list for this node: b2, b4, b3, b1
   The final state of the list of leaves for this node: b1, b2, while the leaves b3, b4 are transferred to the child node a1

Registration:
 - Project on BitBucket or GitHub
 - Demonstration of using GitFlow workflow
 - Coverage test